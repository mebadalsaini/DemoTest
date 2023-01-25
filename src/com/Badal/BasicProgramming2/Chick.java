package com.Badal.BasicProgramming2;

//import java.util.Random;


public class Chick {
    public Chick(){
        name = "Tiny";
        System.out.println("Setting constructor");
    }
    private String name = "Fluffy" ;
    {
        System.out.println("Set field");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Chick td = new Chick();
        System.out.println(td.name);
    }
}
