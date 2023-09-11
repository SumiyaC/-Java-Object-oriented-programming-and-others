package PolymorphismInGui;

//Define a class for the popup window

class PopupWindow implements Window {

public void open() {

System.out.println("Opening popup window...");

}

public void close() {

System.out.println("Closing popup window...");

}

public void resize(int width, int height) {

System.out.println("Resizing popup window to " + width + "x" + height + "...");

}

}
