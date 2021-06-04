package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWindow {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        showWindow();                                //vseki prozorec ot programata si ima metod showWindow
		}
	    
		public static void showWindow() {
			JFrame frame = new JFrame("Parking spaces");  //kakvo pishe v gorniq ugul na frame-a
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             //exit operation
		    frame.setSize(800,600);                        //razmera na nasheto prozorche
		    frame.getContentPane().setLayout(null);        //polzvam Layout null za da moga chrez setBounds(x,y,width,height) 
		                                                   //da vuveda koordinatite bilo to na butoni ili label-i
		    frame.setLocationRelativeTo(null);             //chrez setLocationRelativeTo(null) prozoreca shte izliza po sredata
		                                                   // na nashiq ekran na komputura
		    
		    JLabel lbl = new JLabel("Parking space ¹ ");
		    lbl.setBounds(100, 50, 150, 20);
		    frame.getContentPane().add(lbl);
		    
		    JLabel lbl2 = new JLabel("Area:  ");
		    lbl2.setBounds(100, 100, 150, 20);
		    frame.getContentPane().add(lbl2);
		    
		    JLabel label = new JLabel("Username: ");
		    label.setBounds(100, 150, 150, 20);
		    frame.getContentPane().add(label);
		    
		    JTextArea txt = new JTextArea();
		    txt.setBounds(200, 150, 250, 20);
		    frame.getContentPane().add(txt);
		    
		    JLabel label1 = new JLabel("Description: ");
		    label1.setBounds(100, 200, 150, 20);
		    frame.getContentPane().add(label1);
		    
		    JTextArea txt1 = new JTextArea();
		    txt1.setBounds(200, 200, 250, 100);
		    txt1.setLineWrap(true);
		    frame.getContentPane().add(txt1);
		    
		    JLabel lbl3 = new JLabel("Insert number of parking space:  ");
		    lbl3.setBounds(300, 370, 250, 20);
		    frame.getContentPane().add(lbl3);
		    
		    JTextArea txt2 = new JTextArea();
		    txt2.setBounds(485, 370, 45, 20);
		    frame.getContentPane().add(txt2);
		    
		    JButton button = new JButton("Previous");  
		    button.setBounds(100, 450, 110, 40);
		    Color lightYellow = new Color(255,255,204);    //chrez klasa Color suzdavam cvetove kato polzvam RGB kodove (red,green,blue)
		    button.setBackground(lightYellow);      //zadavam cveta da zapulva butonut
		    Color colorBtn = new Color(255,102,102);
		    button.setForeground(colorBtn);         //zadavam drugiq cvqt da ocveti tekstut v butona
		    frame.getContentPane().add(button);
		    button.addActionListener(new ActionListener(){        //zadavam kakvo deistvie da izvurshi butonut
		    	public void actionPerformed(ActionEvent e){  
		            frame.setVisible(false);                            //taka zatvarqm dosegashniq prozorec(MainWindow)
		          //  ReadingWindow readingWindow = new ReadingWindow();  //suzdavam obekt ot klasa ReadingWindow, koito 
		          //  readingWindow.showWindow();                         //da izvika svoq metod showWindow();
		        }  
		    }); 
		    
		    JButton watchingButton = new JButton("Next");
		    watchingButton.setBounds(600,450,110, 40);
		    watchingButton.setBackground(lightYellow);            
		    watchingButton.setForeground(colorBtn);
		    frame.getContentPane().add(watchingButton);
		    watchingButton.addActionListener(new ActionListener(){   //po sushtiq nachin kato readingButton-a
		    	public void actionPerformed(ActionEvent e){  
		            frame.setVisible(false);
		          //  WatchingWindow watchingWindow = new WatchingWindow();
		          //  watchingWindow.showWindow();
		        }  
		    }); 
		    
		   
		    JButton smthUnusualButton = new JButton("Save changes");
		    smthUnusualButton.setBounds(300, 450, 230, 40);
		    Color colorBtn1 = new Color(255,70,70);
		    smthUnusualButton.setBackground(colorBtn1);
		    smthUnusualButton.setForeground(Color.PINK);             //i otnovo za posledniq ni buton 
		    frame.getContentPane().add(smthUnusualButton);
		    smthUnusualButton.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		            frame.setVisible(false);
		         //   SmthUnusualWindow smthUnusualWindow = new SmthUnusualWindow();
		          //  smthUnusualWindow.showWindow();
		        }  
		    }); 
		    
		    JButton button1 = new JButton("Search");  
		    button1.setBounds(360, 400, 110, 40);
		   // Color lightYellow = new Color(255,255,204);    //chrez klasa Color suzdavam cvetove kato polzvam RGB kodove (red,green,blue)
		   // button1.setBackground(lightYellow);      //zadavam cveta da zapulva butonut
		  //  Color colorBtn = new Color(255,102,102);
		  //  button1.setForeground(colorBtn);         //zadavam drugiq cvqt da ocveti tekstut v butona
		    frame.getContentPane().add(button1);
		    
		                                               
		    frame.setVisible(true);              //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
			
		}
		
	}
	

