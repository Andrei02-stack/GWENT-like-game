package tema1.game;

import fileio.StartGameInput;
import tema1.cards.Cards;
import tema1.cards.Erou.EmpressThorina;
import tema1.cards.Erou.GeneralKocioraw;
import tema1.cards.Erou.KingMudface;
import tema1.cards.Erou.LordRoyce;
import tema1.players.Player;

public class StartGame {
    private int playerOneDeckIdx;
    private int playerTwoDeckIdx;
    private int shuffleSeed;
    private Cards playerOneHero;
    private Cards playerTwoHero;
    private int startingPlayer;
    public StartGame() {
    }
    public StartGame(StartGameInput input, Player playerOne, Player playerTwo) {
        playerOneDeckIdx = input.getPlayerOneDeckIdx();
        playerTwoDeckIdx = input.getPlayerTwoDeckIdx();
        shuffleSeed = input.getShuffleSeed(); //
        if ("Empress Thorina".equals(input.getPlayerOneHero().getName())) {
            playerOne.setHero(new EmpressThorina(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors(), input.getPlayerOneHero().getName()));
        } else if ("General Kocioraw".equals(input.getPlayerOneHero().getName())) {
            playerOne.setHero(new GeneralKocioraw(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors(), input.getPlayerOneHero().getName()));
        } else if ("King Mudface".equals(input.getPlayerOneHero().getName())) {
            playerOne.setHero(new KingMudface(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors(), input.getPlayerOneHero().getName()));
        } else if ("Lord Royce".equals(input.getPlayerOneHero().getName())) {
            playerOne.setHero(new LordRoyce(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors(), input.getPlayerOneHero().getName()));
        }
        if ("Empress Thorina".equals(input.getPlayerTwoHero().getName())) {
            playerTwo.setHero(new EmpressThorina(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerTwoHero().getDescription(), input.getPlayerTwoHero().getColors(), input.getPlayerTwoHero().getName()));
        } else if ("General Kocioraw".equals(input.getPlayerTwoHero().getName())) {
            playerTwo.setHero(new GeneralKocioraw(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerTwoHero().getDescription(), input.getPlayerTwoHero().getColors(), input.getPlayerTwoHero().getName()));
        } else if ("King Mudface".equals(input.getPlayerTwoHero().getName())) {
            playerTwo.setHero(new KingMudface(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerTwoHero().getDescription(), input.getPlayerTwoHero().getColors(), input.getPlayerTwoHero().getName()));
        } else if ("Lord Royce".equals(input.getPlayerTwoHero().getName())) {
            playerTwo.setHero(new LordRoyce(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getAttackDamage(),
                    input.getPlayerTwoHero().getDescription(), input.getPlayerTwoHero().getColors(), input.getPlayerTwoHero().getName()));
        }
        startingPlayer = input.getStartingPlayer();
    }

    public int getPlayerOneDeckIdx() {
        return playerOneDeckIdx;
    }

    public void setPlayerOneDeckIdx(int playerOneDeckIdx) {
        this.playerOneDeckIdx = playerOneDeckIdx;
    }

    public int getPlayerTwoDeckIdx() {
        return playerTwoDeckIdx;
    }

    public void setPlayerTwoDeckIdx(int playerTwoDeckIdx) {
        this.playerTwoDeckIdx = playerTwoDeckIdx;
    }

    public int getShuffleSeed() {
        return shuffleSeed;
    }

    public void setShuffleSeed(int shuffleSeed) {
        this.shuffleSeed = shuffleSeed;
    }

    public Cards getPlayerOneHero() {
        return playerOneHero;
    }

    public void setPlayerOneHero(Cards playerOneHero) {
        this.playerOneHero = playerOneHero;
    }

    public Cards getPlayerTwoHero() {
        return playerTwoHero;
    }

    public void setPlayerTwoHero(Cards playerTwoHero) {
        this.playerTwoHero = playerTwoHero;
    }

    public int getStartingPlayer() {
        return startingPlayer;
    }

    public void setStartingPlayer(int startingPlayer) {
        this.startingPlayer = startingPlayer;
    }
}

