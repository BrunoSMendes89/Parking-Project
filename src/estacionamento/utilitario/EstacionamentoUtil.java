package estacionamento.utilitario;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public static boolean validarPadraoPlaca(String placa) {
		String padrao = "[A_Z][A_Z][A_Z]-\\d\\d\\d\\d"; //formatacao da string, A_Z qualquer letra mai�scula e \d qualquer n�mero
		Pattern p = Pattern.compile(padrao); //chama o compilador passando o padr�o
		Matcher m = p.matcher(placa); //passa a placa no padr�o
		
		return m.matches(); //retorna o resultado
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

	/**
	 * Recupera uma propriedade do arquivo de configura��o da aplica��o
	 * configurationConnection.txt
	 * @param propriedade
	 * @return valor associado � propriedade
	 */
	public static String get(String propriedade) {
		
		Properties prop = new Properties();//generics j� preparada pra carregar arquivos de configura��o de acesso a banco atrav�s do m�todo load
		String valor = null;
		
		try {
			prop.load(new FileInputStream("/resources/configuration.txt"));
			valor = prop.getProperty(propriedade);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			assert false: "Configura��o n�o carregada!";
		}
		
		return valor;
	}

	public static String getDataAsString(LocalDateTime dataHoraEntrada) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
