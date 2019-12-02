package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CALCULATOR11 {

	private JFrame frame;
	private JTextField T1;
	String s1,s2,s3;
	int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALCULATOR11 window = new CALCULATOR11();
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
	public CALCULATOR11() {
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
		
		JLabel L1 = new JLabel("Edit");
		L1.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("View");
		L2.setBounds(48, 11, 46, 14);
		frame.getContentPane().add(L2);
		
		JLabel L3 = new JLabel("Help");
		L3.setBounds(91, 11, 46, 14);
		frame.getContentPane().add(L3);
		
		T1 = new JTextField();
		T1.setBounds(10, 28, 414, 36);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L4 = new JLabel("Scientific");
		L4.setBounds(20, 75, 127, 14);
		frame.getContentPane().add(L4);
		
		JLabel L5 = new JLabel("Standard");
		L5.setBounds(205, 75, 132, 14);
		frame.getContentPane().add(L5);
		
		JButton B1 = new JButton("sqrt");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float a=Float.parseFloat(T1.getText());
				T1.setText(String.valueOf(Math.sqrt(a)));
				
			}
		});
		B1.setBounds(10, 117, 58, 28);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("1/x");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3=T1.getText();
				Float r=Float.parseFloat(s3);
				float x=(float)1/r;
				String r2=String.valueOf(x);
				T1.setText(r2);
				
			}
			
		});
		B2.setBounds(78, 117, 58, 28);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("sin");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				f=1;
				s3=T1.getText();
				T1.setText("");	
				Float a=Float.parseFloat(s3);
				
				
					Float sin=(float)Math.sin((a*Math.PI)/180);
					String r2=String.valueOf(sin);
					T1.setText(r2);
					
				
			}
			
		});
		B3.setBounds(141, 117, 52, 28);
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("%");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=T1.getText();
				 s2=B4.getText();
				
				T1.setText("");	
			}
		});
		B4.setBounds(10, 156, 56, 28);
		frame.getContentPane().add(B4);
		
		JButton B5 = new JButton("Exp");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Float a=Float.parseFloat(T1.getText());
				T1.setText(String.valueOf(Math.exp(a)));
				
			}
		});
		B5.setBounds(78, 156, 58, 28);
		frame.getContentPane().add(B5);
		
		JButton B6 = new JButton("cos");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s3=T1.getText();
				T1.setText("");	
				float a=Float.parseFloat(s3);
				
				
					float cos=(float)(Math.cos((a*Math.PI)/180));
					String r2=String.valueOf(cos);
					T1.setText(r2);
			}
		});
		B6.setBounds(138, 156, 58, 28);
		frame.getContentPane().add(B6);
		
		JButton B7 = new JButton("x^y");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B7.getText();
				
				T1.setText("");
			}
		});
		B7.setBounds(10, 195, 59, 23);
		frame.getContentPane().add(B7);
		
		JButton B8 = new JButton("ln");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float a=Float.parseFloat(T1.getText());
				T1.setText(String.valueOf(Math.log(a)));
				
			}
		});
		B8.setBounds(78, 195, 59, 23);
		frame.getContentPane().add(B8);
		
		JButton B9 = new JButton("tan");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s3=T1.getText();
				T1.setText("");	
				float a=Float.parseFloat(s3);
				
				
					float tan=(float)(Math.tan((a*Math.PI)/180));
					String r2=String.valueOf(tan);
					T1.setText(r2);	
			}
		});
		B9.setBounds(141, 195, 52, 23);
		frame.getContentPane().add(B9);
		
		JButton B10 = new JButton("x^2");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				float f=Float.parseFloat(s1);
				float x=(float)f*f;
				s3=String.valueOf(x);
				T1.setText(s3);
				
			}
		});
		B10.setBounds(10, 229, 59, 23);
		frame.getContentPane().add(B10);
		
		JButton B11 = new JButton("n!");
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				float n=Float.parseFloat(s1);
				String f="1";
				float n1=Float.parseFloat(f);
				for(int i=1;i<=n;i++)
				{
					n1=n1*i;
					
				}
				s3=String.valueOf(n1);
				T1.setText(s3);
				
					
					
				
				
			}
		});
		B11.setBounds(73, 229, 58, 23);
		frame.getContentPane().add(B11);
		
		JButton B12 = new JButton("sec");
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f=1;
				s3=T1.getText();
				T1.setText("");	
				float a=Float.parseFloat(s3);
				
				
					float cos=(float)(Math.cos((a*Math.PI)/180));
					String r2=String.valueOf(cos);
					T1.setText(r2);
					float res=(1/cos);
					String r3=String.valueOf(res);
					T1.setText(r3);
					
					
				
			}
		});
		B12.setBounds(141, 229, 58, 23);
		frame.getContentPane().add(B12);
		
		JButton B13 = new JButton("7");
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B13.getText()));
			}
		});
		B13.setBounds(205, 118, 52, 26);
		frame.getContentPane().add(B13);
		
		JButton B14 = new JButton("8");
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B14.getText()));
			}
		});
		B14.setBounds(261, 117, 52, 28);
		frame.getContentPane().add(B14);
		
		JButton B15 = new JButton("9");
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B15.getText()));
			}
		});
		B15.setBounds(320, 117, 52, 27);
		frame.getContentPane().add(B15);
		
		JButton B16 = new JButton("/");
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B16.getText();
				
				T1.setText("");
			}
		});
		B16.setBounds(378, 117, 46, 28);
		frame.getContentPane().add(B16);
		
		JButton B17 = new JButton("4");
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B17.getText()));
			}
		});
		B17.setBounds(205, 159, 58, 23);
		frame.getContentPane().add(B17);
		
		JButton B18 = new JButton("5");
		B18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B18.getText()));
			}
		});
		B18.setBounds(271, 156, 52, 28);
		frame.getContentPane().add(B18);
		
		JButton B19 = new JButton("6");
		B19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B19.getText()));
			}
		});
		B19.setBounds(330, 156, 46, 28);
		frame.getContentPane().add(B19);
		
		JButton B20 = new JButton("*");
		B20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=T1.getText();
				 s2=B20.getText();
				
				T1.setText("");
			}
		});
		B20.setBounds(378, 159, 46, 23);
		frame.getContentPane().add(B20);
		
		JButton B21 = new JButton("1");
		B21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B21.getText()));
			}
		});
		B21.setBounds(203, 195, 60, 23);
		frame.getContentPane().add(B21);
		
		JButton B22 = new JButton("2");
		B22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B22.getText()));
			}
		});
		B22.setBounds(267, 195, 56, 23);
		frame.getContentPane().add(B22);
		
		JButton B23 = new JButton("3");
		B23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B23.getText()));
			}
		});
		B23.setBounds(328, 195, 52, 23);
		frame.getContentPane().add(B23);
		
		JButton B24 = new JButton("-");
		B24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=T1.getText();
				 s2=B24.getText();
				
				T1.setText("");
			}
		});
		B24.setBounds(378, 195, 46, 23);
		frame.getContentPane().add(B24);
		
		JButton B25 = new JButton("0");
		B25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T1.setText(" ");
					f=0;
				}
				
			T1.setText(T1.getText().concat(B25.getText()));
			//T1.setText(" ");
			
		
			}
		});
		B25.setBounds(205, 229, 58, 23);
		frame.getContentPane().add(B25);
		
		JButton B26 = new JButton(".");
		B26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				T1.setText(T1.getText().concat(B26.getText()));
			}
		});
		B26.setBounds(271, 229, 52, 23);
		frame.getContentPane().add(B26);
		
		JButton B27 = new JButton("=");
		B27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s3=T1.getText();
				Float a=Float.parseFloat(s1);
				Float b=Float.parseFloat(s3);
				 
				T1.setText(" ");
				if (s2.equals("+"))
				{
					Float r1=a+b;
					String r2=String.valueOf(r1);
					T1.setText(r2);
					
				}
				if (s2.equals("-"))
				{
				   Float r1=a-b;
				   String r2=String.valueOf(r1);
				   T1.setText(r2);
				}
				if (s2.equals("*"))
				{
				
					 Float r1=a*b;
					 String r2=String.valueOf(r1);
					 T1.setText(r2);
				}
				if (s2.equals("/"))
				{
					 Float r1=a/b;
					 String r2=String.valueOf(r1);
					 T1.setText(r2);
				}
				if (s2.equals("%"))
				{
					Float r1=a*b/100;
					String r2=String.valueOf(r1);
					T1.setText(r2);
				}
				if (s2.equals("x^y"))
				{
					double r1=Math.pow(a,b);
					String r2=String.valueOf(r1);
					T1.setText(r2);
				}
			}
		});
		B27.setBounds(326, 229, 46, 23);
		frame.getContentPane().add(B27);
	
		JButton B28 = new JButton("+");
		B28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 s1=T1.getText();
				 s2=B28.getText();
				
				T1.setText("");
				
			}
		});
		B28.setBounds(378, 229, 46, 23);
		frame.getContentPane().add(B28);
	}
}
