package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int columnNumber = 1;
        int stopNumber = 6;
        while (columnNumber < stopNumber) {
            int rowNumber = columnNumber;

            while (rowNumber < columnNumber * stopNumber) {
                result += rowNumber;
                result += " | ";
                rowNumber += columnNumber;

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
