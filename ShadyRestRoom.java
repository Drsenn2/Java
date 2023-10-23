/*Write an application for the Shady Rest Hotel; 
the program determines the  price of a room. 
Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for  a king and a pullout couch. 
The output echoes the input and displays the price  of the room: 
$125 for queen, $139 for king, and $165 for suite with king bed  and a pullout couch. 
If the user enters an invalid code, display an appropriate  message and set the price to 0. 
Save the file as ShadyRestRoom.java. */
 
import java.util.Scanner;
public class ShadyRestRoom
{
   public static void main(String[] args)
   {
   int selection;
   int price;
   String result;
   final int QUEEN = 1, KING = 2, SUITE = 3;
   final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
   final String QSTRING = "Queen Bed", KSTRING = "King Bed", 
      SSTRING = "Suite with King Bed and pull out couch", INVALID_STRING = "an invalid option";
   
   Scanner input = new Scanner(System.in);
   System.out.println("\n\n\t***Menu***\n");
   System.out.println("--------------------------------------------");
   System.out.println("(" + QUEEN + ") " + QSTRING);
   System.out.println("(" + KING + ") " + KSTRING);
   System.out.println("(" + SUITE + ") " + SSTRING);
   System.out.println("--------------------------------------------");
   System.out.print("Enter Selection (1, 2, or 3) >>");
   selection = input.nextInt();
   
   if(selection == QUEEN)
      {
      price = QPRICE;
      result = QSTRING;
      }
   else if(selection == KING)
      {
      price = KPRICE;
      result = KSTRING;
      }
   else if(selection == SUITE)
      {
      price = SPRICE;
      result = SSTRING;
      }
   else
      {
      result = INVALID_STRING;
      price = 0;
      }
   System.out.println("You selected " + result + " $" + price + ".");
   }
}