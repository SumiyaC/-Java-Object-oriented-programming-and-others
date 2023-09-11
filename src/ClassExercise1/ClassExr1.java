package ClassExercise1;

public class ClassExr1 {

private String name;

private int age;

private String address; // instance variable

public ClassExr1(String name,int age,String address) {

this.name=name;

this.age=age;

this.address=address;

//constructor name is class name;

}

public void setName(String name) {

this.name = name; // store the name

}

public void setAge(int age) {

this.age = age; // store the name

}

public void setAddress(String address) {

this.address = address; // store the name

}

// method to retrieve the name from the object

public String getName() {

return name; // return value of name to caller

}

public int getAge() {

return age; // return value of name to caller

}

public String getAddress() {

return address; // return value of name to caller

}

}
