public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	
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
		if (suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue==otherCard.pointValue)
			return true;
		else
			return false;
	}

	@Override //override method provided from parent class
	public String toString() {
		return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ") ";
	}
}
