package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;



public class Associcao  {
	
	private Cliente cliente;
	private Corretor corretor;
	private Produto produto;
	
	
	public Associcao(Cliente cliente, Corretor corretor, Produto produto) {
		super();
		this.cliente = cliente;
		this.corretor = corretor;
		this.produto = produto;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Corretor getCorretor() {
		return corretor;
	}
	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	

	
	

}
