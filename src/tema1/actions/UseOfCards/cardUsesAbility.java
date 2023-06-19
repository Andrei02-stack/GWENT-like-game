package tema1.actions.UseOfCards;

import tema1.coords.Coordinates;
import tema1.actions.Actions;

public class cardUsesAbility extends Actions {
    private Coordinates cardAttacker;
    private Coordinates cardAttacked;
    public cardUsesAbility(String command, fileio.Coordinates cardAttacker, fileio.Coordinates cardAttacked) {
        super(command);
        this.cardAttacker = new Coordinates(cardAttacker.getX(), cardAttacker.getY());
        this.cardAttacked = new Coordinates(cardAttacked.getX(), cardAttacked.getY());
    }

    public Coordinates getCardAttacker() {
        return cardAttacker;
    }

    public void setCardAttacker(Coordinates cardAttacker) {
        this.cardAttacker = cardAttacker;
    }

    public Coordinates getCardAttacked() {
        return cardAttacked;
    }

    public void setCardAttacked(Coordinates cardAttacked) {
        this.cardAttacked = cardAttacked;
    }
}
