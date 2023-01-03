package PresentationLayer;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Bussinesslogic.DataTransfer;
import DataAccess.DataTransferDatabase;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FrontEnd extends JFrame {
	private DefaultTableModel DTM;
	private JPanel contentPane;
	private JTextField adress_box;
	DataTransfer B= new DataTransfer();
	ArrayList St=new ArrayList();
	private JTable table;
	private JTextField DB_word;
	private JTextField newWord;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrontEnd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 674);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Our Spell Checker");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setBounds(28, 10, 307, 108);
		contentPane.add(lblNewLabel);
		
		adress_box = new JTextField();
		adress_box.setBounds(77, 128, 175, 38);
		contentPane.add(adress_box);
		adress_box.setColumns(10);
		
		JButton btnNewButton = new JButton("Upload Paragraph");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File Folders= new File(adress_box.getText());
				File[] xmlfile = Folders.listFiles();
				for(int i=0;i<xmlfile.length;i++) {
					File F=xmlfile[i];
					if(F.isFile()) {
						B.ReadXMLFiles(F);
					}
					
				}
				B.remove_spaces();
				
				
			}
		});
		btnNewButton.setBounds(158, 183, 120, 38);
		contentPane.add(btnNewButton);
		
		JButton btnUploadWord = new JButton("Upload Word");
		btnUploadWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				DataTransfer.removeDuplicates();
			
						
				
			}
		});
		btnUploadWord.setBounds(28, 183, 120, 38);
		contentPane.add(btnUploadWord);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 244, 325, 289);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
					"#","Words","Frequency"
			}
		));
		
		scrollPane.setViewportView(table);
		String[] colName = { "#","Words","Frequency"};
	    DTM = new DefaultTableModel(colName, 0);
		JButton btnNewButton_1 = new JButton("View Words");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				St.clear();
				
				int c=1;
				        St=B.word();
				for (int i = 0; i <St.size();i=i+2)  {
					
					int JTAB0=0;
					int JTAB1=1;
					int JTAB2=2;
					
					Object[] StcJTab = new Object[3];
					StcJTab[JTAB0]=c;
					 StcJTab[JTAB1]= St.get(i+1);
		            StcJTab[JTAB2]= St.get(i);
		            c++;
                        
		        DTM.addRow(StcJTab);
				 }
				 table.setModel(DTM);
			}
		});
		btnNewButton_1.setBounds(106, 543, 124, 21);
		contentPane.add(btnNewButton_1);
		
		DB_word = new JTextField();
		DB_word.setBounds(10, 589, 96, 38);
		contentPane.add(DB_word);
		DB_word.setColumns(10);
		
		newWord = new JTextField();
		newWord.setBounds(116, 589, 101, 38);
		contentPane.add(newWord);
		newWord.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("update word");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w1=DB_word.getText();
				String w2=newWord.getText();
				try {
					DataTransferDatabase.update_Word(w1,w2);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(227, 597, 108, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("DB Word");
		lblNewLabel_1.setBounds(28, 575, 58, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Latest Word");
		lblNewLabel_2.setBounds(134, 575, 71, 13);
		contentPane.add(lblNewLabel_2);
	}
}
