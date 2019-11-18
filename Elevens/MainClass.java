
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new ElevensBoard();
		  CardGameGUI gui = new CardGameGUI(board);
		  gui.displayGame();
	}

}
