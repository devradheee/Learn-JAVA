package com.First;

import java.util.Scanner;

public class Input-keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your roll no.");
//        int roll.no = input.nextInt();
//        System.out.println("Your roll no. is " + roll.no);

        int a = 234_000_000;  //underscores are ignored.
        // 10 is a literal. 'a' is called the identifier.
        System.out.println(a);
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
