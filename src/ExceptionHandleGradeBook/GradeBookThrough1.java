package ExceptionHandleGradeBook;

import java.util.ArrayList;

public class GradeBookThrough1 {

private String courseName;

private ArrayList<Integer> grades;

public GradeBookThrough1(String courseName, ArrayList<Integer> grades) {

this.courseName = courseName;

this.grades = grades;

}

public String getCourseName() {

return courseName;

}

public void setCourseName(String courseName) {

this.courseName = courseName;

}

public void processGrades() {

outputGrades();

System.out.printf("%nClass average is %.2f%n", getAverage());

System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",

getMinimum(), getMaximum());

outputBarChart();

}

public int getMinimum() {

if (grades.isEmpty()) {

throw new IllegalStateException("No grades found.");

}

int lowGrade = grades.get(0);

for (int grade : grades) {

if (grade < lowGrade) {

lowGrade = grade;

}

}

return lowGrade;

}

public int getMaximum() {

if (grades.isEmpty()) {

throw new IllegalStateException("No grades found.");

}

int highGrade = grades.get(0);

for (int grade : grades) {

if (grade > highGrade) {

highGrade = grade;

}

}

return highGrade;

}

public double getAverage() {

if (grades.isEmpty()) {

throw new IllegalStateException("No grades found.");

}

int total = 0;

for (int grade : grades) {

total += grade;

}

return (double) total / grades.size();

}

public void outputBarChart() {

System.out.println("Grade distribution:");

int[] frequency = new int[11];

for (int grade : grades) {

++frequency[grade / 10];

}

for (int count = 0; count < frequency.length; count++) {

if (count == 10) {

System.out.printf("%5d: ", 100);

} else {

System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

}

for (int stars = 0; stars < frequency[count]; stars++) {

System.out.print("*");

}

System.out.println();

}

}

public void outputGrades() {

System.out.printf("The grades are:%n%n");

for (int grade : grades) {

System.out.printf("Grade: %3d%n", grade);

}

}

}
