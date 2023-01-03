package Presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BussinessLogic.makeMutant;

public class Mutants_Generator extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mutants_Generator frame = new Mutants_Generator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Mutants_Generator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mutants Generator");
		lblNewLabel.setForeground(new Color(210, 180, 140));
		lblNewLabel.setBackground(new Color(210, 180, 140));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 30));
		lblNewLabel.setBounds(283, 65, 286, 78);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Generate Mutant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				makeMutant M1=new makeMutant();
				M1.Controller();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(210, 105, 30));
		btnNewButton.setBounds(306, 246, 202, 55);
		contentPane.add(btnNewButton);
		
		JButton back= new JButton("Back");
		contentPane.add(back);
		back.setBounds(380, 310, 70, 50);
		back.addActionListener(new ActionListener() {

	           @Override
	           public void actionPerformed(ActionEvent e) {
	           	
	           	ScondeScreen sc=new ScondeScreen();
	           sc.setVisible(true);
	           Hilight h=new Hilight();
	           contentPane.disable();
	        	
	           }
	       });
		
	}

}
