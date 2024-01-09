package _6;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, double price, int diameter) {
        super(material, color, price);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Using plate");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}