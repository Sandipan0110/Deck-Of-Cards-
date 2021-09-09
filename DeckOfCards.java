package deckofcard;

public class DeckOfCards {
	
	public static void main(String[] args) {
		
		int[] deck = new int[52];
	    String[] cards = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" , "Ace"};

	    // Initialize cards
	    for (int i = 0; i < deck.length; i++) {
	      deck[i] = i;
	    }
	}
}
