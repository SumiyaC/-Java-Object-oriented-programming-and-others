package PolymorphismInGui;

//Define a class for the main application window

class AppWindow implements Window {

public void open() {

System.out.println("Opening application window...");

}

public void close() {

System.out.println("Closing application window...");

}

public void resize(int width, int height) {

System.out.println("Resizing application window to " + width + "x" + height + "...");

}

}
