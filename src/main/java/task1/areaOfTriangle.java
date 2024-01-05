package task1;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Привет, я помогу рассчитать периметр треугольника, пожалуйста введите поочередно три стороны треугольника: ");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        int c = scaner.nextInt();
        int rezult = a + b + c;
        System.out.println("Периметр треугольника равен " + rezult);
    }
}
