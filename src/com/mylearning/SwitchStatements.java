package com.mylearning;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Command: ");

        String line = input.nextLine();

        switch (line) {
            case "start":
                System.out.println("Machine Started");
                break;

            case "stop":
                System.out.println("Machine Stopped");
                break;

            default:
                System.out.println("Command not recognized");
        }

    }
}
