import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;

public class DiaryBot extends Application {
  
    // launch the application
    public void start(Stage stage){
        // set title for the stage
        stage.setTitle("Diary Bot");
  
        // create a textfield
        TextField b = new TextField();

        //Creating a Text object 
        Text text = new Text(); 
       
        //Setting font to the text 
        text.setFont(new Font(45)); 
           
        //setting the position of the text 
        text.setX(50); 
        text.setY(50);          
          
        //Setting the text to be added. 
        text.setText("How is your day?"); 
             
        //Creating a Group object  
        Group root = new Group(); 
  
        // add textfield
        root.getChildren().add(b);
  
        // create a scene
        Scene scene = new Scene(root, 800, 600);
  
        // set the scene
        stage.setScene(scene);
  
        stage.show();
    }
  
    public static void main(String args[]){
        // launch the application
        launch(args);
    }
}