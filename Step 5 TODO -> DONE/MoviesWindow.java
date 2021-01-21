package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoviesWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Watching movies...");
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
	    setButton("Horror",145,250,110,30,frame);
	    setButton("Romance",145,300,110,30,frame);
	    setButton("Mystery",145,350,110,30,frame);
	    
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
	        	   Genre action = new Genre("Action",
	        			   "Black Panther (2018)",
	        			   "Avengers: Endgame (2019)",
	        			  " <html>Mission: Impossible - <br>Fallout (2018)</html>",
	        			   "Mad Max: Fury Road (2015)",
	        			   "<html>Spider-Man: Into the <br>Spider-Verse (2018)</html>"
);
		        	
		        	action.displayWindow();
	           }else if (nameOfButton == "Comedy") {
	        	   Genre comedy = new Genre("Comedy",
	        			   "The General (1926)",
	        			   "It Happened One Night (1934)",
	        			   "Bridesmaids (2011)",
	        			   "Eighth Grade (2018)",
	        			   "We're the Millers (2013)");
		        	
		        	comedy.displayWindow();
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama2 = new Genre("Drama",
	        			   "Parasite (Gisaengchung) (2019)",
		        			  " Moonlight (2016)",
		        			  " A Star Is Born (2018)",
		        			  " The Shape of Water (2017)",
		        			  " Marriage Story (2019)");
		        	
		        	drama2.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy2 = new Genre("Fantasy",
	        			   "The Lord of the Rings Trilogy",
	        			   "Metropolis (2016)",
	        			   "Gravity (2013)",
	        			  " Pan's Labyrinth (2006)",
	        			   "The Shape of Water (2017)");
		        	
		        	fantasy2.displayWindow();
	           }else if (nameOfButton == "Horror") {
	        	   Genre horror = new Genre("Horror",
	        			  " Host (2020)",
	        			  " Saw (2004)",
	        			  " The Birds (1963)",
	        			  " Dawn of the Dead (1978)",
	        			  " Shaun of the Dead (2004)");
		        	
		        	horror.displayWindow();
	           }else if (nameOfButton == "Romance") {
	        	Genre romance2 = new Genre("Romance",
	        			"Titanic (1997)",
	        			"La La Land(2016)",
	        			"The Vow (2012)",
	        			"The Notebook (2004)",
	        			"Carol (2015)");
	        	
	        	romance2.displayWindow();
	        	
	        	
	        	
	           }else if (nameOfButton == "Mystery") {
	        	   Genre mystery = new Genre("Mystery",
	        			  " Knives Out (2019)",
	        			  " The Girl With the Dragon Tattoo (2011)",
	        			  " Before I Go to Sleep (2014)",
	        			  " Kiss the Girls (1997)",
	        			  " The Girl on the Train (2016)");
		        	
		        	mystery.displayWindow();
	           }

    	}
         });
	}
}
