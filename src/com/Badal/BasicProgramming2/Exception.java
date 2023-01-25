package com.Badal.BasicProgramming2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        int num1;
        int num2;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers you want to divide : ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        try {
            result = num1 / num2;
            System.out.println(result);
        }
        catch (java.lang.Exception e){
            System.out.println("Invalid input!" + e);
        }
        System.out.println("Rest code execution");
    }
}
