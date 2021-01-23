package app;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NonfictionWindow { //absolutno analogichno e obqsnenieto na klasa NonfictionWindow na tova na MoviesWindow
                                //zatova vijte MoviesWindow

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading nonfiction...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	  
	    
	    setButton("Biography",145,130,110,35,frame);
	    setButton("Autobiography",140,200,120,35,frame);
	    setButton("Cookbooks",145,270,110,35,frame);
	    setButton("True Crimes",145,340,110,35,frame);
	    setButton("Science",145,410,110,35,frame);
	
	    
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
	
	    Picture pic = new Picture("ChooseYour2.jpg",0,0,400,500,frame);
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
	           if(nameOfButton == "Biography") {
	        	   Genre bio = new Genre("Biography",
	        			   "A Beautiful Mind by Sylvia Nasar",
	        			   "Alexander Hamilton by Ron Chernow",
	        			   "<html>Barracoon: The Story of the Last<br> 'Black Cargo' by Zora Neale Hurston</html>",
	        			   //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "Churchill: A Life by Martin Gilbert",
	        			   "<html>E=mc²: A Biography of the World's Most<br>Famous Equation by David Bodanis</html>","BookWindow.png");
	        	   bio.displayWindow();
	        	   
	           }else if (nameOfButton == "Autobiography") {
	        	   Genre autobio = new Genre("Autobiography",
	        			  " The Autobiography of Benjamin Franklin",
	        			   "Long Walk to Freedom by Nelson Mandela",
	        			   "<html>The Story of My Experiments<br> with Truth by Mahatma Gandhi</html>",
	        			   //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "The Diary of a Young Girl by Anne Frank",
	        			   "Chronicles, Vol 1 by Bob Dylan","BookWindow.png");

	        	   autobio.displayWindow();
	        	   
	           }else if (nameOfButton == "Cookbooks") {
	        	   Genre cookbooks = new Genre("Cookbooks",
	        			   "The Joy of Cooking",
	        			   "<html>Salt, Fat, Acid, Heat: Mastering <br>the Elements of Good Cooking</html>",
	        			   //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "<html>Magnolia Table: A Collection<br> of Recipes for Gathering</html>",
	        			   "<html>Flour Water Salt Yeast: The Fundamentals<br> of Artisan Bread and Pizza</html>",
	        			   "<html>Sweet Potato Soul: 100 Easy Vegan<br> Recipes for the Southern Flavors of Smoke, Sugar, Spice, and Soul</html>","BookWindow.png");
	        	   cookbooks.displayWindow();
	        	   
	           }else if (nameOfButton == "True Crimes") {
	        	   Genre trueCrimes = new Genre("True Crimes",
	        			  "<html> Down City: A Daughter's Story of <br>Love, Memory, and Murder</html>",
	        			   "The Other Side: A Memoir",
	        			   "<html>The Real Lolita: A Lost Girl, an<br>Unthinkable Crime, and a Scandalous Masterpiece</html>",
	        			   //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "<html>Midnight in the Garden of<br> Good and Evil: A Savannah Story</html>",
	        			   "Road To Jonestown","BookWindow.png");
	        	   trueCrimes.displayWindow();
	        	   
	           }else if (nameOfButton == "Science") {
	        	   Genre science = new Genre("Science",
	        			   "<html>Einstein’s Unfinished Revolution: <br>The search for what lies beyond the quantum</html>",
	        			   "<html>A Crack in Creation: The new <br>power to control evolution</html>",
	        			   //po tozi nachin, polzvaiki html, otdelqm teksta na dva reda, kogato e tvurde dulug za edin
	        			   "<html>A World Beyond Physics: <br> The emergence and evolution of life</html>",
	        			   "<html>Mind Fixers: Psychiatry’s troubled <br> search for the biology of mental illness</html>",
	        			   "How to Tame a Fox (and Build a Dog)","BookWindow.png");
	        	   science.displayWindow();
	           }

    	}
         });
	}
	
	
	
	
	
	

	
	
	
	
	
	
}    
	    
	    
	    