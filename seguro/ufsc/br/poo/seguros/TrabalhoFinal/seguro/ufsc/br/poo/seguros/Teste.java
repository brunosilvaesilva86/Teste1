package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;


public class Teste {

	public static void main (String[] args){
		
	Implementa int1 = new Implementa();
	
	//1 - O sistema deve possibilitar o registro (cadastro) de todas as 
	//informa��es obtidas a partir de um conjunto de requisitos considerando 
	//determinado dom�nio de problema (peso 0,5);	
	
	Cliente cli1 = new Cliente("Onofre", 33445579);
	Corretor cor1 = new Corretor("Anofre", 24557889);
	Produto prod1 = new Automovel("Carro", "Palio", 3523, 24122016, 1000.00, 25);
	Associcao seg1 = new Associcao(cli1, cor1, prod1);
	
	int1.addSeguro(seg1);
	
	Cliente cli2 = new Cliente("Adagoberto", 33445576);
	Corretor cor2 = new Corretor("Astolfo", 24557889);
	Produto prod2 = new Automovel("Carro", "Gol", 3524, 23052015, 1200.00, 10);
	Associcao seg2 = new Associcao(cli2, cor2, prod2);
	
	int1.addSeguro(seg2);
	
	Cliente cli3 = new Cliente("Jailson K", 33445573);
	Corretor cor3 = new Corretor("Astolfo", 24557889);
	Produto prod3 = new Residencial("Residencial", "Fusion", 2278, 23112016, 300.00, 50);
	Associcao seg3 = new Associcao(cli3, cor3, prod3);
	
	
    int1.addSeguro(seg3);
    
    //2 - As informa��es constantes no sistema (inst�ncias dos objetos), 
    //resultado do processo de popula��o, devem ser persistidas em arquivos antes que o mesmo seja finalizado (peso 1,0);
    
    int1.imprimeMapa();
	
    //3 - As inst�ncias dos objetos devem ter o controle de unicidade de informa��o por algum atributo, por exemplo, em inst�ncias 
    //de uma classe Pessoa n�o podem existir duas com o mesmo CPF (peso 0,5);
    
    //OK
    
   
	//4 - O sistema deve possibilitar a listagem por algum tipo de ordem das informa��es de cada classe principal (peso 0,5);
    
    int1.tipo();
    
    //5 - 5. Todas as informa��es podem ser alteradas, 
    //com exce��o do atributo que identifica unicamente determinada inst�ncia de classe (peso 0,5);
    
    
    //6 - O sistema deve permitir a exclus�o de inst�ncias somente se as mesmas n�o estiverem relacionadas a outras inst�ncias, por exemplo, 
    //uma inst�ncia de departamento n�o pode ser exclu�da se esta estiver relacionada a uma inst�ncia de pessoa (peso 0,5);
   
	int1.removeItemMapa(seg2);
	int1.imprimeMapa();
	
	//7 - Ao ser executado posteriormente, o sistema, deve recompor todas as informa��es previamente persistidas em disco, ou seja,
	//o estado desde o �ltimo encerramento do sistema deve ser restabelecido em mem�ria (peso 0,5);
	
	//Item n�o implementado
	
	//8 - Considerando o objetivo principal do sistema o mesmo deve realizar todas as consist�ncias 
	//ou opera��es que se caracterizem como uma regra de neg�cio (por exemplo, em um sistema de controle de 
	//loca��o de livros � fundamental a verifica��o do limite de empr�stimo por usu�rio, a cobran�a de multa, 
	//a travamento de empr�stimo para usu�rios em d�bito, etc.). 
	//Neste sentido, devem ser implementados controles que se caracterizem como regras de neg�cio (peso 1,0);
	
	// A pricipal regra do sistema � a n�o duplicidade das ap�lices, sendo utilizado o n�mero da mesma como 
	//chave para o mapa, evitando entradas duplas. 
	
	 Cliente cli4 = new Cliente("Jailson K", 33445573);
		Corretor cor4 = new Corretor("Astolfo", 24557889);
		Produto prod4 = new Residencial("Residencial", "Videira", 358799, 24072016, 150.00, 35);
		Associcao seg4 = new Associcao(cli4, cor4, prod4);
		
		int1.addSeguro(seg4);
		int1.imprimeMapa();
	
	// 9 - O sistema deve permitir a gera��o de pelo menos dois relat�rios 
	//gerenciais em que as informa��es estejam agrupadas e sumarizadas por determinado crit�rio. 
	//Por exemplo, em um sistema de vendas pode-se apresentar os 10 colaboradores que mais realizaram vendas (peso 1,0);
	
    int1.totalCorretor("Astolfo");
	
	int1.totalProducao();
	
    
	
	//10 - O sistema de permitir a intera��o atrav�s de uma interface 
	//gr�fica possibilitando todas as opera��es definidas na fase de especifica��o (peso 1,0).
	
	// N�o implementado.
	
	
	
	}	


	
	
}
