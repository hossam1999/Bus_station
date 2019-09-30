package busstation;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.scene.layout.StackPane;

public class historytickets extends JFrame {
	ArrayList<String> historytrips=new ArrayList<String>();
	
	
public historytickets() {
	Scanner sc = null;File file = new File("History.txt");
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
	   historytrips.add(sc.next());
	   
	  }
	  sc.close();
	 }
public void addtoarray(String tripnumber,String numberofticketsbooked ) throws IOException {
	//	ArrayList<String> trip=new ArrayList<String>();
	int x=booking(tripnumber);
	if(x==9999) {historytrips.add(0,tripnumber);historytrips.add(1,numberofticketsbooked);}
	
	if(x!=9999) {int r=Integer.parseInt(historytrips.get(x+1))+Integer.parseInt(numberofticketsbooked);
	
	
	historytrips.set(x+1, String.valueOf(r));
	
	
	
	
	}
    
    
     
     try {int k=0;
 		FileWriter fw = new FileWriter("History.txt");
 		BufferedWriter output = new BufferedWriter(fw);int i;
 		//output.newLine();
 		for(i = 0;i<historytrips.size();i++) {
	 		output.write(historytrips.get(i)+" ");//if(i==1)output.newLine();if(k!=0&&(i-k+1)%2==0&&i!=k&&k>=2)output.newLine();
	 		//if(i%2==0&&i!=0)k++;
	 		//output.newLine();
	 		if(i%2==1)output.newLine();
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
	  String headers[] = {"Trip Number","NUMBER OF Tickets resevered"};
	  model.setColumnIdentifiers(headers);   
	    table.setModel(model);
	    scroll = new JScrollPane(table);
	    model.addRow(new Object[] {"Trip Number","NUMBER OF Tickets resevered"});
	    for (int i = 0; i < (historytrips.size())/2; i++) {
	        model.addRow(new Object[] { String.valueOf(historytrips.get(p++)),String.valueOf(historytrips.get(p++))});
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











//--------------------------------------------------------------------------------------------------------------------------------------------------
public int booking(String searchStr) throws IOException{
	  boolean found = false;
	  java.util.Iterator<String>  iter = historytrips.iterator();
	  String curItem="";
	  int pos=0;
	   
	  while ( iter .hasNext() == true )
	  {
	     // pos=pos+1;
	      curItem =(String) iter .next();
	      if (curItem.equals(searchStr)  ) {
	      found = true;
	      break;
	      
	          }
	      pos=pos+1;
	  }
	   
	  if ( found == false ) {
	  pos=0;return 9999;
	  }
	   
	  if (found==true)
	   {return pos;      }
	  return 0;


}
//------------------------------------------------------------------------------------------------------------------------------------------------
public void cancellation(String searchStr,String number) throws IOException{
	  boolean found = false;
	  java.util.Iterator<String>  iter = historytrips.iterator();
	  String curItem="";
	  int pos=0;
	   
	  while ( iter .hasNext() == true )
	  {
	     // pos=pos+1;
	      curItem =(String) iter .next();
	      if (curItem.equals(searchStr)  ) {
	      found = true;
	      break;
	      
	          }
	      pos=pos+1;
	  }
	   
	  if ( found == false ) {
	  pos=0;
	  }
	   
	  if (found==true&&Integer.parseInt(historytrips.get(pos+1))>=Integer.parseInt(number))
		  
	   { int r=Integer.parseInt(historytrips.get(pos+1))-Integer.parseInt(number);
		
		historytrips.set(pos+1, String.valueOf(r));
		try {int k=0;
 		FileWriter fw = new FileWriter("History.txt");
 		BufferedWriter output = new BufferedWriter(fw);int i;
 		//output.newLine();
 		for(i = 0;i<historytrips.size();i++) {
	 		output.write(historytrips.get(i)+" ");//if(i==1)output.newLine();if(k!=0&&(i-k+1)%2==0&&i!=k&&k>=2)output.newLine();
	 		//if(i%2==0&&i!=0)k++;
	 		//output.newLine();
	 		if(i%2==1)output.newLine();
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
	  


}}


