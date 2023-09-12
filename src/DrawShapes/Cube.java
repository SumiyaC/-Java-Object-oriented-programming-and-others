package DrawShapes;

import java.awt.Color;

import java.awt.Graphics;

public class Cube extends Shape {

private int sideLength;

public Cube(int x, int y, int sideLength, Color color) {

super(x, y, color);

this.sideLength = sideLength;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

// Draw the top face

g.fillRect(x, y, sideLength, sideLength);

// Draw the front face

g.fillRect(x, y + sideLength, sideLength, sideLength);

// Draw the left face

g.fillRect(x - sideLength, y + sideLength, sideLength, sideLength);

// Draw the right face

g.fillRect(x + sideLength, y + sideLength, sideLength, sideLength);

// Draw the bottom face

g.fillRect(x, y + (2 * sideLength), sideLength, sideLength);

}

@Override

public double calculateArea() {

return 6 * Math.pow(sideLength, 2);

}

@Override

public double calculatePerimeter() {

return 12 * sideLength;

}

}
