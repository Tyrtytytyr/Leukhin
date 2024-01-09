package _6;

class Labrador extends Dog {
    public Labrador(String color, int age) {
        super("Labrador", color, age);
    }

    @Override
    public void bark() {
        System.out.println("Labrador barks");
    }
}
