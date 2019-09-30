package busstation;

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

public class ClientScene {
	
	Scene scene;
	System Gui;
	Stage stage;
	//Driver d;
	LoginFormClient loginformClient;
	ClientScene clientScene;
	ReviewTripsSceneC reviewC;
	CancelTripsC cancelC;
	BookC book;
	historytickets k=new historytickets();
	//LimousineScene LimScene;
	
	public ClientScene (Stage stage) {
		this.stage=stage;
	}
	
	public void prepareScene() {
		
		Button bt1= new Button("book trip");
        bt1.setOnAction(m->{reviewC.prepareScene();
        	stage.setScene(reviewC.getScene());
        });
        
        Button bt2= new Button("Cancel Trips");
        bt2.setOnAction(m->{
        	stage.setScene(cancelC.getScene());
        });
        
        
        Button bt3= new Button("review booked trips");
        bt3.setOnAction(m->{
        	k.prepareScene();

        });
        
        Button bt4= new Button("Book Limousine");
        bt4.setOnAction(m->{
        	//stage.setScene(LimScene.getScene());
        	});
        
        Button bt5=new Button("Back");
        bt5.setOnAction(m->{
        	stage.setScene(loginformClient.getScene());
        });
        
        HBox h4=new HBox();
 		h4.getChildren().addAll(bt1,bt2,bt3,bt5);
 		h4.setSpacing(100);
 		
 		scene = new Scene(h4, 600, 400); 
 	
		
	}
	
	public Scene getScene() {
		return scene;
	}
	public void setGui(System Gui) {
		this.Gui = Gui;
	}
	
	public void setLoginFormClient(LoginFormClient loginformClient) {
        this.loginformClient=loginformClient;    
	}
	
	public void setReviewTripsSceneC(ReviewTripsSceneC reviewC) {
		this.reviewC = reviewC;
	}
	
	public void setCancelTripsSceneC(CancelTripsC cancelC) {
		this.cancelC = cancelC;
	}
	
	public void setBookCScene(BookC book) {
		this.book = book;
	}
	
	public void setClientLogin(LoginFormClient loginformClient) {
		this.loginformClient=loginformClient;
	}
	
	
 	}




