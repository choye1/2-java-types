package com.example.task06;


public class Task06 {

    public static int solution(int x, int y) {

        String num = Integer.toString(Math.abs(x+y));
        return num.length() ;
    }

    public static void main(String[] args) {

        int result = solution(-111, -222);
        System.out.println(result);

    }

}
