package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;

public class Automovel extends Produto{
	
	private String placa;
	
	
	public Automovel(String tipo, String descricao, int napolice, int vigencia, double valor, double comissao) {
		super(tipo, descricao, napolice, vigencia, valor, comissao);
		this.setPlaca(placa);
		// TODO Auto-generated constructor stub
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}




	
	
}
	

