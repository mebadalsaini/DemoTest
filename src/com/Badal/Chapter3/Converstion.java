package com.Badal.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Converstion {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Yellow"};
//        List list = Arrays.asList(colors);
//        System.out.println(list);
        ArrayList<String> l = new ArrayList<>();
//        Collections.addAll(l, colors);
//        System.out.println(l);
        for (String str: colors) {
            l.add(str);
        }
        System.out.println(l);
    }
}
