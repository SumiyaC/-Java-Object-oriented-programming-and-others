package ClassExercise7_3;
	import java.util.*;

	public class WarGame {
	    private static final int MAX_ROUNDS = 1000000;

	    private DeckOfCards deck;
	    private Player player1;
	    private Player player2;
	    private int numberOfRounds;

	    public WarGame(String name1, String name2) {
	        deck = new DeckOfCards();
	        deck.shuffle();

	        player1 = new Player(name1);
	        player2 = new Player(name2);

	        for (int i = 0; i < DeckOfCards.NUMBER_OF_CARDS; i++) {
	            if (i % 2 == 0) {
	                player1.addCard(deck.dealCard());
	            } else {
	                player2.addCard(deck.dealCard());
	            }
	        }

	        numberOfRounds = 0;
	    }

	    public void play() {
	        while (!gameOver()) {
	            Card card1 = player1.playCard();
	            Card card2 = player2.playCard();

	            int result = card1.compareTo(card2);

	            if (result > 0) {
	                // Player 1 wins the round
	                player1.addCard(card1);
	                player1.addCard(card2);
	                System.out.println(player1.getName() + " wins the round!");
	            } else if (result < 0) {
	                // Player 2 wins the round
	                player2.addCard(card1);
	                player2.addCard(card2);
	                System.out.println(player2.getName() + " wins the round!");
	            } else {
	                // War!
	                handleWar();
	            }

	            numberOfRounds++;
	        }

	        if (player1.getDeckSize() == 0 && player2.getDeckSize() == 0) {
	            System.out.println("The game ended in a tie!");
	        } else if (player1.getDeckSize() > player2.getDeckSize()) {
	            System.out.println(player1.getName() + " wins the game!");
	        } else {
	            System.out.println(player2.getName() + " wins the game!");
	        }
	    }

	    private boolean gameOver() {
	        return player1.getDeckSize() == 0 || player2.getDeckSize() == 0 || numberOfRounds >= MAX_ROUNDS;
	    }

	    private void handleWar() {
	        List<Card> prize = new ArrayList<>();
	        prize.add(player1.playCard());
	        prize.add(player1.playCard());
	        prize.add(player1.playCard());
	        prize.add(player2.playCard());
	        prize.add(player2.playCard());
	        prize.add(player2.playCard());

	        int result = prize.get(prize.size() - 2).compareTo(prize.get(prize.size() - 1));

	        if (result > 0) {
	            // Player 1 wins the war
	            player1.addAllCards(prize);
	            System.out.println(player1.getName() + " wins the war!");
	        } else if (result < 0) {
	            // Player 2 wins the war
	            player2.addAllCards(prize);
	            System.out.println(player2.getName() + " wins the war!");
	        } else {
	            // Another war!
	            handleWar();
	        }
	    }

	    public static void main(String[] args) {
	        WarGame game = new WarGame("Player 1", "Player 2");
	        game.play();
	    }
	}

