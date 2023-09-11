package ExceptionHandleGradeBook;

import java.util.Scanner;

public class GradeBookThrough1Test {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

GradeBookThrough1 myGradeBook = new GradeBookThrough1();

System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());

System.out.println("Please enter the course name:");

String courseName = input.nextLine();

myGradeBook.setCourseName(courseName);

System.out.println("\nPlease enter the grades. Enter -1 to finish.");

while (true) {

try {

int grade = input.nextInt();

if (grade == -1) {

break;

}

if (grade < 0 || grade > 100) {

throw new IllegalArgumentException("Grade must be between 0 and 100.");

}

myGradeBook.processGrade(grade);

} catch (IllegalArgumentException e) {

System.out.printf("%s Please try again.\n", e.getMessage());

}

}

System.out.println("\nGrade Summary:");

System.out.printf("Total number of grades: %d\n", myGradeBook.getNumberOfGrades());

System.out.printf("Minimum grade: %d\n", myGradeBook.getMinimumGrade());

System.out.printf("Maximum grade: %d\n", myGradeBook.getMaximumGrade());

System.out.printf("Average grade: %.2f\n", myGradeBook.getAverageGrade());

myGradeBook.outputBarChart();

myGradeBook.outputGrades();

}

}
