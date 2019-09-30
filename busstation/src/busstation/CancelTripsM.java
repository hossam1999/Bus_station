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

public class CancelTripsM {
	Scene scene;
	System Gui;
	Stage stage;
//	Driver d;
	LoginFormClient loginformClient;
	ClientScene clientScene;
	ReviewTripsSceneC reviewC;
	ManagerScene managerScene;
	readingfile x=new readingfile();
	
	public CancelTripsM (Stage stage) {
		this.stage=stage;
	}
	
	public void prepareScene() {
		Label item1=new Label("Enter The Number of your trip");
		TextField txt1= new TextField();
		String o=txt1.getText();
		
		
		Button bt5=new Button("Back");
        bt5.setOnAction(m->{
        	stage.setScene(managerScene.getScene());
        });
		
		 Button bt3= new Button("Cancel");
		 bt3.setOnAction(m->{
	        	
					try {
						x.delete(o);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
	        });
		 
		   HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1);
	 		h1.setSpacing(50);
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,bt3,bt5);
	 		v.setSpacing(50);
	 		
	 		scene=new Scene(v, 600, 400);
	}
	
	public Scene getScene() {
		return scene;
	}
	
	
	public void setGui(System Gui) {
		this.Gui = Gui;
	}
	
	public void setManagerscene(ManagerScene managerScene) {
        this.managerScene=managerScene;
        }
}
