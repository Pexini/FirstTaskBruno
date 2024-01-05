package task1;

import java.util.Scanner;

public class MathMin {
    public static void main(String[] args) {
        System.out.println( "введите 3 переменные я расчитаю минимальное значение: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int averageAB =Math.min(a, b);
        int averageABC =Math.min(averageAB, c);

        System.out.println("минимальное значение :" + averageABC );
    }
}
