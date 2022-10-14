package javaFinalProject;

public class Card {
	private int value;
	private String cardName = new String();
	
	//Constructor
	public Card(int newValue, String newCardName) {
		setValue(newValue);
		setCardName(newCardName);
	}
	
	public String describeCard() {		
		return getCardName();		
	}
	
	//Getter
	public int getValue() {
		return value;
	}
	
	//Setter
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	//Getter
	public String getCardName() {
		return cardName;
	}
	
	//Setter
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
}
