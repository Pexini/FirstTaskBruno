package task1;

import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
     System.out.println("Привет, я помогу рассчитать площадь квадрата, пожалуйста введите любую сторону квадрата: ");
    Scanner scaner = new Scanner(System.in);
    int a = scaner.nextInt();
    int area = a * a; //вычисляем площадь квадрата

        System.out.println("Площадь квадрата равна "+ area);
}
}
