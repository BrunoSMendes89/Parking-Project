package estacionamento.controller;

import java.time.LocalDateTime;

/**
 * Coordena todos os fluxos dos casos de uso do sistema
 * 
 * @author bruno
 */

import java.util.List;

import estacionamento.negocio.Movimentacao;
import estacionamento.negocio.Vaga;
import estacionamento.negocio.Veiculo;
import estacionamento.persistencia.DAOEstacionamento;
import estacionamento.utilitario.EstacionamentoUtil;

public class EstacionamentoController {
	
	/**
	 * A partir dos dados do veiculo informador pelo operador,
	 * realiza-se o fluixo de entrada do ve�culo no estacionamento 
	 * registrando a movimentacao gerada.
	 *  
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cor
	 * @throws EstacionamentoException Quanto o estacionamento estiver lotado.
	 * @throws VeiculoException Quando o padr�o da placa for inv�lida
	 */
	public void processarEntrada(String placa, String marca,String modelo, String cor) throws EstacionamentoException, VeiculoException {
		//verificar se o estacionamento est� lotado
		if(!Vaga.temVagaLivre()) {
			throw new EstacionamentoException("Estacionamento lotado!");
		}
		
		//verificar o padr�o de string da placa
		if(!EstacionamentoUtil.validarPadraoPlaca(placa)) {
			throw new VeiculoException("Padr�o de placa inv�lido");
		}
		//criar uma inst�ncia do ve�culo com os dados informados
		Veiculo veiculo = new Veiculo(placa, marca, modelo, cor);
		
		//criar movimenta��o vinculando o veiculo e com data de entrada corrente
		Movimentacao movimentacao = new Movimentacao(veiculo,LocalDateTime.now());
		//registrar na base de dados a informa��o 
		DAOEstacionamento dao = new DAOEstacionamento();
		dao.criar(movimentacao);
		//atualiza o n�mero de vagas ocupadas
		Vaga.entrou();
		//fim	
		
	}
	
	/**
	 * A partir de uma placa de viculo informada, realiza todo 
	 * o fluxo de sa�da do ve�culo do estacinamento 
	 * @param placa
	 */
	public Movimentacao processarSarida(String placa) {
		//TODO implementar
		return null;
	}
	
	/**
	 * Gera um relat�rio de acordo com os par�metros de per�odo desejado.
	 * @param data
	 * @return
	 */
	public List<Movimentacao> emitirRelatorio(LocalDateTime data){
		//TODO implementar
		return null;
	}
}
