package ClassExercise7_4;
	// Fig. 7.15: GradeBookTest.java
	// GradeBookTest creates a GradeBook object using an array of grades, 
	// then invokes method processGrades to analyze them.
import java.util.Scanner;
	public class GradeBookTest {
	   public static void main(String[] args) {
	      // array of student grades 
		   Scanner input1 = new Scanner(System.in);
		   Scanner input2 = new Scanner(System.in);
		   //System.out.println("Enter the course name:");
				   
		   int[] array;
		   String courseName="";
		   int[] gradesArray= {};
		   GradeBook gradeBook=new GradeBook(courseName,gradesArray);
		   boolean exit=false;
		  while(!exit) {
		   System.out.print("Answer by number which option you choose from the menu below:\r\n"
		  		+ "1- Enter the name of the course\r\n"
		  		+ "2- Enter the grades\r\n"
		  		+ "3- Display the average\r\n"
		  		+ "4- Display the maximum\r\n"
		  		+ "5- Display the minimum\r\n"
		  		+ "6- Display the bar chart\r\n"
		  		+ "7- Display all information\r\n"
		  		+ "8- clear the screen\r\n"
		  		+ "9- Exit\r\n");
		  
		  
		  System.out.println("Enter the number of your selected menu:");
		  int menuNum=input1.nextInt();
		  switch(menuNum) {
		  case 1:
			  System.out.println("Enter the course name:");
			  courseName=input2.nextLine();
			  //GradeBook myGradeBook = new GradeBook(courseName, gradesArray);
			  gradeBook.setCourseName(courseName);
			  System.out.printf("Welcome to the grade book for%n%s%n%n",gradeBook.getCourseName());
			  break;
		  case 2:
			  System.out.print("Enter the total elements number of your grades array: ");
		        int size = input1.nextInt();

		        array = new int[size];

		        for (int i = 0; i < size; i++) {
		            System.out.print("Enter element " + (i+1) + ": ");
		            array[i] = input1.nextInt();
		        }

		        System.out.println("The array is: ");
		        for (int i = 0; i < size; i++) {
		            System.out.print(array[i] + " ");
		        }
		        gradeBook.setGrades(array);
		        break;
		  case 3:
			  
			  System.out.printf("%nClass average is %.2f%n", gradeBook.getAverage()); 
		  
			  break;
	     
	      
		  case 4:
			  System.out.printf("%n Maximum value is is %d%n", gradeBook.getMaximum()); 
			  break;
		  case 5:
			  System.out.printf("%n Minimum value is %d%n", gradeBook.getMinimum());
			  break;
		  case 6:
			  gradeBook.outputBarChart();
			  break;
		  case 7:
			  gradeBook.processGrades();
			  break;
		  case 8:
			  System.out.print("\033[H\033[2J");  
			  System.out.flush(); 
			  break;
		  case 9:
			  exit=true;
			  break;
			  
			  
			  
		  }
	   } 
	} 
	}
	



