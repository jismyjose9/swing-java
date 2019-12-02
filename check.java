package calcu;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class check {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					check window = new check();
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
	public check() {
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
		
		
		JLabel L1 = new JLabel("");
		L1.setBounds(144, 171, 118, 14);
		frame.getContentPane().add(L1);
		
		JCheckBox C1 = new JCheckBox("c++");
		C1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		C1.setBounds(130, 57, 97, 23);
		frame.getContentPane().add(C1);
		C1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
					L1.setText("C++ " +(e.getStateChange()==1?"checked":"unchecked"));
					
				}
			
				
	    });
		
		JCheckBox C2 = new JCheckBox("java");
		C2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		C2.setBounds(130, 95, 97, 23);
		frame.getContentPane().add(C2);
		C2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
					L1.setText("java " +(e.getStateChange()==1?"checked":"unchecked"));
					
				}
		});
		
		
		}
	}
	

