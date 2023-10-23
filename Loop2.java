//playing with indefinite loops and String responsesN
import java.util.Scanner;
public class Loop2 {

   public static void main(String[] args) {
   //declarations
   String shouldContinue;
   //input
   Scanner input = new Scanner(System.in);
   //output
   System.out.println("Should you continue? Y or N >>");
   shouldContinue = input.nextLine();
   
   //Loop
   while (shouldContinue.equals("Y"))
   {
      System.out.println("Hello.");
      //System.out.println(" ");
      System.out.println("\nShould you continue? Y or N >>");
      shouldContinue = input.nextLine();
   } 
   //output
   System.out.println("Goodbye.");
   
   
   
   }
}