package DrawShapes;

import java.awt.Graphics;

import java.awt.Color;

public class Circle extends Shape {

private int radius;

public Circle(int x, int y, int radius, Color color) {

super(x, y, color);

this.radius = radius;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);

}

@Override

public double calculateArea() {

return Math.PI * Math.pow(radius, 2);

}

@Override

public double calculatePerimeter() {

return 2 * Math.PI * radius;

}

}
