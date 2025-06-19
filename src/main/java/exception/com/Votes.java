package exception.com;

import java.util.Scanner;
public class Votes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for the votes");
        }
        else
        {
            try {
                throw new Customs("Age must be 18 eligible for the votes ");
            } catch (Customs e) {

                throw new RuntimeException(e);
            }
        }
    }
}
