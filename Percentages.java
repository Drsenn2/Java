//Exercise 3-5a
/** Create an application named Percentages whose main() method holds 
two double variables.  Assign values to the variables. Pass both variables
to a method named computePercent() that displays the two values and the value
of the first number as a percentage of the second number.  Then call the method
a second time passing the values in reverse order*/

public class Percentages
{
   public static void main(String[] args)
   {
   //declarations with assigned values
   double firstNumber = 10;
   double secondNumber = 5;
   
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

