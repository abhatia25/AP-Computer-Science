import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
	public static String[][] cardsArr = {
		{"acespades", "acehearts", "acediamonds", "aceclubs"},
		{"2spades", "2hearts", "2diamonds", "2clubs"},
		{"3spades", "3hearts", "3diamonds", "3clubs"},
		{"4spades", "4hearts", "4diamonds", "4clubs"},
		{"5spades", "5hearts", "5diamonds", "5clubs"},
		{"6spades", "6hearts", "6diamonds", "6clubs"},
		{"7spades", "7hearts", "7diamonds", "7clubs"},
		{"8spades", "8hearts", "8diamonds", "8clubs"},
		{"9spades", "9hearts", "9diamonds", "9clubs"},
		{"10spades", "10hearts", "10diamonds", "10clubs"},
		{"jackspades", "jackhearts", "jackdiamonds", "jackclubs"},
		{"queenspades", "queenhearts", "queendiamonds", "queenclubs"},
		{"kingspades", "kinghearts", "kingdiamonds", "kingclubs"}
	};
	
	String RandomCard() {
		Random rand = new Random();
		
		int r = rand.nextInt(13);
		int c = rand.nextInt(4);
		
		String card = cardsArr[r][c];
		
		return card;
	}
	
	List<String> Shuffle() {
		List<String> cardsList  = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			cardsList.add(RandomCard());
		}
		return cardsList;
	}
}
