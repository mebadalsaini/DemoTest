package com.Chapter2;

public class ForLoop {
    public static void main(String[] args) {
//        int x = 0;
//        for (long y = 0, x = 4; x<10 && y<10; x++, y++){
//            System.out.println(x + " ");
//        }
////        System.out.println(x);
//        byte a =40 , b = 50;
//        byte sum = (byte) (a + b);
//        System.out.println(sum);
//        int x = 1;
//        int y = 15;
//        while (x < 10){
//         y--;
//        x++;}
//        System.out.println(x+", "+y);
//        int y = 1;
//        do {
////            y = 1;
//            System.out.print(y++ + " ");
//            break;
//        } while (y <= 10);{
//            System.out.println("HEy");
//        }
        boolean keepGoing = true;
        int result = 15, i = 10;
         do {
             i--;
             if(i==8) keepGoing = false;
             result -= 2;
             } while(keepGoing);
         System.out.println(result);


    }
}
