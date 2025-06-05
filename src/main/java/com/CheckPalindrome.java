package com;

import java.util.Scanner;

public class CheckPalindrome {
    //check reverse digit
    public int reverseNumber(int n){
        int rem,rev=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    //check the palindrome number
    public String checkPalindrome(int n){
        //reverse number and compare
        int res=reverseNumber(n);
        if(res==n){
            return res+"Number is Palindrome";
        }
        else {
            return res+"number  is not Palindrome";
        }
    }

    public static void main(String[] args) {
        CheckPalindrome chpm=new CheckPalindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String result = chpm.checkPalindrome(sc.nextInt());
        System.out.println(result);
    }
}
