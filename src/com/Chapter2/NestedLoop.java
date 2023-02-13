package com.Chapter2;

public class NestedLoop {
    public static void main(String[] args) {
        int[][] myComplexArray = {{12,23,56}, {32,65,98}};
        for(int[] mySimpleArray : myComplexArray){
            for(int i = 0; i<=myComplexArray.length; i++)
            System.out.println(mySimpleArray[i]);
            System.out.println("1" + "2");
    }

    }
}
