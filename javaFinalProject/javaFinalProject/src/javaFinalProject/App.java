package javaFinalProject;

public class App {

	public static void main(String[] args) {
		Deck cards = new Deck();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		//cards.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.drawToHand(cards);
			} else { 
				playerTwo.drawToHand(cards);
			}
		}
		
		for (int i = 0; i < 26; i++) {	
			
			if (playerOne.flip().getValue() > playerTwo.flip().getValue()) {
				playerOne.incrementScore();
			}
			
			if (playerTwo.flip().getValue() > playerOne.flip().getValue()) {
				playerTwo.incrementScore();
			}
			
		}
		
		System.out.println(playerOne.getScore());
		System.out.println(playerTwo.getScore());		

		playerOne.describePlayer();
		playerTwo.describePlayer();
	}
	
	//Current problems: Shuffle method does not work
	//Deck is not being initialized correctly causing remove functions to find no items

}
