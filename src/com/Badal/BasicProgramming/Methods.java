package com.Badal.BasicProgramming;

public class Methods {
    public static void main(String[] args) {
        int firstValue = 13;
        int secondValue = 42;
        int rs = maxValue(firstValue, secondValue);
        System.out.println(rs);

        double firstDoubleValue = 678.5;
        double secondDoubleValue = 789.9;
        double doubleResult= maxValues(firstDoubleValue, secondDoubleValue);
        System.out.println(doubleResult);
    }
    public static int maxValue(int firstParam, int secondParam){
        int result;
        if(firstParam>secondParam){
            result = firstParam;
        }else{
            result = secondParam;
        }
        return result;
    }
    //Method overloadinig: methods with the same name but different paramerters
    public static double maxValues(double firstParam, double secondParam){
        double result;
        if(firstParam>secondParam){
            result = firstParam;
        }else{
            result = secondParam;
        }
        return result;
    }
}
