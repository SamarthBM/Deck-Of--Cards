/****************************************************************
 * Purpose : To perform deck of card game with 4 players.
 * @author Samarth BM

***************************************************************/

package com.deckofcards;

public class DeckOfCards {
	// Creating 2D array for card combination and player cards.
	String[][] cardCombo = new String[4][13];
	String[][] player = new String[4][9];
	
	// Storing suits and ranks of card in respective array.
	String[] suits = { "Diamond", "Heart", "Spades", "Club" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	/*
	 * Purpose: Method to set the deck with unique cards. 
	 * Here nested 'for' loop is used to generate 52 unique cards.
	 */
	public void setDeck() {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				cardCombo[i][j] = suits[i] + rank[j];
			}
		}

	}

	/* Purpose: Method to distribute 9 cards for 4 players. */
	public void distributeCard() {
		int k = 0, l = 0, m = 0, o = 0, num = 1;
		while (num <= 36) {

			int randomSuit = (int) Math.floor(Math.random() * 10) % 4;
			int randomRank = (int) Math.floor(Math.random() * 100) % 13;

			int option = num % 4;
			switch (option) {
			case 0:
				player[option][k++] = cardCombo[randomSuit][randomRank];
				break;
			case 1:
				player[option][l++] = cardCombo[randomSuit][randomRank];
				break;
			case 2:
				player[option][m++] = cardCombo[randomSuit][randomRank];
				break;
			case 3:
				player[option][o++] = cardCombo[randomSuit][randomRank];
				break;
			}
			num++;
		}
	}

	/* Purpose: Method to display the cards of 4 players. */
	public void displayPlayersCards() {
		for (int i = 0; i < 4; i++) {
			System.out.print("Player " + (i + 1) + " : ");
			for (int j = 0; j < 9; j++) {
				System.out.print(player[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		DeckOfCards deckOfCards = new DeckOfCards();
		
		deckOfCards.setDeck();
		deckOfCards.distributeCard();
		deckOfCards.displayPlayersCards();

	}
}