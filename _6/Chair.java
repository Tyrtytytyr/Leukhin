package _6;

public class Chair extends Furniture {
    private int legs;

    public Chair(String name, double price, int legs) {
        super(name, price);
        this.legs = legs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Price: " + getPrice() + ", Legs: " + legs);
    }
}

