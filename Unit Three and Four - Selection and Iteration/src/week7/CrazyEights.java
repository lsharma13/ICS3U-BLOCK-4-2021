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
        String playerHand = " " + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard(); 
        String initialDeckCard = getInitialDeckCard(getCard()); 
        Scanner in = new Scanner(System.in);
        System.out.println("Player: " + playerHand); 
        System.out.println("Top Deck Card:" + " " + initialDeckCard);
        System.out.println(canPlay(playerHand, initialDeckCard)); 
        getCardsToDiscard(in, playerHand); 
        canPlay(playerHand, initialDeckCard); 
}
//private static String discard(Scanner in, String playerHand) {
     //??wait for james 

      //}
   


private static boolean canPlay(String playerHand, String initialDeckCard) {
   boolean isCanPlay = true;
   if(playerHand.indexOf(initialDeckCard) < 0){
      isCanPlay = false;  
   }else 
   isCanPlay = true; 
   return(isCanPlay); 
   }

private static String getCardsToDiscard(Scanner in, String playerHand) {
   final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";
   boolean validInput = false;
   String cards = "";
   while (!validInput) {
      System.out.println("Please enter the cards to replace: (ex. 7H KD): ");
      cards = in.nextLine().toUpperCase();
      if (VALID_CARDS.indexOf(cards) < 0) {
         System.out.println("Not a valid card: " + cards);
      } else if (playerHand.indexOf(cards) < 0)
         System.out.println("You don't have a " + cards);
      else if (playerHand.indexOf(cards) >= 0){
         validInput = true;
      } else {
         int space = cards.indexOf(" ");

         String card1 = cards.substring(0, space);
         String card2 = cards.substring(space + 1);
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
   return cards;
}

private static String getInitialDeckCard(String initialDeckCard) {
    while(true){
      initialDeckCard = getFace() + getSuit();
        if(initialDeckCard.indexOf("8") >= 0){
            getCard(); 
        }else 
        return initialDeckCard; 
    }
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

   

