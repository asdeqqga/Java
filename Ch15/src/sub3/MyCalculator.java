package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtfDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfDisplay = new JTextField();
		txtfDisplay.setEditable(false);
		txtfDisplay.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisplay.setText("0");
		txtfDisplay.setBounds(12, 10, 256, 47);
		contentPane.add(txtfDisplay);
		txtfDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 62, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(76, 62, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(142, 62, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(209, 62, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 133, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(76, 133, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(142, 133, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(209, 133, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 203, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(76, 203, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(142, 203, 60, 60);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(209, 203, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(12, 273, 60, 60);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(76, 273, 60, 60);
		contentPane.add(btnC);
		
		JButton btn = new JButton("=");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn.setBounds(142, 273, 60, 60);
		contentPane.add(btn);
		
		JButton btnCancel = new JButton("+");
		btnCancel.setBounds(209, 273, 60, 60);
		contentPane.add(btnCancel);
	}
}
