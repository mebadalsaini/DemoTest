package com.Badal.Collections;

import com.sun.source.tree.SynchronizedTree;

import java.io.Serializable;
import java.util.*;
//import org.springframework.util.StringUtils;


public class ArrayListCreation {
    public static void main(String[] args) {
        String [] str = new String[]{"Anthony", "Marry", "John"};
//        System.out.println("Array : " + Arrays.toString(str));

        List<String> names = new ArrayList<String>();
                names.add("Bob");
                names.add("Jenna");
                names.add("Tyler");
                names.add(2,"Linda");
                names.add("23");
//        System.out.println("List : " +names);
        String[] a  = names.toArray(new String[names.size()]);
        System.out.println(names);
        List al = Arrays.asList(a);
        System.out.println(al);
Collection
for(String x : a){
    System.out.println(x + " ");
}
        List<String> id = new ArrayList<>();
        id.add("12");
        id.add("23");
        id.add("21");
//        System.out.println(id);
        names.addAll(1, id);
//        System.out.println(names);
//        System.out.println(names.indexOf("23"));
//        String arrayListToString = StringUtils.collectionToCommaDelimitedString(names);
        List<String> strList = Arrays.asList("Anthony", "Marry", "John");
//        System.out.println("List created and initialized at the same time : "  +  strList);
    }
}