package Presentation;


import javax.swing.*;
import java.awt.*;

public class Facade extends JFrame{
    JFrame frame;
    JLabel image=new JLabel(new ImageIcon("C:\\Users\\ADMIN\\Desktop\\Checling Project\\CodingHUB\\src\\Presentation\\logo.png"));
    JLabel text=new JLabel("ہجے چیکر");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
   
    Facade()
    {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
       addImage();
       
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
        ScondeScreen sc=new ScondeScreen();
        sc.frame.setVisible(true);
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        

    }
    public void addImage(){
        //image.setSize(600,400);
        image.setBounds(100,100,400,400);
        frame.add(image);
    }
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(220,20,600,40);
        text.setForeground(Color.WHITE);
        frame.add(text);
    }
    public void addMessage()
    {
        message.setBounds(250,340,200,40);//Setting the size and location of the label
        message.setForeground(Color.black);//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.add(message);//adding label to the frame
    }
    public void addProgressBar(){
        progressBar.setBounds(100,300,400,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0

        while( i<=100)
        {
            try{
                Thread.sleep(50);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }



        }
      
    }
}