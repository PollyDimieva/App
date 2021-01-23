package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Reading...");               //analogichno na vseki prozorec 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //obqsneno podrobno v MainWindow klasa
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    
	    JButton fictionButton = new JButton("...FICTION?");
	    fictionButton.setBounds(145, 150, 130, 50);
	    Color color1=new Color(228,228,81);
	    Color color2=new Color(51,153,153);
	    Color color3=new Color(153,255,255);
	    fictionButton.setForeground(color2);
	    fictionButton.setBackground(color1);
	    frame.getContentPane().add(fictionButton);
	    fictionButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                            //zatvarqme segashniq frame
	            FictionWindow fictionWindow = new FictionWindow();  //suzdava obekt ot klasa FictionWindow
	            FictionWindow.showWindow();                         //otvarqme go chrez metoda mu showWindow();
	        }  
	    }); 
	       
	    JButton nonfictionButton = new JButton("...NONFICTION?");
	    nonfictionButton.setBounds(145, 230,130, 50);
	    nonfictionButton.setForeground(color1);
	    nonfictionButton.setBackground(color2);
	    frame.getContentPane().add(nonfictionButton);
	    nonfictionButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                                     //zatvarqme segashniq frame
	            NonfictionWindow nonfictionWindow = new NonfictionWindow();  //suzdava obekt ot klasa NonfictionWindow
	            nonfictionWindow.showWindow();                               //otvarqme go chrez metoda mu showWindow();
	        }  
	    });     
	    
	    JButton back = new JButton("Go back");  //back button
	    back.setBounds(30,400, 100, 40);
	    back.setBackground(color3);
	    back.setForeground(color2);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                       //za da se vurnem nazad trqbva da zatvorim segashniq frame
	            MainWindow mainWindow = new MainWindow();      //suzdavame obekt ot predishniq klas
	            mainWindow.showWindow();                       //chrez metoda mu showWindow(); go "otvarqme"
	        }  
	    }); 

	    
	    Picture pic = new Picture("Reading.png",0,0,400,500,frame); //chrez suzdadeniq ot men klas Picture 
	    pic.addImage();                                             //i negoviq metod addImage slagam snimka za fon
	    
    
	    frame.setVisible(true);       //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
	}
	
	
	
	
	
	
	
	
	
}
