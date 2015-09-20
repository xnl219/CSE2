//Code by: Xavier Lema

//Check Calculator
//User will imput cost of check, desired tip percentage, and number of people spliting the bill.
//program will the output the amount in dollars each person must pay

import java.util.Scanner;

//Class
public class Check{
    			
    public static void main(String[] args) {
   	    
   	    //declare an instance of the Scanner object and call the Scanner constructor
   	    Scanner myScanner = new Scanner( System.in );
   	    //prompt the user for the original cost of the check
   	    System.out.print("Enter the original cost of the check in the form xx.xx: ");
        //accept user input
        double checkCost = myScanner.nextDouble ();
        //prompt the user for the tip percentage that they wish to pay and accept the input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100 ;
        //promp user for the number of people spliting the check and accept the input
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //declare variable and print out calculated out put
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
           
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        
        dollars=(int)costPerPerson;
      
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
        
}    
  	} 
