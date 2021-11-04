package com.java21days;

public class Recursion {
    public int dex = -1;
    public Recursion() {
        dex = getValue(17);
    }
    public int getValue(int dexValue) {
        if (dexValue > 100) {
            return dexValue;
        } else {
            return getValue(dexValue * 2); //recursion take place: 17*2 < 100 => 34*2 < 100 => 68*2 > 100; print 134
        }
    }
    public static void main(String[] arguments) {
        Recursion r = new Recursion();
        System.out.println(r.dex);
    }
}
