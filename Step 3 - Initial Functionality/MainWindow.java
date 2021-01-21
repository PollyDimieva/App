package gui;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}
    
	public static void showWindow() {
		JFrame frame = new JFrame("What do you feel like doing today?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel("What do you feel like doing today?");
	    question.setBounds(90,30,250,30);
	    frame.getContentPane().add(question);
	    
	    JButton readingButton = new JButton("Reading");
	    readingButton.setBounds(145, 100, 110, 30);
	    frame.getContentPane().add(readingButton);
	    readingButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            ReadingWindow readingWindow = new ReadingWindow();
	            readingWindow.showWindow();
	        }  
	    }); 
	    
	    
	    
	    JButton watchingButton = new JButton("Watching");
	    watchingButton.setBounds(145, 200,110, 30);
	    frame.getContentPane().add(watchingButton);
	    watchingButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            WatchingWindow watchingWindow = new WatchingWindow();
	            watchingWindow.showWindow();
	        }  
	    }); 
	    
	    
	    
	    
	    JButton smthUnusualButton = new JButton("Something rather unusual");
	    smthUnusualButton.setBounds(90, 300, 220, 30);
	    frame.getContentPane().add(smthUnusualButton);
	    smthUnusualButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            SmthUnusualWindow smthUnusualWindow = new SmthUnusualWindow();
	            smthUnusualWindow.showWindow();
	        }  
	    }); 
	    
		frame.setVisible(true);
		
	}
}
