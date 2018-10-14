package ufsc.br.poo.seguros;

import java.util.*;

public class Seguro  {
	
	
	private int napolice;
	private int vigencia;
	private double valor;
	private double comissao;
	private List<Cliente> cliente = new ArrayList<Cliente>();
	private List<Corretor> corretor = new ArrayList<Corretor>();
	private List<Produto> produto = new ArrayList<Produto>();
    private Map<Integer, List<Cliente>> seguros = new HashMap<Integer, List<Cliente>>();
	
	
	public void addSeguro (Seguro seg){
		
		this.seguros.put(seg.getNapolice(), seg);
		
	}
	
	public static void imprimeSeguro(Map<String, List<Cliente>> param) {
        //aqui responde a sua dúvida
        for(Map.Entry<String, List<Cliente>> entry: param.entrySet()) { 
            for(Cliente c: entry.getValue()) {
                //na variavel `c` vc tem um objeto carteira
                System.out.println(c);
            }
        }
    }
	//public void imprimeMapSeguro() {
		//for (int prodId : seguros.keySet()) {
			//Seguro seg = seguros.get(prodId);
			//System.out.println("Apólice: "+ seg.getCliente().getNome());
					//" - Cliente: "+ ((Cliente) seg.getCliente()).getNome()+
					//" - CPF: "+ ((Cliente) seg.getCliente()).getCpf()+ 
					//" - Vigencia: "+ seg.getVigencia()+
					//" - Comissão: "+ seg.getComissao()+
					//" - Valor: "+ seg.getValor()+
					//" - Tipo Seguro: "+seg.(prodId)+
					//" - Placa: "+;
			
						
	//}

 // }
	
	
	
	public Seguro (int napolice, int vigencia, double valor, double comissao, 
			String nomeCliente, int cpfCliente, String nomeCorretor, int cpfcorretor,String tipoProduto,
			String descricaoProduto, String placa, String endereco){
		
		Cliente cli = new Cliente(nomeCliente, cpfCliente);
		Corretor cor = new Corretor (nomeCorretor, cpfcorretor);
		Produto prod = new Produto(tipoProduto, descricaoProduto, placa, endereco);
		
		
		this.produto.add(prod);
		this.corretor.add(cor);
	    this.cliente.add(cli);
		this.setNapolice(napolice);
		this.setComissao(comissao);
		this.setValor(valor);
		this.setVigencia(vigencia);
		
		
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
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cli) {
		this.cliente.add(cli);
	}
	public List<Corretor> getCorretor() {
		return corretor;
	}
	public void setCorretor(Corretor cor) {
		this.corretor.add(cor);
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(Produto prod) {
		this.produto.add(prod);
	}
	
	
	
	

}
