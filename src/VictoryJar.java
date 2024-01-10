import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Scene;

import javafx.stage.Stage;
public class VictoryJar extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try{

            Parent root = FXMLLoader.load(getClass().getResource("welcomeScreen.fxml"));

            Scene scene = new Scene(root, Color.ANTIQUEWHITE);

            //TODO: Add a nicer logo that's fit for purpose
            //Add CLM Logo
            Image icon = new Image("CLM Logo.png");
            primaryStage.getIcons().add(icon);

            //Scene Setup
            //TODO: Make it so if full screen is exited, text still looks correct
            primaryStage.setTitle("Victory Jar");
            primaryStage.setFullScreen(false);

            primaryStage.setScene(scene); //Add scene
            primaryStage.show();

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
