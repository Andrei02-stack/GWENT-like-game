package tema1.actions.Debugging;

import tema1.actions.Actions;

public class getCardAtPosition extends Actions {
    private int x;
    private int y;

    public getCardAtPosition() {}

    public getCardAtPosition(String command, int x, int y) {
        super(command);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "command{" + getCommand() +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
