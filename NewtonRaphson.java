/*********************************************************************/
/**   <Victor Almeida Nicacio Queiroz>        <10856737>            **/
/**                                                                 **/
/**   <18/05/2018>                                                  **/
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

            double j = 0.5; // Primeiro valor para a taxa de juros J.
            double temp = 0.5; // Variavel temporaria para o calculo do Jk+1.
            double resul_funJ = 0; //Variaveil que armazena o valor da função f(j).
            double resul_funJlinha = 0; // Variavel que armazena o valor da derivada da função f(j).

            do{

                //Laço para calcular o valor da função f(j) e a derivada f'(j).
                for(int i = 0; i < (depositos.length - 1); i++){

                    // Calcula f(j) e armazena na variavel (Resul_funJ).
                    resul_funJ += depositos[i]*Math.pow((1 + j),(datas[datas.length - 1] - datas[i]));

                    // Calcula a derivada f'(j) e armazena em (Resul_funJlinha) 
                    resul_funJlinha += (datas[datas.length - 1] - datas[i]) * depositos[i]*Math.pow((1 + j),(datas[datas.length - 1] - datas[i]) - 1);
                }

                resul_funJ -= depositos[depositos.length - 1]; // Subtrai o valor do saldo.
                temp = j; // Cria o Jk para comparar com o Jk+1.
                j = j - (resul_funJ / resul_funJlinha); // Faz o incremento dos juros, Jk+1.
                resul_funJ = 0; // Reseta a função f(j).
                resul_funJlinha = 0; // Reseta a derivada f'(j).

            }while(Math.abs(j - temp) >= epsilon); // Condição para que continue com as iterações.

            if(epsilon <= 0 || epsilon >= 1){ // Se o epsilon estiver fora do intervalo, ira retornar (-1) como erro.
                return -1;
            }else{
                return j;
            }
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
		*/
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
		
	}
}
