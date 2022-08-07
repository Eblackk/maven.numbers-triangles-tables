package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        int loopnumber = 1;
        while (loopnumber < numberOfRows) {

            result += getRow(loopnumber);
            result += "\n";
            loopnumber += 1;

        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        int loopnumber = 0;
        while (loopnumber < numberOfStars) {
            result += "*";
            loopnumber = loopnumber + 1;
        }
        return result;
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
