package stringdemo;

import java.util.Scanner;

public class StringOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String name");
        String str=sc.nextLine();
        System.out.println("Check the String name");
        String checkword=sc.nextLine();
        int index=0;
        int count=0;
        while ((index=str.indexOf(checkword,index))!=-1){
            count++;
            index+=checkword.length();
        }
        System.out.println("Occurrences of the "+checkword+count);
    }
}
