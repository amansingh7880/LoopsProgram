package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" Number is prime");
        }
        else {
            System.out.println(num+" number is not prime");
        }

    }
}


