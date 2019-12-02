package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

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
					login window = new login();
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
	public login() {
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
		
		JLabel LI = new JLabel("username");
		LI.setBounds(44, 55, 99, 28);
		frame.getContentPane().add(LI);
		
		JLabel L2 = new JLabel("Password");
		L2.setBounds(44, 102, 68, 23);
		frame.getContentPane().add(L2);
		
		JButton B1 = new JButton("submitt");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				string 
			}
		});
		B1.setBounds(141, 143, 89, 23);
		frame.getContentPane().add(B1);
		
		T1 = new JTextField();
		T1.setBounds(220, 59, 86, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(220, 103, 86, 20);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
	}
}
