package tema1.players;

import fileio.CardInput;
import fileio.DecksInput;
import tema1.cards.Cards;
import tema1.cards.Erou.EmpressThorina;
import tema1.cards.Erou.GeneralKocioraw;
import tema1.cards.Erou.KingMudface;
import tema1.cards.Erou.LordRoyce;
import tema1.decks.Decks;

import java.util.ArrayList;

public class Player {
    private int nrDecks;
    private Cards erou = null;
    private ArrayList<Decks> decks = new ArrayList<>();
    private int mana;

    private ArrayList<Cards> hand = new ArrayList<>();

    public void setHero(CardInput input) {
        if ("Empress Thorina".equals(input.getName())) {
            erou = new EmpressThorina(input.getMana(), input.getAttackDamage(), input.getDescription(),
                    input.getColors(), input.getName());
        } else if ("General Kocioraw".equals(input.getName())) {
            erou = new GeneralKocioraw(input.getMana(), input.getAttackDamage(), input.getDescription(),
                    input.getColors(), input.getName());
        } else if ("King Mudface".equals(input.getName())) {
            erou = new KingMudface(input.getMana(), input.getAttackDamage(), input.getDescription(),
                    input.getColors(), input.getName());
        } else if ("Lord Royce".equals(input.getName())) {
            erou = new LordRoyce(input.getMana(), input.getAttackDamage(), input.getDescription(),
                    input.getColors(), input.getName());
        }
    }

    public void addInHand(Cards card) {
        hand.add(card);
    }

    public ArrayList<Cards> getHand() {
        return hand;
    }

    public Player(DecksInput input) {
        nrDecks = input.getNrDecks();
        int count = 0;
        for (count = 0; count < nrDecks; count++)
            decks.add(count, new Decks(input.getDecks().get(count)));
    }

    public int getNrDecks() {
        return nrDecks;
    }

    public void setNrDecks(int nrDecks) {
        this.nrDecks = nrDecks;
    }

    public Cards getHero() {
        return erou;
    }

    public void setHero(Cards erou) {
        this.erou = erou;
    }

    public ArrayList<Decks> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Decks> decks) {
        this.decks = decks;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
