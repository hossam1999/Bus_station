package busstation;
import java.io.IOException;

import busstation.System;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DriverScene {
	Scene scene;
	System Gui;
	Stage stage;
	Driver d;
	LoginFormEmployee loginformemployee;
	readingfile x =new readingfile();
	public DriverScene (Stage stage) {
		this.stage=stage;
	}
	public void getdata(String z) {
		d.ID=z;
		
		}
	

	public void prepareScene(String z) throws IOException {
		
		Label item1=new Label(" Welcome MR. "+"   " +z);
		
		Label item2=new Label("the Trip assigned to you is "+x.search(z));
		
		
		
		HBox h4=new HBox();
		h4.getChildren().addAll(item1,item2);
		h4.setSpacing(100);
		
		
		
		
		
		
		scene = new Scene(h4, 600, 400); 
	}
	
	
	public Scene getScene() {
		return scene;
	}
	public void setGui(System Gui) {
		this.Gui = Gui;
	}
	
	public void setLoginFormEmployee(LoginFormEmployee loginformemployee) {
this.loginformemployee=loginformemployee;}
}
