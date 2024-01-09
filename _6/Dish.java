package _6;

abstract class Dish {
    protected String material;
    protected String color;
    protected double price;

    public Dish(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
