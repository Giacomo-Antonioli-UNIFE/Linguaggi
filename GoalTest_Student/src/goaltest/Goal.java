
package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal {

    public Goal(){

        Image Duke, Glove;
        Duke = new Image(getClass().getResource("Images/Duke.png").toString());
        ImageView dukeview= new ImageView(Duke);
        Glove = new Image(getClass().getResource("Images/Glove.png").toString());
        ImageView gloveview= new ImageView(Glove);
        dukeview.setX(50);
        dukeview.setY(50);
        gloveview.setX(57);
        gloveview.setY(31);
        GoalTest.root.getChildren().addAll(dukeview,gloveview);
        interactions();
    }
    
    private void interactions(){
        //Exercise 4   
        
    }
}
