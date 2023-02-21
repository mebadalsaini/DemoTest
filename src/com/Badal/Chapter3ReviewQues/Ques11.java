package com.Badal.Chapter3ReviewQues;

public class Ques11 {
    public static void main(String[] args) {
//        int total = 0;
//        StringBuilder letters = new StringBuilder("abcdefg");
//        total += letters.substring(1, 2).length();
//        total += letters.substring(6, 6).length();
//        total += letters.substring(6, 5).length();
//        System.out.println(total);
        StringBuilder b = new StringBuilder("rumble");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }
}
