package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SmthUnusualWindow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("!!! Something rather unusual !!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel(" Let's see what is your luck...");
	    question.setBounds(120,30,250,30);
	    frame.getContentPane().add(question);
	    
	    String chosenActivity = chooseActivity();
	    
	    JLabel label = new JLabel();
	    label.setBounds(100, 175, 250, 30);
	    
	    frame.getContentPane().add(label);
	  
	
	    
	    JButton actionBtn = new JButton("Try your luck!");
	    actionBtn.setBounds(100, 100, 200, 30);
	    frame.getContentPane().add(actionBtn);
	    actionBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		label.setText(chosenActivity);  
	    
	    	}
	    });
	    
	   
	    JButton actionBtn2 = new JButton("Try again");
	    actionBtn2.setBounds(100, 250, 200, 30);
	    frame.getContentPane().add(actionBtn2);
	    actionBtn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//displayWindow();
	    		chooseActivity();
	    		 String newChosenActivity = chooseActivity();
	    		label.setText(newChosenActivity);  
	            frame.repaint();
	    	}
	    });
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(10, 400, 80, 30);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            MainWindow mainWindow = new MainWindow();
	            mainWindow.showWindow();
	        }  
	    }); 
	    
	    frame.setVisible(true);
	}
	public static String chooseActivity() {
		String [] activity = new String[17];
		
		
	        activity[0]	="Try Origami";
	        activity[1]	="Fill out a crossword puzzle";
			activity[2]	="Write a letter.";
			activity[3]	="Learn a dance";
			activity[4]	="Play a board game";
			activity[5]	="<html>Play a game from the Jackbox <br> party packs</html>";
			activity[6]	="Create Your Own Cocktail";
			activity[7]	="<html>Keep a Gratitude Journal... <br> at least for a week</html>";
			activity[8]	="Make homemade Ice Cream";
			activity[9]	="Have a Pajama Day";
			activity[10] ="Make yourself a Bucket List";
			activity[11] ="<html>Go 24 Hours without Internet,<br>Radio or Television</html>";
			activity[12] ="Learn Calligraphy";
			activity[13] ="Learn a Magic Trick";
			activity[14] ="<html>Create a Scrapbook with<br>memorable pictures and photos</html>";
			activity[15] ="Try to learn how to Meditate";
			activity[16] ="<html>Write a Thank You Note<br>to Someone Who Deserves It</html>";

	
		int range = 17;
			
		int i = (int)(Math.random()*range);
			
			return activity[i];		    
	}
	
}