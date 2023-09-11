package EmployeePolymorphism;

public class BasePlusCommissionEmployee {

private double baseSalary;

private CommissionEmployee commissionEmployee;

public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {

commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

setBaseSalary(baseSalary);

}

public void setBaseSalary(double baseSalary) {

if (baseSalary < 0.0) {

throw new IllegalArgumentException("Base salary must be >= 0.0");

}

this.baseSalary = baseSalary;

}

public double getBaseSalary() {

return baseSalary;

}

public CommissionEmployee getCommissionEmployee() {

return commissionEmployee;

}

public void setCommissionEmployee(CommissionEmployee commissionEmployee) {

this.commissionEmployee = commissionEmployee;

}

public double earnings() {

return baseSalary + commissionEmployee.earnings();

}

@Override

public String toString() {

return String.format("%s %s%n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary",

getBaseSalary());

}

}
