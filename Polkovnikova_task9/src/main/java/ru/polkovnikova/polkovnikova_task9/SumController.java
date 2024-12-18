package ru.polkovnikova.polkovnikova_task9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Buttonresult;

    @FXML
    private Label numberLabel;

    @FXML
    private TextField numberTextField;

    @FXML
    void ButtonresultOnAction(ActionEvent event) {
        int num = Integer.parseInt(numberTextField.getText().toString());
        int number = 0;
        while (num>0){
            int digit = num %10;
            number= number *10+ digit;
            num/=10;
            numberLabel.setText("Введите трехзначное число");
            numberLabel.setText("перевернутое число:"+number);
        }

    }

}
