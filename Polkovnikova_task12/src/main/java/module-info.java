module ru.polkovnikova.polkovnikova_task12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task12 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task12;
}