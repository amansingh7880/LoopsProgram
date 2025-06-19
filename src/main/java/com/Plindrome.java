package com;

import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rem;
        int sum=0;
        int temp=num;
        while (num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println(sum+" Palindrome number");
        }
        else {
            System.out.println(sum+" not Palindrome number");
        }
    }
}
