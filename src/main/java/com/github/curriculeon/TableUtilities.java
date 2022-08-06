package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int loopnumber = 1 ;
        while (loopnumber < 6) {
            result += loopnumber;
            result += " | ";
            loopnumber += 1;
        }


        return result;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
