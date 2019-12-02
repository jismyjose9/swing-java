package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class currency {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L1 = new JLabel("CURRENCY CONVERTER");
		L1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		L1.setBounds(79, 22, 219, 32);
		frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("Input");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		L2.setBounds(67, 100, 111, 22);
		frame.getContentPane().add(L2);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"RUPEES", "DOLLER", "AED"}));
		C1.setBounds(162, 102, 136, 20);
		frame.getContentPane().add(C1);
		
		JLabel L3 = new JLabel("Amount");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		L3.setBounds(67, 161, 65, 14);
		frame.getContentPane().add(L3);
		
		T1 = new JTextField();
		T1.setBounds(162, 159, 136, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L4 = new JLabel("Output");
		L4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		L4.setBounds(67, 221, 65, 14);
		frame.getContentPane().add(L4);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"RUPEES", "DOLLER", "AED"}));
		C2.setBounds(162, 219, 136, 20);
		frame.getContentPane().add(C2);
		
		JButton B1 = new JButton("Convert");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			String a=T1.getText();
			float b=Float.parseFloat(a);
			
			if(C1.getSelectedItem()=="RUPEES")
			
			{	
			if(C2.getSelectedItem()=="RUPEES")
			{
				T2.setText(a);
				
			}
			else if(C2.getSelectedItem()=="DOLLER")
			{
				float b1=(float)(b*0.014);
				String c=String.valueOf(b1);
			     T2.setText(c);	
			}
			
			else
			{
				if(C2.getSelectedItem()=="AED")
				{
					float b1=(float)(b*0.051);
					String c=String.valueOf(b1);
				     T2.setText(c);	
				}
			}
			}
				
			if(C1.getSelectedItem()=="DOLLER")
				
			{	
			if(C2.getSelectedItem()=="RUPEES")
			{
				float b1=(float)(b*71.78);
				String c=String.valueOf(b1);
			     T2.setText(c);	
				
			}
			else if(C2.getSelectedItem()=="DOLLER")
			{
				
			     T2.setText(a);
			}
			
			else
			{
				if(C2.getSelectedItem()=="AED")
				{
					float b1=(float)(b*3.67);
					String c=String.valueOf(b1);
				     T2.setText(c);	
				}
			}
			}
				
				
            if(C1.getSelectedItem()=="AED")
				
			{	
			if(C2.getSelectedItem()=="RUPEES")
			{
				float b1=(float)(b*19.53);
				String c=String.valueOf(b1);
			     T2.setText(c);	
				
			}
			else if(C2.getSelectedItem()=="DOLLER")
			{
				
				float b1=(float)(b*0.27);
				String c=String.valueOf(b1);
			     T2.setText(c);	
			}
			
			else
			{
				if(C2.getSelectedItem()=="AED")
				{
					
				     T2.setText(a);
				}
			}
			}
				
				
				
				
			}
		});
		B1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		B1.setBounds(42, 276, 101, 32);
		frame.getContentPane().add(B1);
		
		T2 = new JTextField();
		T2.setBounds(162, 283, 136, 20);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		JButton B2 = new JButton("Exit");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		B2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		B2.setBounds(128, 329, 101, 23);
		frame.getContentPane().add(B2);
	}
}
