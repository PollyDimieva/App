package app;


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
	        			   "Barracoon: The Story of the Last 'Black Cargo' by Zora Neale Hurston",
	        			   "Churchill: A Life by Martin Gilbert",
	        			   "E=mc²: A Biography of the World's Most Famous Equation by David Bodanis");
	        	   bio.displayWindow();
	        	   
	           }else if (nameOfButton == "Autobiography") {
	        	   Genre autobio = new Genre("Autobiography",
	        			  " The Autobiography of Benjamin Franklin",
	        			   "Long Walk to Freedom by Nelson Mandela",
	        			   "The Story of My Experiments with Truth by Mahatma Gandhi",
	        			   "The Diary of a Young Girl by Anne Frank",
	        			   "Chronicles, Vol 1 by Bob Dylan");

	        	   autobio.displayWindow();
	        	   
	           }else if (nameOfButton == "Cookbooks") {
	        	   Genre cookbooks = new Genre("Cookbooks",
	        			   "The Joy of Cooking",
	        			   "Salt, Fat, Acid, Heat: Mastering the Elements of Good Cooking",
	        			   "Magnolia Table: A Collection of Recipes for Gathering",
	        			   "Flour Water Salt Yeast: The Fundamentals of Artisan Bread and Pizza: The Fundamentals of Artisan Bread and Pizza",
	        			   "Sweet Potato Soul: 100 Easy Vegan Recipes for the Southern Flavors of Smoke, Sugar, Spice, and Soul");
	        	   cookbooks.displayWindow();
	        	   
	           }else if (nameOfButton == "True Crimes") {
	        	   Genre trueCrimes = new Genre("True Crimes",
	        			  " Down City: A Daughter's Story of Love, Memory, and Murder",
	        			   "The Other Side: A Memoir",
	        			   "The Real Lolita: A Lost Girl, an Unthinkable Crime, and a Scandalous Masterpiece",
	        			   "Midnight in the Garden of Good and Evil: A Savannah Story",
	        			   "Road To Jonestown");
	        	   trueCrimes.displayWindow();
	        	   
	           }else if (nameOfButton == "Science") {
	        	   Genre science = new Genre("Science",
	        			   "Einstein’s Unfinished Revolution: The search for what lies beyond the quantum",
	        			   "A Crack in Creation: The new power to control evolution",
	        			   "A World Beyond Physics: The emergence and evolution of life",
	        			   "Mind Fixers: Psychiatry’s troubled search for the biology of mental illness",
	        			   "How to Tame a Fox (and Build a Dog)");
	        	   science.displayWindow();
	           }

    	}
         });
	}
	
	
	
	
	
	

	
	
	
	
	
	
}    
	    
	    
	    