package tema1.actions.Debugging;

import tema1.actions.Actions;
import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;

public class getPlayerMana extends Actions{
    private int playerIdx;
    private int output;

    public getPlayerMana() {}

    public getPlayerMana(String command, int playerIdx) {
        super(command);
        this.playerIdx = playerIdx;
    }

    public int getPlayerIdx() {
        return playerIdx;
    }

    public void setPlayerIdx(int playerIdx) {
        this.playerIdx = playerIdx;
    }

    @Override
    public void exec(Game game, Player playerOne, Player playerTwo, Decks playingPlayer1, Decks playingPlayer2) {
        if(playerIdx == 1)
            output = playerOne.getMana();
        else if(playerIdx == 2)
            output = playerTwo.getMana();
    }

    @Override
    public String toString() {
        return "{command=" + getCommand() +
                ", playerIdx=" + playerIdx +
                ", output=" + output + "}";
    }
}
