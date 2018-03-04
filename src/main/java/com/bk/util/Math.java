package com.bk.util;

public class Math {

    public static double plus(double num1, double num2) {
        return num1+num2;
    }

    public static double minus(double num1, double num2) {
        return num1-num2;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;
    }

    public static double divide(double num1, double num2) {
        if(num2 == 0){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return num1/num2;
    }
}
