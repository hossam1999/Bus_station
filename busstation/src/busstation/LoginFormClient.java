package busstation;

import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;

	public class LoginFormClient {
		Scene scene;
		System Gui;
		Stage stage;
		CheckingSystem Check= new CheckingSystem();	
       ClientScene clientScene;
		
		public LoginFormClient(Stage stage) {
			this.stage=stage;
		}
		
		public void prepareScene() {
			
			Label item1=new Label("Enter your Id");
			TextField Id2= new TextField();
			Label item2=new Label("Enter your Passcode");
			PasswordField Passcode2= new PasswordField();
			Label item4=new Label();
			
			Button bt5=new Button("Sign Out");
	        bt5.setOnAction(m->{
	        	stage.setScene(Gui.getScene());
	        });
	        
			Button Submit= new Button("Submit");
			
			
             Submit.setOnAction(m->{
				
				String x=Id2.getText();
				String y=Passcode2.getText();
				if(Check.ClientCheckPasscode(x, y) == false) {
					item4.setText("your Id or passcode is wrong");
				}
				else {
					Id2.clear();
					Passcode2.clear();
					stage.setScene(clientScene.getScene());	

				}
             });
			
			HBox h4=new HBox();
			h4.getChildren().addAll(item1,Id2);
			h4.setSpacing(100);
			
			HBox h3=new HBox();
			h3.getChildren().addAll(item2, Passcode2);
			h3.setSpacing(100);
			
			
			VBox b2=new VBox();
			b2.getChildren().addAll(h4,h3,Submit,item4,bt5);
			b2.setSpacing(20);
			
			scene = new Scene(b2, 600, 400); 
		}
		
		
		public Scene getScene() {
			return scene;
		}
		
		public void setGui(System Gui) {
			this.Gui = Gui;
		}
		
		public void setClientScene(ClientScene clientScene) {
			this.clientScene = clientScene;
		}
		
	}





