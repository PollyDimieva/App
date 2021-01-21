package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FictionWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading fiction...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel("Choose your genre!");
	    question.setBounds(120,20,250,30);
	    frame.getContentPane().add(question);
	    
	    

	       
	    setButton("Classics",145,50,110,30,frame);
	    
	    
	    
	    setButton("Crime",145,100,110,30,frame);
	    setButton("Drama",145,150,110,30,frame);
	    setButton("Fantasy",145,200,110,30,frame);
	    setButton("Historical fiction",135,250,130,30,frame);
	    setButton("Romance",145,300,110,30,frame);
	    setButton("Science fiction",140,350,120,30,frame);
	 
	    JButton back = new JButton("Go back");
	    back.setBounds(10, 400, 80, 30);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            ReadingWindow readWindow = new ReadingWindow();
	            readWindow.showWindow();
	        }  
	    }); 
	   
	    
	    frame.setVisible(true);
	}
	
	public static void setButton(String nameOfButton,int x,int y,int width,int heigth, JFrame frame) {
		  
	    JButton Button = new JButton(nameOfButton);
	    Button.setBounds(x, y, width, heigth);
	    frame.getContentPane().add(Button);
        Button.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	           if(nameOfButton == "Classics") {
	        	   Genre classic = new Genre("Classics", "Pride and Prejudice","Jane Eyre","Wuthering Heights","Great Expectations","Tess of d'Urbervilles");
	        	   classic.displayWindow();
	        	   
	           }else if (nameOfButton == "Crime") {
	        	   Genre crime = new Genre("Crime",
	        			   "The Hound of the Baskervilles",
	        			   "The Murder of Roger Ackroyd",
	        			   "The Godfather",
	        			   "The Girl with the Dragon Tattoo",
	        			   "Rebecca");
	        	   crime.displayWindow();
	        	   
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama = new Genre("Drama",  "Then She Was Gone",
	        		        "Before We Were Yours",
	        				"Where the Crawdads Sing",
	        				"The Silent Wife",
	        				"Small Great Things");
	        	   drama.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy = new Genre("Fantasy","A Game of Thrones",
	        		        "The Fellowship of the Ring",
	        				"The Colour of Magic",
	        				"Assassin's Apprentice",
	        				"The Eye of the World");
	        	   fantasy.displayWindow();
	           }else if (nameOfButton == "Historical fiction") {
	        	   Genre histFiction = new Genre("Historical fiction","A Gentleman in Moscow",
	        		        "A Rising Man",
	        				"Alias Grace",
	        				"As Meat Loves Salt",
	        				"Beloved");
	        	   histFiction.displayWindow();
	           }else if (nameOfButton == "Romance") {
	        	   Genre romance = new Genre("Romance","Outlander",
	        		        "Gone with the Wind",
	        				"Sense and Sensibility",
	        				"The Notebook",
	        				"Whitney, My Love");
	        	   romance.displayWindow();
	           }else if (nameOfButton == "Science fiction") {
	        	   Genre scifi = new Genre("Science fiction","The Blazing World",
	        		        "Foundation",
	        			    "The Star My Destination",
	        				"Metro 2033",
	        				"Moonrise: The Golden Age of Lunar Adventures");
	        	   scifi.displayWindow();
	           }

    	}
         });
	}
}