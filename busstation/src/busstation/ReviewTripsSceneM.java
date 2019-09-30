package busstation;

import javax.swing.*;
  import javafx.geometry.Insets;
  import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javax.swing.*;

	
public class ReviewTripsSceneM extends JFrame {
	
	Scene scene;
	System Gui;
	Stage stage;
//	Driver d;
	LoginFormEmployee loginformemployee;
	ManagerScene managerScene;
	
	public ReviewTripsSceneM (Stage stage) {
		this.stage=stage;
	}
	
	/*public void prepareScene() {
	   JTable jt;
	  String[] ColumnHeaders = {"Source","Destination","VechileNumber","DriverAssign","DepratureTime","ArrivalTime","TripType","TypeOfVechile","NumberTrip","Price"};
	  String[][] Trial= {{"0","1","2","3","4","5","6","7","8","9"}};
	
	  
 
		jt=new JTable(Trial,ColumnHeaders);
		jt.setBounds(200,200,200,230);
		JScrollPane js=new JScrollPane(jt);
		this.add(js);
		this.setSize(300, 400);
		this.setVisible(true);
		
		
     }*/
	
	
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
	

