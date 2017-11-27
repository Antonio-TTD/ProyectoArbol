package Árbol;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class ArbolController implements Initializable {
@FXML
Pane pane;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        alert().showAndWait();

    }
public Alert alert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Bienvenido a la aplicacion de árboles\n creada por: \nJosé Antonio Rodríguez Espinosa");
        alert.initStyle(StageStyle.UTILITY);
        return alert;
}
}
