module ru.polkovnikova.polkovnikova_task10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task10 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task10;
}