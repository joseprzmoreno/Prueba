package vistacontrolador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class PrincipalB {

	private JFrame frame;
	private JTextField textNumero;
	private JLabel lblResultado;
	private JLabel lblnumero1;
	private JLabel lblNumero2;
	private JTextField textField1;
	private JTextField textField2;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JLabel lblCalculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalB window = new PrincipalB();
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
	public PrincipalB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblIntroduzcaNmero = new JLabel("Introduzca n\u00FAmero");
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		
		lblResultado = new JLabel("");
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor = Integer.parseInt(textNumero.getText());
				if (valor%2 == 0)
					lblResultado.setText("Par");
				else
					lblResultado.setText("Impar");
				
			}
		});
		
		lblnumero1 = new JLabel("N\u00FAmero 1");
		
		lblNumero2 = new JLabel("N\u00FAmero 2");
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(textField1.getText());
				int numero2 = Integer.parseInt(textField2.getText());
				
				lblCalculadora.setText(Integer.toString(numero1 + numero2));
				
				
				
			}
		});
		
		btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int numero1 = Integer.parseInt(textField1.getText());
				int numero2 = Integer.parseInt(textField2.getText());
				
				lblCalculadora.setText(Integer.toString(numero1 - numero2));
				
			}
		});
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(textField1.getText());
				int numero2 = Integer.parseInt(textField2.getText());
				
				lblCalculadora.setText(Integer.toString(numero1 * numero2));
				
			}
			
		});
		
		btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(textField1.getText());
				int numero2 = Integer.parseInt(textField2.getText());
				
				lblCalculadora.setText(Integer.toString(numero1 / numero2));
				
			}
		});
		
		lblCalculadora = new JLabel("");
		
		JSeparator separator = new JSeparator();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(254)
							.addComponent(lblResultado))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(45)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblnumero1)
											.addGap(18)
											.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNumero2)
											.addGap(18)
											.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(98)
									.addComponent(lblCalculadora)))
							.addGap(73)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnMultiplicar)
								.addComponent(btnRestar)
								.addComponent(btnSumar)
								.addComponent(btnDividir)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblIntroduzcaNmero)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton)
								.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addComponent(lblResultado)
							.addGap(5))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(25, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIntroduzcaNmero)
								.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblnumero1)
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNumero2)
								.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblCalculadora)
							.addContainerGap(39, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(66)
							.addComponent(btnSumar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRestar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnMultiplicar)
							.addGap(3)
							.addComponent(btnDividir)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
