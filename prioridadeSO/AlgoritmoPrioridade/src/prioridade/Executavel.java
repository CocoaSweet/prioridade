package prioridade;

public class Executavel implements Comparable<Executavel>{
	
	String nome;
	int prioridade;
	protected String programas;
	
	
	public Executavel() {}
	
	public Executavel(String nome, int prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	@Override
	public int compareTo(Executavel exe) {
		return Integer.compare(this.prioridade, exe.prioridade);
	}
	
	public String toString() {
	    return "Nome: " + nome + ", Prioridade: " + prioridade;
	}
	
}
