package com.twopirad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateToStringTimestamp {

    public String convertStringDateToStringTimestamp(String inputPattern, String outputPattern, String givenDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);
        Date date = inputFormat.parse(givenDate);
        String requiredDate = outputFormat.format(date);
        return requiredDate;
    }

}
