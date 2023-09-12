package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Polygon;

public class Pentagon extends Shape {

private int sideLength;

public Pentagon(int x, int y, int sideLength, Color color) {

super(x, y, color);

this.sideLength = sideLength;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

int[] xPoints = calculateXPoints();

int[] yPoints = calculateYPoints();

Polygon polygon = new Polygon(xPoints, yPoints, 5);

g.fillPolygon(polygon);

}

@Override

public double calculateArea() {

return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) / 4 * Math.pow(sideLength, 2);

}

@Override

public double calculatePerimeter() {

return 5 * sideLength;

}

private int[] calculateXPoints() {

int[] xPoints = new int[5];

double angle = 2 * Math.PI / 5;

for (int i = 0; i < 5; i++) {

xPoints[i] = (int) (x + sideLength * Math.cos(i * angle));

}

return xPoints;

}

private int[] calculateYPoints() {

int[] yPoints = new int[5];

double angle = 2 * Math.PI / 5;

for (int i = 0; i < 5; i++) {

yPoints[i] = (int) (y + sideLength * Math.sin(i * angle));

}

return yPoints;

}

}
