package ru.polkovnikova.polkovnikova_task10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField TxtNamber;

    @FXML
    private Button calculaterButton;

    @FXML
    void calculaterButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(TxtNamber.getText().toString());
        if(num<100||num>999) {
        }
            int jghhj = -1;
            int hundreds= num/100;
            int tens = (num% 100)/10;
            int ones = num %10;
            int D = tens*100+hundreds*10+ones;
        ResultLabel.setText("" +D);

        }

    }


