package tema1.cards.Erou;

import tema1.cards.Cards;

import java.util.ArrayList;

public class EmpressThorina extends Cards {

    public EmpressThorina() {
    }

    public EmpressThorina(int mana, int attackDamage, String description,
                          ArrayList<String> colors, String name) {
        super(mana, attackDamage, 30, description, colors, name);
        setHeroAbility("Low Blow");
    }
}
