package Questao02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorArroba;
	private JTextField txtQtdeArroba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Bovina");
		lblNewLabel.setBounds(146, 11, 132, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor da Arroba");
		lblNewLabel_1.setBounds(23, 82, 114, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Arrobas");
		lblNewLabel_2.setBounds(23, 135, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		txtValorArroba = new JTextField();
		txtValorArroba.setBounds(192, 87, 114, 20);
		contentPane.add(txtValorArroba);
		txtValorArroba.setColumns(10);
		
		txtQtdeArroba = new JTextField();
		txtQtdeArroba.setBounds(192, 132, 114, 20);
		contentPane.add(txtQtdeArroba);
		txtQtdeArroba.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Total a Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Valor a pagar é R$" + Float.parseFloat(txtValorArroba.getText()) * Float.parseFloat(txtQtdeArroba.getText()));
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(146, 199, 175, 23);
		contentPane.add(btnNewButton);
	}
}
