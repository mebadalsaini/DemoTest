package com.Badal.BasicProgramming2;

public class Obj {
    public static void main(String[] args) {
        Tom tom1 = new Tom();
        System.out.println(" Tom1 " +tom1.toString());

        Tom tom2 = new Tom(false, true, true);
        System.out.println(" Tom2 " +tom2.toString());

        Tom tom3 = new Tom(true, true, true);
        System.out.println(" Tom3 " +tom3.toString());
    }
}
