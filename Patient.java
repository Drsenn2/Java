public class Patient{
   private int idNumber;
   private int age;
   private BloodData bloodData;
   
   public Patient()    {
    idNumber = 0;
    age = 0;
    bloodData = new BloodData();
    }
    
   public Patient(int idNumber, int age, String bType, String rhFactor)    {
    this.idNumber = idNumber;
    this.age = age;
    bloodData = new BloodData(bType, rhFactor);
    }
    
   public int getId()   {
      return idNumber;
   }
   
   public int getAge()   {
      return age;
   }
   
   public BloodData getBloodData()   {
      return bloodData;
   }
      
}