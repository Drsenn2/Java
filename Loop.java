//playing with indefinite loops
import java.util.Scanner;
public class Loop {

   public static void main(String[] args) {
   //declarations
   int shouldContinue;
   //input
   Scanner input = new Scanner(System.in);
   //output
   System.out.println("Should you continue? 1 for Yes or 2 for No >>");
   shouldContinue = input.nextInt();
   
   //Loop
   while (shouldContinue == 1)
   {
      System.out.println("Hello.");
      //System.out.println(" ");
      System.out.println("\nShould you continue? 1 for Yes or 2 for No >>");
      shouldContinue = input.nextInt();
   } 
   //output
   System.out.println("Goodbye.");
   
   
   
   }
}