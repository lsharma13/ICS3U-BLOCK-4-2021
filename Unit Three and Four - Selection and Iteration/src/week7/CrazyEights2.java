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
      String opp1Hand = "";
      String opp2Hand = "";
      String temp = "";

      String initialDeckCard = "";

      for (int i = 0; i < NUM_CARDS_TO_START; i++) {

         playerHand += getCard() + " ";
         opp1Hand += getCard() + " "; 
         opp2Hand += getCard() + " "; 
      }
      System.out.println("Hand:" + " " + playerHand);
      
      
      initialDeckCard = getCard();
      if (initialDeckCard.indexOf("8") >= 0) {
         initialDeckCard = getCard();
         System.out.println("New Deck:" + " " + initialDeckCard);
      } else {
         //System.out.println("Deck:" + " " + initialDeckCard);
      }

      while (playerHand.length() >= 0 || opp1Hand.length() >= 0 || opp2Hand.length() >= 0) {
         
         temp = processPlayer(in, playerHand, initialDeckCard);
         playerHand = temp.substring(0, temp.indexOf("-"));
         initialDeckCard = temp.substring(temp.indexOf("-") + 1);

         temp = processComputer(opp1Hand, initialDeckCard, playerHand, opp2Hand);
         opp1Hand = temp.substring(0, temp.indexOf("-"));
         initialDeckCard = temp.substring(temp.indexOf("-") + 1);

         temp = processComputer(opp2Hand, initialDeckCard, playerHand, opp1Hand);
         opp2Hand = temp.substring(0, temp.indexOf("-"));
         initialDeckCard = temp.substring(temp.indexOf("-") + 1);
      }
      String points = playerTotal(playerHand) + "-" + playerTotal(opp1Hand) + "-" + playerTotal(opp2Hand);
      return points;

   }
      
   
     private static int playerTotal(String playerHand) {
        int points = 0; 
      if(playerHand.indexOf(ACE) >= 0){
         points+= 1;
      }if (playerHand.indexOf("2") >= 0){
         points+= 2; 
      }if (playerHand.indexOf("3") >= 0){
         points+= 3; 
      }if (playerHand.indexOf("4") >= 0){
         points+= 4; 
      }if (playerHand.indexOf("5") >= 0){
         points+= 5; 
      }if (playerHand.indexOf("6") >= 0){
         points+= 6; 
      }if (playerHand.indexOf("7") >= 0){
         points+= 7; 
      }if (playerHand.indexOf("8") >= 0){
         points+= 50; 
      }if (playerHand.indexOf("9") >= 0){
         points+= 9; 
      }if (playerHand.indexOf("10") >= 0){
         points+= 10; 
      }if (playerHand.indexOf(JACK) >= 0){
         points+= 10; 
      }if (playerHand.indexOf(QUEEN) >= 0){
         points+= 10; 
      }if (playerHand.indexOf(KING) >= 0){
         points+= 10; 
   }
   System.out.println(points);
   return points;
}
   private static String processComputer(String thisComputerHand, String initialDeckCard, String opp1Hand, String opp2Hand) {
      /*opp1Hand or opp2Hand might be playerHand
      variables are opposition of the computer */
      thisComputerHand = validHand(thisComputerHand,initialDeckCard) + " ";
         int index = 0;
         String initialCard = "";
         String suit = "";
         String initialDeckCardRank= initialDeckCard.substring(0,initialDeckCard.length()-1);
         String initialDeckCardSuit = initialDeckCard.substring(initialDeckCard.length()-1);
   
         if (thisComputerHand.indexOf(initialDeckCardRank)>=0 || thisComputerHand.indexOf(initialDeckCardSuit)>=0 || thisComputerHand.indexOf("8")>=0){
            if (opp1Hand.indexOf(" ") < 0|| opp2Hand.indexOf(" ") < 0){
            while (thisComputerHand.indexOf(initialDeckCardRank,index) >= 0){
                  index = thisComputerHand.indexOf(initialDeckCardRank,index);
                  initialCard = thisComputerHand.substring(index, thisComputerHand.indexOf(" ", index));
                  if (!(initialCard.substring(initialCard.length()-1).equals(initialDeckCardSuit))){
                     return thisComputerHand.replaceFirst(initialCard + " ", "").trim() + "-" + initialCard;
                  }
                  index++;
                  //finds if we can change the suit via and 8
               } if (thisComputerHand.indexOf("8")>=0){
                  suit = getHighSuit(thisComputerHand, initialDeckCardRank);
                  return thisComputerHand.replaceFirst(thisComputerHand.substring(thisComputerHand.indexOf("8"), thisComputerHand.indexOf("8")+2), "").trim() + "-8"+suit;
               }
            //finds a card with the same suit 
           }if (thisComputerHand.indexOf(initialDeckCardSuit) >= 0){
            index = 0;
            while (thisComputerHand.indexOf(initialDeckCardSuit, index)>= 0){
               index = thisComputerHand.indexOf(initialDeckCardSuit,index);
               initialCard = thisComputerHand.substring(thisComputerHand.lastIndexOf(" ", index)+1, thisComputerHand.indexOf(" ", index));
               if (initialCard.indexOf("8")==-1){
               return thisComputerHand.replaceFirst(initialCard + " ", "").trim() + "-" + initialCard;
               } else{
                  index++;
               }
            }
            //finds a card with the same rank (this does not yet handel if the card is an 8)
            } if (thisComputerHand.indexOf(initialDeckCardRank)!=-1  && thisComputerHand.indexOf("8")==-1){
               index = 0; 
               index = thisComputerHand.indexOf((initialDeckCardRank),index);
               initialCard = thisComputerHand.substring(index, thisComputerHand.indexOf(" ", index));
               return thisComputerHand.replaceFirst(initialCard + " ", "").trim() + "-" + initialCard;
                //finds if we can change the suit via and 8
               //this basically has to be true
            } if (thisComputerHand.indexOf("8")>=0){
            suit = getHighSuit(thisComputerHand,"X");
            initialCard = thisComputerHand.substring(thisComputerHand.indexOf("8"),thisComputerHand.indexOf("8")+2);
            return thisComputerHand.replaceFirst(initialCard + " ", "").trim() + "-" + initialCard;
            } 
            }else{
            System.out.println("The computer skipped it's turn");
            return thisComputerHand + "-" + initialDeckCard;
}

   return ""; // change this
}


private static String getHighSuit(String hand, String bannedSuit){

   int H = 0;
   int D = 0;
   int C = 0;
   int S = 0;

   int maxNum = 0;

   for (int i = 0; i<hand.length(); i++){
      if (hand.substring(i, i+1).equals("H")&&!hand.substring(i-1,i).equals("8") && !("H".equals(bannedSuit))){
         H++;
      }else if (hand.substring(i, i+1).equals("D")&&!hand.substring(i-1,i).equals("8") && !("D".equals(bannedSuit))){
         D++;
      }else if (hand.substring(i, i+1).equals("S")&&!hand.substring(i-1,i).equals("8") && !("S".equals(bannedSuit))){
         S++;
      }else if (hand.substring(i,i+1).equals("C")&&!hand.substring(i-1,i).equals("8") && !("C".equals(bannedSuit))){
         C++;
      }
   }

   maxNum = Math.max(Math.max(H, C), Math.max(D, S));
   if (H==maxNum){
      return "H";
   } else if (D==maxNum){
      return "D";
   }else if (C==maxNum){
      return "C";
   }else if (S==maxNum){
      return "S";
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
            System.out.println("Deck:" + initialDeckCard);
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
               validInput = true; 
               System.out.println("Hand: " + playerHand);
               System.out.println("Deck " + initialDeckCard);
            }

         } else {
            int addedCards = 0; 
            while(playerHand.indexOf(deckCardRank)==-1 && playerHand.indexOf(deckCardSuit)==-1 && playerHand.indexOf("8")==-1){
               System.out.println("You cannot play. Press enter to draw a card.");
               in.nextLine().toUpperCase();
               playerHand+= " " + getCard();
               System.out.println("Hand: " + playerHand);
               System.out.println("Deck: " + initialDeckCard);
               addedCards++;
               if (addedCards==5){
                  System.out.println("Turn Skipped. You can draw a max of 5 cards.");
                  return playerHand + " ";
               } 
            }
            
            
               }
            }
         
            return playerHand + "-" + initialDeckCard;

         }
      

         private static String validHand(String playerHand, String initialDeckCard) {
            String initialDeckCardRank = initialDeckCard.substring(0,initialDeckCard.length()-1); 
            String initialDeckCardSuit = initialDeckCard.substring(initialDeckCard.length()-1); 
            if (playerHand.length()==0){
               return "";
            }
            int addedCards = 0;
            while(playerHand.indexOf(initialDeckCardRank)==-1 && playerHand.indexOf(initialDeckCardSuit)==-1 && playerHand.indexOf("8")==-1){
               playerHand+= " " + getCard();
               addedCards++;
               if (addedCards==5){
                  return playerHand + " ";
               } 
            }
            return playerHand + " ";
         }

   

   private static boolean gameOver(int playerPoints, int c1Points, int c2Points) {
      return playerPoints >= 100 || c1Points >= 100 || c2Points >= 100;

   }

   private static String ifEight(Scanner in, String initialDeckCard, String playerHand, String cards) {
      System.out.println("What suit is the 8?");
      String suit = in.nextLine().toUpperCase();
      if (suit.equals("DIAMONDS") || suit.equals("D")) {
         //initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8D");
         initialDeckCard = "8D"; 
         //System.out.println("Deck: " + initialDeckCard);
      } else if (suit.equals("SPADES") || suit.equals("S")) {
         //initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8S");
         initialDeckCard = "8S"; 
        // System.out.println("Deck: " + initialDeckCard);

      } else if (suit.equals("CLUBS") || suit.equals("C")) {
         //initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8C");
         initialDeckCard = "8C"; 
         //System.out.println("Deck: " + initialDeckCard);

      } else if (suit.equals("HEARTS") || suit.equals("H")) {
         //initialDeckCard = initialDeckCard.replaceFirst(initialDeckCard.substring(0, initialDeckCard.length()), "8H");
         initialDeckCard = "8H"; 
         //System.out.println("Deck: " + initialDeckCard);

      } else {
         System.out.println("Invalid input!");
      }
      playerHand = playerHand.replaceFirst(cards + " ", "");
      System.out.println("Hand: " + playerHand);
      //System.out.println("Deck: " + initialDeckCard);
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