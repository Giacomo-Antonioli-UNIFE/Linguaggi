
package goaltest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GoalTest extends Application {
    public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        Goal goal1 = new Goal(100,100);
        Goal goal2 = new Goal(200,200);
        Goal goal3 = new Goal(400,200);
        
        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
