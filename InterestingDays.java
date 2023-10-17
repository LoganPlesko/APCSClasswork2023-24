//Logan Plesko, AP CS, Fall 2023, Program that uses another calendar program to print days from your birthday and days till the AP test
public class InterestingDays {
   public static void main(String[] args) {
      Day thisDay = new Day(); //Creates this date as variable thisDay
      Day birthday = new Day(2005, 9, 1); //creates variable birthday as my birthday
       int Happyday = thisDay.daysFrom(birthday); { //creates variable Happyday that is days after my birthday
         System.out.println("You have been alive for " + Happyday + " days");
    }
    
    Day Aptest = new Day(2024, 5, 8); //Creates Aptest as new date
       int Apday = Aptest.daysFrom(thisDay); { //Makes Apday equal days until the Ap test according to todays date
         System.out.println("The Ap test is in " + Apday + " days");
    }      
  }
}
