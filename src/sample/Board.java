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

    private ImageView[] bb;








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

    Image tran = new Image(new FileInputStream("src\\Image\\tran.png"));


    Image redblue = new Image(new FileInputStream("src\\Image\\RedBlue.png"));
    Image redpurple = new Image(new FileInputStream("src\\Image\\RedPurple.png"));
    Image redyellow = new Image(new FileInputStream("src\\Image\\RedYellow.png"));

    Image bluepurple = new Image(new FileInputStream("src\\Image\\BluePurple.png"));
    Image blueyellow = new Image(new FileInputStream("src\\Image\\BlueYellow.png"));

    Image yellowpurple = new Image(new FileInputStream("src\\Image\\YellowPurple.png"));

    Image byp = new Image(new FileInputStream("src\\Image\\BYP.png"));
    Image rbp = new Image(new FileInputStream("src\\Image\\RBP.png"));
    Image rby = new Image(new FileInputStream("src\\Image\\RBY.png"));

    Image all = new Image(new FileInputStream("src\\Image\\Four.png"));

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

    int Down(Player player){
        int x = 0;
        if (player.getPosition() == 17){
            player.setPosition(13);
            x = 13;

        }
        else if (player.getPosition()==52){
            player.setPosition(29);
            x = 29;

        }
        else if (player.getPosition()==57){
            player.setPosition(40);
            x = 40;
        }
        else if (player.getPosition()==62){
            player.setPosition(22);
            x = 22;
        }
        else if (player.getPosition()==88){
            player.setPosition(18);
            x = 18;
        }
        else if (player.getPosition()==95){
            player.setPosition(51);
            x = 51;
        }
        else if (player.getPosition()==97){
            player.setPosition(79);
            x = 79;
        }
        return x;
    }

    int Up(Player player){
        int x = 0;
        if (player.getPosition()==3){
            player.setPosition(21);
            x = 21;
        }
        else if (player.getPosition()==8){
            player.setPosition(30);
            x = 30;
        }
        else if (player.getPosition()==28){
            player.setPosition(84);
            x = 84;
        }
        else if (player.getPosition()==58){
            player.setPosition(77);
            x = 77;
        }
        else if (player.getPosition()==75){
            player.setPosition(86);
            x = 86;
        }
        else if (player.getPosition()==80){
            player.setPosition(100);
            x = 100;
        }
        else if (player.getPosition()==90){
            player.setPosition(91);
            x = 91;
        }
        return x;
    }

    void Overlap(Player player1, Player player2, Player player3, Player player4 )
    {
        if (player1.getPosition()==player2.getPosition()){
            // set image red and blue
            bb[player1.getPosition()].setImage(redblue);
        }
        if (player1.getPosition() == player3.getPosition()){
            // set image red and yellow
            bb[player1.getPosition()].setImage(redyellow);
        }
        if (player1.getPosition() == player4.getPosition()){
            // set image red and purple
            bb[player1.getPosition()].setImage(redpurple);
        }
        if (player2.getPosition()==player3.getPosition()){
            // set image blue and yellow
            bb[player2.getPosition()].setImage(blueyellow);
        }
        if (player2.getPosition() == player4.getPosition()){
            // set image blue and purple
            bb[player2.getPosition()].setImage(bluepurple);
        }
        if (player3.getPosition() == player4.getPosition()){
            // set image yellow and purple
            bb[player3.getPosition()].setImage(yellowpurple);
        }
        if (player1.getPosition() == player2.getPosition() && player1.getPosition() == player3.getPosition()){
            // set image red blue yellow
            bb[player1.getPosition()].setImage(rby);
        }
        if ( player1.getPosition()==player2.getPosition() && player1.getPosition() == player4.getPosition()){
            // set image red, blue, purple
            bb[player1.getPosition()].setImage(rbp);
        }
        if (player2.getPosition() == player3.getPosition() && player2.getPosition() == player4.getPosition()){
            // set image blue, yellow, purple
            bb[player2.getPosition()].setImage(byp);
        }
        if (player1.getPosition() == player2.getPosition() && player2.getPosition() == player3.getPosition() && player3.getPosition() == player4.getPosition()){
            // set all four images
            bb[player1.getPosition()].setImage(all);
        }
    }

    @FXML
    void StartGame(ActionEvent event) {
        bb = new ImageView[101];
        bb[0]=b1;
        bb[1]=b1;
        bb[2]=b2;
        bb[3]=b3;
        bb[4]=b4;
        bb[5]=b5;
        bb[6]=b6;
        bb[7]=b7;
        bb[8]=b8;
        bb[9]=b9;
        bb[10]=b10;
        bb[11]=b11;
        bb[12]=b12;
        bb[13]=b13;
        bb[14]=b14;
        bb[15]=b15;
        bb[16]=b16;
        bb[17]=b17;
        bb[18]=b18;
        bb[19]=b19;
        bb[20]=b20;
        bb[21]=b21;
        bb[22]=b22;
        bb[23]=b23;
        bb[24]=b24;
        bb[25]=b25;
        bb[26]=b26;
        bb[27]=b27;
        bb[28]=b28;
        bb[29]=b29;
        bb[30]=b30;
        bb[31]=b31;
        bb[32]=b32;
        bb[33]=b33;
        bb[34]=b34;
        bb[35]=b35;
        bb[36]=b36;
        bb[37]=b37;
        bb[38]=b38;
        bb[39]=b39;
        bb[40]=b40;
        bb[41]=b41;
        bb[42]=b42;
        bb[43]=b43;
        bb[44]=b44;
        bb[45]=b45;
        bb[46]=b46;
        bb[47]=b47;
        bb[48]=b48;
        bb[49]=b49;
        bb[50]=b50;
        bb[51]=b51;
        bb[52]=b52;
        bb[53]=b53;
        bb[54]=b54;
        bb[55]=b55;
        bb[56]=b56;
        bb[57]=b57;
        bb[58]=b58;
        bb[59]=b59;
        bb[60]=b60;
        bb[61]=b61;
        bb[62]=b62;
        bb[63]=b63;
        bb[64]=b64;
        bb[65]=b65;
        bb[66]=b66;
        bb[67]=b67;
        bb[68]=b68;
        bb[69]=b69;
        bb[70]=b70;
        bb[71]=b71;
        bb[72]=b72;
        bb[73]=b73;
        bb[74]=b74;
        bb[75]=b75;
        bb[76]=b76;
        bb[77]=b77;
        bb[78]=b78;
        bb[79]=b79;
        bb[80]=b80;
        bb[81]=b81;
        bb[82]=b82;
        bb[83]=b83;
        bb[84]=b84;
        bb[85]=b85;
        bb[86]=b86;
        bb[87]=b87;
        bb[88]=b88;
        bb[89]=b89;
        bb[90]=b90;
        bb[91]=b91;
        bb[92]=b92;
        bb[93]=b93;
        bb[94]=b94;
        bb[95]=b95;
        bb[96]=b96;
        bb[97]=b97;
        bb[98]=b98;
        bb[99]=b99;
        bb[100]=b100;
;

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
                bb[p1.getPosition()].setImage(red);
                Overlap(p1,p2,p3,p4);
                player1.setVisible(false);

            }
             else if (p1.getPosition()==100){
                 p1.setStat(true);
                 Overlap(p1,p2,p3,p4);

             }
             else if (p1.getPosition()!=0 && !p1.isStat()) {
                 if (p1.getPosition()+x > 100){
                     // do nothing

                 }
                 else if (p1.getPosition() + x == 100){
                     p1.setStat(true);
                     Overlap(p1,p2,p3,p4);
                 }
                 else{
                     bb[p1.getPosition()].setImage(tran);
                     p1.setPosition(p1.getPosition() + x);
                     bb[p1.getPosition()].setImage(red);
                     Overlap(p1,p2,p3,p4);

                     if (isSnake(p1.getPosition())){
                         int n = Down(p1);
                         bb[n].setImage(red);
                         Overlap(p1,p2,p3,p4);
                     }

                     if (isLadder(p1.getPosition())){
                         int n = Up(p1);
                         bb[n].setImage(red);
                         Overlap(p1,p2,p3,p4);
                     }

                 }

             }

            p2.setTurn(true);
            diceButton.setText(home.name2);

        }
        else if (p2.isTurn()){
            p2.setTurn(false);

            if (p2.getPosition()==0 && x == 1) {
                p2.setPosition(1);
                bb[p2.getPosition()].setImage(blue);
                Overlap(p1,p2,p3,p4);
                player2.setVisible(false);

            }
            else if (p2.getPosition()==100){
                p2.setStat(true);
                Overlap(p1,p2,p3,p4);

            }
            else if (p2.getPosition()!=0 && !p2.isStat()) {
                if (p2.getPosition()+x > 100){
                    // do nothing

                }
                else if (p2.getPosition() + x == 100){
                    p2.setStat(true);
                    Overlap(p1,p2,p3,p4);
                }
                else{
                    bb[p2.getPosition()].setImage(tran);
                    p2.setPosition(p2.getPosition() + x);
                    bb[p2.getPosition()].setImage(blue);
                    Overlap(p1,p2,p3,p4);

                    if (isSnake(p2.getPosition())){
                        int n = Down(p2);
                        bb[n].setImage(blue);
                        Overlap(p1,p2,p3,p4);
                    }

                    if (isLadder(p2.getPosition())){
                        int n = Up(p2);
                        bb[n].setImage(blue);
                        Overlap(p1,p2,p3,p4);
                    }

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

            if (p3.getPosition()==0 && x == 1) {
                p3.setPosition(1);
                bb[p3.getPosition()].setImage(yellow);
                Overlap(p1,p2,p3,p4);
                player3.setVisible(false);

            }
            else if (p3.getPosition()==100){
                p3.setStat(true);
                Overlap(p1,p2,p3,p4);

            }
            else if (p3.getPosition()!=0 && !p3.isStat()) {
                if (p3.getPosition()+x > 100){
                    // do nothing

                }
                else if (p3.getPosition() + x == 100){
                    p3.setStat(true);
                    bb[100].setImage(yellow);
                    Overlap(p1,p2,p3,p4);
                }
                else{
                    bb[p3.getPosition()].setImage(tran);
                    p3.setPosition(p3.getPosition() + x);
                    bb[p3.getPosition()].setImage(yellow);
                    Overlap(p1,p2,p3,p4);

                    if (isSnake(p3.getPosition())){
                        int n = Down(p3);
                        bb[n].setImage(yellow);
                        Overlap(p1,p2,p3,p4);
                    }

                    if (isLadder(p3.getPosition())){
                        int n = Up(p3);
                        bb[n].setImage(yellow);
                        Overlap(p1,p2,p3,p4);
                    }

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

            if (p4.getPosition()==0 && x == 1) {
                p4.setPosition(1);
                bb[p4.getPosition()].setImage(purple);
                Overlap(p1,p2,p3,p4);
                player4.setVisible(false);

            }
            else if (p4.getPosition()==100){
                p4.setStat(true);
                Overlap(p1,p2,p3,p4);

            }
            else if (p4.getPosition()!=0 && !p4.isStat()) {
                if (p4.getPosition()+x > 100){
                    // do nothing

                }
                else if (p4.getPosition() + x == 100){
                    p4.setStat(true);
                    bb[100].setImage(purple);
                    Overlap(p1,p2,p3,p4);
                }
                else{
                    bb[p4.getPosition()].setImage(tran);
                    p4.setPosition(p4.getPosition() + x);
                    bb[p4.getPosition()].setImage(purple);
                    Overlap(p1,p2,p3,p4);

                    if (isSnake(p4.getPosition())){
                        int n = Down(p4);
                        bb[n].setImage(purple);
                        Overlap(p1,p2,p3,p4);
                    }

                    if (isLadder(p4.getPosition())){
                        int n = Up(p4);
                        bb[n].setImage(purple);
                        Overlap(p1,p2,p3,p4);
                    }

                }

            }


            p4.setTurn(false);
            p1.setTurn(true);
            diceButton.setText(home.name1);
        }





    }

}
