package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int columnNumber = 1;
        while (columnNumber < 6) {
            int rowNumber = 1;

            while (rowNumber < 6) {
                result += rowNumber;
                result += " | ";
                rowNumber += 1;

            }
            result += "\n";
            columnNumber += 1;
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
