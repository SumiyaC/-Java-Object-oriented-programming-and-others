// // package CombiningCompAndInherit;

// // import java.util.ArrayList;

// // import java.util.List;

// // import java.util.Scanner;

// // public class TestApplication {

// // public static void main(String[] args) {

// // List<Payable> payableItems = new ArrayList<>();

// // Scanner scanner = new Scanner(System.in);

// // System.out.println("Enter employee details:");

// // System.out.print("First name: ");

// // String firstName = scanner.nextLine();

// // System.out.print("Last name: ");

// // String lastName = scanner.nextLine();

// // System.out.print("Social security number: ");

// // String socialSecurityNumber = scanner.nextLine();

// // Employee employee;

// // System.out.println("Select compensation model (1 - Salaried, 2 - Hourly, 3 - Commission, 4 - Base Plus Commission):");

// // int modelChoice = scanner.nextInt();

// // if (modelChoice == 1) {

// // System.out.print("Enter weekly salary: ");

// // double weeklySalary = scanner.nextDouble();

// // CompensationModel compensationModel = new SalariedCompensationModel(weeklySalary);

// // employee = new SalariedEmployee(firstName, lastName, socialSecurityNumber, compensationModel, weeklySalary);

// // } else if (modelChoice == 2) {

// // System.out.print("Enter wage: ");

// // double wage = scanner.nextDouble();

// // System.out.print("Enter hours worked: ");

// // double hours = scanner.nextDouble();

// // CompensationModel compensationModel = new HourlyCompensationModel(wage, hours);

// // employee = new HourlyEmployee(firstName, lastName,socialSecurityNumber,wage,hours,compensationModel);

// // } else if (modelChoice == 3) {

// // System.out.print("Enter gross sales: ");

// // double grossSales = scanner.nextDouble();

// // System.out.print("Enter commission rate: ");

// // double commissionRate = scanner.nextDouble();

// // CompensationModel compensationModel = new CommissionCompensationModel(grossSales, commissionRate);

// // employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,grossSales, commissionRate,compensationModel);

// // } else if (modelChoice == 4) {

// // System.out.print("Enter gross sales: ");

// // double grossSales = scanner.nextDouble();

// // System.out.print("Enter commission rate: ");

// // double commissionRate = scanner.nextDouble();

// // System.out.print("Enter base salary: ");

// // double baseSalary = scanner.nextDouble();

// // CompensationModel compensationModel = new BasePlusCommissionCompensationModel(grossSales, commissionRate, baseSalary);

// // employee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber,grossSales,commissionRate,baseSalary,compensationModel);

// // } else {

// // System.out.println("Invalid choice. Exiting the program.");

// // return;

// // }

// // payableItems.add(employee);

// // System.out.println("Enter invoice details:");

// // System.out.print("Part number: ");

// // String partNumber = scanner.next();

// // System.out.print("Part description: ");

// // String partDescription = scanner.next();

// // System.out.print("Quantity: ");

// // int quantity = scanner.nextInt();

// // System.out.print("Price per item: ");

// // double pricePerItem = scanner.nextDouble();

// // Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

// // payableItems.add(invoice);

// // System.out.println("Payment Details:");

// // for (Payable payable : payableItems) {

// // System.out.println("Payment Amount: $" + payable.getPaymentAmount());

// // }

// // }

// // }
// package CombiningCompAndInherit;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class TestApplication {

//     public static void main(String[] args) {

//         List<Employee> employees = new ArrayList<>();

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter employee details:");
//         System.out.print("First name: ");
//         String firstName = scanner.nextLine();
//         System.out.print("Last name: ");
//         String lastName = scanner.nextLine();
//         System.out.print("Social security number: ");
//         String socialSecurityNumber = scanner.nextLine();

//         Employee employee;

//         System.out.println("Select compensation model (1 - Salaried, 2 - Hourly, 3 - Commission, 4 - Base Plus Commission):");
//         int modelChoice = scanner.nextInt();

//         if (modelChoice == 1) {
//             System.out.print("Enter weekly salary: ");
//             double weeklySalary = scanner.nextDouble();
//             CompensationModel compensationModel = new SalariedCompensationModel(weeklySalary);
//             employee = new SalariedEmployee(firstName, lastName, socialSecurityNumber, compensationModel, weeklySalary);
//         } else if (modelChoice == 2) {
//             System.out.print("Enter wage: ");
//             double wage = scanner.nextDouble();
//             System.out.print("Enter hours worked: ");
//             double hours = scanner.nextDouble();
//             CompensationModel compensationModel = new HourlyCompensationModel(wage, hours);
//             employee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours, compensationModel);
//         } else if (modelChoice == 3) {
//             System.out.print("Enter gross sales: ");
//             double grossSales = scanner.nextDouble();
//             System.out.print("Enter commission rate: ");
//             double commissionRate = scanner.nextDouble();
//             CompensationModel compensationModel = new CommissionCompensationModel(grossSales, commissionRate);
//             employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, compensationModel);
//         } else if (modelChoice == 4) {
//             System.out.print("Enter gross sales: ");
//             double grossSales = scanner.nextDouble();
//             System.out.print("Enter commission rate: ");
//             double commissionRate = scanner.nextDouble();
//             System.out.print("Enter base salary: ");
//             double baseSalary = scanner.nextDouble();
//             CompensationModel compensationModel = new BasePlusCommissionCompensationModel(grossSales, commissionRate, baseSalary);
//             employee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary, compensationModel);
//         } else {
//             System.out.println("Invalid choice. Exiting the program.");
//             return;
//         }

//         employees.add(employee);

//         System.out.println("Enter invoice details:");
//         System.out.print("Part number: ");
//         String partNumber = scanner.next();
//         System.out.print("Part description: ");
//         String partDescription = scanner.next();
//         System.out.print("Quantity: ");
//         int quantity = scanner.nextInt();
//         System.out.print("Price per item: ");
//         double pricePerItem = scanner.nextDouble();

//         // Create an Invoice object with the correct constructor
//         Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

//         for (Employee emp : employees) {
//             if (emp instanceof Payable) {
//                 Payable payable = (Payable) emp;
//                 System.out.println(emp);
//                 System.out.println("Payment Amount: $" + payable.calculatePayment());
//             }
//         }
// }
// }

package CombiningCompAndInherit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social security number: ");
        String socialSecurityNumber = scanner.nextLine();

        Employee employee;

        System.out.println("Select compensation model (1 - Salaried, 2 - Hourly, 3 - Commission, 4 - Base Plus Commission):");
        int modelChoice = scanner.nextInt();

        if (modelChoice == 1) {
            System.out.print("Enter weekly salary: ");
            double weeklySalary = scanner.nextDouble();
            CompensationModel compensationModel = new SalariedCompensationModel(weeklySalary);
            employee = new SalariedEmployee(firstName, lastName, socialSecurityNumber, compensationModel, weeklySalary);
        } else if (modelChoice == 2) {
            System.out.print("Enter wage: ");
            double wage = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            double hours = scanner.nextDouble();
            CompensationModel compensationModel = new HourlyCompensationModel(wage, hours);
            employee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours, compensationModel);
        } else if (modelChoice == 3) {
            System.out.print("Enter gross sales: ");
            double grossSales = scanner.nextDouble();
            System.out.print("Enter commission rate: ");
            double commissionRate = scanner.nextDouble();
            CompensationModel compensationModel = new CommissionCompensationModel(grossSales, commissionRate);
            employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, compensationModel);
        } else if (modelChoice == 4) {
            System.out.print("Enter gross sales: ");
            double grossSales = scanner.nextDouble();
            System.out.print("Enter commission rate: ");
            double commissionRate = scanner.nextDouble();
            System.out.print("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            CompensationModel compensationModel = new BasePlusCommissionCompensationModel(grossSales, commissionRate, baseSalary);
            employee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary, compensationModel);
        } else {
            System.out.println("Invalid choice. Exiting the program.");
            return;
        }

        employees.add(employee);

        System.out.println("Enter invoice details:");
        System.out.print("Part number: ");
        String partNumber = scanner.next();
        System.out.print("Part description: ");
        String partDescription = scanner.next();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Price per item: ");
        double pricePerItem = scanner.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        invoices.add(invoice);

        System.out.println("Payment Details for Employee:");

        for (Employee emp : employees) {
            if (emp instanceof Payable) {
                Payable payable = (Payable) emp;
                System.out.println(emp);
                System.out.println("Payment Amount: $" + payable.calculatePayment());
            }
        }

        System.out.println("\nPayment Details for Invoice:");

        for (Invoice inv : invoices) {
            System.out.println("Part Number: " + inv.getPartNumber());
            System.out.println("Part Description: " + inv.getPartDescription());
            System.out.println("Quantity: " + inv.getQuantity());
            System.out.println("Price per Item: $" + inv.getPricePerItem());
            System.out.println("Payment Amount: $" + inv.calculatePayment());
        }
    }
}
