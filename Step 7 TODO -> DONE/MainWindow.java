package app;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;


public class MainWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();                                //vseki prozorec ot programata si ima metod showWindow
	}
    
	public static void showWindow() {
		JFrame frame = new JFrame("What do you feel like doing today?");  //kakvo pishe v gorniq ugul na frame-a
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             //exit operation
	    frame.setSize(410,535);                        //razmera na nasheto prozorche
	    frame.getContentPane().setLayout(null);        //polzvam Layout null za da moga chrez setBounds(x,y,width,height) 
	                                                   //da vuveda koordinatite bilo to na butoni ili label-i
	    frame.setLocationRelativeTo(null);             //chrez setLocationRelativeTo(null) prozoreca shte izliza po sredata
	                                                   // na nashiq ekran na komputura
	    
	    JButton readingButton = new JButton("READING");  
	    readingButton.setBounds(145, 170, 110, 40);
	    Color lightYellow = new Color(255,255,204);    //chrez klasa Color suzdavam cvetove kato polzvam RGB kodove (red,green,blue)
	    readingButton.setBackground(lightYellow);      //zadavam cveta da zapulva butonut
	    Color colorBtn = new Color(255,102,102);
	    readingButton.setForeground(colorBtn);         //zadavam drugiq cvqt da ocveti tekstut v butona
	    frame.getContentPane().add(readingButton);
	    readingButton.addActionListener(new ActionListener(){        //zadavam kakvo deistvie da izvurshi butonut
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                            //taka zatvarqm dosegashniq prozorec(MainWindow)
	            ReadingWindow readingWindow = new ReadingWindow();  //suzdavam obekt ot klasa ReadingWindow, koito 
	            readingWindow.showWindow();                         //da izvika svoq metod showWindow();
	        }  
	    }); 
	    
	    JButton watchingButton = new JButton("WATCHING");
	    watchingButton.setBounds(145,230,110, 40);
	    watchingButton.setBackground(lightYellow);            
	    watchingButton.setForeground(colorBtn);
	    frame.getContentPane().add(watchingButton);
	    watchingButton.addActionListener(new ActionListener(){   //po sushtiq nachin kato readingButton-a
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            WatchingWindow watchingWindow = new WatchingWindow();
	            watchingWindow.showWindow();
	        }  
	    }); 
	    
	   
	    JButton smthUnusualButton = new JButton("SOMETHING RATHER UNUSUAL");
	    smthUnusualButton.setBounds(85, 292, 230, 40);
	    Color colorBtn1 = new Color(255,70,70);
	    smthUnusualButton.setBackground(colorBtn1);
	    smthUnusualButton.setForeground(Color.PINK);             //i otnovo za posledniq ni buton 
	    frame.getContentPane().add(smthUnusualButton);
	    smthUnusualButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	            SmthUnusualWindow smthUnusualWindow = new SmthUnusualWindow();
	            smthUnusualWindow.showWindow();
	        }  
	    }); 
	    
	    Picture pic = new Picture("What do you.png",0,0,400,500,frame);  //chrez suzdadeniq ot men klas Picture 
	    pic.addImage();                                                  //i negoviq metod addImage slagam snimka za fon
		 
	    frame.setVisible(true);              //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
		
	}
	
}
