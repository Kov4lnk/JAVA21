package com.java21days;

import java.util.*;

public class ComicBooks2 {

    public  ComicBooks2() {
    }

    public static void main(String[] args) {

        HashMap quality = new HashMap();
        float price0 = 5.00F;
        quality.put("pristine mint", price0);
        float price1 = 3.00F;
        quality.put("mint", price1);
        float price2 = 2.00F;
        quality.put("near mint", price2);
        float price3 = 1.50F;
        quality.put("very fine", price3);
        float price4 = 1.00F;
        quality.put("fine", price4);
        float price5 = 0.50F;
        quality.put("good", price5);
        float price6 = 0.25F;
        quality.put("poor", price6);
        float price7 = 0.10F;
        quality.put("coverless", price7);

        Comic2[] comix = new Comic2[5];
        comix[0] = new Comic2("Amazing Spider-man", "1A", "very fine", 12_000F);
        comix[0].setPrice ( (Float) quality.get(comix[0].condition));
        comix[1] = new Comic2("Incredible Hulk", "181", "near mint", 680.00F);
        comix[1].setPrice ( (Float) quality.get(comix[1].condition));
        comix[2] = new Comic2("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice ( (Float) quality.get(comix[2].condition));
        comix[3] = new Comic2("Ironman adventures", "100", "pristine mint", 102_000F);
        comix[3].setPrice( (Float) quality.get(comix[3].condition));
        comix[4] = new Comic2("Dr.Strange universe", "2B", "coverless", 30_000F);
        comix[4].setPrice( (Float) quality.get(comix[4].condition));

        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

class Comic2 {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic2(String inTitle, String inIssueNumber, String inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void  setPrice(float factor) {
        price = basePrice * factor;
    }
}
