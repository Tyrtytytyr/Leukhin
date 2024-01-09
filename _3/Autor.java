package _3;
public class Autor {
    private String name;
    private String email;
    private char gender;

    // Конструктор класса
    public Autor(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // Методы получения значений полей
    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }
    // Метод toString()
    public String toString() {
        String genderText;
        if (gender == 'M') {
            genderText = "(m)";
        } else if (gender == 'F') {
            genderText = "(f)";
        } else {
            genderText = "(---)";
        }
        return name + " " + genderText + " at " + email;
    }
}
