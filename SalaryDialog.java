import javax.swing.JOptionPane;
public class SalaryDialog
{
   public static void main(String[] args)
   {
      //declarations
      String wageString, dependentString;
      double wage, weeklyPay;
      int dependents;
      final double HOURS_IN_WEEK = 37.5;
      
      //input code
      wageString = JOptionPane.showInputDialog(null, 
         "Enter employee's hourly wage", 
         "Salary Dialog 1",
         JOptionPane.INFORMATION_MESSAGE);
      //converts String to double
      weeklyPay = Double.parseDouble(wageString) *
         HOURS_IN_WEEK;
      dependentString = JOptionPane.showInputDialog(null, 
         "How many dependents?",
         "Salary Dialog 2",
         JOptionPane.QUESTION_MESSAGE);
      dependents = Integer.parseInt(dependentString);
      //output
      JOptionPane.showMessageDialog(null,
         "Weekly salary is " + weeklyPay + 
         "\nDeductions will be made for " +
         dependents + " dependents.");
      
   }
}