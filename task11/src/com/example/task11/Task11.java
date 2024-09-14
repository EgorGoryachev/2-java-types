package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки
        float proc = 0.0f;
        for (int i = 1; i <= 12; i++) {
            proc += (sum + proc) * percent;
        }
        return sum + proc;
    }

    public static void main(String[] args) {

        float sum = 500.0f; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
