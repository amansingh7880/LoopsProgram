package stringdemo;

import java.util.Scanner;

public class CheckingOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name");
        name=sc.nextLine();
        char ch[]=name.toCharArray();
        boolean b[]=new boolean[name.length()];

        for (int i = 0; i <ch.length ; i++) {
            if (b[i])
                continue;
            int c=1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        c++;
                        b[j] = true;
                    }
                }
                System.out.println(ch[i] + " " + c);

        }

    }
}
