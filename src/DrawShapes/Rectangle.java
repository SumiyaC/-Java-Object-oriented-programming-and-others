package DrawShapes;

import java.awt.Graphics;

import java.awt.Color;

public class Rectangle extends Shape {

private int width;

private int height;

public Rectangle(int x, int y, int width, int height, Color color) {

super(x, y, color);

this.width = width;

this.height = height;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

g.fillRect(x, y, width, height);

}

@Override

public double calculateArea() {

return width * height;

}

@Override

public double calculatePerimeter() {

return 2 * (width + height);

}

}
