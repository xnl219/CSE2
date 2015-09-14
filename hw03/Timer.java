//Xavier Lema CSE2
//HW 03 Dinner Timer
//Usser inputs current time and desired dinner time.
//program calculates and prints out time left until dinner in the form:
//You have (HH) hours and (MM) minutes left until dinner.


import java.util.Scanner;

public class Timer {
    
    public static void main(String[] args)  {
        
        //Scanner setup
        Scanner timerScanner = new Scanner( System.in );
        //promp user for current time
        System.out.print("Enter the current time (HHMM) : ");
        //input current time
        int currentTime = timerScanner.nextInt ();
        //promp user for dinner time
        System.out.print("Enter desired dinner time (HHMM) : ");
        //input dinner time
        int dinnerTime = timerScanner.nextInt ();
        
        //minute and hour variables and calculations for current time
        int currentTimeHour = (currentTime/100);
        int currentTimeMinute = (currentTime-(currentTimeHour*100));
        //minute and hour variable and calculations for dinner time
        int dinnerTimeHour = (dinnerTime/100);
        int dinnerTimeMinute = (dinnerTime-(dinnerTimeHour*100));
        //final hours and minutes left variables
        int hoursLeft, minutesLeft;
        
        //solves next day possability issue
        if (dinnerTimeHour <= currentTimeHour) {
            dinnerTimeHour = dinnerTimeHour + 24;
        }
        
        //final calculations
        hoursLeft = dinnerTimeHour-currentTimeHour;
        minutesLeft = dinnerTimeMinute-currentTimeMinute;
        
       //resolves negative results 
        if (minutesLeft < 0) {
            hoursLeft = hoursLeft-1;
            minutesLeft = (Math.abs(minutesLeft));
        }
        
        //string variables hours and minunutes
        String hours = " hours ";
        String minutes = " minutes ";
        
        //resolves issue of plural vs singular grammar
        if (hoursLeft == 1) {
            hours = " hour ";
        }
        
        if (minutesLeft == 1) {
            minutes = " minute ";
        }
        
        
        //printing final out come
        System.out.print("You have "+hoursLeft+hours+"and "+minutesLeft+minutes+"until dinner.");
        
    }
    
}

    