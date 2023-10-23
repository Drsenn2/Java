//Using Static and Nonstatic final fields
public class DogTriathlonParticipant
{
   //not static bc different for each dog
   private final int NUM_EVENTS;
   //not final b/c the value can increase
   private static int totalCumulativeScore = 0;
   
   //private fields
   private String name;
   private int obedienceScore;
   private int conformationScore;
   private int agilityScore;
   private int total;
   private double avg;
   
   //contructor for the class
   public DogTriathlonParticipant(String name, int numEvents, 
      int score1, int score2, int score3)
      {
      //constructor assignment
         this.name = name;
         NUM_EVENTS = numEvents;
         obedienceScore = score1;
         conformationScore = score2;
         agilityScore = score3;
         
      //contructor calculations
         total = obedienceScore + 
            conformationScore + agilityScore;
      //double cast for fractional scores
         avg = (double) total / NUM_EVENTS;
         totalCumulativeScore = totalCumulativeScore + total;
      }
   
   public void display()
   {
      System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
      System.out.println( " " + name + " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
   }
 }  
   