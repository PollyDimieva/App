package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Genre {

	String name;                          //imeto na janra naprimer Comedy                
	String[] elements = new String[5];    //5 elementa toest ili knigi, ili seriali, ili filmi ot dadeniq janr
	String image;                         //fonovoto izobrajenie koeto shte suotvetstva na suzdadeniq nov prozorec
	
	
	Genre(String name,String e1, String e2, String e3, String e4, String e5, String image) {
		this.name=name;                   //trqbva da se vuvedat 7 Stringa  - ime, 5 elementa ot janra, imeto na snimkata za fon
		elements[0]=e1;                   //konstuktor
		elements[1]=e2;
		elements[2]=e3;
		elements[3]=e4;
		elements[4]=e5;
		this.image=image;
	}

	public String chooseElement() {        
		int range = 5;                      
			
		int i = (int)(Math.random()*range); //taka izbiram edno random chislo i
		                                    //obiknoveno metoda Math.random vrushta stoinost double i zatova go kastvame kum int
		
		return elements[i];                 //metodut vrushta Stringa s nomer random izbranoto i izmejdu 5-te
		
	}
	public void displayWindow() {                            
		JFrame frame = new JFrame("!!! "+name+ " !!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    
	    String chosenElement = chooseElement();    //suzdavam String chrez metoda chooseElement
    
	    JLabel label = new JLabel();               //prazen label 
	    label.setBounds(100, 215, 250, 60); 
	    Color color = new Color(180,255,255);
	    label.setForeground(color);
	    frame.getContentPane().add(label);
	    
	    JButton actionBtn = new JButton("Try your luck!");
	    actionBtn.setBounds(140, 180, 120, 30);
	    Color color1 = new Color(255,70,70);
	    Color color2 = new Color(255,255,153);
	    actionBtn.setBackground(color1);
	    actionBtn.setForeground(color2);
	    frame.getContentPane().add(actionBtn);
	    actionBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		label.setText(chosenElement);   //sled natiskane na butonut label-ut sudirja random Stringa 
	    
	    	}
	    });
	   
	    
	    JButton actionBtn2 = new JButton("Try again");
	    actionBtn2.setBounds(150, 300, 100, 30);
	    actionBtn2.setForeground(color1);
	    actionBtn2.setBackground(color2);
	    frame.getContentPane().add(actionBtn2);
	    actionBtn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chooseElement();
	    		String newChosenElement = chooseElement();  //suzdavam nov String chrez metoda chooseElement();
	    		label.setText(newChosenElement);            //sled natiskane na butonut label-ut sudurja noviq random String
	    		frame.repaint();                            //chrez repaint pri vsqko novo natiskane na butona she se izbira sledvasht nov String chrez chooseElement();
	    
	    	}
	    });
	    
	    
	    JButton back = new JButton("Go back");
	    back.setBounds(160, 400, 80, 30);
	    Color color3 = new Color(0,76,153);
	    back.setBackground(color3);
	    back.setForeground(color2);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){    
	            frame.setVisible(false);                   
	            MainWindow mainWindow = new MainWindow();  //butonut shte vrushta potrebitelqt v nai-purviq MainWindow
	            mainWindow.showWindow();                  
	        }  
	    }); 
	    
	    Picture pic = new Picture(image,0,0,400,500,frame);//chrez suzdadeniq ot men klas Picture 
	    pic.addImage();                                    //i negoviq metod addImage slagam snimka za fon
	    
	
	    
	    frame.setVisible(true);    //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
	}
	
}
