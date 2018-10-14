package ufsc.br.poo.trabalhofinal3;

public abstract class ItemSeguro implements Comparable<ItemSeguro> {
	
	private int apolice = 0;
	private double valorseguro = 0.0;
	private double comissao = 0.00;
	private String modelo = "";
	private String endereco ="";
	private String cliente ="";


	public ItemSeguro(String cliente, int apolice, double valorseguro, double comissao, String modelo, String endereco) {
		
	
		this.apolice = apolice;
		this.valorseguro = valorseguro;
		this.comissao = comissao;
		this.modelo = modelo;
		this.endereco = endereco;
		this.cliente = cliente;
		
	}




	public String getCliente() {
		return cliente;
	}




	public void setCliente(String cliente) {
		this.cliente = cliente;
	}




	public int getApolice() {
		return apolice;
	}




	public void setApolice(int apolice) {
		this.apolice = apolice;
	}




	public double getValorseguro() {
		return valorseguro;
	}




	public void setValorseguro(double valorseguro) {
		this.valorseguro = valorseguro;
	}




	public double getComissao() {
		return comissao;
	}




	public void setComissao(double comissao) {
		this.comissao = comissao;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public int compareTo(ItemSeguro conta) {
		if (this.getValorseguro() < conta.getValorseguro()) return -1;
		if (this.getValorseguro() > conta.getValorseguro()) return 1;
		return 0;
	}

	

}
