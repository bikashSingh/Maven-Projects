package com.twopirad;

import java.sql.*;

public class SalesTable {

    StringDateToStringTimestamp stringDateToStringTimestamp = new StringDateToStringTimestamp();

    public void insertRecords(Connection connection, String records[]) {

        String query = "insert into salesjan(Transaction_date,Product,Price,Payment_Type,Name,City,State,Country,Account_Created,Last_Login,Latitude,Longitude) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            st.setString(1, stringDateToStringTimestamp.convertStringDateToStringTimestamp("MM/dd/yy HH:mm", "yyyy-MM-dd HH:mm:ss", records[0]));
            st.setString(2, records[1]);
            st.setInt(3, Integer.parseInt(records[2]));
            st.setString(4, records[3]);
            st.setString(5, records[4]);
            st.setString(6, records[5]);
            st.setString(7, records[6]);
            st.setString(8, records[7]);
            st.setString(9, stringDateToStringTimestamp.convertStringDateToStringTimestamp("MM/dd/yy HH:mm", "yyyy-MM-dd HH:mm:ss", records[8]));
            st.setString(10, stringDateToStringTimestamp.convertStringDateToStringTimestamp("MM/dd/yy HH:mm", "yyyy-MM-dd HH:mm:ss", records[9]));
            st.setDouble(11, Double.parseDouble(records[10]));
            st.setDouble(12, Double.parseDouble(records[11]));
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
