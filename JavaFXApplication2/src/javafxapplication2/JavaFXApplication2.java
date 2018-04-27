/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author Giacomo
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       /* Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        
         Group mimo= new Group();
       // mimo.getChildren().add(btn);
        Color col=Color.rgb(120,120,120);
        Color col1=Color.rgb(200,200,0);
       
        Scene scene = new Scene(mimo, 300, 250,col);
      
        //primaryStage.setTitle("Hello World!");
        
           Rectangle rect = new Rectangle(20,20,100,200);
           rect.setFill(col1);
           rect.setStroke(Color.BEIGE);
           rect.setX(299);
           rect.setStrokeWidth(2);
           mimo.getChildren().add(rect);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
