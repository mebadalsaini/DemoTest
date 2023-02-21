package com.Badal.Chapter3;
import java.util.ArrayList;
public class ArrayNew {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        System.out.println(one.equals(two));

        one.add("a");

        System.out.println(one.equals(two));

        two.add("a");

        System.out.println(one.equals(two));

        one.add("b");

        two.add(0, "b");

        System.out.println(one.equals(two));

    }
}
