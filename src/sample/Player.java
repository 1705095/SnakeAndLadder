package sample;

public class Player {
        int position;
        String color;
        boolean stat;
        boolean turn;

    public Player(String color) {
        this.position = 0;
        this.color = color;
        this.stat = false;
        this.turn = false;
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

    public void setTurn(boolean turn) {this.turn = turn; }

    public boolean isTurn() { return  turn; }
}
