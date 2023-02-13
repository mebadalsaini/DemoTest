package com.Badal.Chapter3;

import java.util.Arrays;

public class StringTest {
    public static <L> void main(String[] args) {
//        int[] numbers = { 6, 9, 1 };
//        Arrays.sort(numbers);
//        for (int i = 0; i < numbers.length; i++)
//            System.out.print (numbers[i] + " ");
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 4));
                System.out.println(Arrays.binarySearch(numbers, 1));
                        System.out.println(Arrays.binarySearch(numbers,3));
                                System.out.println(Arrays.binarySearch(numbers,9));
                                        System.out.println(Arrays.binarySearch(numbers,
                                                2));

    }
}
