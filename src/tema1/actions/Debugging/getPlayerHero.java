package tema1.actions.Debugging;

import tema1.actions.Actions;
import tema1.cards.Cards;
import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;
public class getPlayerHero extends Actions {
    private int playerIdx;
    private Cards output;

    public getPlayerHero() {}
    public getPlayerHero(String command, int playerIdx) {
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
            output = playerOne.getHero();
        else if(playerIdx == 2)
            output = playerTwo.getHero();
    }

    @Override
    public String toString() {
        return "{command=" + getCommand() +
                ", playerIdx=" + playerIdx +
                ", output=" + output.toString() + "}";
    }
}
