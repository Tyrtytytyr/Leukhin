package _1;

import java.lang.*;
public class Ball {
    private int circle;
    private int wt;

    public Ball(int n, int a) {
        circle = n;
        wt = a;
    }

    public Ball(int n) {
        circle = n;
        wt = 0;
    }

    public Ball() {
        circle = 0;
        wt = 0;
    }

    public void setWt(int wt) {
        this.wt = wt;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    public int getCircle(int circle) {
        return circle;
    }

    public int getWt() {
        return wt;
    }

    public String toString() {
        return "Circle " + this.circle + ", weight " + this.wt;
    }
}
