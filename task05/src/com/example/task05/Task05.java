package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String str = String.valueOf(x);
        int count = 0;
        for (int i = 0; i < str.length();i++){
            int number = Character.getNumericValue(str.charAt(i));
            if ((number % 2) == 0){
                count++;
            }
        }
        if (count == str.length()){
            return "TRUE";
        }
        else{
            return "FALSE";
        }
    }

    public static void main(String[] args) {
        String result = solution(0);
        System.out.println(result);
    }

}
