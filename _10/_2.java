package _10;

public class _2 {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n = 10; // здесь можно задать любое натуральное число
        printNumbers(n);
    }
}
