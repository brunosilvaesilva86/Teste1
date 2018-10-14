package ufsc.br.poo.seguros;

import java.util.*;


public class Cliente {
	
	private String nome;
    private int cpf;
    private Map<Integer, Cliente> pes = new HashMap<Integer, Cliente>();
    
    public void adicionaClienteMap(Cliente cliente) {
		this.pes.put(cliente.getCpf(), cliente);
	}
    
	public void imprimeClienteMap() {
		for (int prodId : pes.keySet()) {
			Cliente prod = pes.get(prodId);
			System.out.println("Nome: "+prod.getNome()+
					" - CPF: "+prod.getCpf());
		}
	}

	public void removeItemMapa(Cliente cliente) {
		if (pes.containsKey(cliente.getCpf())) {
			pes.remove(cliente.getCpf());

		}
	}
    
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
