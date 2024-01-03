import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class VictoryJar extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage welcomeScreen) {

        try{

            Group root = new Group();

            Scene scene = new Scene(root, Color.ANTIQUEWHITE);

            //Add CLM Logo
            Image icon = new Image("CLM Logo.png");
            welcomeScreen.getIcons().add(icon);
            welcomeScreen.setTitle("Victory Jar");
            welcomeScreen.setHeight(500);
            welcomeScreen.setWidth(500);
            welcomeScreen.setFullScreen(true);

            welcomeScreen.setScene(scene);
            welcomeScreen.show();

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
