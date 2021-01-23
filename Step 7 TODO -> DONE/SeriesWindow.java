package app;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SeriesWindow {  //absolutno analogichno e obqsnenieto na klasa SeriesWindow na tova na MoviesWindow
                             //zatova vijte MoviesWindow
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Watching series...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    setButton("Action",160,185,80,25,frame);    
	    setButton("Comedy",160,220,80,25,frame);
	    setButton("Drama",160,290,80,25,frame);
	    setButton("Fantasy",160,255,80,25,frame);
	    setButton("Crime",70,255,80,25,frame);
	    setButton("Sci-fi",250,255,80,25,frame);
	    setButton("Thriller",160,325,80,25,frame);
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(145, 400, 110, 40);
	    Color color1 = new Color(0,130,153);
	    Color color2 = new Color(255,204,215);
	    back.setForeground(color2);
	    back.setBackground(color1);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            WatchingWindow watchWindow = new WatchingWindow();
	            watchWindow.showWindow();
	        }  
	    }); 
	    
	    Picture pic = new Picture("SeriesChoice.jpg",0,0,400,500,frame);
	    pic.addImage();
	    
	    frame.setVisible(true);
	}
	public static void colorOfTextInButton(int red,int green, int blue, JButton button) {
		Color foregroundColor = new Color(red,green,blue);
		button.setForeground(foregroundColor);
	}
	public static void colorOfButton(int red,int green, int blue, JButton button) {
		Color backgroundColor = new Color(red,green,blue);
		button.setBackground(backgroundColor);
	}
	
	public static void setButton(String nameOfButton,int x,int y,int width,int heigth, JFrame frame) {
		  
	    JButton Button = new JButton(nameOfButton);
	    Button.setBounds(x, y, width, heigth);
	    colorOfButton(255,204,215,Button);
	    colorOfTextInButton(0,130,153,Button);
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
	        			   "The 100 (2014–2020)","MoviesWindow.png");
		        	
		        	action2.displayWindow();
	           }else if (nameOfButton == "Comedy") {
	        	   Genre comedy2 = new Genre("Comedy",
	        			   "Brooklyn Nine-Nine (2013-present)",
	        			   "Sex and the City (1998-2001)",
	        			   "Modern Family (2009-2020)",
	        			   "The Office (2005-2013)",
	        			   "Friends (1994-2004)","MoviesWindow.png");
		        	
		        	comedy2.displayWindow();
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama3 = new Genre("Drama",
	        			  " Band of Brothers (2001)",
	        			  " Chernobyl (2019)",
	        			  " The Wire (2002–2008)",
	        			  " Peaky Blinders (2013–present)",
	        			  " When They See Us (2019)","MoviesWindow.png");
		        	
		        	drama3.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy3 = new Genre("Fantasy",
	        			  " Game of Thrones (2011–2019)",
	        			  " Stranger Things (2016–present)",
	        			  " Supernatural (2005)",
	        			   "American Horror Story (2011)",
	        			   "The Vampire Diaries (2009)","MoviesWindow.png");
		        	
		        	fantasy3.displayWindow();
	           }else if (nameOfButton == "Crime") {
	        	   Genre crime2 = new Genre("Crime",
	        			  " Breaking Bad (2008–2013)",
	        			  " Narcos (2015–2017)",
	        			   "The Shield (2002-2008)",
	        			   "The Sopranos (1999-2007)",
	        			   "Veronica Mars (2004-2007)","MoviesWindow.png");
		        	
		        	crime2.displayWindow();
	           }else if (nameOfButton == "Sci-fi") {
	        	Genre scifi = new Genre("Sci-fi",
	        			"Black Mirror (2011–present)",
	        			"Westworld (2016–present)",
	        			"The Mandalorian(2019-Present)",
	        			"Doctor Who (1963-Present)",
	        			"Star Trek (1966-1969)","MoviesWindow.png");
	        	
	        	scifi.displayWindow();
	        	
	        	
	           }else if (nameOfButton == "Thriller") {
	        	   Genre thriller = new Genre("Thriller",
	        			  " Sherlock (2010)",
	        			  " Dark (2017)",
	        			   "Hannibal (2013)",
	        			   "Homeland (2011)",
	        			   "The Blacklist (2013)","MoviesWindow.png");
		        	
		        	thriller.displayWindow();
	           }

    	}
         });
	}
}
	

