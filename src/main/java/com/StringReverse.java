package com;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Name");
        String name=sc.nextLine();
        for (int i =name.length()-1; i >=0 ; i--) {
            rev=rev+name.charAt(i);
        }
        System.out.println("Reverse String :"+rev);
    }
}
