/*2. Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem 
correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”*/

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("digite um numero: ");
		numero = entrada.nextInt();
		
		if(numero == 0) {
			System.out.println("o numero é 0!");
		}else if(numero % 2 == 0) {
			System.out.println("o numero "+ numero + " é par");
		}else {
			System.out.println("o numero " + numero + " é impar");
		}
		
	}

}
