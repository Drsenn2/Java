//Exercise 5-1, redux
import java.util.Scanner;
class EvenOddB
{
   public static void main(String[] args)
   {
   int number;
   int numEntered;
   int numRemain;
   
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter a number >");
   numEntered = input.nextInt();
   
   numRemain = numEntered % 2;

   isEven();
   }
   
   public static boolean isEven(int numRemain)
   {
   if(numRemain == 0)
      System.out.println(numEntered + " is an even number.");
   else
      System.out.println(numEntered + " is an odd number.");

   }
}