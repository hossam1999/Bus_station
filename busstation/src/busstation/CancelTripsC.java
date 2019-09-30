package busstation;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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

public class CancelTripsC {
	Scene scene;
	System Gui;
	Stage stage;
//	Driver d;
	LoginFormClient loginformClient;
	ClientScene clientScene;
	ReviewTripsSceneC reviewC;
	readingfile k=new readingfile();
	historytickets o=new historytickets();
	
	public CancelTripsC (Stage stage) {
		this.stage=stage;
	}
	
	public void prepareScene() {
		Label item1=new Label("Number of trip you want to cancel");
		TextField txt1= new TextField();
		
		Label item2=new Label("Number of tickets you want to cancel");
		TextField txt2= new TextField();
		
		 Button bt3= new Button("Cancel");
		 bt3.setOnAction(m->{
	        	try {
					k.cancellation(txt1.getText(),txt2.getText());
					o.cancellation(txt1.getText(),txt2.getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	        });
		 
		   HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1);
	 		h1.setSpacing(50);
	 		
	 		HBox h2=new HBox();
	 		h2.getChildren().addAll(item2,txt2);
	 		h2.setSpacing(50);
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,h2,bt3);
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
