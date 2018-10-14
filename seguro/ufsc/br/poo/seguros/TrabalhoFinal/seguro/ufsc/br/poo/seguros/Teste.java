package ufsc.br.poo.seguros.TrabalhoFinal.seguro.ufsc.br.poo.seguros;


public class Teste {

	public static void main (String[] args){
		
	Implementa int1 = new Implementa();
	
	//1 - O sistema deve possibilitar o registro (cadastro) de todas as 
	//informações obtidas a partir de um conjunto de requisitos considerando 
	//determinado domínio de problema (peso 0,5);	
	
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
    
    //2 - As informações constantes no sistema (instâncias dos objetos), 
    //resultado do processo de população, devem ser persistidas em arquivos antes que o mesmo seja finalizado (peso 1,0);
    
    int1.imprimeMapa();
	
    //3 - As instâncias dos objetos devem ter o controle de unicidade de informação por algum atributo, por exemplo, em instâncias 
    //de uma classe Pessoa não podem existir duas com o mesmo CPF (peso 0,5);
    
    //OK
    
   
	//4 - O sistema deve possibilitar a listagem por algum tipo de ordem das informações de cada classe principal (peso 0,5);
    
    int1.tipo();
    
    //5 - 5. Todas as informações podem ser alteradas, 
    //com exceção do atributo que identifica unicamente determinada instância de classe (peso 0,5);
    
    
    //6 - O sistema deve permitir a exclusão de instâncias somente se as mesmas não estiverem relacionadas a outras instâncias, por exemplo, 
    //uma instância de departamento não pode ser excluída se esta estiver relacionada a uma instância de pessoa (peso 0,5);
   
	int1.removeItemMapa(seg2);
	int1.imprimeMapa();
	
	//7 - Ao ser executado posteriormente, o sistema, deve recompor todas as informações previamente persistidas em disco, ou seja,
	//o estado desde o último encerramento do sistema deve ser restabelecido em memória (peso 0,5);
	
	//Item não implementado
	
	//8 - Considerando o objetivo principal do sistema o mesmo deve realizar todas as consistências 
	//ou operações que se caracterizem como uma regra de negócio (por exemplo, em um sistema de controle de 
	//locação de livros é fundamental a verificação do limite de empréstimo por usuário, a cobrança de multa, 
	//a travamento de empréstimo para usuários em débito, etc.). 
	//Neste sentido, devem ser implementados controles que se caracterizem como regras de negócio (peso 1,0);
	
	// A pricipal regra do sistema é a não duplicidade das apólices, sendo utilizado o número da mesma como 
	//chave para o mapa, evitando entradas duplas. 
	
	 Cliente cli4 = new Cliente("Jailson K", 33445573);
		Corretor cor4 = new Corretor("Astolfo", 24557889);
		Produto prod4 = new Residencial("Residencial", "Videira", 358799, 24072016, 150.00, 35);
		Associcao seg4 = new Associcao(cli4, cor4, prod4);
		
		int1.addSeguro(seg4);
		int1.imprimeMapa();
	
	// 9 - O sistema deve permitir a geração de pelo menos dois relatórios 
	//gerenciais em que as informações estejam agrupadas e sumarizadas por determinado critério. 
	//Por exemplo, em um sistema de vendas pode-se apresentar os 10 colaboradores que mais realizaram vendas (peso 1,0);
	
    int1.totalCorretor("Astolfo");
	
	int1.totalProducao();
	
    
	
	//10 - O sistema de permitir a interação através de uma interface 
	//gráfica possibilitando todas as operações definidas na fase de especificação (peso 1,0).
	
	// Não implementado.
	
	
	
	}	


	
	
}
