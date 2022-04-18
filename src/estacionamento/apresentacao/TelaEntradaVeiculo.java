package estacionamento.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import estacionamento.controller.EstacionamentoController;
import estacionamento.controller.EstacionamentoException;
import estacionamento.controller.VeiculoException;

public class TelaEntradaVeiculo extends JFrame implements ActionListener{

	private JFrame parent; 
	private JFormattedTextField txfPlaca;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JButton btnOk;
	private JButton btnCancel;
	
	//TODO temporário
	public static void main(String[] args) {
		TelaEntradaVeiculo tela = new TelaEntradaVeiculo(null);
		tela.setVisible(true);
	}
	
	public TelaEntradaVeiculo(JFrame parent) {
		setResizable(false);
		setSize(399,258);
		setTitle("Entrada de Ve\u00EDculos");
		this.parent = parent;
		getContentPane().setLayout(null);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setBounds(114, 47, 46, 14);
		getContentPane().add(lbPlaca);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(114, 72, 46, 14);
		getContentPane().add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(114, 97, 46, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(114, 122, 46, 14);
		getContentPane().add(lblCor);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(180, 66, 86, 20);
		getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(180, 94, 86, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setBounds(180, 119, 86, 20);
		getContentPane().add(txtCor);
		txtCor.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(99, 171, 89, 23);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		getContentPane().add(btnOk);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(198, 171, 89, 23);
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		getContentPane().add(btnCancel);
		
		try {
			txfPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false : "Padrao de placa incorreto";
		}
		txfPlaca.setColumns(10);
		txfPlaca.setBounds(180, 41, 86, 20);
		getContentPane().add(txfPlaca);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals("ok")) {
			EstacionamentoController controle = new EstacionamentoController();
			try {
				controle.processarEntrada(txfPlaca.getText(), txtMarca.getText(), txtModelo.getText(), txtCor.getText());
				JOptionPane.showConfirmDialog(null, "Veículo registrado com sucesso","Entrada de Veículo", JOptionPane.INFORMATION_MESSAGE);
			} catch (EstacionamentoException | VeiculoException e) {
				JOptionPane.showConfirmDialog(null, e.getMessage(),"Falha na entrada", JOptionPane.ERROR_MESSAGE);
			}		
			
		}
			this.parent.setVisible(true);
			this.dispose();
		
	}
}
