package _6;

class Poodle extends Dog {
    public Poodle(String color, int age) {
        super("Poodle", color, age);
    }

    @Override
    public void bark() {
        System.out.println("Poodle barks");
    }
}