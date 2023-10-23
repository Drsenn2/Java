//playing with inputs and integers
//rick
//12/1
import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{
   public static void main(String[] args)
   {
   //declarations
   int anInt;
   byte aByte;
   short aShort;
   long aLong;
   String name;
   
   //input
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter an integer >> ");
   anInt = input.nextInt();
   System.out.print("Please enter a byte integer >> ");
   aByte = input.nextByte();
   System.out.print("Please enter a short integer >> ");
   aShort = input.nextShort();
   System.out.print("Please enter a long integer >> ");
   aLong = input.nextLong();
      
   //output
   System.out.println("The int is " + anInt);
   System.out.println("The byte is " + aByte);
   System.out.println("The short is " + aShort);
   System.out.println("The long is " + aLong);
   //adding name
   input.nextLine();
   System.out.println("Please enter your name >> ");
   name = input.nextLine();
   System.out.println("Thank you, " + name);
 
   }
}