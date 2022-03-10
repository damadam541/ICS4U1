package unit1;

public class DeckOfCards {
	static Cards [][] deck = new Cards[2][52];
	public static void main(String[] args) {
		
		//Calling 'Cards' for each cell of the array
		for (int x = 0 ; x < 52 ; x++) {
			for (int y = 0 ; y < 2 ; y++) {
				deck[x][y] = new Cards(x,y);
			}
		}

	}

	public static class Cards {
		
	}
}

