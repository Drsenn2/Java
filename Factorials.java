/* Write an application that displays the factorial for every 
integer value from 1  to 10. A factorial of a number is the 
product of that number multiplied by each positive integer 
lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. 
Save  the file as Factorials.java. */

public class Factorials
{
   public static void main(String[] args)
   {
     int num;
     //for loop bc predetermined
     for(int i = 1; i <=10; i++)
     {
      num = i;
      //inner for loop will decrement and multiply until outer loop moves on
     
      for(int j = i - 1; j > 0; j--)
         {
         num = num * j;
         }
         System.out.println("The factorial of " + i + " is " + num);
     } 
   }
}

