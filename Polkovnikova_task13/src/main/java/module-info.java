module ru.polkovnikova.polkovnikova_task13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task13 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task13;
}