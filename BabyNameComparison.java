import java.util.Scanner;
public class BabyNameComparison
{
   public static void main(String[] args)
   {
   String name1, name2, name3;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a baby name >");
   name1 = input.nextLine();
   System.out.print("Enter another baby name >");
   name2 = input.nextLine();
   System.out.print("Enter a  final baby name >");
   name3 = input.nextLine();
   
   System.out.println(name1 + " " + name2);
   System.out.println(name1 + " " + name3);
   System.out.println(name2 + " " + name1);
   System.out.println(name2 + " " + name3);
   System.out.println(name3 + " " + name1);
   System.out.println(name3 + " " + name2);
   
   
   }
}