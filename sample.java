package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class sample {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JPasswordField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
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
		
		textField = new JTextField();
		textField.setBounds(219, 46, 100, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(82, 52, 70, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(82, 100, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel L6 = new JLabel("");
		L6.setBounds(140, 204, 144, 14);
		frame.getContentPane().add(L6);
		
	//	lblNewLabel.setBounds(181, 214, 176, 14);
		//frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_1 = new JButton("submitt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				String str2=Pass.getText();
				if(str1.equals("jismy") && str2.equals("123"))
						{
		         L6.setText("successfull");
					
						}
				   else
				{
					L6.setText("unsuccessful");
				}
			}
		});
		btnNewButton_1.setBounds(197, 156, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		Pass = new JPasswordField();
		Pass.setBounds(219, 97, 100, 20);
		frame.getContentPane().add(Pass);
		
		
	}
}
