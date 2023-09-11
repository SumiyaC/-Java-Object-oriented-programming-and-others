package EnhancingClassDate;

import java.util.Scanner;

public class EnhancedDateTest {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

// Ask user for input

System.out.print("Enter day: ");

int day = input.nextInt();

System.out.print("Enter month: ");

int month = input.nextInt();

System.out.print("Enter year: ");

int year = input.nextInt();

System.out.print("Enter date format (dd/mm/yyyy, mm/dd/yyyy, or yyyy/mm/dd): ");

String dateFormat = input.next();

// Create EnhancedDate object with user input

EnhancedDate date = new EnhancedDate(day, month, year, dateFormat);

System.out.println("This is the date given by you:"+ date.toString());

// Test nextDay() method

System.out.println("These are the dates after testing the method nextDay:");

for (int i = 0; i < 5; i++) {

System.out.println(date.toString());

date.nextDay();

}

}

}
