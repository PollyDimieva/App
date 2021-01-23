package app;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FictionWindow {  //absolutno analogichno e obqsnenieto na klasa FictionWindow na tova na MoviesWindow
                              //zatova vijte MoviesWindow

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading fiction...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    setButton("Classics",145,120,110,30,frame);
	    setButton("Crime",145,170,110,30,frame);
	    setButton("Drama",145,220,110,30,frame);
	    setButton("Fantasy",145,270,110,30,frame);
	    setButton("Historical fiction",135,320,126,30,frame);
	    setButton("Romance",145,370,110,30,frame);
	    setButton("Science fiction",140,420,120,30,frame);
	 
	    JButton back = new JButton("Go back");
	    back.setBounds(20, 360, 80, 40);
	    Color color1 = new Color(255,175,175);
	    Color color2 = new Color(255,255,153);
	    back.setForeground(color1);
	    back.setBackground(color2);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            ReadingWindow readWindow = new ReadingWindow();
	            readWindow.showWindow();
	        }  
	    }); 
	    
	    Picture pic = new Picture("ChooseYour.jpg",0,0,400,500,frame);
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
	    colorOfButton(255,175,175,Button);
	    colorOfTextInButton(255,255,153,Button);
	    frame.getContentPane().add(Button);
        Button.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	           if(nameOfButton == "Classics") {
	        	   Genre classic = new Genre("Classics", "Pride and Prejudice","Jane Eyre","Wuthering Heights","Great Expectations","Tess of d'Urbervilles","BookWindow.png");
	        	   classic.displayWindow();
	        	   
	           }else if (nameOfButton == "Crime") {
	        	   Genre crime = new Genre("Crime",
	        			   "The Hound of the Baskervilles",
	        			   "The Murder of Roger Ackroyd",
	        			   "The Godfather",
	        			   "The Girl with the Dragon Tattoo",
	        			   "Rebecca","BookWindow.png");
	        	   
	        	   
	        	   crime.displayWindow();
	        	   
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama = new Genre("Drama",  "Then She Was Gone",
	        		        "Before We Were Yours",
	        				"Where the Crawdads Sing",
	        				"The Silent Wife",
	        				"Small Great Things","BookWindow.png");
	        	   drama.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy = new Genre("Fantasy","A Game of Thrones",
	        		        "The Fellowship of the Ring",
	        				"The Colour of Magic",
	        				"Assassin's Apprentice",
	        				"The Eye of the World","BookWindow.png");
	        	   fantasy.displayWindow();
	           }else if (nameOfButton == "Historical fiction") {
	        	   Genre histFiction = new Genre("Historical fiction","A Gentleman in Moscow",
	        		        "A Rising Man",
	        				"Alias Grace",
	        				"As Meat Loves Salt",
	        				"Beloved","BookWindow.png");
	        	   histFiction.displayWindow();
	           }else if (nameOfButton == "Romance") {
	        	   Genre romance = new Genre("Romance","Outlander",
	        		        "Gone with the Wind",
	        				"Sense and Sensibility",
	        				"The Notebook",
	        				"Whitney, My Love","BookWindow.png");
	        	   romance.displayWindow();
	           }else if (nameOfButton == "Science fiction") {
	        	   Genre scifi = new Genre("Science fiction","The Blazing World",
	        		        "Foundation",
	        			    "The Star My Destination",
	        				"Metro 2033",
	        				"<html>Moonrise: The Golden<br> Age of Lunar Adventures</html>",
	        				 //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "BookWindow.png");  
	        	   scifi.displayWindow();
	           }

    	}
         });
	}
}
	

