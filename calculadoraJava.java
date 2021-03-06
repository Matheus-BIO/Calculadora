import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.ScrollPane;

public class calculadoraJava extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.  ------------->     ALTERADO DO GIT
	 *                          ------------->     ALTERADO DO ECLIPSE
	 *                          ------------->     TESTE DE PUSH 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraJava frame = new calculadoraJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadoraJava() {
		setForeground(Color.GRAY);
		setFont(new Font("Arial Black", Font.BOLD, 16));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Double[] A = new Double [2];
		Double[] B = new Double [2]; 
		int[] sinais = new int [2];
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton.setBounds(276, 197, 116, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_10.setBounds(24, 197, 116, 62);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(150, 197, 116, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBounds(24, 270, 116, 62);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3.setBounds(150, 270, 116, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("6");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4.setBounds(276, 270, 116, 62);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_5.setBounds(24, 340, 116, 62);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_6.setBounds(150, 340, 116, 62);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7.setBounds(276, 340, 116, 62);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("0");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		
		JTextField lblNewLabel = new JTextField("Label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setEditable(false);
		lblNewLabel.setBounds(150, 11, 357, 23);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("");
		
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8.setBounds(24, 413, 116, 62);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (((sinais[1]> 0)&(sinais[1]< 5))){  
					JOptionPane.showMessageDialog(null, "Operação já selecionada, termine primeiro a operação atual");}
				
				else if(lblNewLabel.getText()==null||!lblNewLabel.getText().trim().equals("")){
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+"+");
						sinais[1] = 1;
						textField.setText("");
				}
				
				else  {
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+A[1]+"+");
						sinais[1] = 1;
						textField.setText("");
				}}});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_9.setBounds(432, 197, 93, 62);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("-");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((sinais[1]> 0)&(sinais[1]< 5))){  
					JOptionPane.showMessageDialog(null, "Operação já selecionada, termine primeiro a operação atual");}
				
				else if(lblNewLabel.getText()==null||!lblNewLabel.getText().trim().equals("")){
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+"-");
						sinais[1] = 2;
						textField.setText("");
				}
				
				else {
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+A[1]+"-");
						sinais[1] = 2;
						textField.setText("");
				}}});
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_9_1.setBounds(432, 270, 93, 62);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("*");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((sinais[1]> 0)&(sinais[1]< 5))){  
					JOptionPane.showMessageDialog(null, "Operação já selecionada, termine primeiro a operação atual");}
				
				else if(lblNewLabel.getText()==null||!lblNewLabel.getText().trim().equals("")){
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+"*");
						sinais[1] = 3;
						textField.setText("");
				}
				
				else {
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+A[1]+"*");
						sinais[1] = 3;
						textField.setText("");
				}}});
		btnNewButton_9_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_9_2.setBounds(432, 343, 93, 62);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_3 = new JButton("/");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((sinais[1]> 0)&(sinais[1]< 5))){  
					JOptionPane.showMessageDialog(null, "Operação já selecionada, termine primeiro a operação atual");}
				
				else if(lblNewLabel.getText()==null||!lblNewLabel.getText().trim().equals("")){
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+"/");
						sinais[1] = 4;
						textField.setText("");
				}
				
				else {
					A[1] = (Double.parseDouble(textField.getText()));
					lblNewLabel.setText(lblNewLabel.getText()+A[1]+"/");
						sinais[1] = 4;
						textField.setText("");
				}}});
		btnNewButton_9_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_9_3.setBounds(432, 413, 93, 62);
		contentPane.add(btnNewButton_9_3);
		
		textField = new JTextField();
		textField.setBounds(24, 61, 491, 125);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		JButton btnNewButton_7_1 = new JButton("=");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (sinais[1] == 0) {
				JOptionPane.showMessageDialog(null, "Operação incompleta");
			}
			else {
				B[1] = (Double.parseDouble(textField.getText()));
				
				if (sinais[1] == 1) {
					textField.setText(A[1]+B[1]+"");
					lblNewLabel.setText(lblNewLabel.getText()+B[1]+"="+textField.getText());
					sinais[1] = 0;
					B[1] = 0.0;
				}
				if (sinais[1] == 2) {
					textField.setText(A[1]-B[1]+"");
					lblNewLabel.setText(lblNewLabel.getText()+B[1]+"="+textField.getText());
					sinais[1] = 0;
					B[1] = 0.0;
				}
				if (sinais[1] == 3) {
					textField.setText(A[1]*B[1]+"");
					lblNewLabel.setText(lblNewLabel.getText()+B[1]+"="+textField.getText());
					sinais[1] = 0;
					B[1] = 0.0;
				}
				if (sinais[1] == 4) {
					textField.setText(A[1]/B[1]+"");
					lblNewLabel.setText(lblNewLabel.getText()+B[1]+"="+textField.getText());
					sinais[1] = 0;
					B[1] = 0.0;
				}
			}
			}});
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_1.setBounds(276, 413, 116, 62);
		contentPane.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton(".");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_2.setBounds(150, 413, 116, 62);
		contentPane.add(btnNewButton_7_2);
		
		JButton btnNewButton_11 = new JButton("CE");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_11.setBounds(24, 11, 75, 39);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				A[1] = 0.0;
				B[1] = 0.0;
				lblNewLabel.setText("");
			}
		});
		
	}
}
