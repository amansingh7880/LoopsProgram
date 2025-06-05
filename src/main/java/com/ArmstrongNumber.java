package com;

import java.util.Scanner;

public class ArmstrongNumber {
    //count digits
   public int countDigits(int n){
       int digits=0;
       while(n>0){
           n/=10;
           digits++;

       }
       return digits;
   }
   //counts power
    public int countPower(int n,int e){
       int p=1;
        for (int i = 1; i <=e; i++) {
            p=p*n;//p=1*2*=2*2=4*2=8
        }

        return p;
    }
    //chech armstrong
    public String checkArmstrong(int n) {
        //count digits of n;
        int e = countDigits(n);
        int rem, temp, sum = 0;
        int x;
        for (x = n; x > 0; x /= 10) //x=x/10=15=x/10=15
        {
            int m = x % 10;//153%10=3
            //find the power(e)of m(m-3)
            int ans = countPower(m, e);
            //add ans to sum
            sum = ans + sum;
        }
        if (n ==sum) {
            return sum+"Number is Armstrong";
        }
        else {
            return sum+"Number is not Armstrong";
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber armn=new ArmstrongNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int countDigit = armn.countDigits(sc.nextInt());
        System.out.println(countDigit);
        System.out.println("Enter the number");
        int countPower = armn.countPower(sc.nextInt(), sc.nextInt());
        System.out.println(countPower);
        System.out.println("Enter the number");
        String result = armn.checkArmstrong(sc.nextInt());
        System.out.println(result);

    }
}
