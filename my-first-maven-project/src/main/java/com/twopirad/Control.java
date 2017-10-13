package com.twopirad;

import java.io.*;
import java.sql.Connection;
import com.opencsv.CSVReader;

public class Control {

    private static final String fileName = "C:\\Users\\bikashs\\Documents\\Maven Projects\\test2.csv";
    private static String a[];

    public static void main(String args[]) throws Exception {
        ConnectToDatabase connectToDatabase = new ConnectToDatabase();
        Connection connection = connectToDatabase.getConnection();
        SalesTable salesTable = new SalesTable();
        CSVReader reader = new CSVReader(new FileReader(fileName));
        DoubleQuotedString doubleQuotedString = new DoubleQuotedString();
        a = reader.readNext();
        while ((a = reader.readNext()) != null) {
            for (int i = 0; i < a.length; i++) {
                a[i] = doubleQuotedString.formatDoubleQuotedString(a[i]);  //need to remove only commas
            }
            //System.out.println(Arrays.toString(a));
            salesTable.insertRecords(connection, a);
        }
        connection.close();
    }

}