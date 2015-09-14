
import java.util.Scanner;

public class Timer {
    
    public static void main(String[] args)  {
        
        //Scanner setup
        Scanner timerScanner = new Scanner( System.in );
        //promp user for current time
        System.out.println("press return after every digit");
        System.out.println("Enter the current time in the form (HH:MM) : ");
        
        //input current time
        double currentTime = timerScanner.nextDouble ();
        //promp user for dinner time
        System.out.print("Enter desired dinner time (HHMM) : ");
        //input dinner time
        double dinnerTime = timerScanner.nextDouble ();
        
        //Time until dinner variable
        double timeLeft;
        int hours, minutes;
        
         
    }
    
}

    