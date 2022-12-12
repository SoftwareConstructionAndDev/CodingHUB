package Presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import BussinessLogic.CheckWords;

@SuppressWarnings("serial")
public class Hilight extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private static JScrollPane Scoll;
	JComboBox comboBox;
	private JComboBox comboBox_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hilight frame = new Hilight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Hilight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(241, 249 ,130));
		contentPane.setForeground(new Color(150, 150 ,150));
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Scoll = new JScrollPane();

		Scoll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Scoll.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		Scoll.setBounds(71, 70, 679, 153);
		contentPane.add(Scoll);
		Scoll.setViewportView(textArea);
		getContentPane().add(Scoll);

		textArea = new JTextArea();
		textArea.setTabSize(14);
		Scoll.setViewportView(textArea);

		JButton btnNewButton = new JButton("Spell Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textArea.getText().isEmpty()) {

				} else {
					comboBox.removeAllItems();
					comboBox_1.removeAllItems();

					
					CheckWords obj = new CheckWords();

					obj.String_Breaker(textArea.getText());
					if (obj.check_List()) {
						obj.Hilight(textArea, 1);
						obj.Hilight2(textArea, comboBox);
						String Nword = obj.Word((String) comboBox.getSelectedItem());
						comboBox_1.addItem(Nword);

					} else {
						JOptionPane.showMessageDialog(null, "Text is Clean !");
					}
				}
			}
		});
		
		

		btnNewButton.setBounds(71, 245, 125, 47);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Text Area Field");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 26));
		lblNewLabel.setBounds(299, 10, 301, 62);
		contentPane.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.setBounds(206, 248, 125, 41);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(341, 249, 125, 39);
		contentPane.add(comboBox_1);

		JButton btnNewButton_2 = new JButton("change Word");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				comboBox_1.removeAllItems();

				CheckWords obj = new CheckWords();
				String Nword = obj.Word((String) comboBox.getSelectedItem());
				comboBox_1.addItem(Nword);
				obj.String_Breaker2(textArea.getText(), (String) comboBox.getSelectedItem(), Nword);
				obj.setTextArea(textArea);
				comboBox.removeAllItems();

				if (obj.check_List()) {
					obj.Hilight(textArea, 2);
					obj.Hilight2(textArea, comboBox);

				} else {
					JOptionPane.showMessageDialog(null, "Text is Clean !");
				}

			}
		});
		btnNewButton_2.setBounds(476, 248, 125, 41);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("Mutants");
		lblNewLabel_1.setBounds(206, 233, 91, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Word");
		lblNewLabel_2.setBounds(347, 233, 91, 13);
		contentPane.add(lblNewLabel_2);
		JButton back= new JButton("Back");
		contentPane.add(back);
		back.setBounds(380, 290, 50, 50);
		back.addActionListener(new ActionListener() {

	           @Override
	           public void actionPerformed(ActionEvent e) {
	           	
	           	ScondeScreen sc=new ScondeScreen();
	           sc.setVisible(true);
	           Hilight h=new Hilight();
	           
	        	
	           }
	       });
		
	}
}