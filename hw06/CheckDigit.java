

import java.util.Scanner;

public class CheckDigit {
    
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner( System.in );
    System.out.println("Please enter a 10 digit barcode: ");
    double number = myScanner.nextInt ();
    int intnumber = (int)(number);
    
   
    int digit1 = (int)(number/1000000000);
    int digit11 = (intnumber/10000000000);
    int digit111 = digit1 - (digit11*10);
    int digit2 = (int)(number/100000000);
    int digit22 = (intnumber/1000000000);
    int digit222 = digit2 - (digit22*10);
    int digit3 = (int)(number/10000000);
    int digit33 = (intnumber/100000000);
    int digit333 = digit3 - (digit33*10);
    int digit4 = (int)(number/1000000);
    int digit44 = (intnumber/10000000);
    int digit444 = digit4 - (digit44*10);
    int digit5 = (int)(number/100000);
    int digit55 = (intnumber/1000000);
    int digit555 = digit5 - (digit55*10);
    int digit6 = (int)(number/10000);
    int digit66 = (intnumber/100000);
    int digit666 = digit6 - (digit66*10);
    int digit7 = (int)(number/1000);
    int digit77 = (intnumber/10000);
    int digit777 = digit7 - (digit77*10);
    int digit8 = (int)(number/100);
    int digit88 = (intnumber/1000);
    int digit888 = digit8 - (digit88*10);
    int digit9 = (int)(number/10);
    int digit99 = (intnumber/100);
    int digit999 = digit9 - (digit99*10);
    int digitx = (int)(number/10);
    int digitxx = (intnumber/100);
    int digitxxx = digitx - (digitxx*10);
    
    
    if(digitxxx = ((digit111*10+digit222*9+digit333*8+digit444*7+digit555*6+digit666*5+digit777*4+digit888*3+digit999*2)/11)){
        System.out.println("This is a valid ISBN.");
    
    } else {
        System.out.println("This is NOT a valid ISBN. Check digit should be X.");
    }
  
    
    
    

        
    }
}