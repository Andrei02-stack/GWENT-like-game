package tema1.cards.Minion.BasicMinions;

import tema1.cards.Cards;

import java.util.ArrayList;

public class Sentinel extends Cards {

    public Sentinel() {
    }

    public Sentinel(int mana, int attackDamage, int health,
                     String description, ArrayList<String> colors, String name) {
        super(mana, attackDamage, health, description, colors, name);
        setTank(false);
        setFrozen(false);
    }
}
