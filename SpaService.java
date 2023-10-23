//class creation
public class SpaService
{
   //field declarations
   private String serviceDescription;
   private double price;
   
   //explicit default contrictor
   public SpaService()
   {
      serviceDescription = "XXX";
      price = 0;
   }
   
   //method declarations
   public void setServiceDescription(String service)
   {
      serviceDescription = service;
   }
   
   public void setPrice(double servicePrice)
   {
      price = servicePrice;
   }
   
   public String getServiceDescription()
   {
      return serviceDescription;
   }
   
   public double getPrice()
   {
      return price;
   }
}