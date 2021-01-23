package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WatchingWindow  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}
    public static void showWindow() {
    	JFrame frame = new JFrame("Watching...");               //analogichno na vseki prozorec 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //obqsneno podrobno v MainWindow klasa
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    frame.getContentPane().setBackground(Color.RED);

	    
	    JButton moviesButton = new JButton("...a MOVIE?");
	    moviesButton.setBounds(190, 180, 110, 50);
	    Color color1=new Color(228,228,81);
	    Color color2=new Color(51,153,153);
	    moviesButton.setBackground(color1);
	    moviesButton.setForeground(color2);
	    frame.getContentPane().add(moviesButton);
	    moviesButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                        //zatvarqme segashniq frame
	            MoviesWindow moviesWindow = new MoviesWindow(); //suzdava obekt ot klasa MoviesWindow
	            moviesWindow.showWindow();                      //otvarqme go chrez metoda mu showWindow();
	        }  
	    }); 
	       
	    JButton seriesButton = new JButton("...SERIES?");
	    seriesButton.setBounds(190, 260,110, 50);
	    seriesButton.setBackground(color2);
	    seriesButton.setForeground(color1);
	    frame.getContentPane().add(seriesButton);
	    seriesButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                        //zatvarqme segashniq frame
	            SeriesWindow seriesWindow = new SeriesWindow(); //suzdava obekt ot klasa SeriesWindow
	            seriesWindow.showWindow();                      //otvarqme go chrez metoda mu showWindow();
	        }  
	    }); 
	    
	    JButton back = new JButton("Go back"); //back button
	    back.setBounds(30, 420, 100, 40);
	    back.setBackground(Color.BLACK);
	    back.setForeground(color1);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                    //zatvarqme segashniq frame
	            MainWindow mainWindow = new MainWindow();   //suzdavame obekt ot klasa na predishniq prozorec
	            mainWindow.showWindow();                    //chrez metoda mu showWindow(); go otvarqme
	        }  
	    }); 
	    
	    Picture pic = new Picture("Watching.png",0,0,400,500,frame);  //chrez suzdadeniq ot men klas Picture 
	    pic.addImage();                                               //i negoviq metod addImage slagam snimka za fon
	    
	  
	    frame.setVisible(true);   //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
    }
}
