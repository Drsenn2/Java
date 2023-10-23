/*
Declarations
   num balance
   num rate
input balance, rate
computeTax(balance, rate)

computeTax(num balance, num rate)
Declarations
   num tax
tax = amount * rate
output
   Amount: amount, Rate: rate, Tax: tax
return
*/
import java.util.Scanner;
public class TestTaxMethod
{
   public static void main(String[] args)
   {
      double balance;
      double rate;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your balance >> ");
      balance = input.nextDouble();
      System.out.println("Please enter your tax rate >> ");
      rate = input.nextDouble();
      
      computeTax(balance, rate);
   }
   
   public static void computeTax(double balance, double rate)
   {
      double tax;
      tax = balance * rate;
      System.out.println("Amount: $" + balance);
      System.out.println("Rate: " + rate);
      System.out.println("Tax = $" + tax);
      System.out.println("Total = $" + (balance + tax)); 
   }
}