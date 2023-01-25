package com.Badal.BasicProgramming;
import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the opertaion either + or - :");
        String sign = input.nextLine();
        int firstValue = input.nextInt();
        int secondValue = input.nextInt();

        if(sign.equals("+")){
            System.out.println("The sum is " + (firstValue+secondValue));
        }
        else if(sign.equals("-")){
            System.out.println("The subtraction is " + (firstValue-secondValue));
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}
