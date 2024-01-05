package task1;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        /* для рассчета используем
            Формула Герона  */

        System.out.println("Привет, я помогу рассчитать площадь треугольника, пожалуйста введите поочередно три стороны треугольника: ");
        Scanner scaner = new Scanner(System.in);
        double a = scaner.nextInt();
        double b = scaner.nextInt();
        double c = scaner.nextInt();
        double p = (a + b + c) / 2; //вычисляем полупериметр
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Формула Герона для площади
        System.out.println("Площадь треугольника равена " + area);
    }
}
