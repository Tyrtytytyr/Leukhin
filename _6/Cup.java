package _6;

class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, double price, int volume) {
        super(material, color, price);
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Using cup");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
