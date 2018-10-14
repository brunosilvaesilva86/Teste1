package ufsc.br.poo.seguros;

import java.util.HashMap;
import java.util.Map;

public class Corretor{
	
	
	 private String nome;
	 private int cpf;
     private Map<Integer, Corretor> corretor = new HashMap<Integer, Corretor>();
	    
	    public void adicionaCorretorMap(Corretor cor) {
			this.corretor.put(cor.getCpf(), cor);
		}
	    
		public void imprimeCorretor() {
			for (int prodId : corretor.keySet()) {
				Corretor prod = corretor.get(prodId);
				System.out.println("Nome: "+prod.getNome()+
						" - CPF: "+prod.getCpf());
			}
		}

		public void removerCorretorMap(Cliente cliente) {
			if (corretor.containsKey(cliente.getCpf())) {
				corretor.remove(cliente.getCpf());

			}
		}
	 
	 
	public Corretor(String nome, int cpf) {
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
