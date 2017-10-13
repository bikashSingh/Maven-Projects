package com.twopirad;

public class DoubleQuotedString {

    public String formatDoubleQuotedString(String inputString) {
        //String inputString = "\"13,000\"";
        //boolean deleteCommas = false;
        //System.out.println(inputString.length());
//        for (int i = 0; i < inputString.length(); i++) {
//
//            if (inputString.charAt(i) == '\u005c\u0022') {
//                inputString = inputString.substring(0, i) + inputString.substring(i + 1, inputString.length());
//                //deleteCommas = !deleteCommas;
//            }
////            if (inputString.charAt(i) == '\u002c' && deleteCommas) {
////                inputString = inputString.substring(0, i) + inputString.substring(i + 1, inputString.length());
////            }
////            if (i + 1 == inputString.length()) {
////                inputString = inputString.substring(0, i);
////                break;
////            }
//        }
        inputString = inputString.replace("\u002c", "");

        //System.out.println(inputString);
        return inputString;
    }
}
