package week7;

import java.util.Scanner;

public class ThreeCardPoker1 {
    private static final double NUM_SUITS = 4;
    private static final String HEARTS = "H";
    private static final String DIAMONDS = "D";
    private static final String SPADES = "S";
    private static final String CLUBS = "C";
    private static final int NUM_CARDS_PER_SUIT = 13;
    private static final String ACE = "A";
    private static final String JACK = "J";
    private static final String QUEEN = "Q";
    private static final String KING = "K";

    public static void main(String[] args) {
        int wallet = 500; 
        
        Scanner in = new Scanner(System.in); 
        //int bet = getWager(in, 50, 100, wallet);
        
        String playerHand = "";      //"5D AC KS"; 
        
        playerHand += getCard(playerHand) + " "; 
        playerHand += getCard(playerHand) + " "; 
        playerHand += getCard(playerHand) + " "; 
        System.out.println(playerHand);


        playerHand = discard(in, playerHand);
    }

    private static String discard(Scanner in, String playerHand) {
        String playerHandAdd = ""; 
        System.out.print("Please enter the number of cards you would like to discard [0-3]: ");
        try{
            int numDiscard = Integer.parseInt(in.nextLine());
            if(numDiscard == 0){
            return playerHand; 
            }else if(numDiscard == 1){ 
                System.out.println("Which cards would you like to replace?:");
                playerHand += getCard(playerHand); 
            }else if(numDiscard == 2){ 
                System.out.println("Which cards would you like to replace?:");
                playerHand += getCard(playerHand); 
                playerHand += getCard(playerHand); 
            }else{
            String playerHandAdd = getCard(playerHand) + " "; 
            playerHandAdd += getCard(playerHand) + " "; 
            playerHandAdd += getCard(playerHand) + " "; 

                if(playerHandAdd.equals(playerHand)){
                    playerHandAdd = getCard(playerHand) + " ";    
                }
                
            }
        }catch(Exception ex){
            System.out.print("Invalid Input");
        }
        return playerHandAdd; 
        //prompt the user for how many cards they want to discard (0-3) 
        //validate input (make sure it doesn't crash - try catch)

        //if 0 - do nothing but return playerHand 
        //if 3 playerHand ""; get 3 cards that have not already been used 
        //if 1 or 2 -> prompt for which cards and replace them
        // (2) -> 3D JC validate their input (make sure it doesn't crash - try catch)
    }

    private static String getCard(String usedCards) {
        String card = getFace() + getSuit();

        while(usedCards.indexOf(card) >= 0){
            card = getFace() + getSuit();
        }

        return card; 
    }

    private static String getSuit() {
        int suit = (int)(Math.random() * NUM_SUITS); 

        if(suit == 0)
            return HEARTS; 
        else if (suit == 1)
            return DIAMONDS; 
        else if (suit == 2)
            return SPADES; 
        else 
            return CLUBS; 
    }

    private static String getFace() {
        int face = (int)(Math.random() * NUM_CARDS_PER_SUIT) + 1; 

        if (face >= 2 && face <10)
            return "" + face; 
        else if (face == 1)
            return ACE;
        else if (face == 11)
            return JACK;
        else if (face == 12)
            return QUEEN;
        else 
            return KING; 
    }

    private static int getWager(Scanner in, int minBet, int maxBet, int wallet) {
        boolean validInput = false; 
        int bet = 0; 

        while (!validInput){
            System.out.print("Please enter a bet [$" + minBet + "- $" + maxBet + "]:");
            try{
                
            bet = Integer.parseInt(in.nextLine()); 

            if (bet > wallet)
                System.out.println("You only have $" + wallet);
            else if (bet > maxBet || bet < minBet)
                System.out.println("Your bet must be between [$" + minBet +  "- $" + maxBet + "]:");
            else 
                validInput = true; 
            }catch(Exception ex){
                System.out.println("Invalid Input!");
            }
        }

        return bet; 

    }
    
}
