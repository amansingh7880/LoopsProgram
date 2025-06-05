package com;

import java.util.Scanner;

public class ArmStrong {
     //calculate digits
    public int countDigit(int n){
         int digits=0;
         while (n>0){
             n=n/10;
             digits++;
         }
         return digits;
     }
     //calculate power
    public int calculatePower(int n,int e){
        int p=1;
        for (int i = 0; i <=e; i++) {
            p=p*n;
        }
        return p;
    }
    //2*2*2=8
     public int reveserNumber(int num){
         int temp=0,rem,rev=0;
         temp=num;
         while (num>0){
             rem=num%10;
             rev=rev*10+rem;
             num=num/10;
         }
         return rev;
     }
     public String palindromNumber(int num){
         int reveserNumber = reveserNumber(num);
         if(reveserNumber==num){
             return num+"Number is palindrome";
         }
         else {
             return num+"Number is not palindrome";
         }
     }
    public  String revrseDigit(int num){
        int temp=0,rem;
        temp=num;
        int sum=0;

        while (num>0){
            rem=num%10;
            sum= (int) (sum+Math.pow(rem,3));
            num=num/10;
        }
        if(sum==temp){
            return sum+"Number is armstrong";
        }
        else
            return sum+" Number is not armstrong";
    }
    public static void main(String[] args) {
        ArmStrong arm=new ArmStrong();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int countDigit = arm.countDigit(sc.nextInt());
        System.out.println("count digits "+countDigit);
        System.out.println("Enter the number");
        String msg = arm.revrseDigit(sc.nextInt());
        System.out.println(msg);
        System.out.println("Enter the number");
        int reveserNumber = arm.reveserNumber(sc.nextInt());
        System.out.println("Reverse number is "+reveserNumber);
        System.out.println("Enter the number");
        String msgs = arm.palindromNumber(sc.nextInt());
        System.out.println(msgs);
    }
}
