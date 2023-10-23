//Exercise 3-5b
/** Create an application named Percentages whose main() method holds 
two double variables.  Assign values to the variables. Pass both variables
to a method named computePercent() that displays the two values and the value
of the first number as a percentage of the second number.  Then call the method
a second time passing the values in reverse order

pt2 - Modify the Percentages class to accept values of the two doubles from a user 
at a keyboard*/

import java.util.Scanner;
public class Percentages2
{
   public static void main(String[] args)
   {
   //declarations
   double firstNumber;
   double secondNumber;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a number >>");
   firstNumber = keyboard.nextDouble();
   System.out.print("Enter another number >>");
   secondNumber = keyboard.nextDouble();
   
   //pass the variables
   computePercent(firstNumber, secondNumber);
   computePercent(secondNumber, firstNumber);
   }
   
   public static void computePercent(double firstNumber, double secondNumber)
   {
   //declarations
   double percentResult;
   
   //math stuff
   percentResult = (firstNumber / secondNumber) * 100;
   
   //output
   System.out.println(firstNumber + " is " + percentResult + " percent of " + secondNumber + "."); 

   }
}

