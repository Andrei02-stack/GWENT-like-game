package tema1.actions;

import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;

public abstract class Actions {
    private String command;
    public Actions() {}
    public Actions(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void exec(Game game, Player playerOne, Player playerTwo, Decks playingPlayer1, Decks playingPlayer2) {}

    @Override
    public String toString() {
        return "command='" + command + '\'';
    }
}
