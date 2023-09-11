package ClassExercise1;

public class practise {

public static void main(String args[]) {

ClassExr1 c = new ClassExr1("Juthi",22,"Kokkola");

ClassExr1 d = new ClassExr1("Lamia",21,"Helsinki");

System.out.printf("1st Account name is:%s%n",c.getName());

System.out.printf("1st Account age is:%s%n",c.getAge());

System.out.printf("1st Account address is:%s%n",c.getAddress());

System.out.printf("2nd Account name is:%s%n",d.getName());

System.out.printf("2nd Account age is:%s%n",d.getAge());

System.out.printf("2nd Account address is:%s%n",d.getAddress());

}

}
