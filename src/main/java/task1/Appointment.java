package task1;

import java.util.Scanner;

public class Appointment {
    public static void main(String[] args) {
        System.out.println("введите число пациентов на приеме у врача: ");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int min = a * 10;
        int max = a * 20;
        int aver = (10 + 20) / 2 * a;
        System.out.println("Минимальное время ожидания: " + min + " мин");
        System.out.println("Максимальное время ожидания: " + max + " мин");
        System.out.println("Среднее время ожидания: " + aver + " мин");
    }
}
