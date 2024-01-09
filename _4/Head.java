package _4;

public class Head {
    private String hairColor;
    private int eyesCount;

    public Head(String hairColor, int eyesCount) {
        this.hairColor = hairColor;
        this.eyesCount = eyesCount;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(int eyesCount) {
        this.eyesCount = eyesCount;
    }

    public void shakeHead() {
        System.out.println("Shaking head");
    }
}
