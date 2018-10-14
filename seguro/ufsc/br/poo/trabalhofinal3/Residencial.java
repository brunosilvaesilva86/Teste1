package ufsc.br.poo.trabalhofinal3;

public class Residencial extends ItemSeguro {
	
	public Residencial(String cliente, int apolice, double valorseguro, double comissao, String modelo, String endereco) {
		super(cliente, apolice, valorseguro, comissao, modelo, endereco);
		
	}

	/*public void atualiza(double taxa) {
		this.setValorseguro(this.getValorseguro() + (this.getValorseguro() * taxa * 2));
	}*/

}
