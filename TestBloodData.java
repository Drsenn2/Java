public class TestBloodData
{
   public static void main(String[] args)
   {
      BloodData person1 = new BloodData ("A", "-");
      BloodData person2 = new BloodData ();
      display(person1);
      display(person2);
      person2.setBloodType("AB");
      person2.setRhFactor("+");
      display(person2);
   }
   
   public static void display(BloodData person)
   {
      System.out.println("The blood type is " + person.getBloodType() + person.getRhFactor());
   }

}