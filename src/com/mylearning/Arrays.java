package com.mylearning;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a command: ");
        String line = input.nextLine();

        switch (line) {
            case "start" -> System.out.println("Machine Started");
            case "stop" -> System.out.println("Machine Stopped");
            default -> System.out.println("Command not recognized");
        }
    }
}
