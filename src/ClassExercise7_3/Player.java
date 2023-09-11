package ClassExercise7_3;
import java.util.*;

	public class Player {
	    private String name;
	    private List<Card> deck;

	    public Player(String name) {
	        this.name = name;
	        deck = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public int getDeckSize() {
	        return deck.size();
	    }

	    public void addCard(Card card) {
	        deck.add(card);
	    }

	    public void addAllCards(List<Card> cards) {
	        deck.addAll(cards);
	    }

	    public Card playCard() {
	        return deck.remove(0);
	    }
	}