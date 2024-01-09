package _13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите информацию: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("file.txt")) {
            writer.write(input);
            System.out.println("Информация успешно заменена в файле!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}
