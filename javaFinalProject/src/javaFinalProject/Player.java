package javaFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
		
	//Constructor
	Player() {
		score = 0;
	}
	
	public List<Card> hand = new ArrayList<Card>();
	
	private int score;
	private String playerName = new String();
	
	//Getter
	public int getScore() {
		return score;
	}
	
	//Setter
	public void setScore(int newScore) {
		this.score = newScore;
	}
	
	//Getter
	public String getPlayerName() {
		return playerName;
	}
	
	//Setter
	public void setPlayerName(String newPlayerName) {
		this.playerName = newPlayerName;
	}
	
	public void describePlayer() {		
			
		System.out.println(getPlayerName());	
		System.out.println("Their hand contains: ");
		for (int i = 0; i < hand.size(); i++) {
			System.out.print(hand.get(i).describeCard());
			if (i != hand.size() - 1) {
				System.out.print(", ");	
			}

		}
		
		System.out.println();
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void drawToHand(Deck cards) {
		hand.add(cards.drawFromDeck());
	}
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	
}
