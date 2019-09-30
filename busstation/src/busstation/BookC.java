package busstation;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
 import javafx.scene.Scene;
 import javafx.stage.Stage;

public class BookC {
	Scene scene;
	System Gui;
	Stage stage;
	//Driver d;
	LoginFormClient loginformClient;
	ClientScene clientScene;
	ReviewTripsSceneC reviewC;
	
	public BookC (Stage stage) {
		this.stage=stage;
	}
	
	public void prepareScene() {
		Label item1=new Label("please enter the number of trip you want to book");
		TextField txt1= new TextField();
		Label item2=new Label("please enter the number of tickets you want");
		TextField txt2= new TextField();
		
		Button bt5=new Button("Back");
        bt5.setOnAction(m->{
        	stage.setScene(clientScene.getScene());
        });
		
		 Button bt3= new Button("Book");Button bt4= new Button("price inquiry");
		 
		   HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1,bt3);
	 		h1.setSpacing(50);
	 		HBox h2=new HBox();
	 		h2.getChildren().addAll(item2,txt2,bt4);
	 		h2.setSpacing(50);
	 		
	 		
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,h2,bt5);
	 		v.setSpacing(50);
	 		
	 		scene=new Scene(v, 600, 400);
	}
	
	public Scene getScene() {
		return scene;
	}
	
	
	public void setGui(System Gui) {
		this.Gui = Gui;
	}
	
	public void setClientscene(	ClientScene clientScene) {
        this.clientScene=clientScene;
        }
}
