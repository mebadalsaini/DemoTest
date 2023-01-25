package com.Badal.BasicProgramming;

public class Circle {
    private double radius;

    public Circle(){
        radius =2;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = radius*radius * Math.PI;
        return area;
    }
    }

