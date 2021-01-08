package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	    
	    JLabel question = new JLabel(" Let's see what is your luck...");
	    question.setBounds(120,30,250,30);
	    frame.getContentPane().add(question);
	    
	    String chosenActivity = chooseActivity();
	    
	    JLabel label = new JLabel();
	    label.setBounds(100, 175, 250, 30);
	    //label.setText(chosenActivity);
	    frame.getContentPane().add(label);
	    
	    JButton actionBtn = new JButton("Try your luck!");
	    actionBtn.setBounds(100, 100, 200, 30);
	    frame.getContentPane().add(actionBtn);
	    actionBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		label.setText(chosenActivity);  
	    
	    	}
	    });
	    
	    String newChosenActivity = chooseActivity();
	    JButton actionBtn2 = new JButton("Try again");
	    actionBtn2.setBounds(100, 250, 200, 30);
	    frame.getContentPane().add(actionBtn2);
	    actionBtn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//displayWindow();
	    		label.setText(newChosenActivity);  
	    
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
			activity[5]	="Play a game from the Jackbox"
					+ " party packs";
			activity[6]	="Create Your Own Cocktail";
			activity[7]	="Keep a Gratitude Journal..."
					+ " at least for a week";
			activity[8]	="Make homemade Ice Cream";
			activity[9]	="Have a Pajama Day";
			activity[10] ="Make yourself a Bucket List";
			activity[11] ="Go 24 Hours without Internet,"
					+ " Radio or Television";
			activity[12] ="Learn Calligraphy";
			activity[13] ="Learn a Magic Trick";
			activity[14] ="Create a Scrapbook with"
					+ " memorable pictures and photos";
			activity[15] ="Try to learn how to Meditate";
			activity[16] ="Write a Thank You Note"
					+ " to Someone Who Deserves It";

	
		int range = 17;
			
		int i = (int)(Math.random()*range);
			
			return activity[i];		    
	}
	
}