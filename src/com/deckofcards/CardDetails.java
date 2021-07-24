/****************************************************************
 * Purpose : To create a pojo class for card details.
 * @author Samarth BM

***************************************************************/

package com.deckofcards;

public class CardDetails {


public class Card {
	public String suit;
	public String rank;

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
}