package ufsc.br.poo.seguros;

//import java.util.HashMap;
//import java.util.Map;

public class Produto {
		
	
	private String tipo;
	private String descricao;
	private String placa;
	private String endereco;
	
	
	/*private Map<String, Produto> produto = new HashMap<String, Produto>();
    
	
    public void adicionaProdutoMapAuto(Automovel auto) {
		this.produto.put(getPlaca(), auto);	
	}
    
    public void adicionaProdutoMapResi(Residencial resi){
    	this.produto.put(getEndereco(), resi);
    }
    
	public void imprimeResi() {
		for (String prodId : produto.keySet()) {
			Produto prod = produto.get(prodId);
			System.out.println("Tipo: "+prod.getTipo()+
					" - Descrição: "+prod.getDescricao()+
					" - Endereço: "+prod.getTipo());
		}
	}
	
	public void imprimeAuto() {
		for (String prodId : produto.keySet()) {
			Produto prod = produto.get(prodId);
			System.out.println("Tipo: "+prod.getTipo()+
					" - Descrição: "+prod.getDescricao());
		}
	}
    
	public void removerResiMap(Residencial resi) {
		if (produto.containsKey(getEndereco())) {
			produto.remove(getEndereco());

		}
	}
	
	public void removerAutoMap(Cliente cliente) {
		if (produto.containsKey(cliente.getCpf())) {
			produto.remove(cliente.getCpf());

		}
	}
	*/
	public String getTipo() {
		return tipo;
	}
	public Produto(String tipo, String descricao, String placa, String endereco) {
		super();
		this.tipo = tipo;
		this.descricao = descricao;
		this.placa = placa;
		this.endereco = endereco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
