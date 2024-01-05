package task1;

import java.util.Scanner;

public class sallary {
    public static void main(String[] args) {
        System.out.println("введите заработные платы 4-х сотрудников: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maxAB = Math.max(a, b);
        int maxCD = Math.max(c, d);
        int max = Math.max(maxAB, maxCD);
        int minAB = Math.min(a, b);
        int minCD = Math.min(c, d);
        int min = Math.min(minAB, minCD);
        int average = max - min;
        System.out.println("Разница между минимальной и максимальной зарплатой составляет :" + average);

    }
}
