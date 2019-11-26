public class Card {
	private String suit;
	private String rank;
	private int pointValue;
   private String[][] cards = { 
      {"ace hearts", "ace diamonds", "ace spades", "ace clubs"}, 
      {"2 hearts", "2 diamonds", "2 spades", "2 clubs"}, 
      {"3 hearts", "3 diamonds", "3 spades", "3 clubs"}, 
      {"4 hearts", "4 diamonds", "4 spades", "4 clubs"}, 
      {"5 hearts", "5 diamonds", "5 spades", "5 clubs"}, 
      {"6 hearts", "6 diamonds", "6 spades", "6 clubs"}, 
      {"7 hearts", "7 diamonds", "7 spades", "7 clubs"}, 
      {"8 hearts", "8 diamonds", "8 spades", "8 clubs"}, 
      {"9 hearts", "9 diamonds", "9 spades", "9 clubs"}, 
      {"10 hearts", "10 diamonds", "10 spades", "10 clubs"}, 
      {"jack hearts", "jack diamonds", "jack spades", "jack clubs"}, 
      {"queen hearts", "queen diamonds", "queen spades", "queen clubs"}, 
      {"king hearts", "king diamonds", "king spades", "king clubs"}
   };
	
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	public String suit() {
		return this.suit; //get set method
   }

	public String rank() {
		return this.rank; //get set method
	}


	public int pointValue() {
		return this.pointValue; //get set method
	}


	public boolean matches(Card otherCard) {
		if (suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue==otherCard.pointValue && cards[4][1].equals("5 diamonds"))
			return true;
		else
			return false;
	}

	@Override //override method provided from parent class
	public String toString() {
		return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ") ";
	}
}
