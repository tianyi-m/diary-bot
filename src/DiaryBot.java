import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.stage.Popup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent; 
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DiaryBot extends Application {

    // declare some informations
    String diary = "";
    String diaryName = "";
    String[] questions = {"What do you want to call today's diary?", "How is your day?", "How are you feeling?", "What is on your mind?"};
    ArrayList<String> answers = new ArrayList<String>();
    int idx = 0;

    public void saveDiary(){

        // create the diary
        for (int i = 0; i < questions.length-1; i++){
            String question = questions[i+1];
            String answer = answers.get(i);
            diary += question + "\n" + answer + "\n\n";
        }

        // save the diary
        String path = "../data/" + diaryName + ".txt";
        try {
            Files.writeString(Paths.get(path), diary);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // re-initialize information variables
        String diary = "";
        String diaryName = "";
        ArrayList<String> answers = new ArrayList<String>();
    }

    // launch the application
    public void start(Stage stage){

        // set title for the stage
        stage.setTitle("Diary Bot");
  
        // create and configure a textfield
        TextField textfield = new TextField();
        textfield.setPrefWidth(500);
        textfield.setMaxWidth(500);
        textfield.setPrefHeight(300);

        // create and configure a Text object 
        Text text = new Text();

        //Setting font to the text 
        text.setFont(new Font(14));         
          
        //Setting the text to be added. 
        text.setText(questions[idx]);

        // create a button
        Button button = new Button("Done"); 

        // create a label
        Label label = new Label("Your diary is finished and saved. Continue if you want to write another one.");
        label.setStyle("-fx-background-color: white;-fx-font-size: 20px;");

        // create and configure a popup window
        Popup popup = new Popup(); 
        popup.getContent().addAll(label);

        // save the diary on click
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (idx == 0){
                    diaryName = textfield.getText();
                } else {
                    answers.add(textfield.getText());
                }
                idx++;
                if (idx == questions.length){
                    idx = 0;
                    saveDiary();
                    popup.show(stage);
                }
                textfield.clear();
                text.setText(questions[idx]);
                stage.show();
            }
        });

        // create and configure a VBox 
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
  
        // add all elements
        root.getChildren().add(text);
        root.getChildren().add(textfield);
        root.getChildren().add(button);

        // create a scene
        Scene scene = new Scene(root, 800, 600);

        scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (popup.isShowing()){
                    popup.hide();
                }
            }
        });
  
        // set the scene
        stage.setScene(scene);
  
        stage.show();
    }
  
    public static void main(String args[]){
        // launch the application
        launch(args);
    }
}