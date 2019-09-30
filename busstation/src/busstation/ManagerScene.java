package busstation;

import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;

	public class ManagerScene {
		Scene scene;
		System Gui;
		Stage stage;
		//Driver d;
		LoginFormEmployee loginformemployee;
		ReviewTripsSceneM review;
		AddMScene Add;
		readingfile read;
		CancelTripsM cancel;
		LoginForm login;
		
		public ManagerScene (Stage stage) {
			this.stage=stage;
		}
		
		

		public void prepareScene() {
			
			Button bt1= new Button("Review Trips");
	         bt1.setOnAction(m->{
				 read.prepareScene();
	         });
	         
			Button bt2= new Button("Add");
	         bt2.setOnAction(m->{
	        	 stage.setScene(Add.getScene());

	         });
	         
			Button bt3= new Button("Cancel Trips");
	         bt3.setOnAction(m->{
	        	 stage.setScene(cancel.getScene());

	         });
	         
			Button bt4= new Button("Assign Driver");
	         bt4.setOnAction(m->{
	         });
	         
	         Button bt5=new Button("Back");
	         bt5.setOnAction(m->{
	         	stage.setScene(login.getScene());
	         });
	         
	        HBox h4=new HBox();
	 		h4.getChildren().addAll(bt1,bt2,bt3,bt4,bt5);
	 		h4.setSpacing(100);
	 		
	 		scene = new Scene(h4, 600, 400); 
	 	}
	        
		public void SetLoginForm(LoginForm login) {
			this.login=login;
		}
		
		public Scene getScene() {
			return scene;
		}
		public void setGui(System Gui) {
			this.Gui = Gui;
		}
		
		//public void setLoginFormEmployee(LoginFormEmployee loginformemployee) {
	      //  this.loginformemployee=loginformemployee;}
     	
	
	  public void setReviewTripsM(ReviewTripsSceneM review) {
	     	this.review = review;
	    }
	  
	  public void setAddMScene(AddMScene Add) {
	     	this.Add = Add;
	    }
	  
	  public void setreadingfilesScene(readingfile read) {
	     	this.read = read;
	    }
	
	  public void setCancelTripsMScene(CancelTripsM cancel) {
	     	this.cancel = cancel;
	    }
	  
	}



