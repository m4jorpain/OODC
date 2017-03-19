package week4.les2.opdracht1;

import javafx.application.Application;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;  

public class HelloWorld extends Application {
	
	@Override  
	public void start(Stage primaryStage) {  
		Button btn = new Button(); 
		btn.setText("Say 'Hello World'");   
		btn.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
		});  
		
//		Button btn2 = new Button(); 
//		btn2.setText("Say 'Hello World2'");   
//		btn2.setOnAction();	
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);  
//		root.getChildren().add(btn2);
		
		Scene scene = new Scene(root, 300, 250);  
		
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene); 
		primaryStage.show();  
	}  
	
	public void handle(ActionEvent event) { 
		System.out.println("Hello World!");  
	}  
	
	public static void main(String[] args) {  
		Application.launch(args);   
	} 
} 