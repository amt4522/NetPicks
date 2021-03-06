import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GroupMemberFromJoinParty implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    // When this method is called, it'll change scene to Home
    public void homeBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent mainPg = FXMLLoader.load(getClass().getResource("/NPHome.fxml"));
        Scene mainScene = new Scene(mainPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }


    public void backBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent groupMemberPg = FXMLLoader.load(getClass().getResource("/JoinParty.fxml"));
        Scene mainScene = new Scene(groupMemberPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

    public void addNewMembersBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent groupMemberPg = FXMLLoader.load(getClass().getResource("/InviteMembers.fxml"));
        Scene mainScene = new Scene(groupMemberPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }


    public void findMovieBtnPushed(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent groupMemberPg = FXMLLoader.load(getClass().getResource("/Pick1.fxml"));
        Scene mainScene = new Scene(groupMemberPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

}

