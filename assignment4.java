package prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Card{
	private static int count = 52;
	private String[] suits = {"Jocker", "Club", "Diamond", "Heart", "Spade"};
	private String[] ranks = {"Jocker", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private int rank;
    private int suit;

    public Card() {
    	this.rank = 0;
    	this.suit = 0;
    } 
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getRank() {
    	return rank;
    }
    
    public void createDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
    }
    
    public void printCard() {
    	System.out.print (" "+ranks[rank] + " of " + suits[suit]);

    }
    
    public boolean sameCard(Card c1, Card c2) {
    	return (c1.suit == c2.suit && c1.rank == c2.rank);
    }
    
    public int compareCard(Card c2) {
    	if (this.suit > c2.suit) {
    		if (this.rank > c2.rank) 
    			return 1;
    		if (this.rank < c2.rank) 
    			return -1;
    	}else if (this.suit < c2.suit) {
    		if (this.rank > c2.rank) 
    			return 1;
    		if (this.rank < c2.rank) 
    			return -1;
    	}
    	return 0;
    }
    
    public void findCard(List<Card> card) {
    	int p = 1;
    	Card c2 = new Card(this.rank,this.suit);
    	for(Card c: card) {
    		if(sameCard(c,c2)) {
    			System.out.println("  Present at Postion "+p);
    		}
    		p++;
    	}
    	if(p > 53) {
    		System.out.println(" Not Found!");
    	}
    }
    
    public void dealCards(List<Card> card, int index) {
    	System.out.println("\n Random 5 Cards :");
		for(int x =1 ; x<=5 ; x++) {
			int r = x + (int) (Math.random() * (index-x));
			int p=1;
			for(Card c: card) {
				if(p == r) {
					System.out.print(">");
					c.printCard();
					System.out.println("");
					p++;
				}
				p++;
			}
		}
    }
}

class sortCard implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Card c6 = (Card)o1;
		Card c7 = (Card)o2;
		if(c6.getRank() == c7.getRank()) {
			return 0;
		}else if(c6.getRank() > c7.getRank()) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class assignment4 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Card[] deck = new Card [52];
	    int index = 0, rank , suit;
	    int st = 1;
	    
	    List<Card> card = new ArrayList<Card>();
	    
	    while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Create Deck");
			System.out.println("2. Display Deck");
			System.out.println("3. Sort Deck");
			System.out.println("4. Search Card");
			System.out.println("5. Compare Cards");
			System.out.println("6. Random Cards");
			System.out.print("   Enter your Choice : ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("\n----DECK----");
				System.out.println("1. Create Manually");
				System.out.println("2. Create Automatically");
				System.out.print("   Enter your Choice : ");
				int dh = scan.nextInt();
				switch(dh) {
					case 1:
						System.out.print("   Enter Number of Cards : ");
						int n = scan.nextInt();
						for(int i=0; i<n; i++) {
							System.out.println("\n Card "+(i+1)+" :");
							System.out.print("   Enter Card Rank (1-13) : ");
							rank = scan.nextInt();
							System.out.print("   Enter Card Suit (1-4) : ");
							suit = scan.nextInt();
							card.add(new Card(rank,suit));
							index++;
						}
						break;
					case 2:
						for (int j = 1; j <= 4; j++) {
							for (int k = 1; k <= 13; k++) {
								if(index > 52) {
									break;
								}else {
									card.add(new Card (k, j));
									index++;
								}
							}
						}
						break;
					default :
						System.out.println(" Invalid Choice ");
				}
				break;
			case 2:
				System.out.println("\n DECK of CARDS :");
				for(Card c: card) {
					System.out.print(">");
					c.printCard();
					System.out.println("");
				}
				
				break;
			case 3:
				Collections.sort(card,new sortCard());
		    	Iterator itr = card.iterator();
		    	while(itr.hasNext()) {
		    		Card s = (Card)itr.next();
		    		System.out.print(">");
					s.printCard();
					System.out.println("");
		    	}
		    	break;
			case 4 :
				System.out.println("\n Card Detail :");
				System.out.print("   Enter Card Rank (1-13) : ");
				rank = scan.nextInt();
				System.out.print("   Enter Card Suit (1-4) : ");
				suit = scan.nextInt();
				Card c1 = new Card(rank,suit);
				System.out.print(" Card ");
				c1.printCard();
				c1.findCard(card);
				break;
			case 5:
					System.out.println("\n Card 1 :");
					System.out.print("   Enter Card Rank (1-13) : ");
					rank = scan.nextInt();
					System.out.print("   Enter Card Suit (1-4) : ");
					suit = scan.nextInt();
					Card c3 = new Card(rank,suit);
					System.out.println("\n Card 2 :");
					System.out.print("   Enter Card Rank (1-13) : ");
					rank = scan.nextInt();
					System.out.print("   Enter Card Suit (1-4) : ");
					suit = scan.nextInt();
					Card c4 = new Card(rank,suit);
					int c = c3.compareCard(c4);
					if(c == -1) {
						c3.printCard();
						System.out.print(" > ");
						c4.printCard();
					}
					if(c == 1) {
						c3.printCard();
						System.out.print(" < ");
						c4.printCard();
					}
					if(c == 0) {
						c3.printCard();
						System.out.print(" = ");
						c4.printCard();
					}
					c3 = null;
					c4 = null;
					Runtime.getRuntime().gc();
				break;
			case 6:
				Card c5 = new Card();
				c5.dealCards(card,index);
				c5 = null;
				Runtime.getRuntime().gc();
				break;
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = scan.nextInt();
		}
	}

}
