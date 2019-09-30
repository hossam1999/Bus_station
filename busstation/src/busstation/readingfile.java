package busstation;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.io.BufferedReader;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.prism.paint.Color;

import javafx.scene.layout.StackPane;

public class readingfile extends JFrame {
	ArrayList<String> trip=new ArrayList<String>();
	ArrayList<String> limo=new ArrayList<String>();
//----------------------------------------------------------------------------------------------------------------------------------
	public readingfile() {
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
		 }
	//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	  public void prepareScene() {
		   JTable jt;int j=0;String[][] Trial;
		  String[] ColumnHeaders = {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Vechile Type","Price"};
		  //for(j = 0;i<trip.size()/9;j++) {
		  //Trial[j][]= {{trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++),trip.get(i++)}};
		  
		  //}
	 
			//jt=new JTable(Trial,ColumnHeaders);
			//jt.setBounds(200,200,200,230);
			//JScrollPane js=new JScrollPane(jt);
		  JTable  table = new JTable();int p=0;
		  DefaultTableModel model = new DefaultTableModel();
		  JScrollPane scroll;
		  String headers[] = {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Vechile Type","Price"};
		  model.setColumnIdentifiers(headers);   
		    table.setModel(model);
		    scroll = new JScrollPane(table);
		    model.addRow(new Object[] {"Trip Number","Destination","Source","Vechile Number","Driver","Depurture Time","Arrival Time","Trip Type","Tickets AV","Price"});
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
	       // JButton b1=new JButton("RESERVE");     
	       // b1.setBounds(50,100,80,30); 
	      //  text te = new text(); 
	        
	        // addActionListener to button 
	       // b1.addActionListener(te); 
	        //JTextField t = new JTextField("ENTER NUMBER OF TRIP YOU WANT TO RESERVE",16); 
	        table.setBounds(1000,10000 , 10000, 10000);
	        
	        panel.add(table);
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
			
	  }
	
	
	
	
	
	
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	  public void addtoarray(String tnumber,String destination,String vn,String Dassingined,String dtime,String Atime,String triptype,String vtype,String source,String price ) {
		//	ArrayList<String> trip=new ArrayList<String>();
		 trip.add(0,tnumber);
		 trip.add(1,source);
	     trip.add(2,destination);
	     trip.add(3,vn);
	     trip.add(4,Dassingined);
	     trip.add(5,dtime);
	     trip.add(6,Atime);
	     trip.add(7,triptype);
	     trip.add(8,vtype);
	     trip.add(9,price);
	    
	     
	     try {int k=0;
	 		FileWriter fw = new FileWriter("Trips.txt");
	 		BufferedWriter output = new BufferedWriter(fw);int i;
	 		//output.newLine();
	 		for(i = 0;i<trip.size();i++) {
		 		output.write(trip.get(i)+" ");if(i==9)output.newLine();if(k!=0&&(i-k+1)%9==0&&i!=k&&k>=2)output.newLine();
		 		if(i%9==0&&i!=0)k++;
		 		//output.newLine();
		 		}
		 		output.write("\n");
		 		output.newLine();
		 		
		 		output.flush();
		 		output.close();
		 		fw.close();
		 		}
	 		
	 		
	 		catch(FileNotFoundException e) {JOptionPane.showMessageDialog(null, "File not found");}
	     catch(IOException e) {
	    	 
	     }
		
		
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	//  -----------------------------------------------------------------------------------------------------------------------------------------
	  public void delete(String searchStr) throws IOException
	  {
	  boolean found = false;
	  java.util.Iterator<String>  iter = trip.iterator();
	  String curItem="";
	  int pos=0;
	   
	  while ( iter .hasNext() == true )
	  {
	      pos=pos+1;
	      curItem =(String) iter .next();
	      if (curItem.equals(searchStr)  ) {
	      found = true;
	      break;
	          }
	      //pos=pos+1;
	  }
	   
	  if ( found == false ) {
	  pos=0;
	  }
	   
	  if (found==true)
	   {//JOptionPane.showMessageDialog(null, "THERE IS ");
		  for(int i=pos;i<=(pos+8);i++) {
	     trip.remove(pos++);}
		  trip.remove(pos);
		  
		  int k=0;
	 		FileWriter fw = new FileWriter("Trips.txt");
	 		BufferedWriter output = new BufferedWriter(fw);int i;
	 		//output.newLine();
	 		for(i = 0;i<trip.size();i++) {
		 		output.write(trip.get(i)+" ");if(i==9)output.newLine();if(k!=0&&(i-k+1)%9==0&&i!=k&&k>=2)output.newLine();
		 		if(i%9==0&&i!=0)k++;
		 		//output.newLine();
		 		}
		 		output.write("\n");
		 		output.newLine();
		 		
		 		output.flush();
		 		output.close();
		 		fw.close();
		  
		  
		   }
	  else
	   {
		  //JOptionPane.showMessageDialog(null, "THERE IS NO TRIP RELATED TO THAT NUMBER");
	      
	   }
	   
	  }
//---------------------------------------------------------------------------------------------------------------------------------------------
	  
	  public String search(String searchStr) throws IOException{
		  boolean found = false;
		  java.util.Iterator<String>  iter = trip.iterator();
		  String curItem="";
		  int pos=0;
		   
		  while ( iter .hasNext() == true )
		  {
		      pos=pos+1;
		      curItem =(String) iter .next();
		      if (curItem.equals(searchStr)  ) {
		      found = true;
		      break;
		          }
		   
		  }
		   
		  if ( found == false ) {
		  pos=0;return null;
		  }
		   
		  if (pos!=0)
		   {
			  return trip.get(pos-5);
			  
			  
		   }
		return  trip.get(pos-5);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  public String returnprice(String searchStr) throws IOException{
		  boolean found = false;
		  java.util.Iterator<String>  iter = trip.iterator();
		  String curItem="";
		  int pos=0;
		   
		  while ( iter .hasNext() == true )
		  {
		      pos=pos+1;
		      curItem =(String) iter .next();
		      if (curItem.equals(searchStr)  ) {
		      found = true;
		      break;
		          }
		   
		  }
		   
		  if ( found == false ) {
		  pos=0;return null;
		  }
		   
		  if (pos!=0)
		   {int x=pos;pos=0;
			  return trip.get(x+8);
			  
			  
		   }
		return null ;
		  
		  
		  }
//----------------------------------------------------------------------------------------------------------------------------------------------------	  
	  public int booking(String searchStr,String number) throws IOException{
		  boolean found = false;
		  java.util.Iterator<String>  iter = trip.iterator();
		  String curItem="";
		  int pos=0;
		   
		  while ( iter .hasNext() == true )
		  {
		      pos=pos+1;
		      curItem =(String) iter .next();
		      if (curItem.equals(searchStr)  ) {
		      found = true;
		      break;
		          }
		   
		  }
		   
		  if ( found == false ) {
		  pos=0;return 0;
		  }
		   
		  if (pos!=0)
		   {int x=pos;pos=0;
		int p =  Integer.parseInt(trip.get(x+7))-Integer.parseInt(number);if(p<0) {return 0;}
		if(p>=0) {
		
		   trip.set(x+7, String.valueOf(p));
		   try {int k=0;
	 		FileWriter fw = new FileWriter("Trips.txt");
	 		BufferedWriter output = new BufferedWriter(fw);int i;
	 		//output.newLine();
	 		for(i = 0;i<trip.size();i++) {
		 		output.write(trip.get(i)+" ");if(i==9)output.newLine();if(k!=0&&(i-k+1)%9==0&&i!=k&&k>=2)output.newLine();
		 		if(i%9==0&&i!=0)k++;
		 		//output.newLine();
		 		}
		 		output.write("\n");
		 		output.newLine();
		 		
		 		output.flush();
		 		output.close();
		 		fw.close();
		 		}
	 		
	 		
	 		catch(FileNotFoundException e) {JOptionPane.showMessageDialog(null, "File not found");}
	     catch(IOException e) {
	    	 
	     }
		
		   
			  return 1;
			  
		}
		   }
		return 0;
		  
		  
		  }
	  
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  public int cancellation(String searchStr,String number) throws IOException{
		  boolean found = false;
		  java.util.Iterator<String>  iter = trip.iterator();
		  String curItem="";
		  int pos=0;
		   
		  while ( iter .hasNext() == true )
		  {
		      pos=pos+1;
		      curItem =(String) iter .next();
		      if (curItem.equals(searchStr)  ) {
		      found = true;
		      break;
		          }
		   
		  }
		   
		  if ( found == false ) {
		  pos=0;return 0;
		  }
		   
		  if (pos!=0)
		   {int x=pos;pos=0;
		int p =  Integer.parseInt(trip.get(x+7))+Integer.parseInt(number);if(p<0) {return 0;}
		if(p>=0) {
		
		   trip.set(x+7, String.valueOf(p));
		   try {int k=0;
	 		FileWriter fw = new FileWriter("Trips.txt");
	 		BufferedWriter output = new BufferedWriter(fw);int i;
	 		//output.newLine();
	 		for(i = 0;i<trip.size();i++) {
		 		output.write(trip.get(i)+" ");if(i==9)output.newLine();if(k!=0&&(i-k+1)%9==0&&i!=k&&k>=2)output.newLine();
		 		if(i%9==0&&i!=0)k++;
		 		//output.newLine();
		 		}
		 		output.write("\n");
		 		output.newLine();
		 		
		 		output.flush();
		 		output.close();
		 		fw.close();
		 		}
	 		
	 		
	 		catch(FileNotFoundException e) {JOptionPane.showMessageDialog(null, "File not found");}
	     catch(IOException e) {
	    	 
	     }
		
		   
			  return 1;
			  
		}
		   }
		return 0;
		  
		  
		  }
	  
//--------------------------------------------------------------------------------------------------------------------------------------------------	  
	  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //---------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
