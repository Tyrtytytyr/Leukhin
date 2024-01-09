package _9;

class Animal implements Priceable {
    private String species;
    private double price;

    public Animal(String species, double price) {
        this.species = species;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}