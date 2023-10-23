import java.util.Scanner;
public class CountByAnything
{
   public static void main(String[] args)
   {
   int num;
   final int NUM_MAX = 1000;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter a number >> ");
   int input = keyboard.nextInt();
   int count = 0;
   for(num = input; num <= NUM_MAX; num += input)
      {
      System.out.print(num + " " );
      count++;
      if(count % 10 == 0)
         System.out.println();
      }
   }
}