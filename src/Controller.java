import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    //Variables
    private Stage stage;
    private Scene scene;
    private Parent root;

    //Switches to Log In Screen when Log in button is pressed
    public void logIn(ActionEvent e) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml"));

        //This line gets the stage that is currently being displayed
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }//End of logIn

    public void createAccount(ActionEvent e) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("createAccount.fxml"));

        //This line gets the stage that is currently being displayed
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }//end of createAccount

    public void cancel(ActionEvent e) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("welcomeScreen.fxml"));

        //This line gets the stage that is currently being displayed
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
