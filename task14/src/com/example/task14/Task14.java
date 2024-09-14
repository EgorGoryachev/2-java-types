package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String value_str = Integer.toString(value);
        String revers_str = new StringBuilder(value_str).reverse().toString();
        value = Integer.valueOf(revers_str);
        return value;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
