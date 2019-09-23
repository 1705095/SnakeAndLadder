package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Home {

    @FXML
    private AnchorPane bckgnd;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private CheckBox TwoPlayer;

    @FXML
    private CheckBox ThreePlayer;

    @FXML
    private CheckBox FourPlayer;

    @FXML
    private Button gameButton;

    @FXML
    private TextField play1;

    @FXML
    private TextField play2;

    @FXML
    private TextField play3;

    @FXML
    private TextField play4;




    @FXML
    void TwoSelected(ActionEvent event) {
        play1.setEditable(true);
        play2.setEditable(true);

        ThreePlayer.setSelected(false);
        FourPlayer.setSelected(false);

        play3.setEditable(false);
        play3.clear();
        play4.setEditable(false);
        play4.clear();

    }


    @FXML
    void ThreeSelected(ActionEvent event) {
        play1.setEditable(true);
        play2.setEditable(true);
        play3.setEditable(true);

        TwoPlayer.setSelected(false);
        FourPlayer.setSelected(false);

        play4.setEditable(false);
        play4.clear();

    }



    @FXML
    void FourSelected(ActionEvent event) {
        play1.setEditable(true);
        play2.setEditable(true);
        play3.setEditable(true);
        play4.setEditable(true);

        TwoPlayer.setSelected(false);
        ThreePlayer.setSelected(false);

    }

    @FXML
    void StartGame(ActionEvent event) {

    }

}
