import java.util.List;
import java.util.ArrayList;

public class Deck {

	private List<Card> cards;
	
	private int size; //not dealt cards

	public Deck(String[] ranks, String[] suits, int[] values) {
		this.cards = new ArrayList<Card>();
		for (int i = 0;i < ranks.length; i++){
			for(int j=0; j< suits.length; j++){
				Card tempCard = new Card(ranks[i],suits[j],values[i]);
				this.cards.add(tempCard);
			}
		}
		
		this.size = cards.size();
		shuffle();

	}

	public boolean isEmpty() {
		if (this.size == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return this.size;
	}


	public void shuffle() { 
		Card temp;
		int random = 0;
		for (int index = cards.size() - 1; index > 0; index--) {
			random = (int) (Math.random() * this.cards.size());			
			temp = this.cards.get(index);
			this.cards.set(index, this.cards.get(random));
			this.cards.set(random, temp);
		}
		this.size = cards.size();
	}

	public Card deal() {
		this.size -= 1;
		if (this.size > 0) {
			return this.cards.get(this.size);
		}
		else {
			return null; 
			}
		
	}

	@Override //override parent method
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
