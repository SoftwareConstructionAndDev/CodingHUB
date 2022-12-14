package Presentation;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import BussinessLogic.CheckWords;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Hilight1 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private static JScrollPane Scoll;
	JComboBox comboBox;
	private JComboBox comboBox_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hilight1 frame = new Hilight1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Hilight1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 666);
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

		JButton btnNewButton = new JButton("Test Paragraph");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textArea.getText().isEmpty()) {

				} else {
					comboBox.removeAllItems();
					comboBox_1.removeAllItems();

					textArea.setText(textArea.getText());
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

		btnNewButton.setBounds(71, 230, 125, 47);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Spell Checker");
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(299, 10, 249, 62);
		contentPane.add(lblNewLabel);

		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Snap ITC", Font.BOLD, 26));
		lblResult.setBounds(365, 302, 112, 47);
		contentPane.add(lblResult);

		JButton btnNewButton_1 = new JButton("Clear Fields");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				textArea.setText(null);

			}
		});
		btnNewButton_1.setBounds(760, 346, 125, 41);
		contentPane.add(btnNewButton_1);

		comboBox = new JComboBox();
		comboBox.setBounds(760, 427, 125, 41);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(760, 499, 125, 39);
		contentPane.add(comboBox_1);

		JButton btnNewButton_2 = new JButton("Replace Word");
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
		btnNewButton_2.setBounds(760, 566, 125, 41);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("Error Words");
		lblNewLabel_1.setBounds(760, 404, 91, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Real Word");
		lblNewLabel_2.setBounds(760, 476, 91, 13);
		contentPane.add(lblNewLabel_2);

	}
}
