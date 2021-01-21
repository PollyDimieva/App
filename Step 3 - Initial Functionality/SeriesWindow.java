package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SeriesWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Watching series...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel("Choose your genre!");
	    question.setBounds(120,20,250,30);
	    frame.getContentPane().add(question);
	    
	    

	       
	    
	    setButton("Action",145,50,110,30,frame);
	    setButton("Comedy",145,100,110,30,frame);
	    setButton("Drama",145,150,110,30,frame);
	    setButton("Fantasy",145,200,110,30,frame);
	    setButton("Crime",145,250,110,30,frame);
	    setButton("Sci-fi",145,300,110,30,frame);
	    setButton("Thriller",145,350,110,30,frame);
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(10, 400, 80, 30);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            WatchingWindow watchWindow = new WatchingWindow();
	            watchWindow.showWindow();
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
	           if(nameOfButton == "Action") {
	        	   Genre action2 = new Genre("Action",
	        			  " Daredevil (2015–2018)",
	        			   "Prison Break(2005)",
	        			   "Daybreak (2019)",
	        			   "Into the Badlands (2015–2019)",
	        			   "The 100 (2014–2020)");
		        	
		        	action2.displayWindow();
	           }else if (nameOfButton == "Comedy") {
	        	   Genre comedy2 = new Genre("Comedy",
	        			   "Brooklyn Nine-Nine (2013-present)",
	        			   "Sex and the City (1998-2001)",
	        			   "Modern Family (2009-2020)",
	        			   "The Office (2005-2013)",
	        			   "Friends (1994-2004)");
		        	
		        	comedy2.displayWindow();
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama3 = new Genre("Drama",
	        			  " Band of Brothers (2001)",
	        			  " Chernobyl (2019)",
	        			  " The Wire (2002–2008)",
	        			  " Peaky Blinders (2013–present)",
	        			  " When They See Us (2019)");
		        	
		        	drama3.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy3 = new Genre("Fantasy",
	        			  " Game of Thrones (2011–2019)",
	        			  " Stranger Things (2016–present)",
	        			  " Supernatural (2005)",
	        			   "American Horror Story (2011)",
	        			   "The Vampire Diaries (2009)");
		        	
		        	fantasy3.displayWindow();
	           }else if (nameOfButton == "Crime") {
	        	   Genre crime2 = new Genre("Crime",
	        			  " Breaking Bad (2008–2013)",
	        			  " Narcos (2015–2017)",
	        			   "The Shield (2002-2008)",
	        			   "The Sopranos (1999-2007)",
	        			   "Veronica Mars (2004-2007)");
		        	
		        	crime2.displayWindow();
	           }else if (nameOfButton == "Sci-fi") {
	        	Genre scifi = new Genre("Sci-fi",
	        			"Black Mirror (2011–present)",
	        			"Westworld (2016–present)",
	        			"The Mandalorian(2019-Present)",
	        			"Doctor Who (1963-Present)",
	        			"Star Trek (1966-1969)");
	        	
	        	scifi.displayWindow();
	        	
	        	
	           }else if (nameOfButton == "Thriller") {
	        	   Genre thriller = new Genre("Thriller",
	        			  " Sherlock (2010)",
	        			  " Dark (2017)",
	        			   "Hannibal (2013)",
	        			   "Homeland (2011)",
	        			   "The Blacklist (2013)");
		        	
		        	thriller.displayWindow();
	           }

    	}
         });
	}
}
