package com.java21days;

import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int k;

    public FourDPoint(int x, int y, int inZ, int inK){
        super(x,y);
        this.z = inZ;
        this.k = inK;
    }

    public static void main(String[] args) {
        FourDPoint myNamed = new FourDPoint(3, 4,5,6);
        System.out.println(myNamed.x);
        System.out.println(myNamed.y);
        System.out.println(myNamed.z);
        System.out.println(myNamed.k);
    }
}
