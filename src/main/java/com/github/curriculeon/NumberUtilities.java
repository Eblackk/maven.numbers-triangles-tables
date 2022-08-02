package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int loopnumber = start;
        while (loopnumber < stop) {
            result += loopnumber;
            loopnumber += 2;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int loopnumber = start;
        while (loopnumber < stop) {
            result += loopnumber;
            loopnumber += 2;
        }
        return result;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int stop) {
        // if i know the range stops at 10
        // i know it will give me 0,1,2,3,4,5,6,7,8,9,10
        String result = "";
        int loopnumber = 0;
        while (loopnumber < stop) {
            result += loopnumber;
            loopnumber = loopnumber + 1;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        int loopnumber = start;
        while (loopnumber < stop) {
            result += loopnumber;
            loopnumber = loopnumber + 1;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        int loopnumber = start;
        while (loopnumber < stop) {
            result += loopnumber;
            loopnumber += step;
        }
        return result;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
