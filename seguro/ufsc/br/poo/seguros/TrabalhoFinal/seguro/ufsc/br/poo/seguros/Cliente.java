package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;

public class Cliente {
	
	private String nome="";
    private int cpf=0;
    
    
	public Cliente(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
    	
    	

}
