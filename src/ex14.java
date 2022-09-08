/*14. Uma empresa de energia elétrica trabalha com 3 tipos de consumidores: I – Industrial; C – Comercial; R –
Residencial. Fazer um algoritmo para ler o tipo de consumidor („I‟, „C‟ ou „R‟), a quantidade de energia 
consumida, e calcular e imprimir qual será o valor pago. Para calcular o valor pago, verificar a tabela abaixo. 
 */

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String tipoConsumidor;
		double consumo;
		
		System.out.print("Digite seu tipo de consumidor I = industrial, C = Comercial, R = Residencial: ");
		tipoConsumidor = entrada.next();
		
		System.out.print("Digite a quantidade de energia consumida: ");
		consumo = entrada.nextDouble();
		
		if(!tipoConsumidor.equals("I") || tipoConsumidor.equals("C") || tipoConsumidor.equals("R")) {
			System.out.println("voçe digitou algo errado no seu tipo de consumidor!");
			
		}else {
			if(tipoConsumidor.equals("I")){
				System.out.println("o seu gasto em enerfia sendo industrial foi de R$ " + ((0.68*consumo)+34));
				
				
			}else if(tipoConsumidor.equals("C")){
				System.out.println("o seu gasto em enerfia sendo industrial foi de R$ " + ((0.37*consumo)+45));
				
			}else if(tipoConsumidor.equals("R")){
				System.out.println("o seu gasto em enerfia sendo industrial foi de R$ " + ((0.77*consumo)-22));
				
			}
		}
	}
}
