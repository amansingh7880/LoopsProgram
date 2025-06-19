package com;

import java.util.Scanner;

public class CheckArmstrong {
    //check armstrong
    //count the power
    //countDigits
    public int countDigits(int num){
        int digit=0;
        while (num>0){
            num=num/10;
            digit++;
        }
        return digit;
    }
    public int countPower(int num,int e){
        int rem;
        int p=1;
        for (int i = 1; i <=e ; i++) {
            p=p*num;
        }
        return p;
    }
    //reverse number
    public int reverseaDigit(int num){
        int rem;
        int sum=0;
        while (num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        return sum;
    }
    //checkArmstrong
    public String checkArm(int num){
        int e = countDigits(num);
        int rem, sum = 0;
        int x;
        for (x = num; x >0 ; x/=10) {
            int m = x % 10;//153%10=3
            //find the power(e)of m(m-3)
            int ans = countPower(m, e);
            //add ans to sum
            sum = ans + sum;
        }
        if (sum==num)
            return num+" is armstrong";
        else
            return num+" is not armstrong";
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        CheckArmstrong chpm=new CheckArmstrong();
        int countPower = chpm.countPower(sc.nextInt(), sc.nextByte());
        System.out.println(countPower);
        System.out.println("enter the number");
        String checked = chpm.checkArm(sc.nextInt());
        System.out.println(checked);
    }
}