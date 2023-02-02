package com.Badal.BasicProgramming2;

public class Snake {
    private String result = "done";
    public boolean shed(boolean time){

        if(time){

        }
        System.out.println(result);

        return time;
    }

    public static void main(String[] args) {
        Snake ss = new Snake();
        System.out.println(ss.shed(true));
    }
}
