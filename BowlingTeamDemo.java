import java.util.*;
public class BowlingTeamDemo
{
   public static void main(String[] args)
   {
 /*declarations. String that holds user input, BowlingTeam object
 an integer to use as the subscript, a constant that represents the
 number of team members, and a Scanner object for input. */
   String name;
   BowlingTeam bowlTeam = new BowlingTeam();
   int x;
   final int NUM_TEAM_MEMBERS = 4;
   Scanner input = new Scanner(System.in);
   
//prompt for team names
   System.out.println("Enter team name >> ");
   name = input.nextLine();
   bowlTeam.setTeamName(name);  
   
//set number loop for team names
//Assign it to the BowlingTeam object to indicate
//the team member's position 
   for(x=0; x<NUM_TEAM_MEMBERS; ++x)
   {
      System.out.println("Enter team member's name >> ");
      name = input.nextLine();
      bowlTeam.setMember(x, name);
   }
//Display the details of Bowling Team
   System.out.println("\nMembers of team " + bowlTeam.getTeamName());
   for(x=0; x<NUM_TEAM_MEMBERS; ++x)
      System.out.print(bowlTeam.getMember(x) + " ");
   System.out.println();
   
   }
}