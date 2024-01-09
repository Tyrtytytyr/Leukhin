package _4;

public class Leg {
    private int length;
    private int size;

    public Leg(int length, int size) {
        this.length = length;
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void walk() {
        System.out.println("Walking");
    }
}
