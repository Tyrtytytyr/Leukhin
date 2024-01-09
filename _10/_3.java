package _10;

public class _3 {
    public static void main(String[] args) {
        int n = 12345;
        int sum = digitSum(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }

    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + digitSum(n / 10);
        }
    }
}
