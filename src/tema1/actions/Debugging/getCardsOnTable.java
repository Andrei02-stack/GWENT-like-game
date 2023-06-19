package tema1.actions.Debugging;

import tema1.actions.Actions;
import tema1.cards.Cards;
import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;

import java.util.ArrayList;

public class getCardsOnTable extends Actions {
    private ArrayList<Cards> output = new ArrayList<>();

    public getCardsOnTable() {}

    public getCardsOnTable(String command) {
        super(command);
    }

    public void exec(Game game, Player playerOne, Player playerTwo, Decks playingPlayer1, Decks playingPlayer2) {
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 5; j++)
                if(game.getTable()[i][j] != null)
                    output.add(game.getTable()[i][j]);
    }

    @Override
    public String toString() {
        return "command=" + getCommand() +
                "output=" + output;
    }
}
