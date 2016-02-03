/**
 * Small test class for the Day class.
 * @author Cay Horstmann
 *
 */
public class DayTwoTester
{
   public static void main(String[] args)
   {
      DayTwo today = new DayTwo(2001, 2, 3); // February 3, 2001
      DayTwo later = today.addDays(999);
      System.out.println(later.getYear() 
         + "-" + later.getMonth() 
         + "-" + later.getDate()); 
      System.out.println(later.daysFrom(today)); // Prints 999
   }
}
