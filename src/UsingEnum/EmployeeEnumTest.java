package UsingEnum;

import java.util.Calendar;

public class EmployeeEnumTest {

public static void main(String[] args) {

// Create an Employee object with a Salaried contract

Calendar birthDate1 = Calendar.getInstance();

birthDate1.set(2001, Calendar.APRIL, 8);

Calendar hireDate1 = Calendar.getInstance();

hireDate1.set(2023, Calendar.MAY, 5);

EmployeeEnum salariedEmployee = new EmployeeEnum("Sumiya", "Chowdhury", birthDate1, hireDate1, EmployeeContractType.Salaried);

System.out.println(salariedEmployee);

// Create another Employee object with a ContractBased contract

Calendar birthDate2 = Calendar.getInstance();

birthDate2.set(1980, Calendar.FEBRUARY, 22);

Calendar hireDate2 = Calendar.getInstance();

hireDate2.set(2010, Calendar.JUNE, 16);

EmployeeEnum contractBasedEmployee = new EmployeeEnum("Farida", "Easmin", birthDate2, hireDate2, EmployeeContractType.ContractBased);

System.out.println(contractBasedEmployee);

}

}
