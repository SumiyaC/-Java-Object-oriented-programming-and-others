package DrawShapes;

import java.awt.Graphics;

import java.awt.Color;

public class Triangle extends Shape {

private int base;

private int height;

public Triangle(int x, int y, int base, int height, Color color) {

super(x, y, color);

this.base = base;

this.height = height;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

int[] xPoints = { x, x - base / 2, x + base / 2 };

int[] yPoints = { y, y + height, y + height };

g.fillPolygon(xPoints, yPoints, 3);

}

@Override

public double calculateArea() {

return 0.5 * base * height;

}

@Override

public double calculatePerimeter() {

return base + 2 * Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(height, 2));

}

}
