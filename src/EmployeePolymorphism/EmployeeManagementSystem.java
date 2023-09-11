package EmployeePolymorphism;

import java.util.ArrayList;

import java.util.Scanner;

public class EmployeeManagementSystem {

public static void main(String[] args) {

ArrayList<CommissionEmployee> commissionEmployees = new ArrayList<>();

ArrayList<BasePlusCommissionEmployee> basePlusCommissionEmployees = new ArrayList<>();

Scanner scanner = new Scanner(System.in);

while (true) {

System.out.println("Enter employee type (1 - Commission Employee, 2 - Base Plus Commission Employee, 0 - Quit):");

int employeeType = scanner.nextInt();

scanner.nextLine(); // Consume the newline character

if (employeeType == 0) {

System.out.println("You ended the process..");

}

if (employeeType == 1) {

System.out.print("First name: ");

String firstName = scanner.nextLine();

System.out.print("Last name: ");

String lastName = scanner.nextLine();

System.out.print("Social security number: ");

String socialSecurityNumber = scanner.nextLine();

System.out.print("Enter gross sales: ");

double grossSales = scanner.nextDouble();

System.out.print("Enter commission rate: ");

double commissionRate = scanner.nextDouble();

CommissionEmployee employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

commissionEmployees.add(employee);

} else if (employeeType == 2) {

System.out.print("First name: ");

String firstName = scanner.nextLine();

System.out.print("Last name: ");

String lastName = scanner.nextLine();

System.out.print("Social security number: ");

String socialSecurityNumber = scanner.nextLine();

System.out.print("Enter gross sales: ");

double grossSales = scanner.nextDouble();

System.out.print("Enter commission rate: ");

double commissionRate = scanner.nextDouble();

System.out.print("Enter base salary: ");

double baseSalary = scanner.nextDouble();

BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);

basePlusCommissionEmployees.add(employee);

} else {

break;

}

scanner.nextLine(); // Consume the newline character

System.out.println();

}

System.out.println("Employee Information:");

for (CommissionEmployee employee : commissionEmployees) {

System.out.println("First Name: " + employee.getFirstName());

System.out.println("Last Name: " + employee.getLastName());

System.out.println("Social Security Number: " + employee.getSocialSecurityNumber());

System.out.println("Earnings: $" + employee.earnings());

System.out.println();

}

for (BasePlusCommissionEmployee employee : basePlusCommissionEmployees) {

System.out.println("First Name: " + employee.getCommissionEmployee().getFirstName());

System.out.println("Last Name: " + employee.getCommissionEmployee().getLastName());

System.out.println("Social Security Number: " + employee.getCommissionEmployee().getSocialSecurityNumber());

System.out.println("Earnings: $" + employee.earnings());

System.out.println();

}

}

}
