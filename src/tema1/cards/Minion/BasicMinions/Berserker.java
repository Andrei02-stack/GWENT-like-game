package tema1.cards.Minion.BasicMinions;

import tema1.cards.Cards;

import java.util.ArrayList;

public class Berserker extends Cards {

    public Berserker() {
    }

    public Berserker(int mana, int attackDamage, int health,
                     String description, ArrayList<String> colors, String name) {
        super(mana, attackDamage, health, description, colors, name);
        setTank(false);
        setFrozen(false);
    }
}
