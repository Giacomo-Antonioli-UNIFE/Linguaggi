
package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {
    private Image dukeImage;
    private ImageView dukeImageView;

    public Goal(double x, double y){
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        dukeImageView = new ImageView(dukeImage);
        
        dukeImageView.setX(x);
        dukeImageView.setY(y);
        
        GoalTest.root.getChildren().addAll(dukeImageView);
        interactions();
    }
    
    private void interactions(){
        //Exercise 4   
        
    }
}
