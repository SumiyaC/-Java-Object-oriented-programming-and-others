package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

public class RightTriangle extends Shape {

private int base;

private int height;

public RightTriangle(int x, int y, int base, int height, Color color) {

super(x, y, color);

this.base = base;

this.height = height;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

int[] xPoints = { x, x, x + base };

int[] yPoints = { y, y + height, y };

g.fillPolygon(xPoints, yPoints, 3);

}

@Override

public double calculateArea() {

return (base * height) / 2.0;

}

@Override

public double calculatePerimeter() {

double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

return base + height + hypotenuse;

}

}
