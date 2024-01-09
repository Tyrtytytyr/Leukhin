package _12;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGame {
    Stack<Integer> fp, sp;

    public DrunkardGame(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        // Инициализация стеков с помощью входных строк
        // Строки преобразуются в целые числа и добавляются в стеки
        for (int i = 4; i >= 0; i--) {
            this.fp.push(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }
    // Метод для добавления элемента в конец стека
    private void pushBack(Stack<Integer> s, Integer item) {
        Stack<Integer> ns = new Stack<>();
        // Временный стек для хранения извлеченных элементов из 's'
        while (!s.isEmpty())
            ns.push(s.pop());
        // Добавление 'item' в конец стека 's'
        s.push(item);
        // Восстановление исходного порядка элементов в стеке 's'
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count <= 106) {
            if (fp.peek() > sp.peek()
                    && sp.peek() != 0) {
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            } else {
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
            }
            count++;
        }
        String res = "";
        if (fp.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if (count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа для первого игрока: ");
        String fp = scanner.nextLine();
        System.out.print("Введите числа для второго игрока: ");
        String sp = scanner.nextLine();
        DrunkardGame game = new DrunkardGame(fp, sp);

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("========== Игра началась! ==========");
            System.out.println("Текущее состояние карт:");
            System.out.println("Первый игрок: " + fp);
            System.out.println("Второй игрок: " + sp);

            String result = game.play();
            System.out.println("Результат: " + result);

            System.out.print("Хотите сыграть еще раз? (да/нет): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("нет")) {
                playAgain = false;
            } else if (choice.equalsIgnoreCase("да")) {
                System.out.print("Введите числа для первого игрока: ");
                fp = scanner.nextLine();
                System.out.print("Введите числа для второго игрока: ");
                sp = scanner.nextLine();
                game = new DrunkardGame(fp, sp);
            } else {
                System.out.println("Некорректный ввод. Игра завершается.");
                playAgain = false;
            }
        }
    }
}
