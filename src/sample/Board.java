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

    Image one = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\1.png"));
    Image two = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\2.png"));
    Image three = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\3.png"));
    Image four = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\4.png"));
    Image five = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\5.png"));
    Image six = new Image(new FileInputStream("D:\\Study Materials\\SnakeAndLadder\\src\\Image\\6.png"));

    public Board() throws FileNotFoundException {

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
