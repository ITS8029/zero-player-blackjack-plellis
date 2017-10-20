import java.util.Scanner;


public class ZeroPlayerBlackjack {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the casino!");		
			
		Deck myDeck = new Deck();
		
		int total = 0;
		
		while(total < 17) {
		
		Card myCard = myDeck.drawCard();
		
		int cardValue = myCard.getValue();		
		
		total = cardValue + total;
		
		String cardName = myCard.toString();
			
		System.out.println("You got a " + cardName);
				
		System.out.println("Your total is " + total);
		
		}
		
		//Check whether the player won or lost.
		
		if (total < 21) { 
			System.out.println("You win!"); }
		else if (total == 21) {
			System.out.println("Blackjack!"); }
		else if (total > 21) {
			System.out.println("You lose!");
			
		}

	}}
	

			
	
	
	

