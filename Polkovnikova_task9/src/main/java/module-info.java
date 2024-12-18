module ru.polkovnikova.polkovnikova_task9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task9 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task9;
}