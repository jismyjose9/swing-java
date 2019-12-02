package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class hotel {
	public int f=0;
	public String s1,s2,s3;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel window = new hotel();
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
	public hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel P1 = new JPanel();
		P1.setBounds(153, 11, 377, 44);
		frame.getContentPane().add(P1);
		P1.setLayout(null);
		
		JLabel L1 = new JLabel("Hotel Management Systems");
		L1.setFont(new Font("Tahoma", Font.BOLD, 18));
		L1.setBounds(31, 0, 296, 44);
		P1.add(L1);
		
		JPanel P2 = new JPanel();
		P2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P2.setForeground(Color.BLACK);
		P2.setBounds(10, 69, 334, 219);
		frame.getContentPane().add(P2);
		P2.setLayout(null);
		
		JLabel L2 = new JLabel("Chicken Burger");
		L2.setFont(new Font("Tahoma", Font.BOLD, 12));
		L2.setBounds(25, 28, 92, 14);
		P2.add(L2);
		
		T1 = new JTextField();
		T1.setBounds(218, 26, 86, 20);
		P2.add(T1);
		T1.setColumns(10);
		
		JLabel L3 = new JLabel("Chicken Burger Meal");
		L3.setFont(new Font("Tahoma", Font.BOLD, 12));
		L3.setBounds(27, 63, 136, 14);
		P2.add(L3);
		
		T2 = new JTextField();
		T2.setBounds(218, 61, 86, 20);
		P2.add(T2);
		T2.setColumns(10);
		
		JLabel L4 = new JLabel("Chese Burger");
		L4.setFont(new Font("Tahoma", Font.BOLD, 12));
		L4.setBounds(25, 98, 110, 14);
		P2.add(L4);
		
		T3 = new JTextField();
		T3.setBounds(218, 98, 86, 20);
		P2.add(T3);
		T3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(25, 127, 292, 2);
		P2.add(separator);
		
		JLabel L5 = new JLabel("Drink");
		L5.setFont(new Font("Tahoma", Font.BOLD, 12));
		L5.setBounds(35, 140, 46, 14);
		P2.add(L5);
		
		JLabel L6 = new JLabel("Qty");
		L6.setFont(new Font("Tahoma", Font.BOLD, 12));
		L6.setBounds(198, 141, 46, 14);
		P2.add(L6);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "Tea", "Coffee"}));
		C1.setBounds(25, 157, 103, 20);
		P2.add(C1);
		
		T4 = new JTextField();
		T4.setBounds(172, 157, 86, 20);
		P2.add(T4);
		T4.setColumns(10);
		
		JRadioButton R1 = new JRadioButton("Home delivery");
		R1.setFont(new Font("Tahoma", Font.BOLD, 11));
		R1.setBounds(26, 184, 109, 23);
		P2.add(R1);
		
		JRadioButton R2 = new JRadioButton("Tax");
		R2.setFont(new Font("Tahoma", Font.BOLD, 11));
		R2.setBounds(182, 184, 109, 23);
		P2.add(R2);
		
		JPanel P3 = new JPanel();
		P3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P3.setBounds(354, 66, 202, 222);
		frame.getContentPane().add(P3);
		P3.setLayout(null);
		
		JLabel L7 = new JLabel("Currency Converter");
		L7.setFont(new Font("Tahoma", Font.BOLD, 13));
		L7.setBounds(20, 11, 179, 14);
		P3.add(L7);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "India", "Usa"}));
		C2.setBounds(20, 50, 149, 20);
		P3.add(C2);
		
		T5 = new JTextField();
		T5.setBounds(20, 96, 149, 20);
		P3.add(T5);
		T5.setColumns(10);
		JButton B3 = new JButton("Total");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cb=T1.getText();
				float CB=Float.parseFloat(cb);
				String cbm=T2.getText();
				float CBM=Float.parseFloat(cbm);
				String cc=T1.getText();
				float CC=Float.parseFloat(cc);
				//String d=(String)C1.getSelectedItem();
				//float d1=Float.parseFloat(d);
				String Q=T4.getText();
				float Q1=Float.parseFloat(Q);
				float CD,CM;
				float R=0;
				String Dr=(String)C1.getSelectedItem();
				if(Dr.equals("Tea"))
				{
					R=10;
					
				}
				else if(Dr.equals("Coffee"))
				{
					R=15;
				}
				 CD=(float)(R*Q1);
				 CM=(float)(50*CB)+(60*CBM)+(40*CC);
				 
				 float HD,CostD;
				 if(R1.isSelected())
				   {
					 HD=100;
					 
				    }
				 
				   else
					 
				    {
					 HD=0;
				    }
				 CostD=(float)(HD);
				 float tax=(float)((CD*.03)+(CM*0.2)+(CostD*.1));
				  float stot=(float)(CD+CM+CostD);
				 float tot=(float)(tax+stot);
				  String CD1=String.valueOf(CD);
				  String CM1=String.valueOf(CM);
				  T6.setText(CD1);
				  T7.setText(CM1);
				  String CostD1=String.valueOf(CostD);
				  T8.setText(CostD1);
				  String tax1=String.valueOf(tax);
				  String stot1=String.valueOf(stot);
				  String tot1=String.valueOf(tot);
				  T9.setText(tax1);
				  T10.setText(stot1);
				  T11.setText(tot1);
				 
				  
				  
					 
					 
					 
				  
				
				
				
				
				
				
				
			}
		});
		
		JButton B1 = new JButton("Convert");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String total=T11.getText();
				float total1=Float.parseFloat(total);
					
			if(C2.getSelectedItem()=="India")
				
			{
				T5.setText(total);
				
			}
			else if(C2.getSelectedItem()=="Usa")
			{
				float b1=(float)(total1*0.014);
				String c=String.valueOf(b1);
			     T5.setText(c);	
			}
		
	}	
});
		B1.setFont(new Font("Tahoma", Font.BOLD, 12));
		B1.setBounds(10, 159, 93, 23);
		P3.add(B1);
		
		JButton B2 = new JButton("Close");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				T5.setText(" ");
				
			}
		});
		B2.setFont(new Font("Tahoma", Font.BOLD, 12));
		B2.setBounds(110, 160, 79, 23);
		P3.add(B2);
		
		JPanel P4 = new JPanel();
		P4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P4.setBounds(10, 294, 327, 84);
		frame.getContentPane().add(P4);
		P4.setLayout(null);
		
		JLabel L8 = new JLabel("Cost of Drinks");
		L8.setFont(new Font("Tahoma", Font.BOLD, 12));
		L8.setBounds(28, 11, 109, 14);
		P4.add(L8);
		
		JLabel L9 = new JLabel("Cost of Meal");
		L9.setFont(new Font("Tahoma", Font.BOLD, 12));
		L9.setBounds(28, 36, 88, 14);
		P4.add(L9);
		
		JLabel L10 = new JLabel("Cost of Delivery");
		L10.setFont(new Font("Tahoma", Font.BOLD, 12));
		L10.setBounds(28, 61, 109, 14);
		P4.add(L10);
		
		T6 = new JTextField();
		T6.setBounds(223, 9, 86, 20);
		P4.add(T6);
		T6.setColumns(10);
		
		T7 = new JTextField();
		T7.setBounds(221, 34, 88, 20);
		P4.add(T7);
		T7.setColumns(10);
		
		T8 = new JTextField();
		T8.setBounds(223, 59, 86, 20);
		P4.add(T8);
		T8.setColumns(10);
		
		JPanel P5 = new JPanel();
		P5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P5.setBounds(347, 294, 216, 84);
		frame.getContentPane().add(P5);
		P5.setLayout(null);
		
		JLabel L11 = new JLabel("Tax");
		L11.setFont(new Font("Tahoma", Font.BOLD, 12));
		L11.setBounds(10, 11, 46, 14);
		P5.add(L11);
		
		JLabel L12 = new JLabel("Sub Total");
		L12.setFont(new Font("Tahoma", Font.BOLD, 12));
		L12.setBounds(10, 32, 84, 14);
		P5.add(L12);
		
		JLabel L13 = new JLabel("Total");
		L13.setFont(new Font("Tahoma", Font.BOLD, 12));
		L13.setBounds(10, 57, 60, 14);
		P5.add(L13);
		
		T9 = new JTextField();
		T9.setBounds(104, 11, 86, 20);
		P5.add(T9);
		T9.setColumns(10);
		
		T10 = new JTextField();
		T10.setBounds(104, 33, 86, 20);
		P5.add(T10);
		T10.setColumns(10);
		
		T11 = new JTextField();
		T11.setBounds(104, 55, 86, 20);
		P5.add(T11);
		T11.setColumns(10);
		
		JPanel P6 = new JPanel();
		P6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		P6.setBounds(10, 389, 875, 55);
		frame.getContentPane().add(P6);
		P6.setLayout(null);
		
		

		
		
		
		
		B3.setFont(new Font("Tahoma", Font.BOLD, 14));
		B3.setBounds(40, 11, 113, 33);
		P6.add(B3);
		
		
		
		
		JButton B5 = new JButton("Reset");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 T1.setText(" ");
			 T2.setText(" ");
			 T3.setText(" ");
			 T4.setText(" ");
			 T5.setText(" ");
			 T6.setText(" ");
			 T7.setText(" ");
			 T8.setText(" ");
			 T9.setText(" ");
			 T10.setText(" ");
			 T11.setText(" ");
			 T12.setText(" ");
			 C1.setSelectedIndex(0);
			 C2.setSelectedIndex(0);
			 R1.setSelected(false);
			 R2.setSelected(false);
			 		 
			 
			}
		});
		B5.setFont(new Font("Tahoma", Font.BOLD, 12));
		B5.setBounds(372, 12, 105, 33);
		P6.add(B5);
		
		JButton B6 = new JButton("Exit");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		B6.setFont(new Font("Tahoma", Font.BOLD, 12));
		B6.setBounds(534, 13, 105, 30);
		P6.add(B6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(573, 69, 344, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 324, 287);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_1, null);
		panel_1.setLayout(null);
		
		T12 = new JTextField();
		T12.setBounds(10, 11, 200, 36);
		panel_1.add(T12);
		T12.setColumns(10);
		
		JButton Bu1 = new JButton("B");
		Bu1.setFont(new Font("Tahoma", Font.BOLD, 12));
		Bu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Bu1.setBounds(1, 55, 52, 29);
		panel_1.add(Bu1);
		
		JButton Bu2 = new JButton("C");
		Bu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					T12.setText(" ");
					
				
				
			
			}
			
		});
		Bu2.setFont(new Font("Tahoma", Font.BOLD, 12));
		Bu2.setBounds(57, 55, 52, 29);
		panel_1.add(Bu2);
		
		JButton Bu3 = new JButton("...");
		Bu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Bu3.setFont(new Font("Tahoma", Font.BOLD, 12));
		Bu3.setBounds(112, 55, 46, 29);
		panel_1.add(Bu3);
		
		JButton Bu4 = new JButton("+");
		Bu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T12.getText();
				 s2=Bu4.getText();
				
				T12.setText("");
			}
		});
		Bu4.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu4.setBounds(168, 55, 52, 29);
		panel_1.add(Bu4);
		
		JButton Bu5 = new JButton("7");
		Bu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu5.getText()));
			}
			
		});
		Bu5.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu5.setBounds(1, 95, 50, 29);
		panel_1.add(Bu5);
		
		JButton Bu6 = new JButton("8");
		Bu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu6.getText()));
			}
			
		});
		Bu6.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu6.setBounds(57, 95, 52, 29);
		panel_1.add(Bu6);
		
		JButton Bu7 = new JButton("9");
		Bu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu7.getText()));
			}
			
		});
		Bu7.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu7.setBounds(112, 95, 52, 29);
		panel_1.add(Bu7);
		
		JButton Bu8 = new JButton("-");
		Bu8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=T12.getText();
				 s2=Bu8.getText();
				
				T12.setText("");
			}
		});
		Bu8.setFont(new Font("Tahoma", Font.BOLD, 18));
		Bu8.setBounds(166, 95, 54, 29);
		panel_1.add(Bu8);
		
		JButton Bu9 = new JButton("4");
		Bu9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu9.getText()));
			}
			
		});
		Bu9.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu9.setBounds(0, 135, 52, 29);
		panel_1.add(Bu9);
		
		JButton Bu10 = new JButton("5");
		Bu10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu10.getText()));
			}
			
		});
		Bu10.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu10.setBounds(57, 135, 52, 29);
		panel_1.add(Bu10);
		
		JButton Bu11 = new JButton("6");
		Bu11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu11.getText()));
			}
			
		});
		Bu11.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu11.setBounds(112, 135, 52, 29);
		panel_1.add(Bu11);
		
		JButton Bu12 = new JButton("*");
		Bu12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T12.getText();
				 s2=Bu12.getText();
				
				T12.setText("");
			}
		});
		Bu12.setFont(new Font("Tahoma", Font.BOLD, 14));
		Bu12.setBounds(168, 135, 52, 29);
		panel_1.add(Bu12);
		
		JButton Bu13 = new JButton("1");
		Bu13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu13.getText()));
			}
		});
		Bu13.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu13.setBounds(1, 169, 52, 29);
		panel_1.add(Bu13);
		
		JButton Bu14 = new JButton("2");
		Bu14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu14.getText()));
			}
			
		});
		Bu14.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu14.setBounds(57, 169, 52, 29);
		panel_1.add(Bu14);
		
		JButton Bu15 = new JButton("3");
		Bu15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(Bu15.getText()));
			}
			
		});
		Bu15.setFont(new Font("Tahoma", Font.BOLD, 12));
		Bu15.setBounds(112, 169, 52, 29);
		panel_1.add(Bu15);
		
		JButton Bu16 = new JButton("/");
		Bu16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T12.getText();
				 s2=Bu16.getText();
				
				T12.setText("");
			}
		});
		Bu16.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bu16.setBounds(168, 169, 52, 29);
		panel_1.add(Bu16);
		
		JButton Bu17 = new JButton("0");
		Bu17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T12.setText(" ");
					f=0;
				}
				
			T12.setText(T12.getText().concat(Bu17.getText()));
			}
		});
		Bu17.setFont(new Font("Tahoma", Font.BOLD, 14));
		Bu17.setBounds(1, 203, 54, 29);
		panel_1.add(Bu17);
		
		JButton Bu18 = new JButton(".");
		Bu18.setFont(new Font("Tahoma", Font.BOLD, 12));
		Bu18.setBounds(57, 203, 52, 29);
		panel_1.add(Bu18);
		
		JButton Bu19 = new JButton("...");
		Bu19.setBounds(112, 203, 52, 29);
		panel_1.add(Bu19);
		
		JButton Bu20 = new JButton("=");
		Bu20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s3=T12.getText();
				Float a=Float.parseFloat(s1);
				Float b=Float.parseFloat(s3);
				 
				T12.setText(" ");
				if (s2.equals("+"))
				{
					Float r1=a+b;
					String r2=String.valueOf(r1);
					T12.setText(r2);
					
				}
				if (s2.equals("-"))
				{
				   Float r1=a-b;
				   String r2=String.valueOf(r1);
				   T12.setText(r2);
				}
				if (s2.equals("*"))
				{
				
					 Float r1=a*b;
					 String r2=String.valueOf(r1);
					 T12.setText(r2);
				}
				if (s2.equals("/"))
				{
					 Float r1=a/b;
					 String r2=String.valueOf(r1);
					 T12.setText(r2);
				}
			}
		});
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 309, 259);
		panel_2.add(textArea);

		JButton B4 = new JButton("Receipt");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("Receipt\n"
						+ "Item\t"+"Qty\t "+"Unit price\t"+"price\n"
						+ "=============================================\n"
						+ "Chicken Burger\t"+T1.getText()+"\t"+"50"+"\t"+(Float.parseFloat(T1.getText())*50)+"\n"
						+ "BurgerMeal\t"+T2.getText()+"\t"+"60"+"\t"+(Float.parseFloat(T2.getText())*60)+"\n"
						+ "Chese Burger\t"+T3.getText()+"\t"+"40"+"\t"+(Float.parseFloat(T3.getText())*40)+"\n"
						 
						+"\n============================================"
						+ "\nTax\t" + T9.getText()
						+ "\nSubtotal\t" + T10.getText()
						+ "\ntotal\t" + T11.getText() + "\n");
				
			}
		});
		B4.setFont(new Font("Tahoma", Font.BOLD, 12));
		B4.setBounds(215, 12, 105, 33);
		P6.add(B4);
		
		Bu20.setFont(new Font("Tahoma", Font.BOLD, 14));
		Bu20.setBounds(168, 203, 52, 32);
		panel_1.add(Bu20);
		
		
	}
}
