package com.bk.util;

public class MathTest {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 4;

        assert Math.plus(n1,n2)==10;
        assert Math.minus(n1,n2)==2;
        assert Math.multiply(n1,n2)==24;
        assert Math.divide(n1,n2)>1.44;
    }
}
