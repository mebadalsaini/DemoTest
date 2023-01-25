package com.Badal.BasicProgramming;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value between 1 to 7 to know the day of the month :");

        int week = input.nextInt();
        String weekday = new String();

        switch(week) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday ="Sunday";
                break;
            default:
                System.out.println("Invalid! Please select values between 1 to 7");
                break;
        }
        System.out.println("This is " + weekday);
    }
}
