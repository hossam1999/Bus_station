package busstation;

    import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.*;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.stage.Stage;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;

	public class LoginFormEmployee {
		Scene scene;
		System Gui;
		Stage stage;
		CheckingSystem Check= new CheckingSystem();	
		DriverScene driverscene;String searchStr;
		Driver d = new Driver();
		ArrayList<String> drivers=new ArrayList<String>();

		public LoginFormEmployee(Stage stage) {
			this.stage=stage;
		}
		
		public void prepareScene() {
			Scanner sc = null;File file = new File("Drivers.txt");
			  try {
			   sc = new Scanner(file);
			   // Check if there is another line of input
			   while(sc.hasNextLine()){
			    String str = sc.nextLine();
			    parseLine(str);
			    
			   }
			   
			  } catch (IOException  exp) {
			   // TODO Auto-generated catch block
			   exp.printStackTrace();
			  }
			  
			  sc.close();
			 }
		  void parseLine(String str){
			  
			  Scanner sc = new Scanner(str);
			  sc.useDelimiter(" ");

			  // Check if there is another line of input
			  while(sc.hasNext()){
			   drivers.add(sc.next());
			   
			  }
			  sc.close();
			
			
	//--------------------------------------------------------------------------------------------------------------------------------------		
			  
			Label item1=new Label("Enter your Id");
			TextField Id2= new TextField();
			
			Label item2=new Label("Enter your Passcode");
			PasswordField Passcode2= new PasswordField();
			
			Label item4=new Label();
			Button Submit= new Button("Submit");
			
			Button bt5=new Button("Sign Out");
	        bt5.setOnAction(m->{
	        	stage.setScene(Gui.getScene());
	        });
	        
	//---------------------------------------------------------------------------------------------------------------------------------------		
             Submit.setOnAction(m->{
            	 boolean found = false;searchStr=Id2.getText();
   			  java.util.Iterator<String>  iter = drivers.iterator();
   			  String curItem=" ";
   			  int pos=0;
   			   
   			  while ( iter .hasNext() == true )
   			  {
   			      
   			      curItem =(String) iter .next();
   			      if (curItem.equals(searchStr)  ) {
   			      found = true;
   			      break;
   			          }
   			   pos=pos+1;
   			  }
   			   
   			  if ( found == false ) {
   			  pos=0;item4.setText("your Idd or passcode is wrong");
   			  }
   			   
   			  if (found == true)
   			   {String y=drivers.get(pos+1);
   			   if(y.equals(Passcode2.getText())) {
   				   item4.setText(pos+"444");
   			String z=drivers.get(pos);
   				Id2.clear();
				Passcode2.clear();
				try {
					driverscene.prepareScene(z);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.setScene(driverscene.getScene());
				
					
   				   
   				 }
   			   else { item4.setText("your Id or passcode is wrong");item4.setText(drivers.get(pos+1));}
   			   
   			   
   			   
   			   
   			   
   			   }});
				
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
				/*String z=Id2.getText();
				String d=Passcode2.getText();
				if(Check.EmployeeCheckPasscode(z, d) == false) {
					item4.setText("your Id or passcode is wrong");
				}
				else {
					
					Id2.clear();
					Passcode2.clear();
					driverscene.prepareScene(z);
					stage.setScene(driverscene.getScene());
					
				
				
				}
             });*/
			
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
		public void setDriverScene(DriverScene driverscene) {
			this.driverscene = driverscene;
		}
		
		
		public Scene getScene() {
			return scene;
		}
		public void setGui(System Gui) {
			this.Gui = Gui;
		}
	}




