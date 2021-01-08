package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    
	    JLabel question = new JLabel("Reading...");
	    question.setBounds(120,30,250,30);
	    frame.getContentPane().add(question);
	    
	    
	    
	    JButton fictionButton = new JButton("...fiction?");
	    fictionButton.setBounds(145, 100, 110, 30);
	    frame.getContentPane().add(fictionButton);
	    fictionButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            FictionWindow fictionWindow = new FictionWindow();
	            FictionWindow.showWindow();
	        }  
	    }); 
	       
	    JButton nonfictionButton = new JButton("...nonfiction?");
	    nonfictionButton.setBounds(145, 200,110, 30);
	    frame.getContentPane().add(nonfictionButton);
	    nonfictionButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            NonfictionWindow nonfictionWindow = new NonfictionWindow();
	            nonfictionWindow.showWindow();
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
	
	
	
	
	
	
	
	
	
}
