package tema1.actions.UseOfCards;

import tema1.actions.Actions;
import tema1.coords.Coordinates;

public class useAttackHero extends Actions {
    private Coordinates cardAttacker;

    public useAttackHero(String command, fileio.Coordinates cardAttacker) {
        super(command);
        this.cardAttacker = new Coordinates(cardAttacker.getX(), cardAttacker.getY());
    }

    public Coordinates getCardAttacker() {
        return cardAttacker;
    }

    public void setCardAttacker(Coordinates cardAttacker) {
        this.cardAttacker = cardAttacker;
    }
}
