/* . Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada 
(denominador igual a zero). Em caso afirmativo, imprima
contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo.*/

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numerador, denominador, divisão;
		
		System.out.print("Digite o numerador: ");
		numerador = entrada.nextInt();
		
		System.out.print("digite o denominador: ");
		denominador = entrada.nextInt();
		
		if (denominador == 0) {
			System.out.println("não pode denominador igual a 0!");
		}else {
			divisão = numerador/denominador;
			System.out.println("o resultado da divisão foi igual a " + divisão);
		}
		
		
		
		
		
	}

}
