package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

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
    private Label message;

    public static String name1;
    public static String name2;
    public static String name3;
    public static String name4;
    public static int number;

    Board board;




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

        number = 2;





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

        number = 3;

    }



    @FXML
    void FourSelected(ActionEvent event) {
        play1.setEditable(true);
        play2.setEditable(true);
        play3.setEditable(true);
        play4.setEditable(true);

        TwoPlayer.setSelected(false);
        ThreePlayer.setSelected(false);

        number = 4;

    }

    int NumofPlayer(){
        if (TwoPlayer.isSelected())
            return 2;
        else if (ThreePlayer.isSelected())
            return 3;
        else
            return 4;
    }

    @FXML
    void StartGame(ActionEvent event) throws IOException {
        if (TwoPlayer.isSelected()){

            if(play1.getText().isEmpty()) {
                name1 = "Player 1";
            }
            else{
                name1 = play1.getText();
            }

            if(play2.getText().isEmpty()) {
                name2 = "Player 2";
            }
            else{
                name2 = play2.getText();
            }


            Parent Tpage= FXMLLoader.load(getClass().getResource("board.fxml"));
            Scene Tscne=new Scene(Tpage);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(Tscne);
            window.show();
        }


        else if (ThreePlayer.isSelected()){

            if(play1.getText().isEmpty()) {
                name1 = "Player 1";
            }
            else{
                name1 = play1.getText();
            }

            if(play2.getText().isEmpty()) {
                name2 = "Player 2";
            }
            else{
                name2 = play2.getText();
            }

            if (play3.getText().isEmpty()){
                name3 = "Player 3";
            }
            else{
                name3 = play3.getText();
            }


            Parent Tpage= FXMLLoader.load(getClass().getResource("board.fxml"));
            Scene Tscne=new Scene(Tpage);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(Tscne);
            window.show();
        }


        else if (FourPlayer.isSelected()){

            if(play1.getText().isEmpty()) {
                name1 = "Player 1";
            }
            else{
                name1 = play1.getText();
            }

            if(play2.getText().isEmpty()) {
                name2 = "Player 2";
            }
            else{
                name2 = play2.getText();
            }

            if (play3.getText().isEmpty()){
                name3 = "Player 3";
            }
            else{
                name3 = play3.getText();
            }

            if(play4.getText().isEmpty()){
                name4 = "Player 4";
            }
            else {
                name4 = play4.getText();
            }


            Parent Tpage= FXMLLoader.load(getClass().getResource("board.fxml"));
            Scene Tscne=new Scene(Tpage);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(Tscne);
            window.show();
        }
        else {
            message.setText("Select Number Of Players");
        }

    }

}
