/*In this lab, you will complete a Java program that uses a two-dimensional array to 
store data for the Building Block Day Care Center. The day care center charges varying 
weekly rates depending on the age of the child and the number of days per week the 
child attends. The program should allow users to enter the age of the child and 
the number of days per week the child will be at the day care center. The program 
should output the appropriate weekly rate. The file provided for this lab contains 
all of the necessary variable declarations, except the two-dimensional array. 
You need to write the input statements and the code that initializes the 
two-dimensional array, determines the weekly rate, and prints the weekly rate. 
Comments in the code tell you where to write your statements. 
Weekly rates can be found in the provided table.*/

import java.util.Scanner;

public class DayCare
{
   public static void main(String args[]) 
   {
      // Declare two-dimensional array here.
      double rate[][] = {
      { 30.00, 60.00, 88.00, 115.00, 140.00 },
      { 26.00, 52.00, 70.00, 96.00, 120.00 },
      { 24.00, 46.00, 67.00, 89.00, 110.00 },
      { 22.00, 40.00, 60.00, 75.00, 88.00 },
      { 20.00, 35.00, 50.00, 66.00, 84.00 } };

      // Declare other variables.
      int numDays;   
      int age = 0;
      String numDaysString;
      String ageString;
      int QUIT = 99;
      Scanner input = new Scanner(System.in);
            
      // This is the work done in the getReady() method
      // Perform a priming read to get the age of the child.
      System.out.println("Enter age of child or 99 to quit: ");
      age = input.nextInt();
      while(age != QUIT)
      {  
      if(age > 4)
            age = 4;
         // This is the work done in the determineRateCharge() method
         // Ask the user to enter the number of days
         System.out.println( "Enter number of days: ");
         numDays = input.nextInt();
                        // Print the weekly rate
                        System.out.println("Weekly Rate is $" + rate[age][numDays-1]); 
         // Ask the user to enter the next child's age
         System.out.println("Enter age of child or 99 to quit: ");
         age = input.nextInt();
         
      }
      // This is the work done in the finish() method
      System.out.println("End of program");

      System.exit(0);
   } // End of main() method.
} // End of DayCare class.