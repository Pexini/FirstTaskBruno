package task1;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        System.out.println("Сейчас я помогу вам раcчитать процент голосов за кандидатов на выборах!");
        System.out.println("Пожалуйста введите количество проголосовавших за первого кандидата : ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("Пожалуйста введите количество проголосовавших за второго кандидата : ");
        double second = scanner.nextInt();
        double total = first + second;
        double result1 = (first / total) * 100;
        double result2 = (second / total) * 100;
        System.out.println("результат выборов: За первого кандидата проголосовало " + result1);
        System.out.println("результат выборов: За второго кандидата проголосовало " + result2);

    }
}
