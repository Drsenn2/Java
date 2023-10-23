public class ShortCircuitTestOr
{
   public static void main(String[] args)
   {
   if(trueMethod() || falseMethod())
      System.out.println("Both are true");
   else
      System.out.println("Both are not true");  
   }
   
   public static Boolean trueMethod()
   {
      System.out.println("Within trueMethod()");
      return true;
   }
   
   public static Boolean falseMethod()
   {
      System.out.println("Within falseMethod()");
      return false;
   }
}