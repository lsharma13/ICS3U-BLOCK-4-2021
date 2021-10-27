package week7;

import java.util.Scanner;

public class CrazyEights2 {
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
   private static final int NUM_CARDS_TO_START = 5;
   private static final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";

   public static void main(String[] args) {
      int playerPoints = 0, c1Points = 0, c2Points = 0;

      while (!gameOver(playerPoints, c1Points, c2Points)) {
         String result = playRound();
         int firstSpace = result.indexOf(" ");
         int secondSpace = result.lastIndexOf(" ");
         playerPoints += Integer.parseInt(result.substring(0, firstSpace));
         c1Points += Integer.parseInt(result.substring(firstSpace + 1, secondSpace));
         c2Points += Integer.parseInt(result.substring(secondSpace + 1));

         System.out.println(playerPoints + " " + c1Points + " " + c2Points);
      }
   }

   private static String playRound() {
      Scanner in = new Scanner(System.in);
      String playerHand = "";
      String oppHand1 = "";
      String oppHand2 = "";

      String initialDeckCard = "";

      for (int i = 0; i < NUM_CARDS_TO_START; i++) {

         playerHand += getCard() + " ";
      }
      System.out.println("Hand:" + " " + playerHand);

      String opp1Card1 = getCard() + " "; 
      String opp1Card2 = getCard() + " "; 
      String opp1Card3 = getCard() + " "; 
      String opp1Card4 = getCard() + " ";
      String opp1Card5 = getCard() + " ";  
      oppHand1 += opp1Card1 + opp1Card2 + opp1Card3 + opp1Card4 + opp1Card5; 
      //canPlayOpp1(opp1Card1, opp1Card2, opp1Card3, opp1Card4, opp1Card5, oppHand1); 
      String opp2Card1 = getCard() + " "; 
      String opp2Card2 = getCard() + " "; 
      String opp2Card3 = getCard() + " "; 
      String opp2Card4 = getCard() + " ";
      String opp2Card5 = getCard() + " "; 
      oppHand2 += opp2Card1 + opp2Card2 + opp2Card3 + opp2Card4 + opp2Card5; 

      initialDeckCard = getCard();
      if (initialDeckCard.indexOf("8") >= 0) {
         initialDeckCard = getCard();
         System.out.println("Deck:" + " " + initialDeckCard);
      } else {
         System.out.println("Deck:" + " " + initialDeckCard);
      }

      while (playerHand.length() >= 0 || oppHand1.length() >= 0 || oppHand2.length() >= 0) {
         String temp = processPlayer(in, playerHand, initialDeckCard);
         playerHand = temp.substring(0, temp.indexOf(" "));
         initialDeckCard = temp.substring(temp.indexOf(" ") + 1);

      }
      return playerTotal(playerHand) + "-" + playerTotal(oppHand1) + "-" + playerTotal(oppHand2);

   }
      
   

   }
   return null; 
}

   private static String processPlayer(Scanner in, String playerHand, String initialDeckCard) {
      boolean validInput = false;
      while (!validInput) {
         String deckCardSuit = initialDeckCard.substring(initialDeckCard.length() - 1);
         String deckCardRank = initialDeckCard.substring(0, initialDeckCard.length() - 1);
         if (playerHand.indexOf(deckCardSuit) >= 0 || playerHand.indexOf(deckCardRank) >= 0
               || playerHand.indexOf("8") >= 0) {
            System.out.print("Please enter the card to play: (ex. 7H KD): ");
            String cards = in.nextLine().toUpperCase();
            String playedCardSuit = cards.substring(cards.length() - 1);
            String playedCardRank = cards.substring(0, cards.length() - 1);
            if (VALID_CARDS.indexOf(cards) < 0) {
               System.out.println("Not a valid card: " + cards);
            } else if (playerHand.indexOf(playedCardSuit) < 0 || playerHand.indexOf(playedCardRank) < 0) {
               System.out.println("You don't have a " + cards);
            } else if (cards.indexOf("8") >= 0) {
               ifEight(in, initialDeckCard, playerHand, cards);
            } else {
               playerHand = playerHand.replaceFirst(cards + " ", "");
               initialDeckCard = cards;
               System.out.println("Hand: " + playerHand);
               System.out.println("Deck " + initialDeckCard);
            }

         } else {
            System.out.println("You cannot play. Press any key to draw a card.");
            String proceed = in.nextLine().toUpperCase();
            playerHand = playerHand + getCard() + " ";
            System.out.println("Hand: " + playerHand);
            System.out.println("Deck: " + initialDeckCard);
         }
      }
      return playerHand;

   }

   private static boolean gameOver(int playerPoints, int c1Points, int c2Points) {
      return playerPoints >= 100 || c1Points >= 100 || c2Points >= 100;

   }

   private static String ifEight(Scanner in, String initialDeckCard, String playerHand, String cards) {
      System.out.println("What suit is the 8?");
      String suit = in.nextLine().toUpperCase();
      if (suit.equals("DIAMONDS") || suit.equals("D")) {
         initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8D");
         System.out.println("Deck: " + initialDeckCard);
      } else if (suit.equals("SPADES") || suit.equals("S")) {
         initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8S");
         System.out.println("Deck: " + initialDeckCard);

      } else if (suit.equals("CLUBS") || suit.equals("C")) {
         initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8C");
         System.out.println("Deck: " + initialDeckCard);

      } else if (suit.equals("HEARTS") || suit.equals("H")) {
         initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8H");
         System.out.println("Deck: " + initialDeckCard);

      } else {
         System.out.println("Invalid input!");
      }
      playerHand = playerHand.replaceFirst(cards + " ", "");
      System.out.println("Hand: " + playerHand);
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

   private static int playerTotal(String playerCards) {
      int p1Points = 0;

      /**
       * Cards 2 through 9 excluding 8 are worth their face value Ace are worth 1
       * eights are worth 50 10 to kind worth 10
       */

      for (int i = 0; i < playerCards.length(); i++) {

         if (playerCards.indexOf(ACE) >= 0) {
            p1Points += 1;
         } else if (playerCards.indexOf(KING) >= 0) {
            p1Points += 10;
         } else if (playerCards.indexOf(QUEEN) >= 0) {
            p1Points += 10;
         } else if (playerCards.indexOf(JACK) >= 0) {
            p1Points += 10;
         } else if (playerCards.indexOf(10) >= 0) {
            p1Points += 10;
         } else if (playerCards.indexOf("2") >= 0) {
            p1Points += 2;
         } else if (playerCards.indexOf("3") >= 0) {
            p1Points += 3;
         } else if (playerCards.indexOf("4") >= 0) {
            p1Points += 4;
         } else if (playerCards.indexOf("5") >= 0) {
            p1Points += 5;
         } else if (playerCards.indexOf("6") >= 0) {
            p1Points += 6;
         } else if (playerCards.indexOf("7") >= 0) {
            p1Points += 7;
         } else {
            p1Points += 9;
         }
      }
      return p1Points;
   }
}