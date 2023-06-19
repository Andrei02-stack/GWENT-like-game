package tema1.cards.Minion.BasicMinions;

import tema1.cards.Cards;

import java.util.ArrayList;

public class Warden extends Cards {

    public Warden() {
    }

    public Warden(int mana, int attackDamage, int health,
                     String description, ArrayList<String> colors, String name) {
        super(mana, attackDamage, health, description, colors, name);
        setTank(true);
        setFrozen(false);
    }
}
