package org.example;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rem;
        while (num > 0) {
            num = num / 10;
            digit++;
        }
        System.out.println("Count of digit is :"+digit);
    }

}
