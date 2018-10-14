package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;

import java.util.*;


public class Implementa {
	
	
	private List<Associcao> lista = new ArrayList<Associcao>();
	private Map<Integer, Associcao> seguros = new HashMap<Integer, Associcao>();
	
	
	public void addSeguro (Associcao seg){
		
		boolean x = testaCpf(seg);
		
		if (x == false){
		lista.add(seg);
		this.seguros.put(seg.getProduto().getNapolice(), seg);	
		}
		if(x==true)
			System.out.println("Cliente já cadastrado: "+ seg.getCliente().getNome()+" - CPF: "+seg.getCliente().getCpf());
		        
	        }
		
	public boolean testaCpf (Associcao f){
		for (Associcao x: lista){
			if(f.getCliente().getCpf() == x.getCliente().getCpf()){
			    return true;
			}
		}
		return false;
		
	}
	
	public void imprimeMapa() {
		
		System.out.println("------ Imprimir listagem de seguro ------ \n");
		for (int prodId : seguros.keySet()) {
			Associcao seg = seguros.get(prodId);
			System.out.println("Apólice: "+ seg.getProduto().getNapolice()+
					" - Cliente: "+ seg.getCliente().getNome()+
					" - CPF: "+ seg.getCliente().getCpf() + 
					" - Tipo Seguro:" + seg.getProduto().getTipo()+
					" - Descrição: " + seg.getProduto().getDescricao()+"\n");
			
				
	}

  }
	
	public void removeItemMapa(Associcao seg) {
		if (seguros.containsKey(seg.getProduto().getNapolice())) {
			seguros.remove(seg.getProduto().getNapolice());
			System.out.println("Remoção efetuada com sucesso!"
					+ "Imprimir nova listagem atualizada...");

		}
	}
	
	public void totalCorretor(String corretorcomp){
		
		double total = 0;
		String corretorcompara = corretorcomp;
		System.out.print("----- Relatório Produção Corretor ----\n");
		for (int prodId : seguros.keySet()) {
			
			Associcao seg = seguros.get(prodId);
			Corretor corretor = seg.getCorretor();
			
			if (corretor.getNome() == corretorcompara)
			total+= seg.getProduto().getValor();	
				
	}
		System.out.println("Total produção "+ corretorcomp + "= " + total);
   }

	public void totalProducao(){
		double total = 0;
		System.out.print("----- Relatório Produção Geral ----\n");
		for (int prodId : seguros.keySet()) {
			Associcao seg = seguros.get(prodId);
			total+= seg.getProduto().getValor();	
				
	}
		System.out.println("Total produção = "+ total);
   }
	
	public void comissaoseguro(String corretorcomp){
		String corretorcompara = corretorcomp;
		double totalcomissao = 0;
		for(Associcao prodId: lista){
			Associcao seg = seguros.get(prodId);
			Corretor corretor = seg.getCorretor();
			
			if (corretor.getNome() == corretorcompara)
				totalcomissao+= seg.getProduto().getValor()*(seg.getProduto().getComissao()/100);	
			
		}
		System.out.println("Total produção = "+ totalcomissao);
	}
	
	public void tipo(){
		
		System.out.println("--------------Listagem por tipo--------------");
		
		for(Associcao x: lista){
		
		if (x.getProduto() instanceof Residencial){
			
			System.out.println("Residencial - " + x.getProduto().getDescricao()+" - " + x.getCliente().getNome() );
		}
        if (x.getProduto() instanceof Automovel){
			
			System.out.println("Automovel - "+ x.getProduto().getDescricao()+" - " + x.getCliente().getNome() );
		}
		
	}
		System.out.println("---------------------------------------------");
}
		
		
	
		
	}
	
	
