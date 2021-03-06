package sample;

public class Player {
        private int position;
        private String color;
        private boolean stat;
        private boolean turn;
        private  boolean inGame;

    public Player(String color) {
        this.position = 0;
        this.color = color;
        this.stat = false;
        this.turn = false;
        this.inGame = true;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStat() {
        return stat;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }

    public void setTurn(boolean turn) { this.turn = turn; }

    public boolean isTurn() { return  turn; }

    public boolean isInGame() {
        return inGame;
    }
}
