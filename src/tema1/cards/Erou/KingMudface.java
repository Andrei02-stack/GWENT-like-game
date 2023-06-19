package tema1.cards.Erou;

import tema1.cards.Cards;

import java.util.ArrayList;

public class KingMudface extends Cards {

    public KingMudface() {
    }

    public KingMudface(int mana, int attackDamage, String description,
                       ArrayList<String> colors, String name) {
        super(mana, attackDamage, 30, description, colors, name);
        setHeroAbility("Earth Born");
    }
}
