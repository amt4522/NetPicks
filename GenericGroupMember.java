import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GenericGroupMember implements Initializable {
    @FXML
    public Button groupMemberButton;


    public String memberName;

    public GenericGroupMember(){

    }

    public GenericGroupMember(String groupMemberName){
        this.memberName = groupMemberName;
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.groupMemberButton.setText( this.memberName);
    }

    public void setGroupMemberName(String name){
        this.memberName = name;
        this.groupMemberButton.setText( this.memberName);
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
        Parent groupMemberPg = FXMLLoader.load(getClass().getResource("/InviteMembers.fxml"));
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
        Parent groupMemberPg = FXMLLoader.load(getClass().getResource("/JoinParty.fxml"));
        Scene mainScene = new Scene(groupMemberPg);

        // Get stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

}

