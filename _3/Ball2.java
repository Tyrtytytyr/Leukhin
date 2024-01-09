package _3;
public class Ball2 {
    private double x; // Положение мяча по оси Х
    private double y; // Положение мяча по оси Y
    private double xSpeed; // Скорость мяча по оси Х
    private double ySpeed; // Скорость мяча по оси Y
    public Ball2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Метод для задания положения мяча по обеим осям
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Метод для задания скорости мяча по обеим осям
    public void setXYSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // Метод для перемещения мяча на основе текущей скорости
    public void move() {
        x += xSpeed;
        y += ySpeed;
    }
    @Override
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}

