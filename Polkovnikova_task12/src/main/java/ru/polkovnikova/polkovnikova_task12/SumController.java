package ru.polkovnikova.polkovnikova_task12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label NumLabel;

    @FXML
    private Button ResultButton;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(ATextField.getText().toString());
        int B = Integer.parseInt(BTextField.getText().toString());
        int C = Integer.parseInt(CTextField.getText().toString());
        int KolichPoDline = A / C;
        int KolichPoShirine = B / C;
        int Vsego = KolichPoDline * KolichPoShirine;
        int PlosPryam = A * B;
        int Plos = Vsego * (C * C);
        int FreePlos = PlosPryam - Plos;
        NumLabel.setText("Количество квадратов: " + Vsego + "Площадь незанятой части: " + FreePlos);

    }

}
