package com.Badal.Chapter3;
import java.util.ArrayList;
public class ArraytListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.add(34);
        list.add(78);
        list.add(90);
        System.out.println(list);

        list.set(2, 45);
        System.out.println(list);

        int element = list.get(3);
        System.out.println(element);

        list.remove(2);
        System.out.println(list);

//        list.clear();



        int size = list.size();
        System.out.println(size);

        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println(list.isEmpty());

    }
   }
