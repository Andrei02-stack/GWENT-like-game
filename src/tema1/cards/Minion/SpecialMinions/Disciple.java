package tema1.cards.Minion.SpecialMinions;

import tema1.cards.Cards;

import java.util.ArrayList;

public class Disciple extends Cards {

    public Disciple() {
    }

    public Disciple(int mana, int health, String description,
                    ArrayList<String> colors, String name) {
        super(mana, 0, health, description, colors, name);
        setTank(false);
        setFrozen(false);
        setSpecialAbility("God's Plan");
    }
}
