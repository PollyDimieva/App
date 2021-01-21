package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WatchingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}
    public static void showWindow() {
    	JFrame frame = new JFrame("Watching...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    
	    JLabel question = new JLabel("Watching...");
	    question.setBounds(120,30,250,30);
	    frame.getContentPane().add(question);
	    
	    JButton moviesButton = new JButton("...a movie?");
	    moviesButton.setBounds(145, 100, 110, 30);
	    frame.getContentPane().add(moviesButton);
	
	       
	    JButton seriesButton = new JButton("...series?");
	    seriesButton.setBounds(145, 200,110, 30);
	    frame.getContentPane().add(seriesButton);
	 
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(10, 400, 80, 30);
	    frame.getContentPane().add(back);
	
	    
	    
	    frame.setVisible(true);
    }
}
