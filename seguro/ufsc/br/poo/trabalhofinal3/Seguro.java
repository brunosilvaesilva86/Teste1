package ufsc.br.poo.trabalhofinal3;


import java.util.*;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Map;



public class Seguro {

	private List<ItemSeguro> lista = new ArrayList<ItemSeguro>();
    private Map<Integer, ItemSeguro> apolice = new HashMap<Integer, ItemSeguro>();
    

	public void adiciona(ItemSeguro cta) {
	
    lista.add(cta);
    this.apolice.put(cta.getApolice(), cta);
		
	}
	
	 
	public void imprimeMapa() {
		for (int prodId : apolice.keySet()) {
			ItemSeguro seg = apolice.get(prodId);
			System.out.println("Apólice: "+ seg.getApolice()+
					" - Cliente: "+ seg.getCliente()+
					" - Modelo: "+ seg.getModelo() + 
					" - Comissao:" + seg.getComissao()+
					" - Valor: " + seg.getValorseguro());
			
				
	     }
    }
	public double[] getSaldo() {
		double saldo[] = new double[2];
		for (ItemSeguro cta : lista) {
			if (cta instanceof Automovel)
				saldo[0]+=cta.getValorseguro();
			else 
				saldo[1]+=cta.getValorseguro();
		}
		return saldo;
	}
	

	public void lista() {
		String mensagem;
		for (ItemSeguro cta : lista) {
			mensagem = "Cliente: " + cta.getCliente() + " - Apolice: "+cta.getApolice()+" - Valor do Seguro: "+cta.getValorseguro();
			if (cta instanceof Automovel)
				System.out.println(mensagem+" tipo: Automovel" );
			else 
				System.out.println(mensagem+" tipo: Residencial");
		}
	}
	
	public List<ItemSeguro> getListaOrdemCrescente() {
		Collections.sort(this.lista);
		return this.lista;
	}
	
	public List<ItemSeguro> getListaOrdemDecrescente() {
		Collections.sort(this.lista);
		Collections.reverse(this.lista);
		return this.lista;
	}

	public double getMenorSaldo() {
		Collections.sort(this.lista);
		return Collections.min(this.lista).getValorseguro();
	}

	public double getMaiorSaldo() {
		Collections.sort(this.lista);
		return Collections.max(this.lista).getValorseguro();
	}

	public boolean existeConta(ItemSeguro cta) {
		if (this.lista.contains(cta))
			return true;
		return false;
	}
	
	
}
