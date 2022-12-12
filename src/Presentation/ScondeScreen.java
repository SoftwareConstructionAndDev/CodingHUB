package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScondeScreen  extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JFrame frame;
   
    JLabel text=new JLabel("Main Screen");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
   public ScondeScreen()
    {
        createGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addText();
        addMessage();
        Button1();
        Button2();
        Button3();
    }
    public void createGUI(){
        frame=new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setVisible(true);

    }
  
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(170,120,600,40);
        text.setForeground(Color.DARK_GRAY);
        frame.add(text);
    }
    public void addMessage()
    {
        message.setBounds(200,220,200,40);//Setting the size and location of the label
        message.setForeground(Color.black);//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.add(message);//adding label to the frame
    }
    
    public void Button1()
    {
    	JButton b = new JButton("Add Mutants");   
   	  // set the position for the button in frame   
 	    b.setBounds(120,230,200,40);    
 	    frame.add(b); 
 	    
 	   b.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
           	Mutants_Generator mg=new Mutants_Generator();
           	ScondeScreen sc=new ScondeScreen();
           mg.setVisible(true);
        	sc.dispose();
        	sc.setVisible(false);
           }
       });
    }
    
    
    public void Button2()
    {
    	JButton b2 = new JButton("Check and Hilights");   
   	  // set the position for the button in frame   
 	    b2.setBounds(350,230,200,40);    
 	    frame.add(b2); 
 	    
 	   b2.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
        		Hilight h=new 	Hilight();
           	ScondeScreen sc=new ScondeScreen();
           h.setVisible(true);
        	sc.dispose();
        	sc.setVisible(false);
           }
       });
    }
   
    public void Button3()
    {
    	JButton b2 = new JButton("Close");   
   	  // set the position for the button in frame   
 	    b2.setBounds(300,290,100,40);    
 	    frame.add(b2); 
 	    
 	   b2.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
           
           //	ScondeScreen h=new 	ScondeScreen();
        	
        	//h.setVisible(false);
        	frame.dispose();
           }
       });
    }
    
}
