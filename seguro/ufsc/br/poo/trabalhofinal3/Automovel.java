package ufsc.br.poo.trabalhofinal3;

public class Automovel extends ItemSeguro {

	
	
	public Automovel(String cliente, int apolice, double valorseguro, double comissao, String modelo, String endereco) {
		super(cliente, apolice, valorseguro, comissao, modelo, endereco);
		
	}

	
	
	/*
	public void atualiza(double taxa) {
		this.setValorseguro(this.getValorseguro() + (this.getValorseguro() * taxa * 3));
	}

	public void deposito(double valor) {
		this.setValorseguro(this.getValorseguro() + valor - 0.05);
	}*/

}
