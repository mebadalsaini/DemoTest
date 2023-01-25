package com.Badal.BasicProgramming2;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 34;
        marks[2] = 56;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int index = input.nextInt();

        System.out.println("Enter the value you want to divide the value with : ");
        int value = input.nextInt();
        try {
            System.out.println("The value of array at the index you have entered : " + marks[index]);
            System.out.println("The value after dividing it with the the value : " + marks[index] / value);
        }
        catch(ArithmeticException e){
            System.out.println("This is throwing :" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is throwing : " + e);
        }
        catch(java.lang.Exception e){
            System.out.println("This is throwing : " + e);
        }

    }
}
