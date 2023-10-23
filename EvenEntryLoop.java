import java.util.Scanner;
public class EvenEntryLoop
{
   public static void main(String[] args)
   {
   int i;
   final int STOP = 999;
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter in an even number or 999 to stop >> ");
   i = input.nextInt();
      while(i != 999)
      {
         if(i % 2 == 0)
         {
            System.out.println("Good job! The number is even. ");
         }
         else 
         {
            System.out.println("This is not an even number. ");
         } 
         
         System.out.println("Enter in an even number or 999 to stop >> ");
         i = input.nextInt();      
       }
       System.out.println("Good bye.");
   }
}