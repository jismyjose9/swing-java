package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class celcius {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celcius window = new celcius();
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
	public celcius() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Degrees");
		lblNewLabel.setBounds(71, 51, 138, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(216, 51, 126, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Result = ");
		lblNewLabel_1.setBounds(183, 113, 111, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(279, 113, 104, 31);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("To Celsius");
		btnNewButton.setBounds(36, 171, 148, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d=textField.getText();
				Float f=Float.parseFloat(d);
				Float f1=(float)(f-273.15);
				String str=String.valueOf(f1);
				label.setText(str);
				
				 
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To Fahrenhet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d=textField.getText();
				Float a=Float.parseFloat(d);
				Float a1=(float)(a-273.15)*9/5+32;
				String str=String.valueOf(a1);
				label.setText(str);
				
			}
		});
		btnNewButton_1.setBounds(235, 171, 148, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}

}
