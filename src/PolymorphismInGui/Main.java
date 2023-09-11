package PolymorphismInGui;

//Define a main class that demonstrates polymorphism with both window types

class Main {

public static void main(String[] args) {

// Create an application window and resize it

Window appWindow = new AppWindow();

appWindow.open();

appWindow.resize(800, 600);

appWindow.close();

// Create a dialog box window and resize it

Window dialogBox = new DialogBox();

dialogBox.open();

dialogBox.resize(400, 200);

dialogBox.close();

//additional class

Window popupWindow = new PopupWindow();

popupWindow.open();

popupWindow.resize(200, 150);

popupWindow.close();

}
}
