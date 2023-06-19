package tema1.cards.Minion.SpecialMinions;

import tema1.cards.Cards;

import java.util.ArrayList;

public class Miraj extends Cards {

    public Miraj() {
    }

    public Miraj(int mana, int attackDamage, int health, String description, ArrayList<String> colors,
                 String name) {
        super(mana, attackDamage , health, description, colors, name);
        setTank(false);
        setFrozen(false);
        setSpecialAbility("Skyjack");
    }
}
