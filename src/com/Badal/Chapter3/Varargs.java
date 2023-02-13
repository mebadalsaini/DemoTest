package com.Badal.Chapter3;
class A{
    void add(int ... a){
        int sum = 0;
        for(int x : a){
            sum = sum + x;
        }
        System.out.println("The sum of the numbers : "+sum);
    }
}
public class Varargs {
    public static void main(String[] args) {
        A a = new A();
        a.add(); a.add(24,56); a.add( 23, 89, 54);
        a.add(12, 45, 48, 23); a.add(62, 51, 84, 95, 87);
    }
}
