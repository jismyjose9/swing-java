package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bodymass {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bodymass window = new bodymass();
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
	public bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 414, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel L1 = new JLabel("Body Mass Index");
		L1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		L1.setBounds(125, 11, 166, 24);
		panel.add(L1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(10, 89, 381, 223);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel L2 = new JLabel("Height(m)");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L2.setBounds(30, 11, 90, 19);
		panel_1.add(L2);
		
		JLabel L3 = new JLabel("Weight(kg)");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L3.setBounds(30, 41, 72, 14);
		panel_1.add(L3);
		
		JLabel L4 = new JLabel("BMI");
		L4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		L4.setBounds(30, 66, 46, 14);
		panel_1.add(L4);
		
		T1 = new JTextField();
		T1.setBounds(193, 10, 86, 20);
		panel_1.add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(193, 38, 86, 20);
		panel_1.add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(100, 66, 86, 20);
		panel_1.add(T3);
		T3.setColumns(10);
		
		JLabel L5 = new JLabel("");
		L5.setBounds(234, 68, 90, 14);
		panel_1.add(L5);
		
		JButton B1 = new JButton("calculate");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h=T1.getText();
				String w=T2.getText();				
				float hi=Float.parseFloat(h);
				float we=Float.parseFloat(w);
				float ans=we/(hi*hi);
				String an=String.valueOf(ans);
				T3.setText(an);
				if(ans<18.5)
				{
					L5.setText("UnderWeight");
				}
				else if(ans>18.5 && ans<24.9)
				{
					L5.setText("Normal Weight");
				}
				else if(ans>25 && ans<29.9)
				{
					L5.setText("over Weight");
				}
				else
				{
					L5.setText(" obese");
				}
				
				
			}
		});
		B1.setBounds(41, 127, 82, 23);
		panel_1.add(B1);
		
		JButton B2 = new JButton("clear");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1.setText("");
				T2.setText("");
				T3.setText("");
				
			}
		});
		B2.setBounds(147, 127, 65, 23);
		panel_1.add(B2);
		
		JButton B3 = new JButton("Exit");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		B3.setBounds(234, 127, 59, 23);
		panel_1.add(B3);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 323, 381, 130);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.PINK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normal Weight", "Over Weight", "Obese"},
				{"> 18.5", "18.5 to 24.9", "25 to 29.9", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(29, 87, 342, 32);
		panel_2.add(table);
	}
}
