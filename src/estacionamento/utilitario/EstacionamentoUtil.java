package estacionamento.utilitario;

import estacionamento.negocio.Movimentacao;

/**
 * Representa uma classe de apoio �s demais do sistema.
 * @author bruno
 *
 */

public class EstacionamentoUtil {

	/**
	 * Valida a placa com o padr�o nacional.
	 * L = Letra 
	 * N = Numero
	 * @param placa Placa do veiculo
	 * @return true se atender e false se n�o.
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
