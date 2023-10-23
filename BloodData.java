/* Create a class named BloodData that includes fields that hold a blood type  
(the four blood types are O, A, B, and AB) and an Rh factor (the factors are  + and –). 
Create a default constructor that sets the fields to O and +, and  an overloaded 
constructor that requires values for both fields. Include get  and set methods 
for each field. Save this file as BloodData.java. Create an  application named 
TestBloodData that demonstrates each method works correctly. 
Save the application as TestBloodData.java. */

public class BloodData
{
   private String bloodType;
   private String rhFactor;
   
   
   public BloodData()
   {
      this("O", "+");
   }
   
    public BloodData(String bType, String rh)
   {
      bloodType = bType;
      rhFactor = rh;
   }
   
   public void setBloodType(String bloodType)
   {
      this.bloodType = bloodType;
   }
   
   public String getBloodType()
   {
      return bloodType;
   }
   
   public void setRhFactor(String rhFactor)
   {
      this.rhFactor = rhFactor;
   }
   
   public String getRhFactor()
   {
      return rhFactor;
   }    

}