package com.java21days;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("One");
        s.push("Two");
        s.push("Three");
        s.push("Four");
        s.push("Five");
        s.push("Six");
        String str1 = (String) s.pop();
        String str2 = (String) s.pop();
        String str3 = (String) s.peek();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(s);

        int i = s.search("Four");
        int j = s.search("One");
        System.out.println(i);
        System.out.println(j);
    }
}
