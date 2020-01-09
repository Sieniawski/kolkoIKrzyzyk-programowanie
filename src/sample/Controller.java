package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;

    public Pane buttonsPanel;

    public Label msgLabel;

    public Button replayButton;

    public int x_or_o;

    public Controller() {
    }

    public void addAction1() {
        if(btn1.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn1.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn1.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction2() {
        if(btn2.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn2.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn2.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction3() {
        if(btn3.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn3.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn3.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction4() {
        if(btn4.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn4.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn4.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction5() {
        if(btn5.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn5.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn5.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction6() {
        if(btn6.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn6.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn6.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction7() {
        if(btn7.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn7.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn7.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction8() {
        if(btn8.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn8.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn8.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void addAction9() {
        if(btn9.getText().equals("")) {
            if ((x_or_o % 2) == 0) {
                btn9.setText("X");
                msgLabel.setText("O turn");
                getTheWinner();
            } else {
                btn9.setText("O");
                msgLabel.setText("X turn");
                getTheWinner();
            }
            x_or_o++;
        }
    }

    public void winEffect(Button b1, Button b2, Button b3){
//        b1.setBackground(BLACK);
//        b2.setBackground(BLACK);
//        b3.setBackground(BLACK);
//
//        b1.setFont(WHITE);
//        b2.setFont(WHITE);
//        b3.setFont(WHITE);

        String msg = b1.getText() + " Is The Winnder";
        msgLabel.setText(msg);
    }

    public void getTheWinner() {

        //poziomo
        if(!btn1.getText().equals("") && btn1.getText().equals(btn2.getText()) && btn1.getText().equals(btn3.getText())) {
            winEffect(btn1, btn2, btn3);
            System.out.println("WIN");
        }

        if(!btn4.getText().equals("") && btn4.getText().equals(btn5.getText()) && btn4.getText().equals(btn6.getText())) {
            winEffect(btn4, btn5, btn6);
            System.out.println("WIN");
        }

        if(!btn7.getText().equals("") && btn7.getText().equals(btn8.getText()) && btn7.getText().equals(btn9.getText())) {
            winEffect(btn7, btn8, btn9);
            System.out.println("WIN");
        }

        //pionowo
        if(!btn1.getText().equals("") && btn1.getText().equals(btn4.getText()) && btn1.getText().equals(btn7.getText())) {
            winEffect(btn1, btn4, btn7);
            System.out.println("WIN");
        }

        if(!btn2.getText().equals("") && btn2.getText().equals(btn5.getText()) && btn2.getText().equals(btn8.getText())) {
            winEffect(btn2, btn5, btn8);
            System.out.println("WIN");
        }

        if(!btn3.getText().equals("") && btn3.getText().equals(btn6.getText()) && btn3.getText().equals(btn9.getText())) {
            winEffect(btn3, btn6, btn9);
            System.out.println("WIN");
        }

        //skos
        if(!btn1.getText().equals("") && btn1.getText().equals(btn5.getText()) && btn1.getText().equals(btn9.getText())) {
            winEffect(btn1, btn5, btn9);
            System.out.println("WIN");
        }

        if(!btn3.getText().equals("") && btn3.getText().equals(btn5.getText()) && btn3.getText().equals(btn7.getText())) {
            winEffect(btn3, btn5, btn7);
            System.out.println("WIN");
        }

        else if(!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") &&
                !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")){
            msgLabel.setText("Draw");
            System.out.println("Draw");
        }
    }

    public void doNewGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        msgLabel.setText("Play");
    }

}





//    public ActionListener createAction(Button button) {
//
//        //lambda expression -> doczytac
//        ActionListener al = new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(button.getText().equals("")) {
//                    if ((x_or_o % 2) == 0) {
//                        button.setText("X");
//                    } else {
//                        button.setText("O");
//                    }
//                    x_or_o++;
//                }
//            }
//        };
//        return al;
//    }
//
//    //Funkcja, ktora dodaje akcje do buttonow
//    public void addAction() {
//        List<Node> comps = buttonsPanel.getChildren();
////        System.out.println(comps);
//
//        for (Node comp : comps) {
//            if(comp instanceof Button) {
//                createAction((Button) comp);
//                System.out.println("niby dziala");
//            } else {
//                System.out.println("something went wrong dude");
//            }
//        }
//    }



//        for (Node comp : comps) {
//            if (comp instanceof Button) {
//                Button button = (Button) comp;
//                button.addActionListener(createAction(button));
//            }
//        }




















