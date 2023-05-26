package exercise1;

import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * 
 * Modified by [Your Name] on [Current Date]
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Ask the user for Card value and suit
        // (assuming the user enters valid inputs)
        int userValue = 1; // Example value, replace with user input
        int userSuit = 0;  // Example suit, replace with user input
        
        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean found = false;
        
        // Search the hand for the user's card
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            printInfo();
        }
    }

    /**
     * A simple method to print out personal information.
     * Replace this information with your own.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is [Your Name]");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- [Your career ambitions]");
        System.out.println();
        
        System.out.println("My hobbies:");
        System.out.println("-- [Your hobbies]");
    }
}
