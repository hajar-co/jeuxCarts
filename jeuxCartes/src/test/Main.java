package test;

import java.util.ArrayList;
import java.util.Iterator;
import jeuxCartes.Card;
import jeuxCartes.Creater;
import jeuxCartes.Land;
import jeuxCartes.Player;
import jeuxCartes.Spel;


public class Main {

	public static void main(String[] args) {
		ArrayList<Card> Mycards = new ArrayList<Card>();
		Mycards.add(new Land("land", 5));
		Mycards.add(new Land("land", 4));
		Mycards.add(new Land("land", 3));
		Mycards.add(new Land("land", 2));
		Mycards.add(new Land("land", 1));
		Mycards.add(new Creater("creat", 1));
		Mycards.add(new Creater("creat", 2));
		Mycards.add(new Creater("creat", 3));
		Mycards.add(new Creater("creat", 4));
		Mycards.add(new Creater("creat", 5));
		Mycards.add(new Spel("spel", 2));
		Mycards.add(new Spel("spel", 1));

		
		Player play1 = new Player("ahmed", Mycards);
		
		Iterator<Card> shuffled = Mycards.iterator();
		while (shuffled.hasNext()) {
			Card obj = (Card) shuffled.next();
			System.out.println(obj.getName() + " " + obj.getValue());
		}
		
		System.out.println("");
		
		Player play2 = new Player("amin", Mycards);
		Iterator<Card> shuffled2 = Mycards.iterator();
		while (shuffled2.hasNext()) {
			Card obj = (Card) shuffled2.next();
			System.out.println(obj.getName() + " " + obj.getValue());
		}
		
		int[] count = new int[2];
		for(int i = 0; i<12; i++) {
			
			Card player1Card = play1.getCards().get(i);
			Card player2Card = play2.getCards().get(i);
			
			if(!player1Card.getName().equals(player2Card.getName())) {
//				System.out.println("players name are equal");
				
				if(player1Card.getName().equals ("spel")){
//					System.out.println("Player 1 card is spel");
					count[0]++;
				} if(player1Card.getName() .equals( "creat") && !player2Card.getName().equals("spel")) {
//					System.out.println("Player 1 card is Create");
					count[0]++;
				}else if(player1Card.getName() .equals( "creat") && player2Card.getName().equals("spel")) {
//					System.out.println("Player 1 card is Create");
					count[1]++;
				}
				else {
//					System.out.println("PLayer 1 name is land");
					count[1]++;
				}
			}
			else  {
				if(player1Card.getValue() > player2Card.getValue()) {
//					System.out.println("the value of 1 player are equals");
					count[0]++;
				}
				else {
//					System.out.println("the 2 value player are not equals");
					count[1]++;
				}
			}
			
			
		}
		
		if(count[0]>count[1]) {
			System.out.println("the winner is:" + play1.getName());
		}else {
			System.out.println("the winner is:"+ play2.getName());
		}
		
		
	}
}
