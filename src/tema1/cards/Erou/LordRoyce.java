package tema1.cards.Erou;

import tema1.cards.Cards;

import java.util.ArrayList;

public class LordRoyce extends Cards {

    public LordRoyce() {
    }

    public LordRoyce(int mana, int attackDamage, String description,
                     ArrayList<String> colors, String name) {
        super(mana, attackDamage, 30, description, colors, name);
        setHeroAbility("Sub-Zero");
    }
}
