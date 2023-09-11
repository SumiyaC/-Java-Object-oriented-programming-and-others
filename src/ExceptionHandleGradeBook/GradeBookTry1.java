package ExceptionHandleGradeBook;

public class GradeBookTry1 {

private String courseName; // name of course this grade book represents

private int[][] grades; // two-dimensional array of student grades

// two-argument constructor initializes courseName and grades array

public GradeBookTry1(String courseName, int[][] grades) {

this.courseName = courseName;

this.grades = grades;

}

// method to set the course name

public void setCourseName(String courseName) {

this.courseName = courseName;

}

// method to retrieve the course name

public String getCourseName() {

return courseName;

}

// perform various operations on the data

public void processGrades() {

try {

// output grades array

outputGrades();

// call methods getMinimum and getMaximum

System.out.printf("%n%s %d%n%s %d%n%n",

"Lowest grade in the grade book is", getMinimum(),

"Highest grade in the grade book is", getMaximum());

// output grade distribution chart of all grades on all tests

outputBarChart();

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

}

}

// find minimum grade

public int getMinimum() {

try {

// assume first element of grades array is smallest

int lowGrade = grades[0][0];

// loop through rows of grades array

for (int[] studentGrades : grades) {

// loop through columns of current row

for (int grade : studentGrades) {

// if grade less than lowGrade, assign it to lowGrade

if (grade < lowGrade) {

lowGrade = grade;

}

}

}

return lowGrade;

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

return -1;

}

}

// find maximum grade

public int getMaximum() {

try {

// assume first element of grades array is largest

int highGrade = grades[0][0];

// loop through rows of grades array

for (int[] studentGrades : grades) {

// loop through columns of current row

for (int grade : studentGrades) {

// if grade greater than highGrade, assign it to highGrade

if (grade > highGrade) {

highGrade = grade;

}

}

}

return highGrade;

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

return -1;

}

}

// determine average grade for particular set of grades

public double getAverage(int[] setOfGrades) {

try {

int total = 0;

// sum grades for one student

for (int grade : setOfGrades) {

total += grade;

}

// return average of grades

return (double) total / setOfGrades.length;

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

return -1;

}

}

// output bar chart displaying overall grade distribution

public void outputBarChart() {

try {

System.out.println("Overall grade distribution:");

// initialize frequency counters

int[] frequency = new int[11];

for (int[] studentGrades : grades) {

for (int grade : studentGrades) {

++frequency[grade / 10];

}

}

// print bar chart of frequencies

for (int count = 0; count < frequency.length; count++) {

// output bar label ("00-09: ", ..., "90-99: ", "100: ")

if (count == 10) {

System.out.printf("%5d: ", 100);

}

else {

System.out.printf("%02d-%02d: ",

count * 10, count * 10 + 9);

}

// print bar of asterisks

for (int stars = 0; stars < frequency[count]; stars++) {

System.out.print("*");

}

System.out.println();

}

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

}

}

public void outputGrades() {

try {

System.out.printf("The grades are:%n%n");

System.out.print(" "); // align column heads

// create a column heading for each of the tests

for (int test = 0; test < grades[0].length; test++) {

System.out.printf("Test %d ", test + 1);

}

System.out.println("Average"); // student average column heading

// create rows/columns of text representing array grades

for (int student = 0; student < grades.length; student++) {

System.out.printf("Student %2d", student + 1);

for (int test : grades[student]) { // output student's grades

System.out.printf("%8d", test);

}

// call method getAverage to calculate student's average grade;

// pass row of grades as the argument to getAverage

double average = getAverage(grades[student]);

System.out.printf("%9.2f%n", average);

}

} catch (Exception e) {

System.out.println("An error occurred: " + e.getMessage());

}

}

}
