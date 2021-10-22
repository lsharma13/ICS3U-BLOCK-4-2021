package week7;

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
        System.out.println("Player: " + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard() +  " "  + getCard());
        System.out.println("Deck:" + "" + getDeckCard(getCard()));
}

private static String getDeckCard(String deckCard) {
    while(true){
    deckCard = getFace() + getSuit();
        if(deckCard.indexOf("8") >= 0){
            getCard(); 
        }else 
        return deckCard; 
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
