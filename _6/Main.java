package _6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 10.99, 25);
        Cup cup = new Cup("Glass", "Clear", 5.99, 300);

        System.out.println("Plate material: " + plate.getMaterial());
        System.out.println("Plate color: " + plate.getColor());
        System.out.println("Plate price: " + plate.getPrice());
        System.out.println("Plate diameter: " + plate.getDiameter());

        System.out.println("Cup material: " + cup.getMaterial());
        System.out.println("Cup color: " + cup.getColor());
        System.out.println("Cup price: " + cup.getPrice());
        System.out.println("Cup volume: " + cup.getVolume());

        plate.use();
        cup.use();

        Labrador labrador = new Labrador("Golden", 5);
        Poodle poodle = new Poodle("White", 3);

        System.out.println("Labrador breed: " + labrador.getBreed());
        System.out.println("Labrador color: " + labrador.getColor());
        System.out.println("Labrador age: " + labrador.getAge());

        System.out.println("Poodle breed: " + poodle.getBreed());
        System.out.println("Labrador color: " + poodle.getColor());
        System.out.println("Labrador age: " + poodle.getAge());

        labrador.bark();
        poodle.bark();

        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Office Chair", 99.99, 5);
        Chair chair2 = new Chair("Dining Chair", 49.99, 4);
        Sofa sofa1 = new Sofa("Sectional Sofa", 699.99, 4);
        Sofa sofa2 = new Sofa("Sleeper Sofa", 499.99, 3);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(sofa1);
        shop.addFurniture(sofa2);

        shop.displayFurniture();
    }
}