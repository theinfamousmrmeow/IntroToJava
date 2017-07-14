/*
COSC2336
L20405356
Alexander Macey
 */

/*
20.2
(Store numbers in a linked list) 
Write a program that lets the user enter numbers from a graphical user interface and displays them in a text area, as shown in Figure 20.17a.
Use a linked list to store the numbers. Do not store duplicate numbers. 
Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and reverse the list.
 */
package cosc2336_ex20_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.*;

public class COSC2336_ex20_2 extends Application {
    
    //Class variables
    TextField textField = new TextField();
    TextArea textArea = new TextArea();
    LinkedList<Integer> list = new LinkedList<>();
    
    @Override
    public void start(Stage primaryStage) {
        
        //Make our three buttons:
        Button btnSort = new Button("Sort");
        Button btnShuffle = new Button("Shuffle");
        Button btnReverse = new Button("Reverse");
        //Hbox with TextField stuff
        javafx.scene.layout.HBox paneTextField = new javafx.scene.layout.HBox(10);
        Label lblTextField = new Label("Enter a number:");
        paneTextField.getChildren().add(lblTextField);
        paneTextField.getChildren().add(textField);
        paneTextField.setAlignment(Pos.CENTER);
        //Hbox for buttons!
        HBox paneButtons = new HBox(3);
        paneButtons.getChildren().addAll(btnSort, btnShuffle, btnReverse);
	paneButtons.setAlignment(Pos.CENTER);
        
        //Vertical alignment for our panes
	BorderPane bPane = new BorderPane();
	bPane.setTop(paneTextField);
	bPane.setCenter(textArea);
	bPane.setBottom(paneButtons);     

        //All the event handlers
	textField.setOnAction(e -> addInteger());
	btnSort.setOnAction(e -> {Collections.sort(list);outputText();});
        btnShuffle.setOnAction(e -> {Collections.shuffle(list);outputText();});
        btnReverse.setOnAction(e -> {Collections.reverse(list);outputText();});        

        StackPane root = new StackPane();
        root.getChildren().add(bPane);
        Scene scene = new Scene(root, 350, 175);
        
        primaryStage.setTitle("Exercise 20.2");
        primaryStage.setScene(scene);
        primaryStage.show();   
    }

    private void addInteger(){
        if (!list.contains(Integer.parseInt(textField.getText()))){
            list.addLast(Integer.parseInt(textField.getText()));
            }
        outputText();
	}
        
    private void outputText() {
        String output = "";
        //For each for life
        for (Integer i: list){
            output += i + " ";
        }
        //Update the output
        textArea.setText(output);
        //Clear the input
        textField.setText("");
	}
        
    public static void main(String[] args) {
        launch(args);
    }
    
}
