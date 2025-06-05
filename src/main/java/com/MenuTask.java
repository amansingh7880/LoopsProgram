package com;

import java.util.Scanner;

public class MenuTask {
    //check even odd
    public String checkEven(int num){
        if(num%2==0){
            return num+" Number is Even";
        }
        else {
            return num+" Number is odd";

        }

    }
    //positive negative
    public String checkPositiveNumber(int num){
        if(num>=0){
            return num+"Number is positive";
        }
        else {
            return num+"Number is negative";
        }
    }
    //print factorial
    public int factiralNumber(int num){
        int f=1;
        for (int i = 1; i < num; i++) {
            f=f*i;

        }
        return f;
    }

    public static void main(String[] args) {
        MenuTask mt=new MenuTask();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("0. Exit");
            System.out.println("1. Check Even Odd Number ");
            System.out.println("2. Check Positive");
            System.out.println("3. Print Factorial Number");
            System.out.println("4. Check The ArmStrong Number ");
            System.out.println("5. Check The Palindrome");
            System.out.println("6. Calculate The Power");
            System.out.println("Enter your choice :");
            ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter the number");
                String checked = mt.checkEven(sc.nextInt());
                System.out.println(checked);
            } else if (ch==2) {
                System.out.println("Enter the number");
                String positiveNumber = mt.checkPositiveNumber(sc.nextInt());
                System.out.println(positiveNumber);
            } else if (ch==3) {
                System.out.println("Enter the number");
                int factiralNumber = mt.factiralNumber(sc.nextInt());
                System.out.println("Number is factorial"+factiralNumber);
            } else if (ch==4) {
                ArmstrongNumber arm=new ArmstrongNumber();
                System.out.println("Enter the Number");
                String checked = arm.checkArmstrong(sc.nextInt());
                System.out.println(checked);
            } else if (ch==5) {
                CheckPalindrome chpm=new CheckPalindrome();
                System.out.println("Enter the Number");
                String checked = chpm.checkPalindrome(sc.nextInt());
                System.out.println(checked);
            } else if (ch==6) {
                System.out.println("Check The power of number");
                ArmstrongNumber arm=new ArmstrongNumber();
                int countPower = arm.countPower(sc.nextInt(), sc.nextInt());
                System.out.println(countPower);

            } else if (ch==0) {
                System.out.println("Good bye!!");
            }
            else {
                System.out.println("Wrong choice!");
            }
            System.out.println("------------------------------------");

        }while (ch!=0);

    }
}
