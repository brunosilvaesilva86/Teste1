package ufsc.br.poo.trabalhofinal3;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Seguro seguro = new Seguro();
		
		
		ItemSeguro seg1 = new Automovel("Joao", 1210, 1000.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg1);
		
		ItemSeguro seg2 = new Automovel("Pedro", 1210, 1100.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg2);
		
		ItemSeguro seg3 = new Residencial("Marcos", 12102, 1000.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg3);

		ItemSeguro seg4 = new Automovel("Rafael", 12103, 1000.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg4);
		
		ItemSeguro seg5 = new Residencial("Almir",12300, 1000.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg5);
	
		ItemSeguro seg6 = new Automovel("Frederico", 12105, 1000.0, 20 , "Palio", "Rua amelias");
		seguro.adiciona(seg6);
		
		seguro.imprimeMapa();
		
		double[] saldoPorTipo = seguro.getSaldo();
		System.out.println("\nProdução Total Seguro Residencial: "+saldoPorTipo[0]);
		System.out.println("Produção Total Automovel: "+saldoPorTipo[1]);
		
		
		
		if (seguro.existeConta(seg2)) {
			System.out.println("\nA Apolice "+seg2.getApolice()+" possui valor de "+
					seg2.getValorseguro()+".");
		}
		
		System.out.println("\nMenor Valor: "+seguro.getMenorSaldo());
		System.out.println("\nMaior Valor: "+seguro.getMaiorSaldo());
		
		System.out.println("\nRelação de seguros ordenadas de forma decrescente pelo valor.");
		for (ItemSeguro seg : seguro.getListaOrdemDecrescente()) {
			System.out.println("Apolice: "+seg.getApolice()+
					" - Cliente: " + seg.getCliente()+
					" - Premio Liquido: "+ seg.getValorseguro());
			        
		}
		double[] producaoTipo = seguro.getSaldo();
		System.out.println("\nSaldo total - Automovel: "+producaoTipo[0]);
		System.out.println("Saldo total - Residencial: "+producaoTipo[1]);
	}

}
