package javaFinalProject;

public class App {

	public static void main(String[] args) {
		Deck newDeck = new Deck();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		//newDeck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.drawToHand(newDeck);
			} else { 
				playerTwo.drawToHand(newDeck);
			}
		}
		
		playerOne.describePlayer();
		playerTwo.describePlayer();
		
		for (int i = 0; i < 26; i++) {	
			
			Card c1 = playerOne.flip();
			Card c2 = playerTwo.flip();
			
			if (c1.getValue() > c2.getValue()) {
				playerOne.incrementScore();
				System.out.println("Player 1 has played " + c1.getCardName() + " which has beaten Player 2 playing the " + c2.getCardName());
			}
			
			else if (c2.getValue() > c1.getValue()) {
				playerTwo.incrementScore();
				System.out.println("Player 2 has played " + c2.getCardName() + " which has beaten Player 1 playing the " + c1.getCardName());
				
			}
			
			else if (c1.getValue() == c2.getValue()) {
				System.out.println("Player 1 has played " + c1.getCardName() + " which has TIED Player 2 playing the " + c2.getCardName());
				
			}	
			
		}
		
		System.out.println(playerOne.getScore());
		System.out.println(playerTwo.getScore());		

	}
	
	//Current problems: Shuffle method does not work

}
