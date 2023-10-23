/*ex 6-1a
Write an application that counts by five from 5 through 500 inclusive, 
and  that starts a new line after every multiple of 50 
(50, 100, 150, and so on). 
Save  the file as CountByFives.java. */

public class CountByFives
{
   public static void main(String[] args)
   {
   int num;
   final int NUM_MAX = 500;
   final int NUM_INCREASE = 5;
   
   for(num = 5; num <= NUM_MAX; num = num + NUM_INCREASE)
      {
      System.out.print(num + " " );
      if(num % 50 == 0)
         System.out.println();
      }
   }
}