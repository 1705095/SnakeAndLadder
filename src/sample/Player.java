package sample;

public class Player {
        int position;
        int color;
        boolean stat;

    public Player(int color) {
        this.position = 0;
        this.color = color;
        this.stat = false;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isStat() {
        return stat;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }
}
