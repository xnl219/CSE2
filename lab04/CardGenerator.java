//Xavier Lema CSE2
//Lab 4
//objective: create a random card generator using if and switch statements
//Class CardGenerator
public class CardGenerator {
    
    public static void main(String[] args)  {
        //generation of random number 1-52
        int cardNumber = (int)(Math.random()*52)+1;
        //string variables
        String suit = "";
        String cardIdentity = "";
        
        //defining the suit "Diamonds"
        if (cardNumber >= 1 && cardNumber <= 13) {
            suit = "Diamonds";
            
        }
        //defining the suit "Clubs"
        if (cardNumber >= 14 && cardNumber <= 26) {
            suit = "Clubs";
            cardNumber = cardNumber - 13;
        }
        //defining the suit "Hearts"
        if (cardNumber >= 27 && cardNumber <= 39) {
            suit = "Hearts";
            cardNumber = cardNumber - 26;
        }
        //defining the suit "Spades"
        if (cardNumber >= 40 && cardNumber <= 52) {
            suit = "Spades";
            cardNumber = cardNumber - 39;
        }
        // Switch Staements used to define card identity
        switch (cardNumber) {
            // "Ace" witch cases
            case 1: case 14: case 27: case 40:
                cardIdentity = "Ace";
                break;
            // "Jack" witch cases   
            case 11: case 24: case 37: case 50:
                cardIdentity = "Jack";
                break;
            // "Queen" Switch cases    
            case 12: case 25: case 38: case 51:
                cardIdentity = "Queen";
                break;
            // "King" switch cases   
            case 13: case 26: case 39: case 52:
                cardIdentity = "King";
                break;
            // default for all number card identities    
            default:
            cardIdentity = Integer.toString (cardNumber);
            break;

        }
        
        // printing results
        System.out.println("You picked the "+cardIdentity+" of "+suit);
    }
}