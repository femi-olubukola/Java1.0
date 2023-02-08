package com.mylearning;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a floating point value: ");

        double value = input.nextDouble();

        System.out.println("You entered: " + value);


        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value2 = input2.nextInt();
        System.out.println("Integer entered: ");

    }
}
