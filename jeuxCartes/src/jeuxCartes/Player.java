package jeuxCartes;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
	
	private String Name;
	private ArrayList<Card> Cards;
	
	public Player(String name, ArrayList<Card> Cards) {
		this.setName(name);
		this.setCards(Cards);
		this.shuffled();
	}
	
	public ArrayList<Card> getCards() {
		this.shuffled();
		return this.Cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.Cards = cards;
		this.shuffled();
	}

	public String getName() {
		return this.Name;
	}
	
	public String setName(String newName) {
		return this.Name = newName;
	}
	
    public void shuffled() {
		Collections.shuffle(this.Cards);
	}

	
	
	

    
  
}
