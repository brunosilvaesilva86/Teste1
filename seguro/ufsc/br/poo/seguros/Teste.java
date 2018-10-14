package ufsc.br.poo.seguros;

//testando git 22

public class Teste {

	public static void main (String[] args){
		
	Interface int1 = new Interface();
	
	//O sistema deve possibilitar o registro (cadastro) de todas as informações 
	//obtidas a partir de um conjunto de requisitos considerando determinado 
	//domínio de problema (peso 0,5);	
	
	//Cliente cli1 = new Cliente("Onofre", 33445578);
	//Corretor cor1 = new Corretor("Anofre", 24557889);
	//Produto prod1 = new Produto("Automovel", "Palio");
	Seguro seg1 = new Seguro(12345, 241016, 1000.20, 26, "Bruno", 5678 ,
			                 "Side", 558994333, "Automovel", "Palio", "MEQ3879", "Rua das amelia");
	
	//int napolice, int vigencia, double valor, double comissao, 
	//String nomeCliente, int cpfCliente, String nomeCorretor, int cpfcorretor,String tipoProduto,
	//String descricaoProduto, String placa
	
	int1.addSeguro(seg1);
	
	/*Cliente cli2 = new Cliente("Adagoberto", 33445578);
	cli2.adicionaClienteMap(cli2);
	Corretor cor2 = new Corretor("Astolfo", 24557889);
	cor2.adicionaCorretorMap(cor2);
	Produto prod2 = new Produto("Automovel", "Fusion");
	Seguro seg2 = new Seguro(52345, 24, 1200, 26, cli2, cor2, prod2);
	
	int1.addSeguro(seg2);
	
	Cliente cli3 = new Cliente("Jailson K", 33445578);
	Corretor cor3 = new Corretor("Astolfo", 24557889);
	Produto prod3 = new Produto("Residencial", "Fusion");
	Seguro seg3 = new Seguro(18345, 24, 1200, 26, cli3, cor3, prod3);
	
	int1.addSeguro(seg3);*/
	
	//As informações constantes no sistema (instâncias dos objetos), resultado do processo de população, 
	//devem ser persistidas em arquivos antes que o mesmo seja finalizado (peso 1,0);

	int1.imprimeSeguro();
	
	//int1.removeItemMapa(seg2);
	
	//int1.imprimeMapa();
	
	//int1.totalCorretor("Astolfo");
	
	//int1.totalProducao();
	
	//int1.imprimeLista();

	
	
	}	


	
	
}
