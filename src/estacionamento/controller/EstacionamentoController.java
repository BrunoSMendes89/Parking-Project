package estacionamento.controller;

import java.time.LocalDateTime;
import java.util.List;

import estacionamento.negocio.Movimentacao;

public class EstacionamentoController {

	public void processarEntrada(String placa, String marca,String modelo, String cor) {
		//TODO implementar
	}
	
	public Movimentacao processarSarida(String placa) {
		//TODO implementar
		return null;
	}
	
	public List<Movimentacao> emitirRelatorio(LocalDateTime data){
		//TODO implementar
		return null;
	}
}