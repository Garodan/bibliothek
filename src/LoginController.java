

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

    @FXML
    private TextField username;
    private TextField userpw;
    private Button loginButton;
    private TextArea debugLog;


   //private LoginController model;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //model = new LoginController();
        debugLog = new TextArea();
    }

    public void logInButtonPressed() {
        debugLog.setText("Login gedrückt");
    }
}
