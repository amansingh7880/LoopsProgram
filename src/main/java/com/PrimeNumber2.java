package com;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int i;
        for (i = 1; i<=num ; i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not Prime");
        }
    }
}
