package _13;

import java.io.FileReader;
import java.io.IOException;

public class _2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nИнформация успешно выведена на экран!");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
