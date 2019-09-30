package busstation;

import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;

	public class LoginForm {
		Scene scene;
		System Gui;
		Stage stage;
		CheckingSystem Check= new CheckingSystem();	
        ManagerScene managerScene;
		
		public LoginForm(Stage stage) {
			this.stage=stage;
		}
		
		public void prepareScene() {
			
			Label item1=new Label("Enter your Id");
			TextField Id= new TextField();
			Label item2=new Label("Enter your Passcode");
			PasswordField Passcode= new PasswordField();
			Label item3=new Label();
			Button Submit= new Button("Submit");
			
			Button bt5=new Button("Sign Out");
	        bt5.setOnAction(m->{
	        	stage.setScene(Gui.getScene());
	        });
			
             Submit.setOnAction(m->{
				
				String x=Id.getText();
				String y=Passcode.getText();
				Check.ManagerCheckPasscode(x, y);
				if(Check.ManagerCheckPasscode(x, y) == false) {
					item3.setText("your Id or passcode is wrong");
				}
				else {
					Id.clear();
					Passcode.clear();
					stage.setScene(managerScene.getScene());	
				}
             });
			
			HBox h=new HBox();
			h.getChildren().addAll(item1,Id);
			h.setSpacing(100);
			
			HBox h2=new HBox();
			h2.getChildren().addAll(item2, Passcode);
			h2.setSpacing(100);
			
			
			VBox b=new VBox();
			b.getChildren().addAll(h,h2,Submit,item3,bt5);
			b.setSpacing(20);
			
			scene = new Scene(b, 600, 400); 
		}
		
		
		public Scene getScene() {
			return scene;
		}
		
		public void setGui(System Gui) {
			this.Gui = Gui;
		}
		
		public void setManagerScene(ManagerScene managerScene) {
			this.managerScene = managerScene;
		}
		
		
	}



