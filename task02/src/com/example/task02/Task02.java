package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try {
            Byte.parseByte(input);
            return "byte";
        }
        catch (NumberFormatException e) {
            try {
                Short.parseShort(input);
                return "short";
            }
            catch (NumberFormatException e2) {
                try{
                    Integer.parseInt(input);
                    return "int";
                }
                catch (NumberFormatException e3) {
                    return "long";
                }
            }
        }
    }

    public static void main(String[] args) {

        String result = solution("-35000");
        System.out.println(result);

    }

}
