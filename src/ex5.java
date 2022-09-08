/*5. Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano. 
Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo 
médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do 
crédito.*/


import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double saldoMedio, resultado;
		
		System.out.print("Digite o saldo medio: ");
		saldoMedio = entrada.nextDouble();
		
		if(saldoMedio <= 200) {
			resultado = saldoMedio;
			System.out.println("O saldo medio foi de " + resultado);
		
		}else if(saldoMedio <= 200 || saldoMedio <= 400) {
			resultado = saldoMedio + (saldoMedio * 0.10);
			System.out.println("O saldo medio foi de " + resultado);
		}else if(saldoMedio > 400) {
			resultado = saldoMedio + (saldoMedio * 0.20);
			System.out.println("O saldo medio foi de " + resultado);
		}else {
			System.out.println("valor invalido!");
		}
		
		
	}

}
