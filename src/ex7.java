/*7. Faça um programa que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. 
Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o programa deverá escrever 
"Financiamento Concedido"; senão, escreverá "Financiamento Negado". Independente de conceder ou não o 
financiamento, o programa escreverá depois a frase "Obrigado por nos consultar." */

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salario, financiamento, valor;
		
		System.out.print("informe o salario: ");
		salario = entrada.nextDouble();
		
		System.out.print("informe o financimanto pretendido: ");
		financiamento = entrada.nextDouble();
		
		valor = salario * 5.0;
		
		if (financiamento <= valor) {
			System.out.println("FInanciamento concedido!");
			System.out.println("Obrigado por nos consultar!");
			
		}else {
			System.out.println("financiamento negado!");
			System.out.println("Obrigado por nos consultar!");
		}
		
		
		
	}

}
