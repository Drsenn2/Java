//playing with inputs and integers
//rick
//12/1
import java.util.Scanner;
public class IntegerDemoInteractive
{
   public static void main(String[] args)
   {
   //declarations
   int anInt;
   byte aByte;
   short aShort;
   long aLong;
   
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
    
   }
}