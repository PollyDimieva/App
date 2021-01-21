package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NonfictionWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading nonfiction...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel("Choose your genre!");
	    question.setBounds(120,30,250,20);
	    frame.getContentPane().add(question);
	    
	    setButton("Biography",145,50,110,30,frame);
	    setButton("Autobiography",140,100,120,30,frame);
	    setButton("Cookbooks",145,150,110,30,frame);
	    setButton("True Crimes",145,200,110,30,frame);
	    setButton("Science",145,250,110,30,frame);
	 
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
	           if(nameOfButton == "Biography") {
	        	   Genre bio = new Genre("Biography",
	        			   "A Beautiful Mind by Sylvia Nasar",
	        			   "Alexander Hamilton by Ron Chernow",
	        			   "<html>Barracoon: The Story of the Last<br>'Black Cargo' by Zora Neale Hurston</html>",
	        			   "Churchill: A Life by Martin Gilbert",
	        			   "<html>E=mc²: A Biography of the World's <br> Most Famous Equation by David Bodanis</html>");
	        	   bio.displayWindow();
	        	   
	           }else if (nameOfButton == "Autobiography") {
	        	   Genre autobio = new Genre("Autobiography",
	        			  " The Autobiography of Benjamin Franklin",
	        			   "Long Walk to Freedom by Nelson Mandela",
	        			   "<html>The Story of My Experiments <br>with Truth by Mahatma Gandhi</html>",
	        			   "The Diary of a Young Girl by Anne Frank",
	        			   "Chronicles, Vol 1 by Bob Dylan");

	        	   autobio.displayWindow();
	        	   
	           }else if (nameOfButton == "Cookbooks") {
	        	   Genre cookbooks = new Genre("Cookbooks",
	        			   "The Joy of Cooking",
	        			   "<html>Salt, Fat, Acid, Heat: Mastering the<br> Elements of Good Cooking</html>",
	        			   "<html>Magnolia Table: A Collection of<br>Recipes for Gathering</html>",
	        			   "<html>Flour Water Salt Yeast: The Fundamentals<br> of Artisan Bread and Pizza</html>",
	        			   "<html>100 Easy Vegan Recipes for the Southern <br>Flavors of Smoke, Sugar, Spice, and Soul<html>");
	        	   cookbooks.displayWindow();
	        	   
	           }else if (nameOfButton == "True Crimes") {
	        	   Genre trueCrimes = new Genre("True Crimes",
	        			  "<html>Down City: A Daughter's Story of<br> Love, Memory, and Murder</html>",
	        			   "The Other Side: A Memoir",
	        			   "<html>The Real Lolita: A Lost Girl, <br>an Unthinkable Crime, and a Scandalous Masterpiece</html>",
	        			   "<html>Midnight in the Garden of Good <br>and Evil: A Savannah Story</html>",
	        			   "Road To Jonestown");
	        	   trueCrimes.displayWindow();
	        	   
	           }else if (nameOfButton == "Science") {
	        	   Genre science = new Genre("Science",
	        			   "<html>Einstein’s Unfinished Revolution: <br>The search for what lies beyond the quantum</html>",
	        			   "<html>A Crack in Creation: The new<br> power to control evolution</html>",
	        			   "<html>A World Beyond Physics:<br> The emergence and evolution of life</html>",
	        			   "<html>Mind Fixers: Psychiatry’s troubled<br> search for the biology of mental illness",
	        			   "How to Tame a Fox (and Build a Dog)");
	        	   science.displayWindow();
	           }

    	}
         });
	}

	
}    
