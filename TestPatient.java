public class TestPatient
{
   public static void main(String[] args)
   {
   Patient p1 = new Patient();
   Patient p2 = new Patient(1234, 35, "B", "+");
   display(p1);
   display(p2);
   Patient p3 = new Patient(4567, 52, "AB", "+");
   display(p3);
   }
   
   public static void display(Patient p)
   {
      BloodData bt = p.getBloodData();
      System.out.println("Patient #" + p.getId() + " age: " + p.getAge() +
         "\n  The blood type is: " + bt.getBloodType() + bt.getRhFactor());
   }

}