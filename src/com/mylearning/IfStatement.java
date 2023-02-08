package com.mylearning;

public class IfStatement {

    public static void main(String[] args) {

        int myInt = 15;

        if (myInt < 10) {
            System.out.println("Yes its true");
        }
        else if (myInt > 20){
            System.out.println("No its false");
        }
        else {
            System.out.println("None of the above");
        }

        int loop = 0;

        while(loop < 5) {
            System.out.println("Looping: " + loop);

            if (loop == 5) {
                break;
            }
            loop++;

            System.out.println("Running");
        }
    }
}

