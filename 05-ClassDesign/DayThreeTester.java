/**
 * Small test class for the Day class.
 * @author Cay Horstmann
 *
 */
public class DayThreeTester
{
   public static void main(String[] args)
   {
      DayThree today = new DayThree(2001, 2, 3); // February 3, 2001
      DayThree later = today.addDays(999);
      System.out.println(later.getYear() 
         + "-" + later.getMonth() 
         + "-" + later.getDate()); 
      System.out.println(later.daysFrom(today)); // Prints 999
   }
}
