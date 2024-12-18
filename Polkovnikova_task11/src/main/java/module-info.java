module ru.polkovnikova.polkovnikova_task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task11 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task11;
}