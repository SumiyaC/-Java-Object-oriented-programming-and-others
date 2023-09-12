package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

public class Cylinder extends Shape {

private int radius;

private int height;

public Cylinder(int x, int y, int radius, int height, Color color) {

super(x, y, color);

this.radius = radius;

this.height = height;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

// Draw the base circle

int baseX = x - radius;

int baseY = y - radius;

g.fillOval(baseX, baseY, 2 * radius, 2 * radius);

// Draw the curved surface

int surfaceX = x - radius;

int surfaceY = y;

g.fillRect(surfaceX, surfaceY, 2 * radius, height);

// Draw the top circle

int topX = x - radius;

int topY = y + radius;

g.fillOval(topX, topY, 2 * radius, 2 * radius);

//int topX = x - radius;

//int topY = y + height;

//g.fillOval(topX, topY, 2 * radius, 2 * radius);

}

@Override

public double calculateArea() {

double baseArea = Math.PI * Math.pow(radius, 2);

double surfaceArea = 2 * Math.PI * radius * height;

return 2 * baseArea + surfaceArea;

}

@Override

public double calculatePerimeter() {

return 2 * Math.PI * radius;

}

}
