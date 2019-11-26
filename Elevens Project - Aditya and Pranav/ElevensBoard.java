import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board {

	//number of cards on board
	private static final int BOARD_SIZE = 9;

	//all ranks
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	//all suits
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	//all point values
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	@Override //overrides parent class method
	public boolean isLegal (List<Integer> selectedCards) {
		if (containsPairSum11(selectedCards) == true || containsJQK(selectedCards) == true){
			return true;
		}
		else
			return false;
	}

	@Override //overrides parent class method
	public boolean anotherPlayIsPossible() {
		List<Integer> cardList = cardIndexes();  //cardIndexes is from the Board class
		if (isLegal (cardList) == true){
			return true;
		}
		else
			return false;
	}

	private boolean containsPairSum11 (List<Integer> selectedCards) { 
		
		if (selectedCards.size() < 2) {
            return false;
        }
        for (int i = 0; i < selectedCards.size() - 1; i++) {
            for (int j = i + 1; j < selectedCards.size(); j++) {
                if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() == 11) {
                    return true; //if both chosen cards add up to 11, then return true; 
                }
            }
        }
        return false;
		
		
		
		
		
	}
		

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		boolean j = false;
		boolean q = false;
		boolean k = false;
		
		for(int i = 0; i<selectedCards.size(); i++){
			if(cardAt(selectedCards.get(i)).rank() == "jack"){
				j = true;
			}
			else if(cardAt(selectedCards.get(i)).rank() == "queen"){
				q = true;
			}
			else if (cardAt(selectedCards.get(i)).rank() == "king"){
				k = true;
			}
		}
		
		return j && q && k; //if the selected cards are jack, queen, king it returns true
    }
		
		
}
