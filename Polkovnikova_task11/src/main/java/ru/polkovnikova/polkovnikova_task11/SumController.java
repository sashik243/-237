package ru.polkovnikova.polkovnikova_task11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Dayweek;

    @FXML
    private TextField KTextField;

    @FXML
    private Button ResultButton;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(KTextField.getText().toString());
        int b = (a)%7;
        if(1<=a&&a<=365)
            switch (b) {
                case 0:
                    Dayweek.setText("День недели: воскресенье");
                    break;
                case 1:
                    Dayweek.setText("День недели:понедельник");
                    break;
                case 2:
                    Dayweek.setText("День недели:вторник");
                    break;
                case 3:
                    Dayweek.setText("День недели:среда");
                    break;
                case 4:
                    Dayweek.setText("День недели:четверг");
                    break;
                case 5:
                    Dayweek.setText("День недели:пятница");
                    break;
                case 6:
                    Dayweek.setText("День недели:суббота");
                    break;
            }else
            Dayweek.setText("введите число попадающее под текущий год");


            }

    }


