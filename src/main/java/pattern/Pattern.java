package pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        for (i = 1; i <=num ; i++) {
            System.out.println(" ");
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
