package _8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class CircleShape extends Shape {
    private int radius;

    public CircleShape(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}