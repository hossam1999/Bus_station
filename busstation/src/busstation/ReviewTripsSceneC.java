package busstation;

    import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

	
public class ReviewTripsSceneC {
	
	Scene scene;
	System Gui;
	Stage stage;
	//Driver d;
	LoginFormEmployee loginformemployee;historytickets l= new historytickets();
	ManagerScene managerScene;
	ClientScene clientScene;
	readingfile k = new readingfile();
	ArrayList<String> trip=new ArrayList<String>();
	public ReviewTripsSceneC (Stage stage) {
		this.stage=stage;
	}
	

	@SuppressWarnings("unchecked")
	public void prepareScene() {//ArrayList<String> trip=new ArrayList<String>();
	//----------------------------------------------------------------------------------------------------------------------------------
		k.prepareScene();//String first_name = JOptionPane.showInputDialog("First Name");
		Label item1=new Label("Enter trip number you want to reserve");
		TextField txt1= new TextField();
		
		Label item3=new Label();
		
		 Button bt3= new Button("book");
		 
		 
		 
		 
		 HBox h1=new HBox();
	 		//h1.getChildren().addAll(item1,txt1);
	 		//h1.setSpacing(50);
	 		Button bt4= new Button("price inquiry");
	 		Label item2=new Label("please enter the number of tickets you want");
			TextField txt2= new TextField();
	 		
			bt4.setOnAction(m->{
				 try {
			String x= k.returnprice(txt1.getText());//item3.setText("No trip related to that number");
			if(x.equals(null)) {item3.setText("No trip related to that number");}
			if(!x.equals(null)) { item3.setText("Total price is: "+"  "+Integer.parseInt(x)*Integer.parseInt(txt2.getText()));}

			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				});
			
			 bt3.setOnAction(m->{
			try {
				int x=	 k.booking(txt1.getText(),txt2.getText());
				//l.addtoarray(txt1.getText(),txt1.getText());
				
				
				if(x==0) {item3.setText("No trip related to that number");}
				if(x==1) {item3.setText("saved");l.addtoarray(txt1.getText(),txt2.getText());}
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 
	        	 
				});
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
			//HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1);
	 		h1.setSpacing(50);
	 		HBox h2=new HBox();
	 		h2.getChildren().addAll(item2,txt2,bt4);
	 		h2.setSpacing(50);
	 		
	 		
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,h2,item3,bt3);
	 		v.setSpacing(50);
	 		
	 		
	 		scene = new Scene(v, 600, 400);
			
//---------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		
		
		
		
Scanner sc = null;File file = new File("Trips.txt");
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
			   trip.add(sc.next());
			   
			  }
			  sc.close();
//----------------------------------------------------------------------------------------------------------------------------------------------------		
		/* JTable  table = new JTable();int p=0;
		  DefaultTableModel model = new DefaultTableModel();
		  JScrollPane scroll;
		  String headers[] = {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Vechile Type","Price"};
		  model.setColumnIdentifiers(headers);   
		    table.setModel(model);
		    scroll = new JScrollPane(table);
		    model.addRow(new Object[] {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Vechile Type","Price"});
		    for (int i = 0; i < (trip.size() / 9); i++) {
		        model.addRow(new Object[] { String.valueOf(trip.get(p++)),String.valueOf(trip.get(p++)),String.valueOf(trip.get(p++)),String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))
		        		,String.valueOf(trip.get(p++))});
		      }
		    

		    add(scroll, BorderLayout.CENTER);
		    setSize(1000,1000);
		    StackPane layoutOne = new StackPane();
		    JFrame f= new JFrame("Panel Example");    
	        JPanel panel=new JPanel();  
	        panel.setBounds(40,80,200,200);
	        JButton b1=new JButton("RESERVE");     
	        b1.setBounds(50,100,80,30); 
	      //  text te = new text(); 
	        
	        // addActionListener to button 
	       // b1.addActionListener(te); 
	        JTextField t = new JTextField("ENTER NUMBER OF TRIP YOU WANT TO RESERVE",16); 
	        panel.add(table);panel.add(b1);panel.add(t);
	        f.add(panel);  
           f.setSize(400,400);    
	       // panel.setBackground(Color.BLACK);  
	        //setVisible(true);
		    //String first_name;
		    //first_name = JOptionPane.showInputDialog("First Name");
		   // JTextField tfFName = new JTextField(20);		   
		    this.add(panel);
		    //this.add(tfFName);
			this.setSize(3000,3000);
			this.setVisible(true);
       // ((Group) scene.getRoot()).getChildren().addAll(vbox);
    */    
 }
	
	public Scene getScene() {
		return scene;
	}
	
	public void setGui(System Gui) {
		this.Gui = Gui;
	}
	
	public void setClientscene(	ClientScene clientScene) {
        this.clientScene=clientScene;
        }
 	}
	

