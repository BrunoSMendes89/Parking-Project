package estacionamento.utilitario;

import estacionamento.negocio.Movimentacao;

/**
 * Representa uma classe de apoio às demais do sistema.
 * @author bruno
 *
 */

public class EstacionamentoUtil {

	/**
	 * Valida a placa com o padrão nacional.
	 * L = Letra 
	 * N = Numero
	 * @param placa Placa do veiculo
	 * @return true se atender e false se não.
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar
		return false;
	}
	
	/**
	 * O calculo do valor da estadia do veiculo baseado no tarifario 
	 * e na hora de entrada e saida do veiculo
	 * 
	 * Altera a propria instancia do parametro
	 * 
	 * @param movimentacao Instancia da movimentacao
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar
	}
	
}
