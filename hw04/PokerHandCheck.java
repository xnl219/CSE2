//Xavier Lema CSE2
//hw04 PokerHandCheck
//Program: Draw 5 random cards from5 separate 52 card deck. 
//Then, let user know what poker hand he has.

//Class
public class PokerHandCheck {
    
    public static void main(String[] args)  {
    
    //CARD 1    
        //generation of random number 1-52
        int cardNumber1 = (int)(Math.random()*52)+1;
        //string variables
        String suit1 = "";
        String cardIdentity1 = "";
        
        //defining the suit "Diamonds"
        if (cardNumber1 >= 1 && cardNumber1 <= 13) {
            suit1 = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber1 >= 14 && cardNumber1 <= 26) {
            suit1 = "Clubs";
            cardNumber1 = cardNumber1 - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber1 >= 27 && cardNumber1 <= 39) {
            suit1 = "Hearts";
            cardNumber1 = cardNumber1 - 26;
        }
        //defining the suit "Spades"
        if (cardNumber1 >= 40 && cardNumber1 <= 52) {
            suit1 = "Spades";
            cardNumber1 = cardNumber1 - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber1) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity1 = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity1 = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity1 = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity1 = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity1 = Integer.toString (cardNumber1);
            break;
            }
    
    //CARD 2    
        int cardNumber2 = (int)(Math.random()*52)+1;
        //string variables
        String suit2 = "";
        String cardIdentity2 = "";
        
        //defining the suit "Diamonds"
        if (cardNumber2 >= 1 && cardNumber2 <= 13) {
            suit2 = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber2 >= 14 && cardNumber2 <= 26) {
            suit2 = "Clubs";
            cardNumber2 = cardNumber2 - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber2 >= 27 && cardNumber2 <= 39) {
            suit2 = "Hearts";
            cardNumber2 = cardNumber2 - 26;
        }
        //defining the suit "Spades"
        if (cardNumber2 >= 40 && cardNumber2 <= 52) {
            suit2 = "Spades";
            cardNumber2 = cardNumber2 - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber2) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity2 = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity2 = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity2 = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity2 = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity2 = Integer.toString (cardNumber2);
            break;
            }
            
    //CARD 3
       int cardNumber3 = (int)(Math.random()*52)+1;
        //string variables
        String suit3 = "";
        String cardIdentity3 = "";
        
        //defining the suit "Diamonds"
        if (cardNumber3 >= 1 && cardNumber3 <= 13) {
            suit3 = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber3 >= 14 && cardNumber3 <= 26) {
            suit3 = "Clubs";
            cardNumber3 = cardNumber3 - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber3 >= 27 && cardNumber3 <= 39) {
            suit3 = "Hearts";
            cardNumber3 = cardNumber3 - 26;
        }
        //defining the suit "Spades"
        if (cardNumber3 >= 40 && cardNumber3 <= 52) {
            suit3 = "Spades";
            cardNumber3 = cardNumber3 - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber3) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity3 = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity3 = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity3 = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity3 = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity3 = Integer.toString (cardNumber3);
            break;
            }  
            
    //CARD 4
       int cardNumber4 = (int)(Math.random()*52)+1;
        //string variables
        String suit4 = "";
        String cardIdentity4 = "";
        
        //defining the suit "Diamonds"
        if (cardNumber4 >= 1 && cardNumber4 <= 13) {
            suit4 = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber4 >= 14 && cardNumber4 <= 26) {
            suit4 = "Clubs";
            cardNumber4 = cardNumber4 - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber4 >= 27 && cardNumber4 <= 39) {
            suit4 = "Hearts";
            cardNumber4 = cardNumber4 - 26;
        }
        //defining the suit "Spades"
        if (cardNumber4 >= 40 && cardNumber4 <= 52) {
            suit4 = "Spades";
            cardNumber4 = cardNumber4 - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber4) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity4 = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity4 = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity4 = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity4 = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity4 = Integer.toString (cardNumber4);
            break;
            }
            
    //CARD 5
       int cardNumber5 = (int)(Math.random()*52)+1;
        //string variables
        String suit5 = "";
        String cardIdentity5 = "";
        
        //defining the suit "Diamonds"
        if (cardNumber5 >= 1 && cardNumber5 <= 13) {
            suit5 = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber5 >= 14 && cardNumber5 <= 26) {
            suit5 = "Clubs";
            cardNumber5 = cardNumber5 - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber5 >= 27 && cardNumber5 <= 39) {
            suit5 = "Hearts";
            cardNumber5 = cardNumber5 - 26;
        }
        //defining the suit "Spades"
        if (cardNumber5 >= 40 && cardNumber5 <= 52) {
            suit5 = "Spades";
            cardNumber5 = cardNumber5 - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber5) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity5 = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity5 = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity5 = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity5 = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity5 = Integer.toString (cardNumber5);
            break;
            }

        // variables for checking if there is a pair
        int pairs1 ;
        int pairs2 ;
        int pairs3 ;
        int pairs4 ;
        int pairs5 ;
        int pairs6 ;
        int pairs7 ;
        int pairs8 ;
        int pairs9 ;
        int pairs10 ;
      
        //if statements checking for pairs
        if (cardNumber1 == cardNumber2) {
            pairs1 = 1;
        } else {
            pairs1 = 0;
        }
        
        if (cardNumber1 == cardNumber3) {
            pairs2 = 1;
        } else {
            pairs2 = 0;
        }
        
        if (cardNumber1 == cardNumber4) {
            pairs3 = 1;
        } else {
            pairs3 = 0;
        }    
        if (cardNumber1 == cardNumber5) {
            pairs4 = 1;
        } else {
            pairs4 = 0;
        }
        if (cardNumber2 == cardNumber3) {
            pairs5 = 1;
        } else {
            pairs5 = 0;
        }
        if (cardNumber2 == cardNumber4) {
            pairs6 = 1;
        } else {
            pairs6 = 0;
        }
        if (cardNumber2 == cardNumber5) {
            pairs7 = 1;
        } else {
            pairs7 = 0;
        }
        if (cardNumber3 == cardNumber4) {
            pairs8 = 1;
        } else {
            pairs8 = 0;
        }
        if (cardNumber3 == cardNumber5) {
            pairs9 = 1;
        } else {
            pairs9 = 0;
        }
        if (cardNumber4 == cardNumber5) {
            pairs10 = 1;
        } else {
            pairs10 = 0;
        }
        
        //variable (pairs) is total number of pairs
        //calculate total number of pairs
        int pairs;
        pairs = pairs10+pairs9+pairs8+pairs7+pairs6+pairs5+pairs4+pairs3+pairs2+pairs1;
        
        //System out printing what cards the user got
        System.out.println("Your random cards were:");        
        System.out.println("  - The "+cardIdentity1+" of "+suit1);
        System.out.println("  - The "+cardIdentity2+" of "+suit2);
        System.out.println("  - The "+cardIdentity3+" of "+suit3);
        System.out.println("  - The "+cardIdentity4+" of "+suit4);
        System.out.println("  - The "+cardIdentity5+" of "+suit5);
        System.out.println("");
        
        //check and print for high card
        if (pairs == 0) {
        System.out.println("You have a high card hand!");
        }
        // check and print for 1 pair
        if (pairs == 1) {
        System.out.println("You have a pair!");
        }
        //check and print for 2 pairs
        if (pairs == 2) {
        System.out.println("You have 2 pairs!");
        }
        //check and print for 3 of a kind
        if (pairs == 3) {
        System.out.println("You have 3 of a kind!");
        }
        //check and frint for full house
        if (pairs == 4) {
        System.out.println("You have a full house!");    
        }
        // check and print for 4 of a kind
        if (pairs == 6) {
        System.out.println("You have 4 of a kind");
        }
        //check and print for 5 of a kind
        if (pairs == 10) {
        System.out.println("You have 5 of a kind");
        }
    }
}