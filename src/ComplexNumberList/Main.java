package ComplexNumberList;

//import static java.lang.System.out;

//import Complex.java;

//import ComplexList.java;

public class Main {

public static void main(String[] args) {

ComplexList complexList = new ComplexList(5);

complexList.add(Complex.of(2, 3));

complexList.add(Complex.of(4, 5));

complexList.add(Complex.of(6, 7));

if (!complexList.isFull()) {

System.out.println("The list is not full.");

}

System.out.println("There are " + complexList.size() + " complex numbers in the list.");

for (int i = 0; i < complexList.size(); i++) {

System.out.println("Complex number " + (i + 1) + ": " + complexList.get(i).toString());

}

complexList.add(Complex.of(8, 9));

complexList.add(Complex.of(10, 11));

if (complexList.isFull()) {

System.out.println("The list is full.");

}

complexList.add(Complex.of(12, 13));

System.out.println(complexList.toString());

}

}
