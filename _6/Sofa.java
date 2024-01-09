package _6;

public class Sofa extends Furniture {
    private int seats;

    public Sofa(String name, double price, int seats) {
        super(name, price);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Price: " + getPrice() + ", Seats: " + seats);
    }
}