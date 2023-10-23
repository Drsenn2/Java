//Swapping Integers
//Rick
//12/2
public class IntegerSwap
{
   public static void main(String [] args)
   {
      //declaration
      int x = 2, y = 6, z;
      //z holds a place
      System.out.println("Before the switch: ");
      System.out.println("X = " + x);
      System.out.println("Y = " + y);
      //no line for z b/c it would produce an error
      //switch
      z = x;
      x = y;
      y = z;
      
      System.out.println("After the switch: ");
      System.out.println("X = " + x);
      System.out.println("Y = " + y);

      
   }
}