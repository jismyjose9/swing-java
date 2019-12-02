package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

public class grade {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JTextField T8;
	private JTextField T9;
	private JTextField T10;
	private JTextField T11;
	private JTextField T12;
	private JTextField T13;
	private JTextField T14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					grade window = new grade();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public grade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 765, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel P1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, P1, 11, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, P1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, P1, 288, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, P1, 393, SpringLayout.WEST, frame.getContentPane());
		P1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		P1.setBackground(Color.GRAY);
		P1.setForeground(Color.GRAY);
		frame.getContentPane().add(P1);
		P1.setLayout(null);
		
		JLabel L1 = new JLabel("Student ID");
		L1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L1.setBounds(10, 28, 71, 14);
		P1.add(L1);
		
		T1 = new JTextField();
		T1.setBounds(78, 25, 86, 20);
		P1.add(T1);
		T1.setColumns(10);
		
		JLabel L2 = new JLabel("Firstname");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L2.setBounds(10, 63, 56, 14);
		P1.add(L2);
		
		T2 = new JTextField();
		T2.setBounds(78, 60, 86, 20);
		P1.add(T2);
		T2.setColumns(10);
		
		JLabel L3 = new JLabel("Surname");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L3.setBounds(10, 97, 56, 14);
		P1.add(L3);
		
		T3 = new JTextField();
		T3.setBounds(78, 94, 86, 20);
		P1.add(T3);
		T3.setColumns(10);
		
		JLabel L4 = new JLabel("Course code");
		L4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L4.setBounds(10, 128, 71, 14);
		P1.add(L4);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"11103A", "11102B", "11102C"}));
		C1.setBounds(78, 125, 86, 20);
		P1.add(C1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 165, 162, 2);
		P1.add(separator);
		
		JLabel L5 = new JLabel("Total Score");
		L5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L5.setBounds(10, 178, 71, 14);
		P1.add(L5);
		
		T4 = new JTextField();
		T4.setBounds(78, 178, 86, 20);
		P1.add(T4);
		T4.setColumns(10);
		
		JLabel L6 = new JLabel("Average");
		L6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L6.setBounds(10, 211, 63, 14);
		P1.add(L6);
		
		T5 = new JTextField();
		T5.setBounds(78, 208, 86, 20);
		P1.add(T5);
		T5.setColumns(10);
		
		JLabel L7 = new JLabel("Ranking");
		L7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L7.setBounds(10, 236, 56, 14);
		P1.add(L7);
		
		T6 = new JTextField();
		T6.setBounds(78, 233, 86, 20);
		P1.add(T6);
		T6.setColumns(10);
		
		JLabel L8 = new JLabel("Maths");
		L8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L8.setBounds(204, 28, 56, 14);
		P1.add(L8);
		
		T7 = new JTextField();
		T7.setBounds(270, 25, 86, 20);
		P1.add(T7);
		T7.setColumns(10);
		
		JLabel L9 = new JLabel("English");
		L9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L9.setBounds(204, 63, 56, 14);
		P1.add(L9);
		
		T8 = new JTextField();
		T8.setBounds(270, 60, 86, 20);
		P1.add(T8);
		T8.setColumns(10);
		
		JLabel L10 = new JLabel("Biology");
		L10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L10.setBounds(203, 97, 46, 14);
		P1.add(L10);
		
		T9 = new JTextField();
		T9.setBounds(270, 94, 86, 20);
		P1.add(T9);
		T9.setColumns(10);
		
		JLabel L11 = new JLabel("Computer");
		L11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L11.setBounds(203, 128, 57, 14);
		P1.add(L11);
		
		T10 = new JTextField();
		T10.setBounds(270, 125, 86, 20);
		P1.add(T10);
		T10.setColumns(10);
		
		JLabel L12 = new JLabel("Chemistry");
		L12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L12.setBounds(204, 159, 56, 14);
		P1.add(L12);
		
		T11 = new JTextField();
		T11.setBounds(270, 156, 86, 20);
		P1.add(T11);
		T11.setColumns(10);
		
		JLabel L13 = new JLabel("Physics");
		L13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L13.setBounds(204, 184, 46, 14);
		P1.add(L13);
		
		T12 = new JTextField();
		T12.setBounds(270, 187, 86, 20);
		P1.add(T12);
		T12.setColumns(10);
		
		JLabel L14 = new JLabel("Tamil");
		L14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L14.setBounds(203, 211, 46, 14);
		P1.add(L14);
		
		T13 = new JTextField();
		T13.setBounds(270, 211, 86, 20);
		P1.add(T13);
		T13.setColumns(10);
		
		JLabel L15 = new JLabel("Malayalam");
		L15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L15.setBounds(197, 236, 71, 14);
		P1.add(L15);
		
		T14 = new JTextField();
		T14.setBounds(270, 236, 86, 20);
		P1.add(T14);
		T14.setColumns(10);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 11, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 403, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 323, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 739, SpringLayout.WEST, frame.getContentPane());
		panel.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 316, 235);
		panel.add(textArea);
		
		JButton B1 = new JButton("Clear");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
			
		});
		B1.setBounds(131, 267, 82, 23);
		panel.add(B1);
		
		JButton B2 = new JButton("Add Report");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=T1.getText();
				String fn=T2.getText();
				String sn=T3.getText();
				String cc=(String)C1.getSelectedItem();
				String m=T7.getText();
				String en=T8.getText();
				String b=T9.getText();
				String co=T10.getText();
				String che=T11.getText();
				String ph=T12.getText();
				String ta=T13.getText();
				String ma=T14.getText();
				
				float m1=Float.parseFloat(m);
				float en1=Float.parseFloat(en);
				float b1=Float.parseFloat(b);
				float co1=Float.parseFloat(co);
				float che1=Float.parseFloat(che);
				float ph1=Float.parseFloat(ph);
				float ta1=Float.parseFloat(ta);
				float ma1=Float.parseFloat(ma);
				float tot=(float)(m1+en1+b1+co1+che1+ph1+ta1+ma1);
				
				float avg=(float)(tot)/8;
				String R=" ";
				
				if(tot>700)
				{
					R="1";
					
				}
				else if(tot>=600 && tot<700)
				{
					R="2";
					
				}
				else if (tot>=500 && tot<600)
				{
					R="3";
					
				}
				else if (tot>=400 && tot<500)
				{
					R="4";
					
				}
				else if (tot<400)
				{
					R="Fail";
					
				}
				
				String tot1=String.valueOf(tot);
				String avg1=String.valueOf(avg);
				String[] row= {sid,cc,m,en,b,co,che,ph,ta,ma,tot1,avg1,R};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
				T4.setText(tot1);
				T5.setText(avg1);
				T6.setText(R);
				
			  
			  
			    
				
				
				
				     
				
				
				
			}
		});
		B2.setForeground(Color.RED);
		B2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		springLayout.putConstraint(SpringLayout.WEST, B2, 113, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, B2, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("Delete");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
				
						
			}
		});
		B3.setForeground(Color.MAGENTA);
		B3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		springLayout.putConstraint(SpringLayout.NORTH, B3, 0, SpringLayout.NORTH, B2);
		springLayout.putConstraint(SpringLayout.WEST, B3, 25, SpringLayout.EAST, B2);
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("Show Report");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+T2.getText()+" "+T3.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + T7.getText()
						+ "\nEnglish:\t\t" + T8.getText()
						+ "\nBiology:\t\t" + T9.getText()
						+ "\nComputer:\t\t" + T10.getText()
						+ "\nChemistry:\t\t" + T11.getText()
						+ "\nPysics:\t\t" + T12.getText()
						+ "\nTamil:\t\t" + T13.getText()
						+ "\nMalayalam:\t\t" + T14.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + T4.getText()
						+ "\nAverage:\t\t" + T5.getText()
						+ "\nRanking:\t\t" + T6.getText() + "\n");

			}
		});
		B4.setForeground(Color.BLACK);
		B4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		springLayout.putConstraint(SpringLayout.NORTH, B4, 0, SpringLayout.NORTH, B2);
		springLayout.putConstraint(SpringLayout.WEST, B4, 26, SpringLayout.EAST, B3);
		frame.getContentPane().add(B4);
		
		JButton B5 = new JButton("Exit");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		B5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		springLayout.putConstraint(SpringLayout.NORTH, B5, 0, SpringLayout.NORTH, B2);
		springLayout.putConstraint(SpringLayout.WEST, B5, 8, SpringLayout.EAST, B4);
		frame.getContentPane().add(B5);
		
		JButton B6 = new JButton("Reset");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				T5.setText("");
				T6.setText("");
				T7.setText("");
				T8.setText("");
				T9.setText("");
				T10.setText("");
				T11.setText("");
				T12.setText("");
				T13.setText("");
				T14.setText("");
				
			}
		});
		B6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		springLayout.putConstraint(SpringLayout.WEST, B6, 17, SpringLayout.EAST, B5);
		springLayout.putConstraint(SpringLayout.SOUTH, B6, 0, SpringLayout.SOUTH, B2);
		frame.getContentPane().add(B6);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"student_id", "course_name", "maths", "english", "biology", "computer", "chemistry", "physics", "tamil", "malayalam", "total", "average", "ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		springLayout.putConstraint(SpringLayout.NORTH, table, 28, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, table, 0, SpringLayout.WEST, P1);
		springLayout.putConstraint(SpringLayout.SOUTH, table, -6, SpringLayout.NORTH, B2);
		springLayout.putConstraint(SpringLayout.EAST, table, -21, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(table);
	}
}
