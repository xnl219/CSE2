//Xavi Lema cse02
//hw 10
//Shuffling


public class Shuffling{
    
    //printArray
    public static void printArray( String[] list) {
        
        for(int x=0; x<list.length; x++) {
            System.out.print(list[x]+" ");
        }
    }
    
    
    //Shuffle array
    public static void shuffle( String[] list) {
        
        for(int y=0; y<list.length; y++) {
            
            int randomShuffle = (int) (list.length*Math.random() );
            
            String temp = list[randomShuffle];
            
            list[randomShuffle] = list[y];
            list[y] = temp;
        }
    }
    
    
    //random hand
    public static String[] randomizeHand(String[] list) {
        
        String[] list2 = new String[5];
        
        for(int z=0; z<5; z++){
            int hand = (int) (Math.random()*52);
            
            list2[z] = list[hand];
        }
        
        return list2;
    }
    
    //main method
    public static void main(String[] args) {
    	
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        
        System.out.println("");
        System.out.println("Deck:");
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        System.out.println("");
        
        shuffle(cards);
        System.out.println(" ");
        System.out.println("Suffled Deck: ");
        printArray(cards);
        System.out.println("");
        
        hand = randomizeHand(cards);
        System.out.println(" ");
        System.out.println("Randomized Hand:");
        printArray(hand);
        System.out.println("");
        
    }

}

