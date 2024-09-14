package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String number = Integer.toString(x + y);
        return number.replace("-","").length();
    }

    public static void main(String[] args) {
        int result = solution(-111, -222);
        System.out.println(result);
    }

}
