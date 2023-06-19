package tema1.game;

import fileio.ActionsInput;
import tema1.actions.Actions;
import tema1.actions.Debugging.*;
import tema1.actions.Gameplay.endPlayerTurn;
import tema1.actions.Gameplay.placeCard;
import tema1.actions.Statistics.getPlayerOneWins;
import tema1.actions.Statistics.getPlayerTwoWins;
import tema1.actions.Statistics.getTotalGamesPlayed;
import tema1.actions.UseOfCards.*;
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
import tema1.players.Player;

import java.util.ArrayList;

public class Game {
    private StartGame startGame = new StartGame();
    private ArrayList<Actions> actions = new ArrayList<>();

    private int currentPlayerIdx = startGame.getStartingPlayer();

    private Player playerOne;
    private Player playerTwo;

    private Decks playingPlayerOne;
    private Decks playingPlayerTwo;

    private Cards[][] table = new Cards[4][5];
    private int addedMana = 2;

    public Decks getPlayingPlayerOne() {
        return playingPlayerOne;
    }

    public void setPlayingPlayerOne(Decks playingPlayerOne) {
        this.playingPlayerOne = playingPlayerOne;
    }

    public Decks getPlayingPlayerTwo() {
        return playingPlayerTwo;
    }

    public void setPlayingPlayerTwo(Decks playingPlayerTwo) {
        this.playingPlayerTwo = playingPlayerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void commandsList(ArrayList<ActionsInput> commandList) {
        for (ActionsInput actionsInput : commandList)
            if ("getPlayerDeck".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerDeck(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
            } else if ("getPlayerHero".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerHero(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
            } else if ("getPlayerTurn".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerTurn(actionsInput.getCommand()));
            } else if ("endPlayerTurn".equals(actionsInput.getCommand())) {
                actions.add(new endPlayerTurn(actionsInput.getCommand()));
            } else if ("placeCard".equals(actionsInput.getCommand())) {
                actions.add(new placeCard(actionsInput.getCommand(), actionsInput.getHandIdx()));
            } else if ("getCardsInHand".equals(actionsInput.getCommand())) {
                actions.add(new getCardsInHand(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
            } else if ("getPlayerMana".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerMana(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
            } else if ("getCardsOnTable".equals(actionsInput.getCommand())) {
                actions.add(new getCardsOnTable(actionsInput.getCommand()));
            } else if ("getEnvironmentCardsInHand".equals(actionsInput.getCommand())) {
                actions.add(new getEnvironmentCardsInHand(actionsInput.getCommand()));
            } else if ("useEnvironmentCard".equals(actionsInput.getCommand())) {
                actions.add(new useEnvironmentCard(actionsInput.getCommand(), actionsInput.getHandIdx(), actionsInput.getAffectedRow()));
            } else if ("getCardAtPosition".equals(actionsInput.getCommand())) {
                actions.add(new getCardAtPosition(actionsInput.getCommand(), actionsInput.getX(), actionsInput.getY()));
            } else if ("cardUsesAttack".equals(actionsInput.getCommand())) {
                actions.add(new cardUsesAttack(actionsInput.getCommand(), actionsInput.getCardAttacker(), actionsInput.getCardAttacked()));
            } else if ("cardUsesAbility".equals(actionsInput.getCommand())) {
                actions.add(new cardUsesAbility(actionsInput.getCommand(), actionsInput.getCardAttacker(), actionsInput.getCardAttacked()));
            } else if ("useAttackHero".equals(actionsInput.getCommand())) {
                actions.add(new useAttackHero(actionsInput.getCommand(), actionsInput.getCardAttacker()));
            } else if ("useHeroAbility".equals(actionsInput.getCommand())) {
                actions.add(new useHeroAbility(actionsInput.getCommand(), actionsInput.getAffectedRow()));
            } else if ("getFrozenCardsOnTable".equals(actionsInput.getCommand())) {
                actions.add(new getFrozenCardsOnTable(actionsInput.getCommand()));
            } else if ("getPlayerOneWins".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerOneWins(actionsInput.getCommand()));
            } else if ("getPlayerTwoWins".equals(actionsInput.getCommand())) {
                actions.add(new getPlayerTwoWins(actionsInput.getCommand()));
            } else if ("getTotalGamesPlayed".equals(actionsInput.getCommand())) {
                actions.add(new getTotalGamesPlayed(actionsInput.getCommand()));
            }
    }

    public int findSpot(Cards[] row) {
        int spot = -1;
        int i = 0;
        while (i < row.length) {
            if(row[i] == null) {
                spot = i;
                break;
            }
            i++;
        }
        return spot;
    }

    public void putCardOnPosition(Cards card, int x, int y) {
        if(card instanceof Berserker)
            table[x][y] = new Berserker(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof Goliath)
            table[x][y] = new Goliath(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof Sentinel)
            table[x][y] = new Sentinel(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof Warden)
            table[x][y] = new Warden(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof Disciple)
            table[x][y] = new Disciple(card.getMana(), card.getHealth(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof Miraj)
            table[x][y] = new Miraj(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof TheCursedOne)
            table[x][y] = new TheCursedOne(card.getMana(), card.getHealth(), card.getDescription(), card.getColors(), card.getName());
        if(card instanceof TheRipper)
            table[x][y] = new TheRipper(card.getMana(), card.getHealth(), card.getAttackDamage(), card.getDescription(), card.getColors(), card.getName());
        table[x][y] = card;
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public void setCurrentPlayerIdx(int currentPlayerIdx) {
        this.currentPlayerIdx = currentPlayerIdx;
    }


    public StartGame getStartGame() {
        return startGame;
    }

    public void setStartGame(StartGame startGame) {
        this.startGame = startGame;
    }

    public ArrayList<Actions> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Actions> actions) {
        this.actions = actions;
    }

    public Cards[][] getTable() {
        return table;
    }

    public void setTable(Cards[][] table) {
        this.table = table;
    }

    public int getAddedMana() {
        return addedMana;
    }

    public void setAddedMana(int addedMana) {
        this.addedMana = addedMana;
    }
}
