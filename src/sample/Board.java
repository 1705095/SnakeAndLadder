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
    private ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,
                     b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,
                     b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,
                     b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,
            b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100 ;

    private ImageView[] bb;

    @FXML
    private ImageView y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28,y29,y30,
            y31,y32,y33,y34,y35,y36,y37,y38,y39,y40,y41,y42,y43,y44,y45,y46,y47,y48,y49,y50,y51,y52,y53,y54,y55,y56,y57,y58,y59,y60,
            y61,y62,y63,y64,y65,y66,y67,y68,y69,y70,y71,y72,y73,y74,y75,y76,y77,y78,y79,y80,y81,y82,y83,y84,y85,y86,y87,y88,y89,y90,y91,y92,y93,y94,y95,y96,y97,y98,y99,y100;

    private ImageView[] yy;

    @FXML
    private ImageView r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,
            r31,r32,r33,r34,r35,r36,r37,r38,r39,r40,r41,r42,r43,r44,r45,r46,r47,r48,r49,r50,r51,r52,r53,r54,r55,r56,r57,r58,r59,r60,r61,r62,r63,
            r64,r65,r66,r67,r68,r69,r70,r71,r72,r73,r74,r75,r76,r77,r78,r79,
            r80,r81,r82,r83,r84,r85,r86,r87,r88,r89,r90,r91,r92,r93,r94,r95,r96,r97,r98,r99,r100;

    private  ImageView[] rr;

    @FXML
    private ImageView P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,P23,P24,P25,P26,P27,P28,P29,P30,P31,P32,P33,P34,P35,P36,P37,P38,P39,
            P40,P41,P42,P43,P44,P45,P46,P47,P48,P49,P50,P51,P52,P53,P54,P55,P56,P57,P58,P59,P60,P61,P62,P63,P64,P65,P66,P67,P68,P69,
            P70,P71,P72,P73,P74,P75,P76,P77,P78,P79,P80,P81,P82,P83,P84,P85,P86,P87,P88,P89,P90,P91,P92,P93,P94,P95,P96,P97,P98,P99,P100;

    private ImageView[] pp;








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



    @FXML
    void StartGame(ActionEvent event) {
        bb = new ImageView[101];
        bb[0]=b1;bb[1]=b1;bb[2]=b2;bb[3]=b3;bb[4]=b4;bb[5]=b5;bb[6]=b6;bb[7]=b7;bb[8]=b8;bb[9]=b9;
        bb[10]=b10;bb[11]=b11;bb[12]=b12;bb[13]=b13;bb[14]=b14;bb[15]=b15;bb[16]=b16;bb[17]=b17;bb[18]=b18;bb[19]=b19;bb[20]=b20;
        bb[21]=b21;bb[22]=b22;bb[23]=b23;bb[24]=b24;bb[25]=b25;bb[26]=b26;bb[27]=b27;bb[28]=b28;bb[29]=b29;bb[30]=b30;bb[31]=b31;bb[32]=b32;
        bb[33]=b33;bb[34]=b34;bb[35]=b35;bb[36]=b36;bb[37]=b37;bb[38]=b38;bb[39]=b39;bb[40]=b40;bb[41]=b41;bb[42]=b42;bb[43]=b43;bb[44]=b44;
        bb[45]=b45;bb[46]=b46;bb[47]=b47;bb[48]=b48;bb[49]=b49;bb[50]=b50;bb[51]=b51;bb[52]=b52;bb[53]=b53;bb[54]=b54;bb[55]=b55;bb[56]=b56;
        bb[57]=b57;bb[58]=b58;bb[59]=b59;bb[60]=b60;bb[61]=b61;bb[62]=b62;bb[63]=b63;bb[64]=b64;bb[65]=b65;bb[66]=b66;bb[67]=b67;bb[68]=b68;
        bb[69]=b69;bb[70]=b70;bb[71]=b71;bb[72]=b72;bb[73]=b73;bb[74]=b74;bb[75]=b75;bb[76]=b76;bb[77]=b77;bb[78]=b78;bb[79]=b79;bb[80]=b80;
        bb[81]=b81;bb[82]=b82;bb[83]=b83;bb[84]=b84;bb[85]=b85;bb[86]=b86;bb[87]=b87;bb[88]=b88;bb[89]=b89;
        bb[90]=b90;bb[91]=b91;bb[92]=b92;bb[93]=b93;bb[94]=b94;bb[95]=b95;bb[96]=b96;bb[97]=b97;bb[98]=b98;bb[99]=b99;bb[100]=b100;

        yy = new ImageView[101];
        yy[0] = y1;
        yy[1]=y1;yy[2]=y2;yy[3]=y3;yy[4]=y4;yy[5]=y5;yy[6]=y6;yy[7]=y7;yy[8]=y8;yy[9]=y9;yy[10]=y10;yy[11]=y11;yy[12]=y12;yy[13]=y13;yy[14]=y14;yy[15]=y15;
        yy[16]=y16;yy[17]=y17;yy[18]=y18;yy[19]=y19;yy[20]=y20;yy[21]=y21;yy[22]=y22;yy[23]=y23;yy[24]=y24;yy[25]=y25;yy[26]=y26;yy[27]=y27;yy[28]=y28;yy[29]=y29;
        yy[30]=y30;yy[31]=y31;yy[32]=y32;yy[33]=y33;yy[34]=y34;yy[35]=y35;yy[36]=y36;yy[37]=y37;yy[38]=y38;yy[39]=y39;yy[40]=y40;yy[41]=y41;yy[42]=y42;yy[43]=y43;
        yy[44]=y44;yy[45]=y45;yy[46]=y46;yy[47]=y47;yy[48]=y48;yy[49]=y49;yy[50]=y50;yy[51]=y51;yy[52]=y52;yy[53]=y53;yy[54]=y54;yy[55]=y55;yy[56]=y56;yy[57]=y57;
        yy[58]=y58;yy[59]=y59;yy[60]=y60;yy[61]=y61;yy[62]=y62;yy[63]=y63;yy[64]=y64;yy[65]=y65;yy[66]=y66;yy[67]=y67;yy[68]=y68;yy[69]=y69;yy[70]=y70;yy[71]=y71;
        yy[72]=y72;yy[73]=y73;yy[74]=y74;yy[75]=y75;yy[76]=y76;yy[77]=y77;yy[78]=y78;yy[79]=y79;
        yy[80]=y80;yy[81]=y81;yy[82]=y82;yy[83]=y83;yy[84]=y84;yy[85]=y85;yy[86]=y86;yy[87]=y87;yy[88]=y88;yy[89]=y89;
        yy[90]=y90;yy[91]=y91;yy[92]=y92;yy[93]=y93;yy[94]=y94;yy[95]=y95;yy[96]=y96;yy[97]=y97;yy[98]=y98;yy[99]=y99;yy[100]=y100;

        rr = new ImageView[101];
        rr[0] = r1;
        rr[1]=r1;rr[2]=r2;rr[3]=r3;rr[4]=r4;rr[5]=r5;rr[6]=r6;rr[7]=r7;rr[8]=r8;rr[9]=r9;rr[10]=r10;rr[11]=r11;rr[12]=r12;rr[13]=r13;rr[14]=r14;rr[15]=r15;rr[16]=r16;rr[17]=r17;
        rr[18]=r18;rr[19]=r19;rr[20]=r20;rr[21]=r21;rr[22]=r22;rr[23]=r23;rr[24]=r24;rr[25]=r25;rr[26]=r26;rr[27]=r27;rr[28]=r28;rr[29]=r29;rr[30]=r30;rr[31]=r31;rr[32]=r32;rr[33]=r33;
        rr[34]=r34;rr[35]=r35;rr[36]=r36;rr[37]=r37;rr[38]=r38;rr[39]=r39;rr[40]=r40;rr[41]=r41;rr[42]=r42;rr[43]=r43;rr[44]=r44;rr[45]=r45;rr[46]=r46;rr[47]=r47;rr[48]=r48;rr[49]=r49;rr[50]=r50;
        rr[51]=r51;rr[52]=r52;rr[53]=r53;rr[54]=r54;rr[55]=r55;rr[56]=r56;rr[57]=r57;rr[58]=r58;rr[59]=r59;rr[60]=r60;rr[61]=r61;rr[62]=r62;rr[63]=r63;rr[64]=r64;rr[65]=r65;rr[66]=r66;rr[67]=r67;
        rr[68]=r68;rr[69]=r69;rr[70]=r70;rr[71]=r71;rr[72]=r72;rr[73]=r73;rr[74]=r74;rr[75]=r75;rr[76]=r76;rr[77]=r77;rr[78]=r78;rr[79]=r79;
        rr[80]=r80;rr[81]=r81;rr[82]=r82;rr[83]=r83;rr[84]=r84;rr[85]=r85;rr[86]=r86;rr[87]=r87;rr[88]=r88;rr[89]=r89;rr[90]=r90;rr[91]=r91;
        rr[92]=r92;rr[93]=r93;rr[94]=r94;rr[95]=r95;rr[96]=r96;rr[97]=r97;rr[98]=r98;rr[99]=r99;rr[100]=r100;

        pp = new ImageView[101];
        pp[0] = P1;
        pp[1]=P1;pp[2]=P2;pp[3]=P3;pp[4]=P4;pp[5]=P5;pp[6]=P6;pp[7]=P7;pp[8]=P8;pp[9]=P9;pp[10]=P10;pp[11]=P11;pp[12]=P12;pp[13]=P13;pp[14]=P14;pp[15]=P15;pp[16]=P16;
        pp[17]=P17;pp[18]=P18;pp[19]=P19;pp[20]=P20;pp[21]=P21;pp[22]=P22;pp[23]=P23;pp[24]=P24;pp[25]=P25;pp[26]=P26;pp[27]=P27;
        pp[28]=P28;pp[29]=P29;pp[30]=P30;pp[31]=P31;pp[32]=P32;pp[33]=P33;pp[34]=P34;pp[35]=P35;pp[36]=P36;pp[37]=P37;pp[38]=P38;pp[39]=P39;pp[40]=P40;pp[41]=P41;
        pp[42]=P42;pp[43]=P43;pp[44]=P44;pp[45]=P45;pp[46]=P46;pp[47]=P47;pp[48]=P48;pp[49]=P49;pp[50]=P50;pp[51]=P51;pp[52]=P52;pp[53]=P53;pp[54]=P54;pp[55]=P55;pp[56]=P56;pp[57]=P57;pp[58]=P58;pp[59]=P59;
        pp[60]=P60;pp[61]=P61;pp[62]=P62;pp[63]=P63;pp[64]=P64;pp[65]=P65;pp[66]=P66;pp[67]=P67;pp[68]=P68;pp[69]=P69;pp[70]=P70;
        pp[71]=P71;pp[72]=P72;pp[73]=P73;pp[74]=P74;pp[75]=P75;pp[76]=P76;pp[77]=P77;pp[78]=P78;pp[79]=P79;pp[80]=P80;pp[81]=P81;pp[82]=P82;pp[83]=P83;pp[84]=P84;pp[85]=P85;pp[86]=P86;pp[87]=P87;pp[88]=P88;pp[89]=P89;
        pp[90]=P90;pp[91]=P91;pp[92]=P92;pp[93]=P93;pp[94]=P94;pp[95]=P95;pp[96]=P96;pp[97]=P97;pp[98]=P98;pp[99]=P99;pp[100]=P100;


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
                player1.setVisible(false);

            }
             else if (p1.getPosition()==100){
                 p1.setStat(true);

             }
             else if (p1.getPosition()!=0 && !p1.isStat()) {
                 if (p1.getPosition()+x > 100){
                     // do nothing

                 }
                 else if (p1.getPosition() + x == 100){
                     p1.setStat(true);
                 }
                 else{
                     bb[p1.getPosition()].setImage(tran);
                     p1.setPosition(p1.getPosition() + x);
                     bb[p1.getPosition()].setImage(red);

                     if (isSnake(p1.getPosition())){
                         int n = Down(p1);
                         bb[n].setImage(red);
                     }

                     if (isLadder(p1.getPosition())){
                         int n = Up(p1);
                         bb[n].setImage(red);
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
                player2.setVisible(false);

            }
            else if (p2.getPosition()==100){
                p2.setStat(true);

            }
            else if (p2.getPosition()!=0 && !p2.isStat()) {
                if (p2.getPosition()+x > 100){
                    // do nothing

                }
                else if (p2.getPosition() + x == 100){
                    p2.setStat(true);
                }
                else{
                    bb[p2.getPosition()].setImage(tran);
                    p2.setPosition(p2.getPosition() + x);
                    bb[p2.getPosition()].setImage(blue);

                    if (isSnake(p2.getPosition())){
                        bb[p2.getPosition()].setImage(tran);
                        int n = Down(p2);
                        bb[n].setImage(blue);
                    }

                    if (isLadder(p2.getPosition())){
                        bb[p2.getPosition()].setImage(tran);
                        int n = Up(p2);
                        bb[n].setImage(blue);
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
                yy[p3.getPosition()].setImage(yellow);
                player3.setVisible(false);

            }
            else if (p3.getPosition()==100){
                p3.setStat(true);

            }
            else if (p3.getPosition()!=0 && !p3.isStat()) {
                if (p3.getPosition()+x > 100){
                    // do nothing

                }
                else if (p3.getPosition() + x == 100){
                    p3.setStat(true);
                    yy[100].setImage(yellow);
                }
                else{
                    yy[p3.getPosition()].setImage(tran);
                    p3.setPosition(p3.getPosition() + x);
                    yy[p3.getPosition()].setImage(yellow);


                    if (isSnake(p3.getPosition())){
                        yy[p3.getPosition()].setImage(tran);
                        int n = Down(p3);
                        yy[n].setImage(yellow);
                    }

                    if (isLadder(p3.getPosition())){
                        yy[p3.getPosition()].setImage(tran);
                        int n = Up(p3);
                        yy[n].setImage(yellow);
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
                pp[p4.getPosition()].setImage(purple);
                player4.setVisible(false);

            }
            else if (p4.getPosition()==100){
                p4.setStat(true);

            }
            else if (p4.getPosition()!=0 && !p4.isStat()) {
                if (p4.getPosition()+x > 100){
                    // do nothing

                }
                else if (p4.getPosition() + x == 100){
                    p4.setStat(true);
                    pp[100].setImage(purple);
                }
                else{
                    pp[p4.getPosition()].setImage(tran);
                    p4.setPosition(p4.getPosition() + x);
                    pp[p4.getPosition()].setImage(purple);

                    if (isSnake(p4.getPosition())){
                        pp[p4.getPosition()].setImage(tran);
                        int n = Down(p4);
                        pp[n].setImage(purple);
                    }

                    if (isLadder(p4.getPosition())){
                        pp[p4.getPosition()].setImage(tran);
                        int n = Up(p4);
                        bb[n].setImage(purple);
                    }

                }

            }


            p4.setTurn(false);
            p1.setTurn(true);
            diceButton.setText(home.name1);
        }





    }

}
