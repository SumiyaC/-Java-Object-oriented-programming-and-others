package ClassExercise7_1;
	// Fig. 7.6: BarChart.java
	// Bar chart printing program.
import java.util.Scanner;
	public class Home1 {
	   public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
		   System.out.printf("How many numbers you want to give:");
		   int totalNum=input.nextInt();
		   int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		   for(int i=0;i<totalNum;i++) {
			   System.out.printf("Enter Grade [0-100]:");
			   int num=input.nextInt();
			   if (num >=0 && num<=9) {
				   array[0]++;   
			   }
			   else if (num >=10 && num<=19) {
				   array[1]++;   
			   }
			   else if (num >=20 && num<=29) {
				   array[2]++;   
			   }
			   else if (num >=30 && num<=39) {
				   array[3]++;   
			   }
			   else if (num >=40 && num<=49) {
				   array[4]++;   
			   }
			   else if (num >=50 && num<=59) {
				   array[5]++;   
			   }
			   else if (num >=60 && num<=69) {
				   array[6]++;   
			   }
			   else if (num >=70 && num<=79) {
				   array[7]++;   
			   }
			   else if (num >=80 && num<=89) {
				   array[8]++;   
			   }
			   else if (num >=90 && num<=99) {
				   array[8]++;   
			   }
			   else  if (num ==100) {
				   array[10]++;   
			   }	
			}	
	      //int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

	      System.out.println("Grade distribution:");

	      // for each array element, output a bar of the chart
	      for (int counter = 0; counter < array.length; counter++) {
	         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
	         if (counter == 10) {
	            System.out.printf("%5d: ", 100);
	         } 
	         else {
	            System.out.printf("%02d-%02d: ", 
	               counter * 10, counter * 10 + 9); 
	         } 

	         // print bar of asterisks                           
	         for (int stars = 0; stars < array[counter]; stars++) {
	            System.out.print("*");                           
	         } 

	         System.out.println(); 
	      } 
	   } 
	} 




	
