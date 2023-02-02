package com.Badal.BasicProgramming2;

import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the time?");
        int hourOfDay = input.nextInt();

        if(hourOfDay<11){
            int morningGreetingCount = 0;
            System.out.println("Good morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);
        }
        if(hourOfDay>=11){
            System.out.println("Good Afternoon");
        }
    }

}
