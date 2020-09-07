package Fiado;

public class Consumidor {
	//Atributos
	//PACKAGE - PUBLIC - PROTECTED - PRIVATE
	private String nome;
	private String telefone;
	private int [] fiados;
	private int posicao =0;
	//CONSTRUTOR
	public Consumidor (String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.fiados = new int [10];
	}
	
	//GETTER E SETTER
	public String getNome () {
		return this.nome;
		
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public void registrarFiado (int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado () {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}
