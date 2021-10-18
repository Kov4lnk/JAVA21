package com.java21days;

public class Investment {
/*    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Original investment: $" + total);
        // Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        // Increases by 12 percent the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }*/
    public static void main(String[] args) {
        int invest = 14000;
        int result;
        result = (int) (invest + invest * 0.4);
        result = result - 1500;
        result += result * 0.12;
        System.out.println(result);
    }
}
