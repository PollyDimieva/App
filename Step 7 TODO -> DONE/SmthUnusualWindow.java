package app;

import java.awt.Color;
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
		JFrame frame = new JFrame("!!! Something rather unusual !!!");  //analogichno na vseki prozorec 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //obqsneno podrobno v MainWindow klasa
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    String chosenActivity = chooseActivity();
	    
	    JLabel label = new JLabel();             //suzdavam prazen label
	    label.setBounds(100, 320, 250, 30);
	    label.setForeground(Color.YELLOW);
	    frame.getContentPane().add(label);
	    
	    JButton actionBtn = new JButton("Try your luck!");
	    actionBtn.setBounds(100, 250, 200, 40);
	    Color color1 = new Color(255,140,255);
	    Color color2 = new Color(255,255,153);
	    actionBtn.setForeground(color2);
	    actionBtn.setBackground(color1);
	    frame.getContentPane().add(actionBtn);
	    actionBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		label.setText(chosenActivity);  //sled natiskane na butonut label-ut sudirja random izbraniq Stringa chrez metoda chooseActivity();
	    
	    	}
	    });
	    
	    JButton actionBtn2 = new JButton("Try again");
	    actionBtn2.setBounds(150, 380, 100, 30);
	    Color color3=new Color(51,153,153);
	    Color color4=new Color(153,255,255);
	    actionBtn2.setBackground(color4);
	    actionBtn2.setForeground(color3);
	    frame.getContentPane().add(actionBtn2);
	    actionBtn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chooseActivity();                          
	    		String newChosenActivity = chooseActivity();  //suzdavam nov String chrez metoda chooseActivity();
	    		label.setText(newChosenActivity);             //sled natiskane na butonut label-ut sudurja noviq random String
	            frame.repaint();    
//chrez repaint(); pri vsqko novo natiskane na butona she se izbira sledvasht nov String chrez chooseActivity();
	    	}
	    });
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(20, 440, 100, 40);
	    Color color5 = new Color(255,175,175);
	    Color color6 = new Color(255,255,153);
	    back.setForeground(color5);
	    back.setBackground(color6);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            MainWindow mainWindow = new MainWindow();
	            mainWindow.showWindow();
	        }  
	    }); 
	    
	    Picture pic = new Picture("smthUnusual.png",0,0,400,500,frame);
	    pic.addImage();
	    
	    frame.setVisible(true);
	}
	public static String chooseActivity() {      //metodut vrushta random izbran String 
		String [] activity = new String[17];     //masiv ot Stringovete ni
		
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
			
		int i = (int)(Math.random()*range);   //taka izbiram edno random chislo i
			                                  //obiknoveno metoda Math.random vrushta stoinost double i zatova go kastvame kum int
		
		return activity[i];		              //metodut vrushta Stringa s nomer random izbranoto i       
	}
	
}