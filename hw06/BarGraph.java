//Xavier Lema HW06

 
import java.util.Scanner;
//class
public class BarGraph {
    
    public static void main(String[] args) {
        
        //Monday
   	    double monday = 0;
   	    System.out.print("Expenses for Monday:    $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            monday = (double)myScanner.nextFloat ();
                if(monday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Tuesday
   	    double tuesday = 0;
   	    System.out.print("Expenses for Tuesday:   $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            tuesday = (double)myScanner.nextFloat ();
                if(tuesday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Wednesday
   	    double wednesday = 0;
   	    System.out.print("Expenses for Wednesday: $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            wednesday = (double)myScanner.nextFloat ();
                if(wednesday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Thursday
   	    double thursday = 0;
   	    System.out.print("Expenses for Thursday:  $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            thursday = (double)myScanner.nextFloat ();
                if(thursday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Friday
   	    double friday = 0;
   	    System.out.print("Expenses for Friday:    $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            friday = (double)myScanner.nextFloat ();
                if(friday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Saturday
   	    double saturday = 0;
   	    System.out.print("Expenses for Saturday:  $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            saturday = (double)myScanner.nextFloat ();
                if(saturday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //Sunday
   	    double sunday = 0;
   	    System.out.print("Expenses for Sunday:    $");
        //accept user input
        while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) {
            sunday = (double)myScanner.nextFloat ();
                if(sunday < 0){
                    System.out.print("Please only enter positive numbers. Try again: $");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: $");
            }
        }
        
        //rounding
        double mondayGraph = Math.round(monday);
        int mondayCheck = 1;
        double tuesdayGraph = Math.round(tuesday);
        int tuesdayCheck = 1;
        double wednesdayGraph = Math.round(wednesday);
        int wednesdayCheck = 1;
        double thursdayGraph = Math.round(thursday);
        int thursdayCheck = 1;
        double fridayGraph = Math.round(friday);
        int fridayCheck = 1; 
        double saturdayGraph = Math.round(saturday);
        int saturdayCheck =  1;
        double sundayGraph = Math.round(sunday);
        int sundayCheck = 1;
        
        System.out.println("");
        //graph symbol
        String symbol = "*";
        
        //Graph
        System.out.print("Mon:  ");
        while(mondayCheck <= mondayGraph && mondayGraph > 0){
            
            System.out.print(symbol+" ");
            mondayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Tue:  ");
        while(tuesdayCheck <= tuesdayGraph && tuesdayGraph > 0){
            
            System.out.print(symbol+" ");
            tuesdayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Wed:  ");
        while(wednesdayCheck <= wednesdayGraph && wednesdayGraph > 0){
            
            System.out.print(symbol+" ");
            wednesdayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Thu:  ");
        while(thursdayCheck <= thursdayGraph && thursdayGraph > 0){
            
            System.out.print(symbol+" ");
            thursdayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Fri:  ");
        while(fridayCheck <= fridayGraph && fridayGraph > 0){
            
            System.out.print(symbol+" ");
            fridayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Sat:  ");
        while(saturdayCheck <= saturdayGraph && saturdayGraph > 0){
            
            System.out.print(symbol+" ");
            saturdayCheck++;
        }
        System.out.println("");
        
        
        System.out.print("Sun:  ");
        while(sundayCheck <= sundayGraph && sundayGraph > 0){
            
            System.out.print(symbol+" ");
            sundayCheck++;
        }
        System.out.println("");
        
       //average expense 
        System.out.println("");
        double average = (monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7 ;
        double roundedAverage = Math.round(average * 100.0) / 100.0;
        
        System.out.println("Your average daily expenses are: $"+roundedAverage);
        
        //percent genertor
        double percent = (double)(Math.random()*.4)-.20;
        
        //4year calc
        int day = 1456;
        int dayCheck = 1;
        double estimate = 0;
    
        while(dayCheck <= day){
            estimate = estimate + roundedAverage + roundedAverage*percent;
            dayCheck++;
        }
        // round estimate
        double roundedEstimate = Math.round(estimate * 100.0) / 100.0;
        
        System.out.println("Estimated expenditure for 4 years: $"+roundedEstimate);
     }
}