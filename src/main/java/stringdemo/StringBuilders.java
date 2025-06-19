package stringdemo;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder();
        System.out.println("Enter the String Name");
        str= new StringBuilder(sc.nextLine());
        StringBuilder reverse = str.reverse();
        System.out.println("String reverse is "+reverse);
        if (reverse.equals(str)){
            System.out.println(str+" is Palindrome");
        }
        else {
            System.out.println(str+" is not Palindrome");
        }
    }
}
