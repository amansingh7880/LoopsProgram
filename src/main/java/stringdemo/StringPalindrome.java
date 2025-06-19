package stringdemo;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        String rev="";
        System.out.println("Enter the string name");
        name=sc.nextLine();
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("String Reverse is :"+rev);
        if(rev.equalsIgnoreCase(name)){
            System.out.println(name+" is Palindrome");
        }
        else {
            System.out.println(name+" is not palindrome");
        }
    }
}
