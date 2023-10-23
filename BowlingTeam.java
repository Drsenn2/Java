public class BowlingTeam
{
   //teamname and array to hold names
   private String teamName;
   private String[] members = new String[4];
   
   //get and set methods
   public void setTeamName(String team)
   {
      teamName = team;
   }
   public String getTeamName()
   {
      return teamName;
   }
   
   //method that sets a team member's name
   //requires a position and a name
   public void setMember(int number, String name)
   {
      members[number] = name;
   }
   
   //method that returns a team member's name
   //requires a value used as the subscript to determine which name to return
   public String getMember(int number)
   {
      return members[number];
   }
   
   
   
}