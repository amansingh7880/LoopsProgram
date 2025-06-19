package com;

import java.util.Scanner;

public class LogicMethod {
    //count digits
    //count the digits
    public int countDitits(int num){
        int digit=0;
        while (num>0){
            num=num/10;
            digit++;
        }
        return digit;
    }
    //reverse the number
    public int reverseDigit(int num){
        int rem;
        int rev = 0;
        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    //check palidrome
    public String checkPalindrome(int num){
        int reverseDigit = reverseDigit(num);
        if (reverseDigit==num)
            return num+" is Palindrome";
        else
            return num+" is not palindrome";
    }
}
class Test{
    public static void main(String[] args) {
        LogicMethod lgm=new LogicMethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String checked = lgm.checkPalindrome(sc.nextInt());
        System.out.println(checked);
    }
}