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
    public void start(Stage welcomeScreen) {

        try{

            Parent root = FXMLLoader.load(getClass().getResource("welcomeScreen.fxml"));

            Scene scene = new Scene(root, Color.ANTIQUEWHITE);

            //TODO: Add a nicer logo that's fit for purpose
            //Add CLM Logo
            Image icon = new Image("CLM Logo.png");
            welcomeScreen.getIcons().add(icon);

            //Scene Setup
            //TODO: Make it so if full screen is exited, text still looks correct
            welcomeScreen.setTitle("Victory Jar");
            //welcomeScreen.setHeight(500);
            //welcomeScreen.setWidth(500);
            welcomeScreen.setFullScreen(true);

            //Text on Welcome Screen
            Text welcomeText = new Text();
            welcomeText.setText("Welcome to the Victory Jar Application!");
            welcomeText.setX(125);
            welcomeText.setY(100);
            welcomeText.setFont(Font.font("SourceSans", 50));
            welcomeText.setFill(Color.GREY);

            //root.getChildren().add(welcomeText); //Add text
            welcomeScreen.setScene(scene); //Add scene
            welcomeScreen.show();

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
