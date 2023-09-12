package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Polygon;

public class Hexagon extends Shape {

private int sideLength;

public Hexagon(int x, int y, int sideLength, Color color) {

super(x, y, color);

this.sideLength = sideLength;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

int[] xPoints = calculateXPoints();

int[] yPoints = calculateYPoints();

Polygon polygon = new Polygon(xPoints, yPoints, 6);

g.fillPolygon(polygon);

}

@Override

public double calculateArea() {

return (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

}

@Override

public double calculatePerimeter() {

return 6 * sideLength;

}

private int[] calculateXPoints() {

int[] xPoints = new int[6];

double angle = 2 * Math.PI / 6;

for (int i = 0; i < 6; i++) {

xPoints[i] = (int) (x + sideLength * Math.cos(i * angle));

}

return xPoints;

}

private int[] calculateYPoints() {

int[] yPoints = new int[6];

double angle = 2 * Math.PI / 6;

for (int i = 0; i < 6; i++) {

yPoints[i] = (int) (y + sideLength * Math.sin(i * angle));

}

return yPoints;

}

}
