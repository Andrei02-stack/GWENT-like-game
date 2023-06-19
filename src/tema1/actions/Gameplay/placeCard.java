package tema1.actions.Gameplay;

import tema1.actions.Actions;
import tema1.cards.Cards;
import tema1.cards.Minion.BasicMinions.Berserker;
import tema1.cards.Minion.BasicMinions.Goliath;
import tema1.cards.Minion.BasicMinions.Sentinel;
import tema1.cards.Minion.BasicMinions.Warden;
import tema1.cards.Minion.SpecialMinions.Disciple;
import tema1.cards.Minion.SpecialMinions.Miraj;
import tema1.cards.Minion.SpecialMinions.TheCursedOne;
import tema1.cards.Minion.SpecialMinions.TheRipper;
import tema1.decks.Decks;
import tema1.game.Game;
import tema1.players.Player;

public class placeCard extends Actions {
    private int handIdx = 0;
    private String error = null;

    public placeCard() { }

    public placeCard(String command, int handIdx) {
        super(command);
        this.handIdx = handIdx;
    }

    public int getHandIdx() {
        return handIdx;
    }

    public void setHandIdx(int handIdx) {
        this.handIdx = handIdx;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public void exec(Game game, Player playerOne, Player playerTwo, Decks playingPlayer1, Decks playingPlayer2) {
        if (game.getCurrentPlayerIdx() == 1) {
            if(playerOne.getHand().size() > 0){
                System.out.println("404");
            }
            else {
            if (playerOne.getHand().get(0) instanceof Cards) {
                if (playerOne.getMana() >= playerOne.getHand().get(0).getMana()) {
                    if (playerOne.getHand().get(0) instanceof Berserker) {
                        placeCardOn4thRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof Goliath) {
                        placeCardOn4thRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof Sentinel) {
                        placeCardOn4thRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof Warden) {
                        placeCardOn4thRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof Disciple) {
                        placeCardOn3rdRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof Miraj) {
                        placeCardOn3rdRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof TheCursedOne) {
                        placeCardOn3rdRow(game, playerOne);
                    }
                    if (playerOne.getHand().get(0) instanceof TheRipper) {
                        placeCardOn3rdRow(game, playerOne);
                        }
                } else error = "Not enough mana to place card on table.";
            } else error = "Cannot place environment card on table."; }
        } else if (game.getCurrentPlayerIdx() == 2) {
            if (playerTwo.getHand().size() > 0){
                System.out.println("404");
            }
                /////
            else{

            if (playerTwo.getHand().get(0) instanceof Cards) {
                if (playerTwo.getMana() >= playerTwo.getHand().get(0).getMana()) {
                    if (playerTwo.getHand().get(0) instanceof Disciple) {
                        placeCardOn2ndRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof Miraj) {
                        placeCardOn2ndRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof TheCursedOne) {
                        placeCardOn2ndRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof TheRipper) {
                        placeCardOn2ndRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof Berserker) {
                        placeCardOn1stRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof Goliath) {
                        placeCardOn1stRow(game, playerTwo);
                    }
                    if (playerTwo.getHand().get(0) instanceof Sentinel) {
                        placeCardOn1stRow(game, playerTwo);
                        }
                    if (playerTwo.getHand().get(0) instanceof Warden) {
                        placeCardOn1stRow(game, playerTwo);
                        }
                } else error = "Not enough mana to place card on table.";
            } else error = "Cannot place environment card on table.";}
        }
    }

    private void placeCardOn1stRow(Game game, Player playerTwo) {
        if (game.findSpot(game.getTable()[0]) >= 0) {
            game.putCardOnPosition(playerTwo.getHand().get(handIdx), 0, game.findSpot(game.getTable()[3]));
            playerTwo.setMana(playerTwo.getMana() - playerTwo.getHand().get(handIdx).getMana());
            playerTwo.getHand().remove(0);
        } else error = "Cannot place card on table since row is full.";
    }
    private void placeCardOn2ndRow(Game game, Player playerTwo) {
        if (game.findSpot(game.getTable()[1]) >= 0) {
            game.putCardOnPosition(playerTwo.getHand().get(handIdx), 1, game.findSpot(game.getTable()[1]));
            playerTwo.setMana(playerTwo.getMana() - playerTwo.getHand().get(handIdx).getMana());
            playerTwo.getHand().remove(0);
        } else error = "Cannot place card on table since row is full.";
    }

    private void placeCardOn3rdRow(Game game, Player playerOne) {
        if (game.findSpot(game.getTable()[2]) >= 0) {
            game.putCardOnPosition(playerOne.getHand().get(handIdx), 2, game.findSpot(game.getTable()[0]));
            playerOne.setMana(playerOne.getMana() - playerOne.getHand().get(handIdx).getMana());
            playerOne.getHand().remove(0);
        } else error = "Cannot place card on table since row is full.";
    }

    private void placeCardOn4thRow(Game game, Player playerOne) {
        if (game.findSpot(game.getTable()[3]) >= 0) {
            game.putCardOnPosition(playerOne.getHand().get(handIdx), 3, game.findSpot(game.getTable()[3]));
            playerOne.setMana(playerOne.getMana() - playerOne.getHand().get(handIdx).getMana());
            playerOne.getHand().remove(0);
        } else error = "Cannot place card on table since row is full.";
    }

    @Override
    public String toString() {
        return "PlaceCard{" +
                "error='" + error + '\'' +
                '}';
    }
}
