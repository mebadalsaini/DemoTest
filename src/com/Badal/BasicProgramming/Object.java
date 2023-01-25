package com.Badal.BasicProgramming;

public class Object {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(15);
        System.out.println(circle2.getArea());

        Circle circle3 = new Circle(34.67);
        System.out.println(circle3.getArea());
    }
}
