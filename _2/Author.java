package _2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String a, String b, char g) {
        name = a;
        email = b;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return this.name+"("+this.gender+") at "+this.email;
    }
}
