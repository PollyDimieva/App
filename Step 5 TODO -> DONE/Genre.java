package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Genre {

	String name;                         
	String[] elements = new String[5];    
	
	
	Genre(String name,String e1, String e2, String e3, String e4, String e5) {
		this.name=name;
		elements[0]=e1;               
		elements[1]=e2;
		elements[2]=e3;
		elements[3]=e4;
		elements[4]=e5;
	}

	public String chooseElement() {        
		int range = 5;                      
			
		int i = (int)(Math.random()*range);
		return elements[i];
		
	}
	
	
	
	
	public void displayWindow() {                            
		JFrame frame = new JFrame("!!! "+name+ " !!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,500);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    JLabel question = new JLabel(" Let's see what is your luck...");
	    question.setBounds(120,30,250,30);
	    frame.getContentPane().add(question);
	    
	    String chosenElement = chooseElement(); 
    
	    JLabel label = new JLabel();          
	    label.setBounds(100, 155, 250, 60);    
	    frame.getContentPane().add(label);
	 
	    
	    JButton actionBtn = new JButton("Try your luck!");
	    actionBtn.setBounds(100, 100, 200, 30);
	    frame.getContentPane().add(actionBtn);
	    actionBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		label.setText(chosenElement);  
	    
	    	}
	    });
	    
	    
	    
	  //  String newChosenElement = chooseElement();
	    
	    JButton actionBtn2 = new JButton("Try again");
	    actionBtn2.setBounds(100, 250, 200, 30);
	    frame.getContentPane().add(actionBtn2);
	    actionBtn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chooseElement();
	    	
	    		String newChosenElement = chooseElement();
	    		label.setText(newChosenElement);
	    		frame.repaint();
	    	//}
	    	}
	    });
	    
	    
	    JButton back = new JButton("Go back to the main menu");
	    back.setBounds(10, 400, 200, 30);
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
