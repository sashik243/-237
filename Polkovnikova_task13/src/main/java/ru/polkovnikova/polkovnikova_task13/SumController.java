package ru.polkovnikova.polkovnikova_task13;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Result;

    @FXML
    private TextField godTextField;

    @FXML
    private Button gooButton;

    @FXML
    void gooButtonOnAction(ActionEvent event) {
        int god = Integer.parseInt(godTextField.getText().toString());
        int stoletie;
        if (god % 100 == 0) {
            stoletie = god / 100;
        }else {
            stoletie = god / 100 + 1;
        }
        Result.setText("Номер столетия:"  + stoletie);

        }
        }




