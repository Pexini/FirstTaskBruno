package task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class divideBy2 {
    public static void main(String[] args) {
        System.out.println("введите число, и я разделю его на 2, на 5 и на 10");
        Scanner scaner = new Scanner(System.in);
        double a = scaner.nextInt();
        double result2 = a / 2;
        double result5 = a / 5;
        double result10 = a / 10;
        System.out.println("Результат деления на 2: " + result2);
        System.out.println("Результат деления на 5: " + result5);
        System.out.println("Результат деления на 10: " + result10);
    }
}

