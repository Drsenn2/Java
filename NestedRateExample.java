import java.util.Scanner;
public class NestedRateExample
{
   public static void main(String[] args)
   {
      final double HIGH_LIM = 1000.00;
      final double HIGH_RATE = 0.08;
      final double MED_LIM = 500.00;
      final double MED_RATE = 0.06;
      final double LOW_RATE = 0.05;
      double saleAmount;
      double commissionRate;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a $ Amount >");
      saleAmount = input.nextDouble();
      
      if(saleAmount >= HIGH_LIM)
         commissionRate = HIGH_RATE;
      else
         if(saleAmount >= MED_LIM)
            commissionRate = MED_RATE;
         else
            commissionRate = LOW_RATE;
            
      System.out.println("With a sale of $" + saleAmount + ", you will get a " +
         commissionRate + " commission.");
   }
   
   
}