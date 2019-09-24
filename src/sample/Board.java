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

    Player p1,p2,p3,p4;
    Home home;

    public Board() throws FileNotFoundException {
    }

    @FXML
    void StartGame(ActionEvent event) {
        if (home.number == 2){
            player1.setImage(red);

            player2.setImage(blue);


            namePlayer1.setText(home.name1);
            namePlayer2.setText(home.name2);
        }
        else if (home.number == 3){
            player1.setImage(red);

            player2.setImage(blue);

            player3.setImage(yellow);

            namePlayer1.setText(home.name1);
            namePlayer2.setText(home.name2);
            namePlayer3.setText(home.name3);

        }
        else if (home.number == 4){
            player1.setImage(red);

            player2.setImage(blue);

            player3.setImage(yellow);

            player4.setImage(purple);


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





    }

}
