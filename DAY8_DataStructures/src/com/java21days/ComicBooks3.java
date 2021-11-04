package com.java21days;

import java.util.*;

public class ComicBooks3 {

    public  ComicBooks3() {
    }

    public static void main(String[] args) {

        HashMap quality = new HashMap();
        quality.put(Conditions.PRISCINE_MINT, 5.00F);
        quality.put(Conditions.MINT, 3.00F);
        quality.put(Conditions.NEAR_MINT, 2.00F);
        quality.put(Conditions.VERY_FINE, 1.50F);
        quality.put(Conditions.FINE, 1.00F);
        quality.put(Conditions.GOOD, 0.50F);
        quality.put(Conditions.POOR, 0.25F);
        quality.put(Conditions.COVERLESS, 0.10F);

        Comic3[] comix = new Comic3[5];
        comix[0] = new Comic3("Amazing Spider-man", "1A", Conditions.VERY_FINE, 12_000F);
        comix[0].setPrice ( (Float) quality.get(comix[0].condition));
        comix[1] = new Comic3("Incredible Hulk", "181", Conditions.NEAR_MINT, 680.00F);
        comix[1].setPrice ( (Float) quality.get(comix[1].condition));
        comix[2] = new Comic3("Cerebus", "1A", Conditions.GOOD, 190.00F);
        comix[2].setPrice ( (Float) quality.get(comix[2].condition));
        comix[3] = new Comic3("Ironman adventures", "100", Conditions.PRISCINE_MINT, 102_000F);
        comix[3].setPrice( (Float) quality.get(comix[3].condition));
        comix[4] = new Comic3("Dr.Strange universe", "2B", Conditions.COVERLESS, 30_000F);
        comix[4].setPrice( (Float) quality.get(comix[4].condition));

        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

class Comic3 {
    String title;
    String issueNumber;
    Conditions condition;
    float basePrice;
    float price;

    Comic3(String inTitle, String inIssueNumber, Conditions inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void  setPrice(float factor) {
        price = basePrice * factor;
    }
}

enum Conditions {
    PRISCINE_MINT,
    MINT,
    NEAR_MINT,
    VERY_FINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS
}