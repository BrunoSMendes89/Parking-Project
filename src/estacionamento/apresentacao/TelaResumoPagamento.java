package estacionamento.apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import estacionamento.negocio.Movimentacao;

public class TelaResumoPagamento extends JFrame implements ActionListener{
	
	private JFrame parent;

	public TelaResumoPagamento(Movimentacao movimentacao,JFrame parent) {
		this.parent = parent;
		setResizable(false);
		setTitle("Tela Resumo de Pagamento");
		getContentPane().setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlaca.setBounds(109, 40, 46, 14);
		getContentPane().add(lblPlaca);
		
		JLabel lblDataEntrada = new JLabel("Entrada:");
		lblDataEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataEntrada.setBounds(109, 87, 71, 14);
		getContentPane().add(lblDataEntrada);
		
		JLabel lblDataSaida = new JLabel("Sa\u00EDda:");
		lblDataSaida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataSaida.setBounds(109, 142, 71, 14);
		getContentPane().add(lblDataSaida);
		
		JLabel lblValor = new JLabel("Valor Total:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(109, 192, 71, 14);
		getContentPane().add(lblValor);
		
		JLabel lplValPlaca = new JLabel("[placa]");
		lplValPlaca.setForeground(Color.BLUE);
		lplValPlaca.setFont(new Font("Tahoma", Font.BOLD, 11));
		lplValPlaca.setBounds(240, 40, 108, 14);
		getContentPane().add(lplValPlaca);
		
		JLabel lplDataEntrada = new JLabel("[data entrada]");
		lplDataEntrada.setForeground(Color.BLUE);
		lplDataEntrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lplDataEntrada.setBounds(240, 87, 108, 14);
		getContentPane().add(lplDataEntrada);
		
		JLabel lplDataSaida = new JLabel("[data saida]");
		lplDataSaida.setForeground(Color.BLUE);
		lplDataSaida.setFont(new Font("Tahoma", Font.BOLD, 11));
		lplDataSaida.setBounds(240, 142, 108, 14);
		getContentPane().add(lplDataSaida);
		
		JLabel lplValor = new JLabel("[valor]");
		lplValor.setForeground(Color.RED);
		lplValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lplValor.setBounds(240, 192, 108, 14);
		getContentPane().add(lplValor);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(163, 227, 89, 23);
		getContentPane().add(btnOk);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		parent.setVisible(true);
		dispose();
		
	}
}
