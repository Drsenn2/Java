//exercise 4-1
public class FormLetter
{
   public static void main(String[] args)
   {
       FormLetterWriter person1 = new FormLetterWriter("Smith");
       person1.display();
         
       FormLetterWriter person2 = new FormLetterWriter("Julie", "Smith");
       person2.display();  
   }
}

   