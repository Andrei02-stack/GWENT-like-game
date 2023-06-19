package tema1.actions.UseOfCards;

import tema1.actions.Actions;

public class useHeroAbility extends Actions {
    private int affectedRow;
    public useHeroAbility(String command, int affectedRow) {
        super(command);
        this.affectedRow = affectedRow;
    }

    public int getAffectedRow() {
        return affectedRow;
    }

    public void setAffectedRow(int affectedRow) {
        this.affectedRow = affectedRow;
    }
}

