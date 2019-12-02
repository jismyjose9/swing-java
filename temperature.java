package calcu;
import javax.swing.ButtonGroup;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class temperature {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temperature window = new temperature();
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
	public temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L1 = new JLabel("Input");
		L1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		L1.setBounds(121, 24, 46, 14);
		frame.getContentPane().add(L1);
		
		T1 = new JTextField();
		T1.setBounds(194, 22, 86, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L5 = new JLabel("");
		L5.setBounds(214, 215, 95, 14);
		frame.getContentPane().add(L5);
		
		JLabel L2 = new JLabel("Input scale");
		L2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		L2.setBounds(41, 66, 95, 14);
		frame.getContentPane().add(L2);
		
		JLabel L3 = new JLabel("Output scale");
		L3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		L3.setBounds(271, 67, 100, 14);
		frame.getContentPane().add(L3);
		
		JRadioButton R1 = new JRadioButton("Celcius");
		R1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R1.setBounds(41, 100, 109, 23);
		frame.getContentPane().add(R1);
		
		
		JRadioButton R2 = new JRadioButton("Fahernheit");
		R2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R2.setBounds(41, 126, 109, 23);
		frame.getContentPane().add(R2);
		
					
		JRadioButton R3 = new JRadioButton("Kelvin");
		R3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R3.setBounds(41, 152, 109, 23);
		frame.getContentPane().add(R3);
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(R1);
		G1.add(R2);
		G1.add(R3);
		
		JLabel L4 = new JLabel("Output");
		L4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		L4.setBounds(121, 214, 46, 14);
		frame.getContentPane().add(L4);
		
		JRadioButton R4 = new JRadioButton("Celcius");
		R4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R4.setBounds(271, 100, 109, 23);
		frame.getContentPane().add(R4);
		
		JRadioButton R5 = new JRadioButton("Fahrenheit");
		R5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R5.setBounds(271, 127, 109, 23);
		frame.getContentPane().add(R5);
		
		JRadioButton R6 = new JRadioButton("Kelvin");
		R6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		R6.setBounds(271, 153, 109, 23);
		frame.getContentPane().add(R6);
		
		ButtonGroup G2=new ButtonGroup();
		G2.add(R4);
		G2.add(R5);
		G2.add(R6);
		
		
		R1.addActionListener(new ActionListener() {  //
			public void actionPerformed(ActionEvent e) {
				
                 String d=T1.getText();
				float f=Float.parseFloat(d);
				
			if(R4.isSelected())
			
				{
				
				String str=String.valueOf(f);
				
					L5.setText(str);
				}
					
				else if(R5.isSelected())
				{
					
				
				float a1=(float)((1.8*f)+32);
				String str1=String.valueOf(a1);
				L5.setText(str1);
				}
				
				
				else 
					{if(R6.isSelected())
				{
					
					float a1=(float)(f+273.15);
					String str1=String.valueOf(a1);
					L5.setText(str1);	
				
		
				}
					}
			
			}
		
			
		});
		
		R2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String d=T1.getText();
					
				 float f=Float.parseFloat(d);
				 if(R4.isSelected())
				 {
					 float a1=(float)(((f-32)*5)/9);
					String str1=String.valueOf(a1);
					L5.setText(str1); 
				 }
				 else if(R5.isSelected())
				 {
					 String str=String.valueOf(f);
						
						L5.setText(str); 
				 }
		
			
			      else 
			    	  {if(R6.isSelected())
			      {
			    	  float a1=(float)(((f-32*5)/9)+273.15);
						String str1=String.valueOf(a1);
					 L5.setText(str1);	  
			      }
			    	  }
				
			}
			
		});
		   R3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d=T1.getText();
				float f=Float.parseFloat(d);
				 if(R4.isSelected())
				 {
					 float a1=(float)(f-273.15);
						String str1=String.valueOf(a1);
					 L5.setText(str1);	  
				 }
				 else if(R5.isSelected())
				 {
					 float a1=(float)((((f-273.15)*9)/5)+32);
						String str1=String.valueOf(a1);
					 L5.setText(str1);	  
				 }
				 
				 else 
					 {if(R6.isSelected())
				 {
					 String str=String.valueOf(f);
						
						L5.setText(str);  
				 }
					 }
				 
			}
		 });	
		   R4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		   
					String d=T1.getText();
					float f=Float.parseFloat(d);
					if(R1.isSelected())
					{
						 String str=String.valueOf(f);
							
							L5.setText(str);  
					}
					if(R2.isSelected())
					{
						float a1=(float)((1.8*f)+32);
						String str1=String.valueOf(a1);
						L5.setText(str1);	
					}
						
					if(R3.isSelected())	
					{
						float a1=(float)(f+273.15);
						String str1=String.valueOf(a1);
						L5.setText(str1);
					}
					
		
				}
		   });
		   
		   R5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String d=T1.getText();
					float f=Float.parseFloat(d);
					if(R1.isSelected())
					{
						float a1=(float)(((f-32)*5)/9);
						String str1=String.valueOf(a1);
						L5.setText(str1); 
					}
					if(R2.isSelected())
					{
						String str=String.valueOf(f);
						
						L5.setText(str); 	
					}
					if(R3.isSelected())
					{
						float a1=(float)(((f-32*5)/9)+273.15);
						String str1=String.valueOf(a1);
					     L5.setText(str1);	
					}
				}
		   });
		   
		   
		   R6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
 
				String d=T1.getText();
				float f=Float.parseFloat(d);
				if(R1.isSelected())
				{
					float a1=(float)(f-273.15);
					String str1=String.valueOf(a1);
				     L5.setText(str1);	
				}
				if(R2.isSelected())
				{
					float a1=(float)((((f-273.15)*9)/5)+32);
					String str1=String.valueOf(a1);
				    L5.setText(str1);		
				}

				if(R3.isSelected())
				{
					String str=String.valueOf(f);
					
					L5.setText(str); 
				}
				
			}
				
		 });
		   
	}  
		
}	
