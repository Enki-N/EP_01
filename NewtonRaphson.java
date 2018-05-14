/*********************************************************************/
/**   <nome do(a) aluno(a)>                   <número USP>          **/
/**                                                                 **/
/**   <data de entrega>                                             **/
/*********************************************************************/
class NewtonRaphson {
	/*
		Depósitos realizados, com saldo final
	*/
	static double[] depositos;
	
	/*
		Datas correspondentes aos depósitos feitos e saldo final
	*/
	static int[] datas;
	
	
	/*
		Você pode incluir métodos que ache necessários aqui. Contudo, apenas newton
		será executado diretamente. Então, para que seus métodos rodem, deve haver um
		caminho pelo qual sejam rodados a partir de newton (ex: newton chama um método que
		chama outro. Nesse caso, os 2 acabarão sendo rodados via newton)
	*/
	
	
	/*
		Método para cálculo dos juros de aplicação, segundo Newton-Raphson
		
		NÃO MUDE A ASSINATURA DESSE MÉTODO
	*/
	static double newton(double epsilon) {
		// seu código vai aqui
	}
	
	
	/*
		Use isso apenas para seus testes. Ele pode até ser removido para entrega.
		Use-o para abastecer valores nos arranjos e então testar o método newton.
		
		O MAIN SERÁ COMPLETAMENTE IGNORADO.
	*/
	public static void main(String[] args) {
		// será ignorado
		
		/* 
			exemplo de uso para seu teste:
			4 depósitos, nos meses 1, 3, 5 e 6, com valores de 2000, 123.5, 358.5 e 23
			o 3500.68 é o saldo no mês 10
		
		depositos = new double[5];
		depositos[0] = 2000;
		depositos[1] = 123.5;
		depositos[2] = 358.5;
		depositos[3] = 23;
		depositos[4] = 3500.68;
		datas = new int[5];
		datas[0] = 1;
		datas[1] = 3;
		datas[2] = 5;
		datas[3] = 6;
		datas[4] = 10;
		
		// o 0.001 é a precisão
		System.out.println(newton(0.001));
		*/
	}
}
