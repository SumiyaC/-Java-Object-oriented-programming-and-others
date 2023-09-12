package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

public class Parallelogram extends Shape {

private int baseLength;

private int height;

public Parallelogram(int x, int y, int baseLength, int height, Color color) {

super(x, y, color);

this.baseLength = baseLength;

this.height = height;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

int[] xPoints = { x, x + baseLength, x + baseLength - height, x - height };

int[] yPoints = { y, y, y + height, y + height };

g.fillPolygon(xPoints, yPoints, 4);

}

@Override

public double calculateArea() {

return baseLength * height;

}

@Override

public double calculatePerimeter() {

return 2 * (baseLength + height);

}

}
