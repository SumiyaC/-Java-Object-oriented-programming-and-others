package PolymorphismInGui;

//Define a class for the dialog box window

class DialogBox implements Window {

public void open() {

System.out.println("Opening dialog box window...");

}

public void close() {

System.out.println("Closing dialog box window...");

}

public void resize(int width, int height) {

System.out.println("Resizing dialog box window to " + width + "x" + height + "...");

}

}
