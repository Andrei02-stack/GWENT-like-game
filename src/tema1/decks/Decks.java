package tema1.decks;

import fileio.CardInput;
import tema1.cards.Cards;
import tema1.cards.Environment.Firestorm;
import tema1.cards.Environment.HeartHound;
import tema1.cards.Environment.Winterfell;
import tema1.cards.Erou.EmpressThorina;
import tema1.cards.Erou.GeneralKocioraw;
import tema1.cards.Erou.KingMudface;
import tema1.cards.Erou.LordRoyce;
import tema1.cards.Minion.BasicMinions.Berserker;
import tema1.cards.Minion.BasicMinions.Goliath;
import tema1.cards.Minion.BasicMinions.Sentinel;
import tema1.cards.Minion.BasicMinions.Warden;
import tema1.cards.Minion.SpecialMinions.Disciple;
import tema1.cards.Minion.SpecialMinions.Miraj;
import tema1.cards.Minion.SpecialMinions.TheCursedOne;
import tema1.cards.Minion.SpecialMinions.TheRipper;

import java.util.ArrayList;
public class Decks {
    public int nrCardsInDeck;
    ArrayList<Cards> card = new ArrayList<>();
    public Decks(ArrayList<CardInput> deck) {
        nrCardsInDeck = deck.size();
        for(CardInput iter : deck)
            if ("Berserker".equals(iter.getName())) {
                card.add(new Berserker(iter.getMana(), iter.getAttackDamage(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Goliath".equals(iter.getName())) {
                card.add(new Goliath(iter.getMana(), iter.getAttackDamage(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Sentinel".equals(iter.getName())) {
                card.add(new Sentinel(iter.getMana(), iter.getAttackDamage(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Warden".equals(iter.getName())) {
                card.add(new Warden(iter.getMana(), iter.getAttackDamage(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Disciple".equals(iter.getName())) {
                card.add(new Disciple(iter.getMana(), iter.getHealth(), iter.getDescription(),
                        iter.getColors(), iter.getName()));
            } else if ("Miraj".equals(iter.getName())) {
                card.add(new Miraj(iter.getMana(), iter.getAttackDamage(), iter.getHealth(), iter.getDescription(),
                        iter.getColors(), iter.getName()));
            } else if ("The Cursed One".equals(iter.getName())) {
                card.add(new TheCursedOne(iter.getMana(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("The Ripper".equals(iter.getName())) {
                card.add(new TheRipper(iter.getMana(), iter.getAttackDamage(), iter.getHealth(),
                        iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Firestorm".equals(iter.getName())) {
                card.add(new Firestorm(iter.getMana(), iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Heart Hound".equals(iter.getName())) {
                card.add(new HeartHound(iter.getMana(), iter.getDescription(), iter.getColors(), iter.getName()));
            } else if ("Winterfell".equals(iter.getName())) {
                card.add(new Winterfell(iter.getMana(), iter.getDescription(), iter.getColors(), iter.getName()));
            }
    }
    public Decks(Decks deck) {
        nrCardsInDeck = deck.getNrCardsInDeck();
        for(Cards cards : deck.getCards())
            if ("Berserker".equals(cards.getName())) {
                card.add(new Berserker(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Goliath".equals(cards.getName())) {
                card.add(new Goliath(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Sentinel".equals(cards.getName())) {
                card.add(new Sentinel(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Warden".equals(cards.getName())) {
                card.add(new Warden(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                       cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Disciple".equals(cards.getName())) {
                card.add(new Disciple(cards.getMana(), cards.getHealth(), cards.getDescription(),
                        cards.getColors(), cards.getName()));
            } else if ("Miraj".equals(cards.getName())) {
                card.add(new Miraj(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("The Cursed One".equals(cards.getName())) {
                card.add(new TheCursedOne(cards.getMana(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("The Ripper".equals(cards.getName())) {
                card.add(new TheRipper(cards.getMana(), cards.getAttackDamage(), cards.getHealth(),
                        cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Firestorm".equals(cards.getName())) {
                card.add(new Firestorm(cards.getMana(), cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Heart Hound".equals(cards.getName())) {
                card.add(new HeartHound(cards.getMana(), cards.getDescription(), cards.getColors(), cards.getName()));
            } else if ("Winterfell".equals(cards.getName())) {
                card.add(new Winterfell(cards.getMana(), cards.getDescription(), cards.getColors(), cards.getName()));
            }
    }

    public int getNrCardsInDeck() {
        return nrCardsInDeck;
    }

    public void setNrCardsInDeck(int nrCardsInDeck) {
        this.nrCardsInDeck = nrCardsInDeck;
    }

    public ArrayList<Cards> getCards() {
        return card;
    }

    public void setCards(ArrayList<Cards> card) {
        this.card = card;
    }
}
