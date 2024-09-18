package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while (x>0){
            int remains = x%10;
            if (remains % 2 != 0){
                return "FALSE";
            }

            x = x/10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(24);
        System.out.println(result);

    }

}
