/* Assume that the population of Mexico is 128 million and that the 
population  increases 1.01 percent annually.
Assume that the population of the United States  is 323 million 
and that the population is reduced 0.15 percent annually. 
Write  an application that displays the populations for the two 
countries every year until the population of Mexico exceeds 
that of the United States, and display the  number of years it took.
*/

public class Population
{
   public static void main(String[] args)
   {
      double mexPop = 128000000;
      double usPop = 323000000;
      int year = 0;
      final double MEX_RATE = 0.0101;
      final double US_RATE = 0.0015;
      System.out.println("Years     Mexico Pop      US Pop");
      while(usPop > mexPop) 
      {
         mexPop = mexPop + mexPop * MEX_RATE;
         usPop = usPop - usPop * US_RATE;
         year++;
         System.out.println(year + "    " + mexPop + "    " + usPop);
      }
   }
}