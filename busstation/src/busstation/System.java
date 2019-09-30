package busstation;

    import javafx.application.Application;
	import javafx.scene.control.*;
	import javafx.stage.Stage;
	import javafx.scene.*;
	import javafx.scene.layout.*;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JFrame;


	public class System  {
		public static Object out;
		Scene scene;
		LoginForm Managerlogin;
		Stage stage;
		LoginFormEmployee Employeelogin;
		LoginFormClient Clientlogin;
		
		
		public System(Stage stage) {
			this.stage=stage;
		}
		
		public void PrepareScene() {
			
			Button bt1= new Button("Manager");
	         bt1.setOnAction(m->{
	        	 stage.setScene(Managerlogin.getScene());
				});
			
			
			Button bt2= new Button("Employee");
			 bt2.setOnAction(m->{
				 stage.setScene(Employeelogin.getScene());
				});
			 
			 Button bt3= new Button("Client");	
			 bt3.setOnAction(m->{
				 stage.setScene(Clientlogin.getScene());
				});
			 
			 VBox V=new VBox();
				V.getChildren().addAll(bt1,bt2,bt3);
				V.setSpacing(50);
		scene = new Scene(V, 600, 400); 		
	}
		
		public Scene getScene() {
			return this.scene;
		}
		
		public void setLogin(LoginForm Managerlogin) {
			this.Managerlogin = Managerlogin;
		}
		
		public void setLoginEmployee(LoginFormEmployee Employeelogin) {
			this.Employeelogin = Employeelogin;
		}
		
		public void setLoginClient(LoginFormClient Clientlogin) {
			this.Clientlogin = Clientlogin;
		}
		
		
		
		
	}



