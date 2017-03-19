package week4.practicum2;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene; 
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BoekingenApp extends Application {

	private Hotel hotel = new Hotel("Avondrust"); 
	
	@Override  
	public void start(Stage primaryStage) {  		
		TextField txtField1 = new TextField();
		txtField1.setPrefWidth(200);
		TextField txtField2 = new TextField();
		txtField1.setPrefWidth(200);

		DatePicker datePicker1 = new DatePicker();
		datePicker1.setPrefWidth(200);
		datePicker1.setValue(LocalDate.now());
		DatePicker datePicker2 = new DatePicker();
		datePicker2.setPrefWidth(200);
		datePicker2.setValue(LocalDate.now().plusDays(1));
		
		ComboBox<KamerType> comboBox1 = new ComboBox<KamerType>(); 
		comboBox1.setPrefWidth(200);
		comboBox1.getItems().addAll(hotel.getKamerTypen());
		
		String gegevensPls = "Voer uw gegevens in: ";
		Label label1 = new Label(gegevensPls);
		Label label2 = new Label("");
		Label naamLabel = new Label("Naam: ");
		Label adresLabel = new Label("Adres: ");
		Label aankomstLabel = new Label("Aankomstdatum: ");
		Label vertrekLabel = new Label("Vertrekdatum: ");
		Label kamerLabel = new Label("Kamertype: ");
		
		Button btn = new Button(); 
		btn.setText("Say 'Hello World'");   
		btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hotel.voegBoekingToe(datePicker1.getValue(), datePicker2.getValue(), txtField1.getText(), txtField2.getText(), comboBox1.getValue());
            	System.out.println("Hello World!");
            }
		});  
		
		FlowPane top = new FlowPane();
		top.setVgap(8);
		top.setMinHeight(10);
		top.getChildren().addAll(label1, label2);
		top.setPadding(new Insets(10,10,10,10));
		
		FlowPane left = new FlowPane(Orientation.VERTICAL);
		left.setVgap(16);
		left.setHgap(10);
		left.setPrefWrapLength(100);
		left.setPrefWidth(110);
		left.setPadding(new Insets(0,10,10,10));
		left.getChildren().addAll(naamLabel, adresLabel, aankomstLabel, vertrekLabel, kamerLabel);  
		
		FlowPane right = new FlowPane(Orientation.VERTICAL);
		right.setVgap(8);
		right.setPadding(new Insets(0,10,10,-50));
		right.getChildren().addAll(txtField1, txtField2, datePicker1, datePicker2, comboBox1);
		
		HBox bottom = new HBox();
	    bottom.setSpacing(10);
	    	Button buttonReset = new Button("Reset");
	    	buttonReset.setPrefSize(50, 20);
	    	buttonReset.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent event) {
	                label1.setText(gegevensPls);
	                label2.setText("");
	                txtField1.setText("");
	                txtField2.setText("");
	                datePicker1.setValue(LocalDate.now());
	                datePicker2.setValue(LocalDate.now().plusDays(1));
	                comboBox1.setValue(null);
	            }
			});  
	    	Button buttonBoek = new Button("Boek");
	    	buttonBoek.setPrefSize(50, 20);
	    	buttonBoek.setOnAction(new EventHandler<ActionEvent>() {
	            @Override 
	            public void handle(ActionEvent event) {
	                if (!txtField1.getText().equals("") && 
	                !txtField2.getText().equals("") && 
	                datePicker1.getValue().isBefore(datePicker2.getValue()) && 
	                datePicker1.getValue().isAfter(LocalDate.now().minusDays(1)) &&
	                comboBox1.getValue() != null) {
	                	hotel.voegBoekingToe(datePicker1.getValue(), datePicker2.getValue(), txtField1.getText(), txtField2.getText(), comboBox1.getValue());
	            		label1.setText(gegevensPls);
	            		label2.setText("\tBoeking succesvol!");
	            		label2.setTextFill(Color.web("#088A08"));
		                txtField1.setText("");
		                txtField2.setText("");
		                datePicker1.setValue(LocalDate.now());
		                datePicker2.setValue(LocalDate.now().plusDays(1));
		                comboBox1.setValue(null);
		                System.out.println(hotel);
	                } else {
	                	label2.setText("\tBoeking niet gelukt :(");
	                	label2.setTextFill(Color.web("#DF0101"));
	                }
	            }
			});  
	    bottom.setPadding(new Insets(0,0,10,240));
	    bottom.getChildren().addAll(buttonReset, buttonBoek);
		
		BorderPane border = new BorderPane();
		border.setTop(top);
		border.setLeft(left);
		border.setRight(right);
		border.setBottom(bottom);
		
		Scene scene = new Scene(border, 350, 230); 
		
		primaryStage.setTitle("Tweepersoonsboekingen");
	    primaryStage.setResizable(false);
		primaryStage.setScene(scene); 
		primaryStage.show();  
	}  
	
	public static void main(String[] args) {  
		Application.launch(args);   
	} 
} 