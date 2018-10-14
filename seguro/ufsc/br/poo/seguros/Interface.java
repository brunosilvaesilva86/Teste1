package ufsc.br.poo.seguros;

import java.util.*;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Map;






public class Interface {
	
	
	private List<Seguro> lista = new ArrayList<Seguro>();
	private Map<Integer, Seguro> seguros = new HashMap<Integer, Seguro>();
	
	
	public void addSeguro (Seguro seg){
		
		lista.add(seg);
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
	
	public void removeItemMapa(Seguro seg) {
		if (seguros.containsKey(seg.getNapolice())) {
			seguros.remove(seg.getNapolice());
			System.out.println("Remoção efetuada com sucesso!"
					+ "Imprimir nova listagem atualizada...");

		}
	}
	
	public void totalCorretor(String corretorcomp){
		double total = 0;
		String corretorcompara = corretorcomp;
		for (int prodId : seguros.keySet()) {
			
			Seguro seg = seguros.get(prodId);
			Corretor corretor = seg.getCorretor();
			
			if (corretor.getNome() == corretorcompara)
			total+= seg.getValor();	
				
	}
		System.out.println("Total produção "+ corretorcomp + "= " + total);
   }

	public void totalProducao(){
		double total = 0;
		for (int prodId : seguros.keySet()) {
			Seguro seg = seguros.get(prodId);
			total+= seg.getValor();	
				
	}
		System.out.println("Total produção = "+ total);
   }
	
	//public void imprimeLista() {
		//Collection.sort(this.lista);
		//for (Seguro prod : lista) {
			//System.out.println("Produto id: "+prod.getCliente().getNome ());
			
		//}
	//}
	
	
}
