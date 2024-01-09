package _10;

import java.util.Scanner;

public class _1 {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int N = 12345; // здесь можно задать любое натуральное число
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }
}