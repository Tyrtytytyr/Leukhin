package _3;
public class TestAutor {
    public static void main(String[] args) {
        // Создание объекта Author
        Autor author = new Autor("John Doe", "johndoe@example.com", 'M');

        // Получение значений полей с помощью геттеров
        String name = author.getName();
        String email = author.getEmail();
        char gender = author.getGender();

        // Вывод значений полей
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
        System.out.println("Author Gender: " + gender);

        // Проверка значения пола автора
        if (gender == 'M') {
            System.out.println("Author is male.");
        } else if (gender == 'F') {
            System.out.println("Author is female.");
        } else {
            System.out.println("Author gender is ---.");
        }
    }
}
