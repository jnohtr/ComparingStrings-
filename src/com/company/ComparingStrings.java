package com.company;

import java.util.Scanner;
public class ComparingStrings {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer.equals("rain"))
            System.out.println("Take your umbrella!");
        else if (answer.equals("windy"))
            System.out.println("Wear your jacket!");
        else if (answer.equals("snow") )
            System.out.println("Wear a coat and take a shovel!");
        else if (answer.equals("stormy"))
            System.out.println("you should stay outside");
        else
            System.out.println("Enjoy your day!");
    }
}
