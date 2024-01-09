package _13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите информацию: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("file.txt")) {
            writer.write(input);
            System.out.println("Информация успешно записана в файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}
