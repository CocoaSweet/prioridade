package prioridade;

import java.util.PriorityQueue;
import java.util.Queue;

public class Algoritmo {
	
	Microsoft microsoft = new Microsoft();
	Steam steam = new Steam();
	Queue<Executavel> executavel = new PriorityQueue<>();
	
	void adicionarExe (Executavel executavel) {
		this.executavel.add(executavel);
	}
	
	void adicionarExe (String nome, int prioridade) {
		this.executavel.add(new Executavel(nome, prioridade));
	}
	
	public String nomePrograma(String selecao, int numero) {
		if(selecao.equals("microsoft")) {
			return microsoft.nomePrograma(numero);
		} else if (selecao.equals("steam")) {
			return steam.nomePrograma(numero);
		}
		return "Programa não encontrado";
		
	}
	
	public String mostrarFila() {
		while(executavel.size() != 0) {
			return executavel.poll().toString();
		}
		return "";
	}
	  
}
