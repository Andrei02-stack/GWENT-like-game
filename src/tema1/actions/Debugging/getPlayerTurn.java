package tema1.actions.Debugging;

import tema1.actions.Actions;
import tema1.cards.Cards;
import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;

public class getPlayerTurn extends Actions {
    private int playerIdx;
    private int output;

    public getPlayerTurn() {}
    public getPlayerTurn(String command) {
        super(command);
    }

    public int getPlayerIdx() {
        return playerIdx;
    }

    public void setPlayerIdx(int playerIdx) {
        this.playerIdx = playerIdx;
    }

    @Override
    public void exec(Game game, Player playerOne, Player playerTwo, Decks playingPlayer1, Decks playingPlayer2) {
        output = game.getCurrentPlayerIdx();
    }

    @Override
    public String toString() {
        return "{command=" + getCommand() +
                ", playerIdx=" + playerIdx +
                ", output=" + output + "}";
    }
}
