import java.util.*;
public class BowlingTeamDemo3
{
   public static void main(String[] args)
   {
 /*declarations. String that holds user input, BowlingTeam object
 an integer to use as the subscript, a constant that represents the
 number of team members, and a Scanner object for input. */
   String name;
   
   //bowling team object
   final int NUM_TEAMS = 4;
   BowlingTeam []teams = new BowlingTeam[NUM_TEAMS];
   int x;
   int y;
   final int NUM_TEAM_MEMBERS = 4;
   Scanner input = new Scanner(System.in);
//Loop for Team names
   for(y=0; y<NUM_TEAMS; ++y)
      {
         teams[y] = new BowlingTeam();
         System.out.println("Enter team name >> ");
         name = input.nextLine();
         teams[y].setTeamName(name);   
//Nested loop for member names
         for(x=0; x<NUM_TEAM_MEMBERS; ++x)
         {
            System.out.println("Enter team member's name >> ");
            name = input.nextLine();
            teams[y].setMember(x, name);
         }
      }
//Display the details of Bowling Team
//Nested loop to display
   for(y=0; y<NUM_TEAMS; ++y)
      {
      System.out.println("\nMembers of team " + teams[y].getTeamName());
      for(x=0; x<NUM_TEAM_MEMBERS; ++x)
         System.out.print(teams[y].getMember(x) + " ");
      System.out.println();
      }  
      
      System.out.println("\n\nEnter a team name to see its roster");
      name = input.nextLine();
      
      for(y=0; y<teams.length; ++y)
         if(name.equals(teams[y].getTeamName()))
            for(x=0; x<NUM_TEAM_MEMBERS; ++x)
               System.out.print(teams[y].getMember(x) +" ");
               
      System.out.println();
   }
}