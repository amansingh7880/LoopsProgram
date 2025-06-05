package com;

import java.util.Scanner;

public class StringPalindrome {
    //   name is reverse using string builder
    public String reverseName(String name){
        StringBuilder strb =new StringBuilder(name);
        String reversed=strb.reverse().toString();
        return reversed;
    }
   //    check Palindrome String
    public String checkPalindrome(String name){
        String result=reverseName(name);
        if(result.equalsIgnoreCase(name)){
            return result+" String is Palindrome";
        }
        else {
            return result+" String is not Palindrome";
        }
    }
    //   reverse String name
    public String reverseNames(String name){
        String rev ="";
        for (int i =name.length()-1; i >=0; i--) {
            rev =rev+name.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        StringPalindrome strp=new StringPalindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String reverseNames = strp.reverseNames(sc.nextLine());
        System.out.println(reverseNames);
        System.out.println("Enter the name");
        // System.out.println("Reverse string "+reverseName);
        String result = strp.checkPalindrome(sc.nextLine());
        System.out.println(result);
    }
}
