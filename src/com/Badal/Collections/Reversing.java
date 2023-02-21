package com.Badal.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Reversing {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(32);
        al.add(90);
        System.out.println("Before Reversing : " + al);
        Collections.reverse(al);
        System.out.println("After Reversing : " + al);
    }
}
