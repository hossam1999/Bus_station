//String headers[] = {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Vechile Type","Price"};
package busstation;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
	
public class AddMScene {
//File filename=new File("Trips.txt");
	readingfile u=new readingfile();
	
	
ArrayList<String> trip;
	int i;
	Scene scene;
	System Gui;
	Stage stage;
	//Driver d;
	LoginFormEmployee loginformemployee;
	ManagerScene managerScene;

	private String x;
	
	public AddMScene(Stage stage) {
		this.stage=stage;
	}
	
/*	public boolean sourceV(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			
			if(Character.isDigit(x.charAt(i))){
				count++;
			}
		}
		if(count==0)
		return true;
		else 
			return false;
	}
	
	public boolean DestinationV(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			
			if(Character.isDigit(x.charAt(i))){
				count++;
			}
		}
		if(count==0)
		return true;
		else 
			return false;
	}
	
	public boolean compare(String x, String y) {
		if(x.equals(y))
			return false;
		return true;
        
	}
	
	public boolean tripType(String x) {
		if(x=="S" || x=="s" || x=="D" || x=="d")
			return true;
		return false;
	}
	
	public boolean Seats(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			if(Character.isLetter(x.charAt(i)))
					count++;
		}
	   	if(count==0)
			return true;
		return false;
	}
	
	public boolean NumTrip(String x) {
		int i,count=0;
		if(x.charAt(0)=='B' || x.charAt(0)=='b' || x.charAt(0)=='M' || x.charAt(0)=='m' || x.charAt(0)=='L' || x.charAt(0)=='l'){
			for(i=1;i<x.length();i++) {
				if(Character.isLetter(x.charAt(i)))
						count++;
			}
		}
		if(count==0)
			return true;
		return false;

	}
	
	
	public boolean price(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			if(Character.isLetter(x.charAt(i)))
					count++;
		}
	   	if(count==0)
			return true;
		return false;
	}
	
	public boolean Arrivaltime(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			if(Character.isLetter(x.charAt(i)))
					count++;
		}
	   	if(count==0)
			return true;
		return false;
	}
	
	public boolean Departuretime(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			if(Character.isLetter(x.charAt(i)))
					count++;
		}
	   	if(count==0)
			return true;
		return false;
	}
	
	public boolean VechNum(String x) {
		int i,count=0;
		for(i=0;i<x.length();i++) {
			if(Character.isLetter(x.charAt(i)))
					count++;
		}
	   	if(count==0)
			return true;
		return false;
	}*/
	
	public void prepareScene() {
		 

		Label item1=new Label("Number of trip");
		TextField txt1= new TextField();
		
		Label item2=new Label("Destination");
		TextField txt2= new TextField();
		
		Label item3=new Label("Vechicle Number");
		TextField txt3= new TextField();
		
		Label item4=new Label("Driver Assign");
		TextField txt4= new TextField();
		
		Label item5 =new Label("deprature Time");
		TextField txt5=new TextField();
		
		Label item6= new Label("arrival Time");
		TextField txt6=new TextField();
		
		Label item7 =new Label("Trip type(TYPE S FOR SINGLE TRIP OR D FOR ROUNDTRIP)");
		TextField txt7=new TextField();
		
		Label item8 =new Label("Number of Seats Available");
		TextField txt8=new TextField();
		
		Label item9 =new Label("Source ");
		TextField txt9=new TextField();
		
		Label item10 =new Label("Price");
		TextField txt10=new TextField();
		
		Label item11 =new Label();

		Button bt5=new Button("Back");
        bt5.setOnAction(m->{
        	stage.setScene(managerScene.getScene());
        });
		
		 Button bt3= new Button("Save");
		 bt3.setOnAction(m->{
			 int i,count=0;
			 
			 String a=txt9.getText();
			
				for(i=0;i<a.length();i++) {
					
					if(Character.isDigit(a.charAt(i))){
						count++;
					}
				}
				if(a.isEmpty())
					count=1;
				
				if(count==0) {
					
				
			 String b=txt2.getText();
		
			 for(i=0;i<b.length();i++) {
					
					if(Character.isDigit(b.charAt(i))){
						count++;
					}
					
				}
			 
			  if(a.equals(b))
					count=1;
			  
			  else  if(b.isEmpty() )
					count=1;
			 
			   if(count==0) {
					 
			 String c=txt3.getText();
			 
			 for(i=0;i<c.length();i++) {
					if(Character.isLetter(c.charAt(i)))
							count++;
				}
			  if(c.isEmpty() || Float.parseFloat(c)==0)
					count=1;
			 
			   if(count==0) {
			 
			 
			 String d=txt4.getText();	 
			 String f=txt5.getText();
			 
			 if(f.isEmpty() || Float.parseFloat(f)==0)
					count=1;
			 
			 else if(Float.parseFloat(f)>24)
			    	count=1;
			 else {
			 for(i=0;i<f.length();i++) {
					if(Character.isLetter(f.charAt(i)))
							count++;
				}
			 }
			 
			     if(count==0) {
			 
			 
			 String g=txt6.getText();
			 if(g.isEmpty() || Float.parseFloat(g)==0 )
					count=1;
			 
			 else if(Float.parseFloat(g)>24)
			    	count=1;
			 
			 else if(Float.parseFloat(g)<Float.parseFloat(f))
				 count=1;
			 
			 else { 
			 for(i=0;i<g.length();i++) {
					if(Character.isLetter(g.charAt(i)))
							count++;
				}
			 }
			     
			     if(count==0) {
			 
			 String t=txt7.getText();
			 if(t.isEmpty())
				 count=1;
			 
			 else if(x=="Stops+1" || x=="stops+1" || x=="Direct" || x=="direct"||x=="onestop")
                           count=0;
			 if(count==0) {
				 
				 
			 String k=txt8.getText();
			  if(k.isEmpty() || Float.parseFloat(k)==0)
				 count=1;
			  else if(Integer.parseInt(k)>30)
				  count=1;
			  
			  else {
			 for(i=0;i<k.length();i++) {
					if(Character.isLetter(k.charAt(i)))
							count++;
				}
			  }
			   	if(count==0) {
			 
			 String y=txt1.getText();			
			 
			 if(y.isEmpty())
				 count=1;
			 
			 else if(y.charAt(0)=='B' || y.charAt(0)=='b' || y.charAt(0)=='M' || y.charAt(0)=='m'||y.charAt(0)=='v'||y.charAt(0)=='V'){
					for(i=1;i<y.length();i++) {
						if(Character.isLetter(y.charAt(i)))
								count++;
					}
				}
			 else {
				 count=1;
			 }
			 
				if(count==0) {
			 
			 
			 String z=txt10.getText();
			
			 if(z.isEmpty() || Float.parseFloat(z)==0)
				 count=1;
			 
			 else {
			 for(i=0;i<z.length();i++) {
					if(Character.isLetter(z.charAt(i)))
							count++;
				}
			 }
			   	if(count==0) {
			 
			 u.addtoarray(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(),txt6.getText(),txt7.getText(),txt8.getText(),txt9.getText(),txt10.getText());
			 item11.setText("Saved");
			 }
			   	else {
			   		item11.setText("Enter a Valid Price");
			   	}
				}
				else {
					item11.setText("Enter a Valid Type Number" );
				}
			   	}
			   	else {
			   		item11.setText("Enter a Valid Seats Number");
			   	}
			 }
			 else {
				 item11.setText("Enter a Valid Trip Type");
			 }
			   }
			    else {
			   		item11.setText("Enter a valid time");

			    }
			   	}
			   	else {
			   		item11.setText("Enter a valid time");
			   	}
			   	}
			   	else {
			   		item11.setText("Enter a Valid Vechile Number");
			   	}
				}
				else {
					item11.setText("Enter a Valid Destination");
				}
				}
				else {
					item11.setText("Enter a Valid Source");
				}
			 });
			
		   
		 HBox h1=new HBox();
	 		h1.getChildren().addAll(item1,txt1);
	 		h1.setSpacing(50);
	 		
	 		HBox h2=new HBox();
	 		h2.getChildren().addAll(item2,txt2);
	 		h2.setSpacing(50);
	 		
	 		HBox h3=new HBox();
	 		h3.getChildren().addAll(item3,txt3);
	 		h3.setSpacing(50);
	 		
	 		HBox h4=new HBox();
	 		h4.getChildren().addAll(item4,txt4);
	 		h4.setSpacing(50);
	 		HBox h5=new HBox();
	 		h5.getChildren().addAll(item5,txt5);
	 		h5.setSpacing(50);
	 		HBox h6=new HBox();
	 		h6.getChildren().addAll(item6,txt6);
	 		h6.setSpacing(50);
	 		HBox h7=new HBox();
	 		h7.getChildren().addAll(item7,txt7);
	 		h7.setSpacing(50);
	 		HBox h8=new HBox();
	 		h8.getChildren().addAll(item8,txt8);
	 		h8.setSpacing(50);
	 		HBox h9=new HBox();
	 		h9.getChildren().addAll(item9,txt9);
	 		h9.setSpacing(50);
	 		
	 		HBox h10=new HBox();
	 		h10.getChildren().addAll(item10,txt10);
	 		h10.setSpacing(50);
	 		
	 		
	 		VBox v=new VBox();
	 		v.getChildren().addAll(h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,bt3,item11,bt5);
	 		v.setSpacing(20);
	 		
	 		
	 		scene = new Scene(v, 1600, 1400);
	 	
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
	

