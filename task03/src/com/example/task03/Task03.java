package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        return centimetre / 100;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(400);
        System.out.println(result);
    }

}
