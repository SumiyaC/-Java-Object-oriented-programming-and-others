package UsingEnum;

import java.util.Calendar;

public class EmployeeEnum {

private String firstName;

private String lastName;

private Calendar birthDate;

private Calendar hireDate;

private EmployeeContractType employeeType;

public EmployeeEnum(String firstName, String lastName, Calendar birthDate, Calendar hireDate, EmployeeContractType employeeType) {

this.firstName = firstName;

this.lastName = lastName;

this.birthDate = birthDate;

this.hireDate = hireDate;

this.employeeType = employeeType;

}

public String getFirstName() {

return firstName;

}

public String getLastName() {

return lastName;

}

public Calendar getBirthDate() {

return birthDate;

}

public Calendar getHireDate() {

return hireDate;

}

public EmployeeContractType getEmployeeType() {

return employeeType;

}

public void setEmployeeType(EmployeeContractType employeeType) {

this.employeeType = employeeType;

}

public String toString() {

return String.format("%s %s%nBirthdate: %s%nHire date: %s%nEmployee type: %s%n",

firstName, lastName, birthDate.getTime(), hireDate.getTime(), employeeType);

}

}

enum EmployeeContractType {

Salaried, Hourly, ContractBased;

}
