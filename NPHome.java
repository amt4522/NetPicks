
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NPHome implements Initializable {

    @FXML private Button preferencesBtn;
    @FXML private Button newPartyBtn;
    @FXML private Button joinPartyBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    // When this method is called, it'll change scene to Preferences
    public void preferencesBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent mainPg = FXMLLoader.load(getClass().getResource("/Preferences.fxml"));
        Scene mainScene = new Scene(mainPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

    public void newWatchPartyBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent mainPg = FXMLLoader.load(getClass().getResource("/JoinParty.fxml"));
        Scene mainScene = new Scene(mainPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

    public void joinPartyBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent mainPg = FXMLLoader.load(getClass().getResource("/JoinParty.fxml"));
        Scene mainScene = new Scene(mainPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

    public void helpBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent mainPg = FXMLLoader.load(getClass().getResource("/Help.fxml"));
        Scene mainScene = new Scene(mainPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }


}
