package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class ticket {
	static int id=500;
    public int R;
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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 760, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel P1 = new JPanel();
		P1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P1.setForeground(new Color(0, 0, 0));
		P1.setBounds(215, 11, 335, 46);
		frame.getContentPane().add(P1);
		P1.setLayout(null);
		
		JLabel L1 = new JLabel("Ticket Booking");
		L1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		L1.setBounds(97, 11, 176, 24);
		P1.add(L1);
		
		JPanel P2 = new JPanel();
		P2.setBorder(new TitledBorder(null, "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		P2.setBounds(301, 68, 433, 297);
		frame.getContentPane().add(P2);
		P2.setLayout(null);
		
		JLabel L6 = new JLabel("Name");
		L6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		L6.setBounds(25, 45, 46, 14);
		P2.add(L6);
		
		T5 = new JTextField();
		T5.setBounds(106, 44, 86, 20);
		P2.add(T5);
		T5.setColumns(10);
		
		JLabel L7 = new JLabel("From");
		L7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L7.setBounds(25, 98, 46, 14);
		P2.add(L7);
		
		T6 = new JTextField();
		T6.setBounds(106, 95, 86, 20);
		P2.add(T6);
		T6.setColumns(10);
		
		JLabel L8 = new JLabel("To");
		L8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L8.setBounds(25, 135, 46, 14);
		P2.add(L8);
		
		T7 = new JTextField();
		T7.setBounds(106, 132, 86, 20);
		P2.add(T7);
		T7.setColumns(10);
		
		JLabel L9 = new JLabel("Date");
		L9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L9.setBounds(25, 175, 46, 14);
		P2.add(L9);
		
		T8 = new JTextField();
		T8.setBounds(106, 172, 86, 20);
		P2.add(T8);
		T8.setColumns(10);
		
		JLabel L10 = new JLabel("Time");
		L10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L10.setBounds(25, 208, 46, 14);
		P2.add(L10);
		
		T9 = new JTextField();
		T9.setBounds(106, 205, 86, 20);
		P2.add(T9);
		T9.setColumns(10);
		JRadioButton R4 = new JRadioButton("First class");
		R4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R4.setBounds(6, 176, 78, 23);
		frame.getContentPane().add(R4);
		
		JRadioButton R5 = new JRadioButton("AC");
		R5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R5.setBounds(86, 176, 46, 23);
		frame.getContentPane().add(R5);
		
		JRadioButton R6 = new JRadioButton("Sleeper");
		R6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R6.setBounds(131, 176, 70, 23);
		frame.getContentPane().add(R6);
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(R4);
		G1.add(R5);
		G1.add(R6);
		JComboBox C3 = new JComboBox();
		C3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		C3.setBounds(178, 206, 78, 26);
		frame.getContentPane().add(C3);
		
		
		
		
		
		
		JLabel L11 = new JLabel("Ticket No");
		L11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L11.setBounds(307, 84, 74, 14);
		P2.add(L11);
		
		T10 = new JTextField();
		T10.setBounds(295, 109, 86, 20);
		P2.add(T10);
		T10.setColumns(10);
		
		JLabel L12 = new JLabel("Price");
		L12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L12.setBounds(318, 135, 46, 14);
		P2.add(L12);
		
		T11 = new JTextField();
		T11.setBounds(295, 154, 86, 20);
		P2.add(T11);
		T11.setColumns(10);
		
		JLabel L13 = new JLabel("Route");
		L13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L13.setBounds(318, 178, 46, 14);
		P2.add(L13);
		
		T12 = new JTextField();
		T12.setBounds(295, 205, 86, 20);
		P2.add(T12);
		T12.setColumns(10);
		
		JLabel L2 = new JLabel("Name");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		L2.setBounds(20, 101, 52, 14);
		frame.getContentPane().add(L2);
		
		T1 = new JTextField();
		T1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		T1.setBounds(108, 100, 86, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 126, 264, 2);
		frame.getContentPane().add(separator);
		
		
		
		
		JRadioButton R1 = new JRadioButton("Standard");
		R1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R1.setBounds(10, 135, 78, 23);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("Single Ticket");
		R2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R2.setBounds(90, 135, 108, 23);
		frame.getContentPane().add(R2);
		
		JRadioButton R3 = new JRadioButton("Adult");
		R3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R3.setBounds(200, 135, 74, 23);
		frame.getContentPane().add(R3);
		
		JRadioButton R7 = new JRadioButton("Child");
		R7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		R7.setBounds(200, 176, 70, 23);
		frame.getContentPane().add(R7);
		
		
		ButtonGroup G2=new ButtonGroup();
		G2.add(R1);
		G2.add(R2);
		G2.add(R3);
		G2.add(R7);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"Kollam", "Kottayam", "Ekm"}));
		C1.setBounds(10, 206, 74, 26);
		frame.getContentPane().add(C1);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"Kollam", "Kottayam", "Ekm", ""}));
		C2.setBounds(90, 206, 78, 26);
		frame.getContentPane().add(C2);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 243, 264, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel L3 = new JLabel("Tax");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L3.setBounds(10, 256, 46, 14);
		frame.getContentPane().add(L3);
		
		T2 = new JTextField();
		T2.setBounds(108, 256, 86, 20);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		JLabel L4 = new JLabel("Sub Total");
		L4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L4.setBounds(10, 290, 62, 14);
		frame.getContentPane().add(L4);
		
		T3 = new JTextField();
		T3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		T3.setBounds(108, 287, 86, 20);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		JLabel L5 = new JLabel("Total");
		L5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		L5.setBounds(10, 321, 46, 14);
		frame.getContentPane().add(L5);
		
		T4 = new JTextField();
		T4.setBounds(108, 318, 86, 20);
		frame.getContentPane().add(T4);
		T4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 346, 264, 2);
		frame.getContentPane().add(separator_2);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 378, 724, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.of Seats", "Time", "Date", "AC/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 704, 68);
		panel.add(table);
		
		JButton B1 = new JButton("Total");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Cn=T1.getText();
			String fr=(String)C1.getSelectedItem();
			String to=(String)C2.getSelectedItem();
			
			String b=(String)C3.getSelectedItem();
			float n=Float.parseFloat(b);
			float tax=0,stot=0,tot=0;
			float R=0;
			float Rt,Tt;
			if(fr.equals("Kollam")&&to.equals("Kottayam"))
			{
				R=50;
			}
			else if(fr.equals("Kollam")&&to.equals("Ekm"))
			{
				R=100;
			}
			
			else if(fr.equals("Kottayam")&&to.equals("Kollam"))
			{
				
				R=50;
			}
			else if(fr.equals("Kottayam")&&to.equals("Ekm"))
			{
				R=150;
			}
			else if(fr.equals("Ekm")&&to.equals("Kollam"))
			{
				R=100;
			}
			else if(fr.equals("Kottayam")&&to.equals("Ekm"))
			{
				R=150;
			}
			
			else
			{
				if((fr.equals("Kollam"))&&(to.equals("Kollam")))
				{
				
					JOptionPane.showMessageDialog(null, "Enter valid Destination",
							"Ticket Details ",JOptionPane.OK_OPTION);
				
			   }
				else if(fr.equals("Kottayam")&&to.equals("Kottayam"))
				
		    	{
				
				JOptionPane.showMessageDialog(null, "Enter valid Destination",
						"Ticket Details ",JOptionPane.OK_OPTION);
			
			   }	
				else
				{
			       if(fr.equals("Ekm")&&to.equals("Ekm"))
	         		{
			        	JOptionPane.showMessageDialog(null, "Enter valid Destination",
						"Ticket Details ",JOptionPane.OK_OPTION);
			
		        	}
				}
			}
			if(R4.isSelected())
					
			{
				Rt=(float)(R+(R*0.3));
				Tt=(float)(Rt*0.3);
				tax=(float)(Tt*n);
				stot=(float)(Rt*n);
				tot=(float)(tax+stot);
				
			}
			if(R5.isSelected())
				
			{
				Rt=(float)(R+(R*0.2));
				Tt=(float)(Rt*0.2);
				tax=(float)(Tt*n);
				stot=(float)(Rt*n);
				tot=(float)(tax+stot);
				
			}
			
            if(R6.isSelected())
				
			{
            	Rt=(float)(R);
				Tt=(float)(Rt*0.1);
				tax=(float)(Tt*n);
				stot=(float)(Rt*n);
				tot=(float)(tax+stot);
				
			}
			
            String tax1=String.valueOf(tax);
			String stot1=String.valueOf(stot);
			String tot1=String.valueOf(tot);
			T2.setText(tax1);
			T3.setText(stot1);
			T4.setText(tot1);
			T11.setText(tot1);
			T6.setText(fr);
			T7.setText(to);
			T5.setText(Cn);
			LocalDate m=java.time.LocalDate.now();
			String q=String.valueOf(m);
			T8.setText(q);
			LocalTime u=java.time.LocalTime.now();
			String v=String.valueOf(u);
			T9.setText(v);
			T12.setText("Any");
			
			String id1=String.valueOf(id);
			T10.setText(id1);
			id++;
			
			
				
				
		  }
 });
		B1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		B1.setBounds(6, 349, 78, 23);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("Reset");
		B2.addActionListener(new ActionListener() {
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
				C1.setSelectedIndex(0);
				C2.setSelectedIndex(0);
				C3.setSelectedIndex(0);
				G1.clearSelection();
				G2.clearSelection();
				
				
				
			}
		});
		B2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		B2.setBounds(90, 349, 89, 23);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("Exit");
		B3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		B3.setBounds(189, 349, 86, 23);
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("Confirm");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=T5.getText();
				String data2=T10.getText();
				String data3=T6.getText();
				String data4=T7.getText();
			    String data5=(String)C3.getSelectedItem();
				String data6=T9.getText();
				String data7=T8.getText();
				String data8=" ";
				String data9=T11.getText();
				if(R4.isSelected())
				{
					data8="AC";
					
				}
				else if(R5.isSelected())
				{
					data8="AC";
				}
				else if(R6.isSelected())
				{
					data8="Non AC";
				}
				
				String[] row= {data1,data2,data3,data4,data5,data6,data7,data8,data9};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
			
		 }
});
		B4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		B4.setBounds(185, 246, 89, 23);
		P2.add(B4);	
	
	}
}
