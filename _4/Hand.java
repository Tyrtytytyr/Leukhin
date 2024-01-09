package _4;

public class Hand {
    private int length;
    private boolean hasFingers;

    public Hand(int length, boolean hasFingers) {
        this.length = length;
        this.hasFingers = hasFingers;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHasFingers() {
        return hasFingers;
    }

    public void setHasFingers(boolean hasFingers) {
        this.hasFingers = hasFingers;
    }

    public void wave() {
        System.out.println("Waving");
    }
}
