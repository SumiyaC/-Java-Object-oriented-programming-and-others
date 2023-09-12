package DrawShapes;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.ArrayList;

public class DrawingProgramm extends JFrame {

private JPanel drawingPanel;

private JButton rectangleButton;

private JButton circleButton;

private JButton triangleButton;

private JButton squareButton;

private JButton cubeButton;

private JButton cylinderButton;

private JButton hexagonButton;

private JButton parallelogramButton;

private JButton pentagonButton;

private JButton rightTriangleButton;

private JPanel infoPanel;

private ArrayList<Shape> shapes;

private int startX;

private int startY;

private int endX;

private int endY;

public DrawingProgramm() {

// Set up the main JFrame

super("Drawing Program");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setSize(800, 600);

// Create the components

drawingPanel = new JPanel() {

@Override

protected void paintComponent(Graphics g) {

super.paintComponent(g);

for (Shape shape : shapes) {

shape.draw(g);

}

}

};

rectangleButton = new JButton("Rectangle");

circleButton = new JButton("Circle");

triangleButton = new JButton("Triangle");

squareButton = new JButton("Square");

cubeButton = new JButton("Cube");

cylinderButton = new JButton("Cylinder");

hexagonButton = new JButton("Hexagon");

parallelogramButton = new JButton("Parallelogram");

pentagonButton = new JButton("Pentagon");

rightTriangleButton = new JButton("Right Triangle");

infoPanel = new JPanel(new FlowLayout()); // Use FlowLayout for infoPanel

shapes = new ArrayList<>();

// Create a panel to hold the buttons

JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

buttonsPanel.add(rectangleButton);

buttonsPanel.add(circleButton);

buttonsPanel.add(triangleButton);

buttonsPanel.add(squareButton);

buttonsPanel.add(cubeButton);

buttonsPanel.add(cylinderButton);

buttonsPanel.add(hexagonButton);

buttonsPanel.add(parallelogramButton);

buttonsPanel.add(pentagonButton);

buttonsPanel.add(rightTriangleButton);

// Add the components to the JFrame

add(buttonsPanel, BorderLayout.NORTH);

add(drawingPanel, BorderLayout.CENTER);

add(infoPanel, BorderLayout.SOUTH);

// Add event listeners to the buttons

rectangleButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(rectangleButton);

}

});

circleButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(circleButton);

}

});

triangleButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(triangleButton);

}

});

squareButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(squareButton);

}

});

cubeButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(cubeButton);

}

});

cylinderButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(cylinderButton);

}

});

hexagonButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(hexagonButton);

}

});

parallelogramButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
    selectButton(parallelogramButton);

}

});

pentagonButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(pentagonButton);

}

});

rightTriangleButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

selectButton(rightTriangleButton);

}

});

// Add mouse listener to the drawing panel

drawingPanel.addMouseListener(new MouseAdapter() {

public void mousePressed(MouseEvent e) {

startX = e.getX();

startY = e.getY();

}

public void mouseReleased(MouseEvent e) {

endX = e.getX();

endY = e.getY();

// Calculate shape attributes

int width = Math.abs(endX - startX);

int height = Math.abs(endY - startY);

int x = Math.min(startX, endX);

int y = Math.min(startY, endY);

// Create the shape and add it to the list

Shape shape = null;

if (rectangleButton.isSelected()) {

shape = new Rectangle(x, y, width, height, Color.BLACK);

} else if (circleButton.isSelected()) {

int radius = Math.max(width, height) / 2;

shape = new Circle(x + radius, y + radius, radius, Color.BLACK);

} else if (triangleButton.isSelected()) {

shape = new Triangle(x + width / 2, y, width, height, Color.BLACK);

} else if (squareButton.isSelected()) {

shape = new Square(x, y, width, Color.BLACK);

} else if (cubeButton.isSelected()) {

shape = new Cube(x, y, width, Color.BLACK);

} else if (cylinderButton.isSelected()) {

int radius = Math.max(width, height) / 2;

shape = new Cylinder(x + radius, y + radius, radius, height, Color.BLACK);

} else if (hexagonButton.isSelected()) {

shape = new Hexagon(x, y, width, Color.BLACK);

} else if (parallelogramButton.isSelected()) {

shape = new Parallelogram(x, y, width, height, Color.BLACK);

} else if (pentagonButton.isSelected()) {

shape = new Pentagon(x, y, width, Color.BLACK);

} else if (rightTriangleButton.isSelected()) {

shape = new RightTriangle(x, y, width, height, Color.BLACK);

}

if (shape != null) {

shapes.add(shape);

}

// Repaint the drawing panel

drawingPanel.repaint();

// Display shape information in the info panel

displayShapeInfo(shape);

}

});

// Display the JFrame

setVisible(true);

}

private void selectButton(JButton button) {

rectangleButton.setSelected(false);

circleButton.setSelected(false);

triangleButton.setSelected(false);

squareButton.setSelected(false);

cubeButton.setSelected(false);

cylinderButton.setSelected(false);

hexagonButton.setSelected(false);

parallelogramButton.setSelected(false);

pentagonButton.setSelected(false);

rightTriangleButton.setSelected(false);

button.setSelected(true);

}

private void displayShapeInfo(Shape shape) {

if (shape != null) {

System.out.println("Shape: " + shape.getClass().getSimpleName());

System.out.println("Area: " + shape.calculateArea());

System.out.println("Perimeter: " + shape.calculatePerimeter());

System.out.println();

}

}

public static void main(String[] args) {

new DrawingProgramm();

}

}
