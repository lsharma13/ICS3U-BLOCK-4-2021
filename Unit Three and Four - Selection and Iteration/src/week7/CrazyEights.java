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
      Scanner in = new Scanner(System.in);
      String playerHand = "";  
      String initialDeckCard = ""; 
      int playerPoints = 0; 
      //getSuit(); 
      //getFace(); 
      //getCard();  
      getInitialSuit(); 
      getInitialRank(); 
      playerHand += getPlayerHand(playerHand); 
      initialDeckCard += getInitialDeckCard(initialDeckCard); 

         canPlay(in, playerHand, initialDeckCard);    //figure out loops
       
      
     // gameOver(playerPoints); 
    }
      
   
       
   


private static boolean gameOver(int playerPoints) {
   return playerPoints >= 100; //|| c1Points >= 100 || c2Points >= 100;
   }


private static String canPlay(Scanner in, String playerHand, String initialDeckCard){
      final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";   
      String cards = "";               
      boolean validInput = false;
      while(!validInput){ 
            String deckCardSuit = initialDeckCard.substring(initialDeckCard.length() - 1); 
            String deckCardRank = initialDeckCard.substring(0, initialDeckCard.length() - 1);
         if(playerHand.indexOf(deckCardSuit) >= 0 || playerHand.indexOf(deckCardRank) >= 0 || playerHand.indexOf("8") >= 0){
            while(!validInput){ 
            System.out.print("Please enter the cards to replace: (ex. 7H KD): ");
            cards = in.nextLine().toUpperCase();  
            String playedCardSuit = cards.substring(cards.length() - 1); 
            String playedCardRank = cards.substring(0, cards.length() - 1); 
            if (VALID_CARDS.indexOf(cards) < 0) {
               System.out.println("Not a valid card: " + cards);
            } else if (playerHand.indexOf(playedCardSuit) < 0 || playerHand.indexOf(playedCardRank) < 0 ){ 
               System.out.println("You don't have a " + cards);
            }else if(cards.indexOf("8") >= 0){
               ifEight(in, initialDeckCard);  
            } else {
               validInput = true; 
            }
            }
               playerHand = playerHand.replace(cards + " ", "").trim();
               System.out.println("Hand:" + " " + playerHand);
               initialDeckCard = cards; 
               System.out.println("Deck:" + " " + initialDeckCard);
         }else {
            System.out.println("You cannot play. Card will be drawn.");
            playerHand += " " + getCard();  
            System.out.println(playerHand);  
            System.out.println("Deck" + " " + initialDeckCard);     
           }        
      }
      return playerHand;  
}
     

//add if what suit they want is not equal to the deck card - you cannot play

private static void ifEight(Scanner in, String initialDeckCard) {
   System.out.println("What suit is the 8?");
   String cards = in.nextLine().toUpperCase(); 
   if (cards.equals("DIAMONDS")) { 
      initialDeckCard = initialDeckCard.replace(initialDeckCard.substring(0,initialDeckCard.length()), "8D"); 
      System.out.println("Deck: " + initialDeckCard);
      initialDeckCard = "8D"; 
    } else if (cards.equals("SPADES")) {
      initialDeckCard = initialDeckCard.replace(initialDeckCard.substring(0,initialDeckCard.length()), "8S"); 
      System.out.println("Deck: " + initialDeckCard);
      initialDeckCard = "8S"; 
    } else if (cards.equals("CLUBS")) {
      initialDeckCard = initialDeckCard.replace(initialDeckCard.substring(0,initialDeckCard.length()), "8C"); 
      System.out.println("Deck: " + initialDeckCard);
      initialDeckCard = "8C"; 
    }else if (cards.equals("HEARTS")){
      initialDeckCard = initialDeckCard.replace(initialDeckCard.substring(0,initialDeckCard.length()), "8H"); 
      System.out.println("Deck: " + initialDeckCard);
      initialDeckCard = "8H"; 
      }else {
         System.out.println("Invalid input!");
      }
   
}






private static String getInitialDeckCard(String initialDeckCard) {
   initialDeckCard += getInitialRank() + getInitialSuit(); 
        if(initialDeckCard.indexOf("8") >= 0){
            initialDeckCard = getCard(); 
            System.out.println("Deck:" + " " + initialDeckCard);
        }else {
           System.out.println("Deck:" + " " + initialDeckCard); 
        }
        return initialDeckCard;
   }

   private static String getInitialSuit() {
      String initialSuit = getSuit(); 
      return initialSuit; 
   }

   private static String getInitialRank() {
      String initialRank = getFace();  
      return initialRank; 
   }

private static String getPlayerHand(String playerHand) {
   playerHand +=  getCard() + " " + getCard() + " " + getCard() + " " + getCard() + " " + getCard(); 
   System.out.println("Player: " + playerHand); 
   return playerHand; 
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

   

