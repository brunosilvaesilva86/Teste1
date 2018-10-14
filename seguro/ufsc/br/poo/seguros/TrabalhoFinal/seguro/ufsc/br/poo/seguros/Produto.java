package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;



public class Produto  {
	
	private String tipo="";
	private String descricao="";
	private int napolice=0;
	private int vigencia=0;
	private double valor=0;
	private double comissao=0;
	
	
	
	public Produto(String tipo, String descricao, int napolice, int vigencia, double valor, double comissao) {
		super();
		this.tipo = tipo;
		this.descricao = descricao;
		this.napolice = napolice;
		this.vigencia = vigencia;
		this.valor = valor;
		this.comissao = comissao;
	}
	
	public int getNapolice() {
		return napolice;
	}
	public void setNapolice(int napolice) {
		this.napolice = napolice;
	}
	public int getVigencia() {
		return vigencia;
	}
	public void setVigencia(int vigencia) {
		this.vigencia = vigencia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	

}
