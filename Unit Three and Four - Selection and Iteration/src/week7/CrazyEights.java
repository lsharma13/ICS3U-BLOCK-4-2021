package week7;

import java.util.Scanner;

public class CrazyEights {
    private static final double NUM_SUITS = 4;
    private static final double CARDS_PER_SUIT = 13;
    private static final String HEARTS = "H";
    private static final String CLUBS = "C";
    private static final String SPADES = "S";
    private static final String DIAMONDS = "D";
    private static final String ACE = "A";
    private static final String JACK = "J";
    private static final String QUEEN = "Q";
    private static final String KING = "K";

    public static void main(String[] args) {
        getSuit(); 
        getFace(); 
        getCard(); 
        int playerPoints = 0; 
         gameOver( playerPoints); 
         String playerHand = ""; 
         getPlayerHand(playerHand); 
       // String playerHand = " " + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard(); 
        String initialDeckCard = getInitialDeckCard(getCard()) + " "; 
        Scanner in = new Scanner(System.in);
        //System.out.println("Player: " + playerHand); 
        //System.out.println("Top Deck Card:" + " " + initialDeckCard);
         while(!gameOver(playerPoints)){
            canPlay(in, playerHand, initialDeckCard); 
         }

      }
   
       
   
private static boolean gameOver(int playerPoints) {
   return playerPoints >= 100; //|| c1Points >= 100 || c2Points >= 100;
   }


private static String canPlay(Scanner in, String playerHand, String initialDeckCard){
      final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";   String cards = "";
         boolean validInput = false;
         String deckCardSuit = initialDeckCard.substring(initialDeckCard.length() - 2); 
         String deckCardRank = initialDeckCard.substring(0, initialDeckCard.length() - 2); 
        while(!validInput){ 
         if(playerHand.indexOf(deckCardSuit) >= 0){
            //System.out.println("You can play a card with the same suit");
            System.out.print("Please enter the cards to replace: (ex. 7H KD): ");
            cards = in.nextLine().toUpperCase();
               playerHand = playerHand.replace(cards + " ", "").trim();
               System.out.println("Hand:" + " " + playerHand); 
           // String replacedPlayer = playerHand.replace(cards + " ", "").trim();
            //String updatePlayerDeck = replacedPlayer.replace(cards + " ", ""); 
            //System.out.println(updatePlayerDeck);

            initialDeckCard = cards; 
            System.out.println("Deck:" + " " + initialDeckCard);
            }   

            //initialDeckCard += " " + cards;  
            //System.out.println("Deck:" + initialDeckCard.replace(initialDeckCard, initialDeckCard.substring(initialDeckCard.indexOf(" ")))); 
            else if(playerHand.indexOf(deckCardRank) >= 0){
            //System.out.println("You can play a card with the same ranK");
            System.out.print("Please enter the cards to replace: (ex. 7H KD): ");
            cards = in.nextLine().toUpperCase();
               playerHand = playerHand.replace(cards + " ", "").trim();
               System.out.println("Hand:" + " " + playerHand);
            initialDeckCard = cards; 
            System.out.println("Deck:" + " " + initialDeckCard);
           // initialDeckCard += " " + cards; 
            //System.out.println("Deck:" + initialDeckCard.replace(initialDeckCard, initialDeckCard.substring(initialDeckCard.indexOf(" "))));

         }else if(playerHand.indexOf("8") >= 0){
            //System.out.println("You can play an 8");
            System.out.print("Please enter the cards to replace: (ex. 7H KD): ");
            cards = in.nextLine().toUpperCase();
            
               playerHand = playerHand.replace(cards + " ", "").trim();
               System.out.println("Hand:" + " " + playerHand); 

            initialDeckCard = cards; 
            System.out.println("Deck:" + " " + initialDeckCard);
           // initialDeckCard += " " + cards; 
           // System.out.println("Deck:" + initialDeckCard.replace(initialDeckCard, initialDeckCard.substring(initialDeckCard.indexOf(" "))));
         }else {
            System.out.println("You cannot play. Card will be drawn."); 
            System.out.println(playerHand + " " + getCard());       
           }
           return playerHand;
         } 
         while (!validInput) {
            cards = in.nextLine().toUpperCase();
            if (VALID_CARDS.indexOf(cards) < 0) {
               System.out.println("Not a valid card: " + cards);
            } else if (playerHand.indexOf(cards) < 0)
               System.out.println("You don't have a " + cards);
            else if (playerHand.indexOf(cards) >= 0){
               validInput = true; 
            } else {
               int space = playerHand.indexOf(" ");
      
               String card1 = playerHand.substring(0, space);
               String card2 = playerHand.substring(space + 1);
               if (VALID_CARDS.indexOf(card1) < 0)
                  System.out.println("Not a valid card: " + card1);
               else if (VALID_CARDS.indexOf(card2) < 0)
                  System.out.println("Not a valid card: " + card2);
               else if (playerHand.indexOf(card1) < 0)
                  System.out.println("You don't have a " + card1);
               else if (playerHand.indexOf(card2) < 0)
                  System.out.println("You don't have a " + card2);
               else if (card1.equals(card2))
                  System.out.println("You cannot discard the same card.");
               else
                  validInput = true;
            }
         }
         return playerHand;          
}



private static String getInitialDeckCard(String initialDeckCard) {
    while(true){
      String initialFace = getFace(); 
      String initialSuit = getSuit(); 
      initialDeckCard = initialFace + initialSuit; 
        if(initialDeckCard.indexOf("8") >= 0){
            initialDeckCard = getCard(); 
            System.out.println("Top Deck Card:" + " " + initialDeckCard);
        }else 
        System.out.println("Top Deck Card:" + " " + initialDeckCard);
    }
}

private static void getPlayerHand(String playerHand) {
   playerHand = " " + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard();
   System.out.println("Player: " + playerHand); 
   }



private static String getSuit() {
    int suit = (int) (Math.random() * NUM_SUITS);
    
    if (suit == 0)
       return HEARTS;
    else if (suit == 1)
        return DIAMONDS; 
    else if (suit == 2)
       return CLUBS;
    else
       return SPADES;

 }

 private static String getFace() {
    int suit = (int) (Math.random() * CARDS_PER_SUIT);
    if (suit >= 2 && suit <= 10)
       return suit + "";
    else if (suit == 1)
       return ACE;
    else if (suit == 11)
       return JACK;
    else if (suit == 12)
       return QUEEN;
    else
       return KING;

 }
 private static String getCard() {
    String card = getFace() + getSuit();
    return card;
 }
}

   

