package ComplexNumberList;

import java.util.ArrayList;

public class ComplexList {

private ArrayList<Complex> list;

private int maxSize;

public ComplexList(int maxSize) {

list = new ArrayList<Complex>();

this.maxSize = maxSize;

}

public boolean isFull() {

return list.size() >= maxSize;

}

public int size() {

return list.size();

}

public Complex get(int index) {

return list.get(index);

}

public void add(Complex complex) {

if (!isFull()) {

list.add(complex);

} else {

System.out.println("Failed to add complex number: " + complex.toString());

}

}

public String toString() {

return "The list of complex numbers is: " + list.toString();

}

}
