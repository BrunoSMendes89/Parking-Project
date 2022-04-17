package estacionamento.negocio;

/*
 * Representa as informações relativas à vagas do estacinamento ou
 * status de ocupação.
 * 
 * @author BrunoMendes
 */
public class Vaga {
	
	public static int TOTAL_VAGAS = 100;
	private static int VagasOcupadas = 0;
	
	private Vaga() {}
	
	/*
	 * Verificar a existencia de alguma vaga livre no estacionamento.
	 * 
	 * 
	 * @return true se houve alguma vaga e false se estiver lotado.
	 */
	public static boolean temVagaLivre() {
		//TODO implementar este método.
		return false;
	}
	
	/**
	 * Buscar status atual das vagas do estacionamento. 
	 */
	public static void inicializarOcupadas() {
		//TODO implementar
	}
	
	/**
	 * Retorna o número de vagas ocupadas 
	 * @return numero total de vagas ocupadas num determinado instante
	 */
	public static int ocupadas() {
		return Vaga.VagasOcupadas;
	}

	/**
	 * Retornar o numero de vagas livres
	 * @return total de vagas livres num determinado instante
	 */
	
	public static int livres() {
		return TOTAL_VAGAS - Vaga.VagasOcupadas;
	}
	
	/**
	 * Atualiza o numero de vagas ocupadas após a entrada do veiculo.
	 */
	public static void entrou() {
		Vaga.VagasOcupadas ++;
	}
	
}
