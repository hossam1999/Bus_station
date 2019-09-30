package busstation;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		
		readingfile x=new readingfile();
		System Gui =new System(primaryStage);
		LoginForm login =new LoginForm(primaryStage);
		LoginFormEmployee Employeelogin =new LoginFormEmployee(primaryStage);
		LoginFormClient Clientlogin =new LoginFormClient(primaryStage);
		DriverScene driverscene= new DriverScene(primaryStage);
		ManagerScene managerScene = new ManagerScene(primaryStage);
		ClientScene clientScene= new ClientScene(primaryStage);
		ReviewTripsSceneM review= new ReviewTripsSceneM(primaryStage) ;
		AddMScene add=new AddMScene(primaryStage);
		AssignScene Assign= new AssignScene(primaryStage);
		ReviewTripsSceneC reviewC=new ReviewTripsSceneC(primaryStage);
		CancelTripsC cancelC=new CancelTripsC(primaryStage);
		BookC book=new BookC(primaryStage);
		readingfile read=new readingfile();
		CancelTripsM cancelM=new CancelTripsM(primaryStage);
		
	//	LimousineScene LimScene=new LimousineScene(primaryStage);
		
		Gui.setLogin(login);
		login.setGui(Gui);
		
		Gui.setLoginEmployee(Employeelogin);
		Employeelogin.setGui(Gui);
		
		Gui.setLoginClient(Clientlogin);
		Clientlogin.setGui(Gui);
		
		login.setManagerScene(managerScene);
		managerScene.SetLoginForm(login);
		
		Clientlogin.setClientScene(clientScene);
		clientScene.setClientLogin(Clientlogin);
		
		managerScene.setReviewTripsM(review);
		managerScene.setreadingfilesScene(read);
		
		managerScene.setAddMScene(add);
		add.setManagerscene(managerScene);
		
		clientScene.setReviewTripsSceneC(reviewC);
		
		clientScene.setCancelTripsSceneC(cancelC);
		cancelC.setClientscene(clientScene);
		
        clientScene.setBookCScene(book);
        book.setClientscene(clientScene);
        
      //  clientScene.setLimousineScene(LimScene);
        managerScene.setCancelTripsMScene(cancelM);
        cancelM.setManagerscene(managerScene);
		
	//	managerScene.setAssignScene(Assign);
		
		
		primaryStage.setTitle("Welcome To Booking Application");
             
		     Gui.PrepareScene();
             login.prepareScene();
             Employeelogin.prepareScene();
            driverscene.prepareScene(toString());
             Clientlogin.prepareScene();
             managerScene.prepareScene();
             clientScene.prepareScene();
           //review.prepareScene();
             add.prepareScene();
             Assign.prepareScene();
             //reviewC.prepareScene();
             cancelC.prepareScene();
             book.prepareScene();
             cancelM.prepareScene();
           //  LimScene.prepareScene();
             
             Employeelogin.setDriverScene(driverscene);
              
           
			primaryStage.setScene(Gui.getScene());
			primaryStage.show();
		
	}
	
	}



