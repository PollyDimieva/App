package app;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoviesWindow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showWindow();
	}

	public static void showWindow() {
		JFrame frame = new JFrame("Watching movies...");      //analogichno na vseki prozorec 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //obqsneno podrobno v MainWindow klasa
		frame.setSize(410,535);
	    frame.getContentPane().setLayout(null);
	    frame.setLocationRelativeTo(null);
	    frame.getContentPane().setBackground(Color.WHITE);

	    
	    setButton("Action",160,185,80,25,frame);  //izpozvam metoda setButton ot po-dolu
	    setButton("Fantasy",160,220,80,25,frame);  // za da suzdam po-lesno i burzo novite butoni
	    setButton("Drama",160,290,80,25,frame);
	    setButton("Romance",155,255,90,25,frame);
	    setButton("Horror",70,255,80,25,frame);
	    setButton("Comedy",250,255,80,25,frame);
	    setButton("Mystery",160,325,80,25,frame);
	    
	    
	    
	    JButton back = new JButton("Go back");   //back button
	    back.setBounds(145, 370, 110, 40);      
	    Color color = new Color(60,0,150);
	    back.setBackground(color);
	    back.setForeground(Color.PINK);
	    frame.getContentPane().add(back);
	    back.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                  //za da se vurnem nazad trqbva da zatvorim segashniq frame
	            WatchingWindow watchWindow = new WatchingWindow(); //suzdavame obekt ot predishniq klas
	            watchWindow.showWindow();                          //chrez metoda mu showWindow(); go "otvarqme"
	        }  
	    }); 

	    Picture pic1 = new Picture("MoviesChoice.jpg",0,0,400,500,frame);  //chrez suzdadeniq ot men klas Picture 
	    pic1.addImage();                                                   //i negoviq metod addImage slagam snimka za fon
	  
	    
	    frame.setVisible(true);            //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
	}
	
	public static void colorOfTextInButton(int red,int green, int blue, JButton button) {
		Color foregroundColor = new Color(red,green,blue);
		button.setForeground(foregroundColor);
	}
	public static void colorOfButton(int red,int green, int blue, JButton button) {
		Color backgroundColor = new Color(red,green,blue);
		button.setBackground(backgroundColor);
	}
	//chrez tezi metodi si pravq dvata cvqta, v koito se ocvetq butonite za vsichki janri
	
	
	public static void setButton(String nameOfButton,int x,int y,int width,int heigth, JFrame frame) {
   //tozi metod suzdava butonut s negovite parametri - ime,koordinati,razmeri,frame
	    JButton Button = new JButton(nameOfButton);
	    Button.setBounds(x, y, width, heigth);
	    colorOfButton(153,204,255,Button);             //izpolzvam metodite ot po-gore
	    colorOfTextInButton(60,0,150,Button);
	    frame.getContentPane().add(Button);
        Button.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	           if(nameOfButton == "Action") {          //kogato imeto na butona suvpada sus Stringa "Action",to tova e nashiqt janr
	        	   Genre action = new Genre("Action",  //chrez klasa Genre zadavam vseki buton kakuv nov prozorec shte otvori
	        			   "Black Panther (2018)",     //kakvi filmi shte sudurja vseki janr 
	        			   "Avengers: Endgame (2019)",
	        			  " Mission: Impossible - Fallout (2018)",
	        			   "Mad Max: Fury Road (2015)",
	        			   "Spider-Man: Into the Spider-Verse (2018)", "MoviesWindow.png" //kakvo fonovo izobrajenie shte ima
);
		        	
		        	action.displayWindow();   
//chrez metoda showWindow(); ,koito vseki obekt ot klasa Genre ima, otvarqme sledvashtiq(posleden) prozorec
		        	
		        	
	           }else if (nameOfButton == "Comedy") {  //i taka za vsichki filmovi janri
	        	   Genre comedy = new Genre("Comedy",
	        			   "The General (1926)",
	        			   "It Happened One Night (1934)",
	        			   "Bridesmaids (2011)",
	        			   "Eighth Grade (2018)",
	        			   "We're the Millers (2013)","MoviesWindow.png");
		        	
		        	comedy.displayWindow();
	           }else if (nameOfButton == "Drama") {
	        	   Genre drama2 = new Genre("Drama",
	        			   "Parasite (Gisaengchung) (2019)",
		        			  " Moonlight (2016)",
		        			  " A Star Is Born (2018)",
		        			  " The Shape of Water (2017)",
		        			  " Marriage Story (2019)","MoviesWindow.png");
		        	
		        	drama2.displayWindow();
	           }else if (nameOfButton == "Fantasy") {
	        	   Genre fantasy2 = new Genre("Fantasy",
	        			   "The Lord of the Rings Trilogy",
	        			   "Metropolis (2016)",
	        			   "Gravity (2013)",
	        			  " Pan's Labyrinth (2006)",
	        			   "The Shape of Water (2017)","MoviesWindow.png");
		        	
		        	fantasy2.displayWindow();
	           }else if (nameOfButton == "Horror") {
	        	   Genre horror = new Genre("Horror",
	        			  " Host (2020)",
	        			  " Saw (2004)",
	        			  " The Birds (1963)",
	        			  " Dawn of the Dead (1978)",
	        			  " Shaun of the Dead (2004)","MoviesWindow.png");
		        	
		        	horror.displayWindow();
	           }else if (nameOfButton == "Romance") {
	        	Genre romance2 = new Genre("Romance",
	        			"Titanic (1997)",
	        			"La La Land(2016)",
	        			"The Vow (2012)",
	        			"The Notebook (2004)",
	        			"Carol (2015)","MoviesWindow.png");
	        	
	        	romance2.displayWindow();
	        	
	        	
	        	
	           }else if (nameOfButton == "Mystery") {
	        	   Genre mystery = new Genre("Mystery",
	        			  " Knives Out (2019)",
	        			  " The Girl With the Dragon Tattoo (2011)",
	        			  " Before I Go to Sleep (2014)",
	        			  " Kiss the Girls (1997)",
	        			  " The Girl on the Train (2016)","MoviesWindow.png"
	        			  );
		        	
		        	mystery.displayWindow();
	           }

    	}
         });
	}
}
	

