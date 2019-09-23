package sample;

public class Player {
        int position;
        String color;
        boolean stat;

    public Player(String color) {
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
}
