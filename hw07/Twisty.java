//Xavier Lema CSE02
//hw07 Twisty


//scanner
import java.util.Scanner;
//class
public class Twisty {
    
   public static void main(String[] args) {
       //aquiring length input from user
        double length = 0;
   	    System.out.print("Input length (integer  0-80): ");
   	    //loop to make sure correct input in enteres
   	    while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) { //check for correct input
            length = (double)myScanner.nextFloat ();
                if(length < 0 || length > 80){
                    System.out.print("Input Error. Please enter an integer between 0-80. Try again: ");
                } else{
                    break; //breaks loop
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: ");
            }
        }
        //aquiring width input from user
        double width = 0;
   	    System.out.print("Input width (integer 0-80, not greater than length): ");
   	    
   	    while(true){
            Scanner myScanner = new Scanner( System.in );
            if(myScanner.hasNextFloat()) { //check for correct input
            width = (double)myScanner.nextFloat ();
                if(width < 0 || width > 80 || width > length){
                    System.out.print("Input Error. Please enter an integer between 0-80 not greater than length. Try again: ");
                } else{
                    break;
                }
            } else {
                System.out.print("Sorry, you did not enter an integer. Try again: ");
            }
        }
        
        //variables
        String blank = " ";
        String hashtag = "#";
        String fslash = "/";
        String bslash = "\\";
        boolean y = false;
       
       //vertical/width loop check 
        for(int check1 = 0; check1 < width; check1++){
            System.out.println("");
            //horrizonta/length check loop
            for(int check2 = 0; check2 < length; check2++){
            //w = which variation to use    
            int w = (int)check2/(int)width;        
                // checks for value of w 
                if(w%2==0) {
                    //first x variation    
                    if(check2 == width*w + width - (check1 + 1) && check2 == width*w + check1 && y == true) {
                        System.out.print(fslash);
                    } else if(check2 == width*w + width - (check1 + 1) && check2 == width*w + check1){
                        System.out.print(hashtag);
                    } else if(check2 == width*w + width - (check1+ 1)) {
                        System.out.print(fslash);
                    } else if(check2 == width*w + check1){
                        System.out.print(hashtag);
                    } else {
                        System.out.print(blank);
                    }
                
                }
                //checks for values of w
                if(w%2!=0){
                    //second variation    
                    if(check2 == width*w + width - (check1 + 1) && check2 == width*w + check1 && y == true) {
                        System.out.print(hashtag);
                    } else if(check2 == width*w + width - (check1 + 1) && check2 == width*w + check1){
                        System.out.print(bslash);
                    } else if(check2 == width*w + width - (check1+ 1)) {
                        System.out.print(hashtag);
                    } else if(check2 == width*w + check1){
                        System.out.print(bslash);
                    } else {
                        System.out.print(blank);
                    }        
                   
                }
            
                    
            }
        }
        
        System.out.println("");
        
        
        
   }
}