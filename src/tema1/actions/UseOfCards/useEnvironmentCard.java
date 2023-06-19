package tema1.actions.UseOfCards;

import tema1.actions.Actions;

public class useEnvironmentCard extends Actions {
    private int handIdx;
    private int affectedRow;
    public useEnvironmentCard(String command, int handIdx, int affectedRow) {
        super(command);
        this.handIdx = handIdx;
        this.affectedRow = affectedRow;
    }

    public int getHandIdx() {
        return handIdx;
    }

    public void setHandIdx(int handIdx) {
        this.handIdx = handIdx;
    }

    public int getAffectedRow() {
        return affectedRow;
    }

    public void setAffectedRow(int affectedRow) {
        this.affectedRow = affectedRow;
    }
}

