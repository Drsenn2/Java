import java.util.Scanner;
public class CreateSpaServices
{
   public static void main(String[] args)
   {
     SpaService firstService = new SpaService();
     SpaService secondService = new SpaService();
      
      firstService = getData(firstService);
      secondService = getData(secondService);
            
      System.out.println("First service details:");
         System.out.println(firstService.getServiceDescription() +
         " $" + firstService.getPrice());
      System.out.println("Second service details:");
         System.out.println(secondService.getServiceDescription() +
         " $" + secondService.getPrice());
   }
   
   public static SpaService getData(SpaService service)
   {
      //String service;
      double price;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter service >> ");
      service = keyboard.nextLine();
      System.out.print("Enter price >> ");
      price = keyboard.nextDouble();
      //the next statement clears the input buffer
      keyboard.nextLine();
      
      service.setServiceDescription(service);
      service.setPrice(price);
      return service;
   }
}