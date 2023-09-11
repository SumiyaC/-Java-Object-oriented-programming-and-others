package UsingG_AI;

import java.util.ArrayList;

import java.util.Scanner;

public class EmployeeManagementProgram {

private ArrayList<Employee> employees;

public EmployeeManagementProgram() {

employees = new ArrayList<>();

}

public void run() {

Scanner scanner = new Scanner(System.in);

int choice;

do {

displayMenu();

choice = scanner.nextInt();

scanner.nextLine(); // Consume the newline character

switch (choice) {

case 1:

addEmployees(scanner);

break;

case 2:

modifyEmployee(scanner);

break;

case 3:

showEmployeeDetails(scanner);

break;

case 4:

System.out.println("Exiting the program...");

break;

default:

System.out.println("Invalid choice. Please try again.");

}

System.out.println();

} while (choice != 4);

}

private void displayMenu() {

System.out.println("Employee Management Program");

System.out.println("1. Add employees");

System.out.println("2. Modify an employee");

System.out.println("3. Show employee details");

System.out.println("4. Exit");

System.out.print("Enter your choice: ");

}

private void addEmployees(Scanner scanner) {

System.out.println("Adding employees...");

System.out.print("Enter the number of employees to add: ");

int count = scanner.nextInt();

scanner.nextLine(); // Consume the newline character

for (int i = 0; i < count; i++) {

System.out.println("Enter details for employee " + (i + 1));

System.out.print("Enter the employee type (1: Salaried, 2: Hourly): ");

int type = scanner.nextInt();

scanner.nextLine(); // Consume the newline character

Employee employee;

if (type == 1) {

employee = createSalariedEmployee(scanner);

} else if (type == 2) {

employee = createHourlyEmployee(scanner);

} else {

System.out.println("Invalid employee type. Skipping employee...");

continue;

}

employees.add(employee);

System.out.println("Employee added successfully.");

}

}

private Employee createSalariedEmployee(Scanner scanner) {

System.out.print("Enter the first name: ");

String firstName = scanner.nextLine();

System.out.print("Enter the last name: ");

String lastName = scanner.nextLine();

System.out.print("Enter the social security number: ");

String socialSecurityNumber = scanner.nextLine();

System.out.print("Enter the weekly salary: ");

double weeklySalary = scanner.nextDouble();

scanner.nextLine(); // Consume the newline character

return new SalariedEmployee(firstName, lastName, socialSecurityNumber, weeklySalary);

}

private Employee createHourlyEmployee(Scanner scanner) {

System.out.print("Enter the first name: ");

String firstName = scanner.nextLine();

System.out.print("Enter the last name: ");

String lastName = scanner.nextLine();

System.out.print("Enter the social security number: ");

String socialSecurityNumber = scanner.nextLine();

System.out.print("Enter the hourly wage: ");

double hourlyWage = scanner.nextDouble();

System.out.print("Enter the hours worked: ");

double hoursWorked = scanner.nextDouble();

scanner.nextLine(); // Consume the newline character

return new HourlyEmployee(firstName, lastName, socialSecurityNumber, hourlyWage, hoursWorked);

}

private void modifyEmployee(Scanner scanner) {

if (employees.isEmpty()) {

System.out.println("No employees found. Please add employees first.");

return;

}

System.out.println("Modifying an employee...");

System.out.print("Enter the social security number of the employee to modify: ");

String socialSecurityNumber = scanner.nextLine();

Employee employee = findEmployeeBySocialSecurityNumber(socialSecurityNumber);

if (employee == null) {

System.out.println("Employee not found.");

return;

}

System.out.println("Employee found:");

System.out.println(employee);

System.out.print("Enter the new first name (leave blank to keep the same): ");

String firstName = scanner.nextLine();

if (!firstName.isEmpty()) {

employee.setFirstName(firstName);

}

System.out.print("Enter the new last name (leave blank to keep the same): ");

String lastName = scanner.nextLine();

if (!lastName.isEmpty()) {

employee.setLastName(lastName);

}

System.out.println("Employee modified successfully.");

}

private void showEmployeeDetails(Scanner scanner) {

if (employees.isEmpty()) {

System.out.println("No employees found.");

return;

}

System.out.println("Showing employee details...");

System.out.println("1. Show details for all employees");

System.out.println("2. Show details for a specific employee");

System.out.print("Enter your choice: ");

int choice = scanner.nextInt();

scanner.nextLine(); // Consume the newline character

if (choice == 1) {

for (Employee employee : employees) {

System.out.println(employee);

}

} else if (choice == 2) {

System.out.print("Enter the social security number of the employee: ");

String socialSecurityNumber = scanner.nextLine();

Employee employee = findEmployeeBySocialSecurityNumber(socialSecurityNumber);

if (employee == null) {

System.out.println("Employee not found.");

return;

}

System.out.println("Employee found:");

System.out.println(employee);

} else {

System.out.println("Invalid choice.");

}

}

private Employee findEmployeeBySocialSecurityNumber(String socialSecurityNumber) {

for (Employee employee : employees) {

if (employee.getSocialSecurityNumber().equals(socialSecurityNumber)) {

return employee;

}

}

return null;

}

public static void main(String[] args) {

EmployeeManagementProgram program = new EmployeeManagementProgram();

program.run();

}

}
