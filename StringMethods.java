package com.string_methods;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Indian Team";
        System.out.println(str);

        int len = str.length();
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(len-1);
        System.out.println(ch1+" "+ch2);

        String str2 = str.substring(1);
        System.out.println(str2);

        String str3 = str.substring(1,5);
        System.out.println(str3);

        boolean b = str.contains("i");
        System.out.println(b);

        String str4 = String.join(" - ",str,"lost");
        System.out.println(str4);

    }
}
