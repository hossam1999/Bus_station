package busstation;

    import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;

	
	
public class AssignScene {
	
	Scene scene;
	System Gui;
	Stage stage;
	//Driver d;
	LoginFormEmployee loginformemployee;
	ManagerScene managerScene;
	
	public AssignScene(Stage stage) {
		this.stage=stage;
	}
	
	public void prepareScene() {
		Label item1=new Label("Trip Number");
		TextField txt1= new TextField();
		
		Label item2=new Label("Driver Number");
		TextField txt2= new TextField();
		 
		 Button bt3= new Button("Save");

		
	    	HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1);
	 		h1.setSpacing(50);
	 		
	 		HBox h2=new HBox();
	 		h2.getChildren().addAll(item2,txt2);
	 		h2.setSpacing(50);
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,h2,bt3);
	 		v.setSpacing(50);
	 		
	 		
	 		scene = new Scene(v, 600, 400);
	 		 		
		
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
