package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Board {

    @FXML
    private ImageView boardImage;

    @FXML
    private ImageView diceImage;

    @FXML
    private Button diceButton;

    @FXML
    private Label labelText;

    @FXML
    public ImageView player1;

    @FXML
    public ImageView player2;

    @FXML
    public ImageView player3;

    @FXML
    public ImageView player4;

    @FXML
    private Label namePlayer1;

    @FXML
    private Label namePlayer2;

    @FXML
    private Label namePlayer3;

    @FXML
    private Label namePlayer4;

    @FXML
    private Button startButton;


    @FXML
    private ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;

    @FXML
    private  ImageView b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40;

    @FXML
    private ImageView b41,b42,b43,b44,b45,b46,b47,b48,b49,b50;

    @FXML
    private ImageView b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80;

    @FXML
    private ImageView b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100;







    Image one = new Image(new FileInputStream("src\\Image\\1.png"));
    Image two = new Image(new FileInputStream("src\\Image\\2.png"));
    Image three = new Image(new FileInputStream("src\\Image\\3.png"));
    Image four = new Image(new FileInputStream("src\\Image\\4.png"));
    Image five = new Image(new FileInputStream("src\\Image\\5.png"));
    Image six = new Image(new FileInputStream("src\\Image\\6.png"));

    Image red = new Image(new FileInputStream("src\\Image\\red.png"));
    Image blue = new Image(new FileInputStream("src\\Image\\blue.png"));
    Image purple = new Image(new FileInputStream("src\\Image\\purple.png"));
    Image yellow = new Image(new FileInputStream("src\\Image\\yellow.png"));

    Home home;
    Player p1 = new Player("red");
    Player p2 = new Player("blue");
    Player p3 = new Player("yellow");
    Player p4 = new Player("purple");

    public Board() throws FileNotFoundException {
    }

    String RePos(int n){
        return "b" + String.valueOf(n);
    }

    boolean isSnake(int pos){
        return pos == 17 || pos == 52 || pos == 57 || pos == 62 || pos == 88 || pos == 95 || pos == 97;
    }

    boolean isLadder(int pos){
        return pos==3 || pos == 8 || pos == 28 || pos == 58 || pos == 75 || pos == 80 || pos == 90;
    }

    void Down(Player player){
        // have to add picture implementation
        if (player.getPosition() == 17){
            player.setPosition(13);

        }
        else if (player.getPosition()==52){
            player.setPosition(29);

        }
        else if (player.getPosition()==57){
            player.setPosition(40);
        }
        else if (player.getPosition()==62){
            player.setPosition(22);
        }
        else if (player.getPosition()==88){
            player.setPosition(18);
        }
        else if (player.getPosition()==95){
            player.setPosition(51);
        }
        else if (player.getPosition()==97){
            player.setPosition(79);
        }
    }

    void Up(Player player){
        // have to add picture implementation
        if (player.getPosition()==3){
            player.setPosition(21);
        }
        else if (player.getPosition()==8){
            player.setPosition(30);
        }
        else if (player.getPosition()==28){
            player.setPosition(84);
        }
        else if (player.getPosition()==58){
            player.setPosition(77);
        }
        else if (player.getPosition()==75){
            player.setPosition(86);
        }
        else if (player.getPosition()==80){
            player.setPosition(100);
        }
        else if (player.getPosition()==90){
            player.setPosition(91);
        }
    }

    @FXML
    void StartGame(ActionEvent event) {
        if (home.number == 2){
            player1.setImage(red);
            p1.setPosition(0);
            p1.setTurn(true);
            p1.setStat(false);

            player2.setImage(blue);
            p2.setPosition(0);
            p2.setStat(false);
            p2.setTurn(false);


            namePlayer1.setText(home.name1);
            namePlayer2.setText(home.name2);
        }
        else if (home.number == 3){
            player1.setImage(red);
            p1.setPosition(0);
            p1.setTurn(true);
            p1.setStat(false);

            player2.setImage(blue);
            p2.setPosition(0);
            p2.setTurn(false);
            p2.setStat(false);

            player3.setImage(yellow);
            p3.setPosition(0);
            p3.setTurn(false);
            p3.setStat(false);

            namePlayer1.setText(home.name1);
            namePlayer2.setText(home.name2);
            namePlayer3.setText(home.name3);

        }
        else if (home.number == 4){
            player1.setImage(red);
            p1.setPosition(0);
            p1.setTurn(true);
            p1.setStat(false);

            player2.setImage(blue);
            p2.setPosition(0);
            p2.setTurn(false);
            p2.setStat(false);

            player3.setImage(yellow);
            p3.setPosition(0);
            p3.setTurn(false);
            p3.setStat(false);

            player4.setImage(purple);
            p4.setPosition(0);
            p4.setTurn(false);
            p4.setStat(false);


            namePlayer1.setText(home.name1);
            namePlayer2.setText(home.name2);
            namePlayer3.setText(home.name3);
            namePlayer4.setText(home.name4);

        }
        boardImage.setOpacity(100);
        labelText.setOpacity(100);
        diceButton.setVisible(true);
        startButton.setVisible(false);
        startButton.setCancelButton(true);

        diceButton.setText(home.name1);


    }




    @FXML
    void RollDice(ActionEvent event) {
        int max = 6;
        int min = 1;
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        //System.out.println(x);

        if (x==1){
            diceImage.setImage(one);
        }
        else if (x==2){
            diceImage.setImage(two);
        }
        else if (x==3){
            diceImage.setImage(three);
        }
        else if (x==4){
            diceImage.setImage(four);
        }
        else if (x==5){
            diceImage.setImage(five);
        }
        else if (x==6){
            diceImage.setImage(six);
        }

        if (p1.isTurn()){
             p1.setTurn(false);


            if (p1.getPosition()==0 && x == 1) {
                p1.setPosition(1);
                String pos = RePos(p1.getPosition());
                System.out.println(pos);
                b1.setImage(red);
                player1.setVisible(false);

            }
            else if (p1.getPosition()!=0 && !p1.isStat()){
                p1.setPosition(p1.getPosition()+x);
                // set image
                if (p1.getPosition()==100){
                        namePlayer1.setText("WINNER");
                        p1.setStat(true);
                }
                if (isSnake(p1.getPosition())){
                    Down(p1);
                    // To do: set image here
                }
                else if (isLadder(p1.getPosition())){
                    Up(p1);

                    // set image here
                }

            }

            p2.setTurn(true);
            diceButton.setText(home.name2);

        }
        else if (p2.isTurn()){
            p2.setTurn(false);

            // necessary codes

            if (p2.getPosition()==0 && x == 1) {
                p2.setPosition(1);
                String pos = RePos(p2.getPosition());
                System.out.println(pos);
                b1.setImage(blue);
                player2.setVisible(false);

            }
            else if (p2.getPosition()!=0 && !p2.isStat()){
                p2.setPosition(p2.getPosition()+x);
                // set image
                if (p2.getPosition()==100){
                    namePlayer2.setText("WINNER");
                    p2.setStat(true);
                }
                if (isSnake(p2.getPosition())){
                    Down(p2);
                    // To do: set image here
                }
                else if (isLadder(p2.getPosition())){
                    Up(p2);

                    // set image here
                }

            }

            if (home.number==2){
                p1.setTurn(true);
                diceButton.setText(home.name1);
            }
            else{
                p3.setTurn(true);
                diceButton.setText(home.name3);
            }
        }



        else if(p3.isTurn()){
            p3.setTurn(false);

            // necessary codes


            if (p3.getPosition()==0 && x == 1) {
                p3.setPosition(1);
                String pos = RePos(p3.getPosition());
                System.out.println(pos);
                b1.setImage(yellow);
                player3.setVisible(false);

            }
            else if (p3.getPosition()!=0 && !p3.isStat()){
                p3.setPosition(p3.getPosition()+x);
                // set image
                if (p3.getPosition()==100){
                    namePlayer3.setText("WINNER");
                    p3.setStat(true);
                }
                if (isSnake(p3.getPosition())){
                    Down(p3);
                    // To do: set image here
                }
                else if (isLadder(p3.getPosition())){
                    Up(p3);

                    // set image here
                }

            }

            if (home.number == 3){
                p1.setTurn(true);
                diceButton.setText(home.name1);
            }
            else{
                p4.setTurn(true);
                diceButton.setText(home.name4);
            }
        }
        else if (p4.isTurn()){

            // necessary codes


            if (p4.getPosition()==0 && x == 1) {
                p4.setPosition(1);
                String pos = RePos(p4.getPosition());
                System.out.println(pos);
                b1.setImage(purple);
                player4.setVisible(false);

            }
            else if (p4.getPosition()!=0 && !p4.isStat()){
                p4.setPosition(p4.getPosition()+x);
                // set image
                if (p4.getPosition()==100){
                    namePlayer4.setText("WINNER");
                    p4.setStat(true);
                }
                if (isSnake(p4.getPosition())){
                    Down(p4);
                    // To do: set image here
                }
                else if (isLadder(p4.getPosition())){
                    Up(p4);

                    // set image here
                }

            }

            p4.setTurn(false);
            p1.setTurn(true);
            diceButton.setText(home.name1);
        }





    }

}
