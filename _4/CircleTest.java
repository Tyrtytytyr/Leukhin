package _4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area: " + circle.getArea());
        System.out.println("New circumference: " + circle.getCircumference());
    }
}