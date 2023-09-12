package DrawShapes;

import java.awt.Graphics;

import java.awt.Color;

public class Square extends Shape {

private int sideLength;

public Square(int x, int y, int sideLength, Color color) {

super(x, y, color);

this.sideLength = sideLength;

}

@Override

public void draw(Graphics g) {

g.setColor(color);

g.fillRect(x, y, sideLength, sideLength);

}

@Override

public double calculateArea() {

return Math.pow(sideLength, 2);

}

@Override

public double calculatePerimeter() {

return 4 * sideLength;

}
}
