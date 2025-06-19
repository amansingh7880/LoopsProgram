package org.example;
import java.util.Scanner;
public class Primenumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        for (int i = 1; i<=num ; i++) {
            if(num%i==0) {
                count++;
            }

        }
        if(count==1){
            System.out.println(num+ "Number is prime");
        }
        else {
            System.out.println(num+ "Number is not prime");
        }
    }
}
