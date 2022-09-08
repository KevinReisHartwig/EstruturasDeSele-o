/*3. Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o 
usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar 
mensagem de erro. (utilize a estrutura ESCOLHA)*/

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2, escolhaOperações;
		
		System.out.println("Operações escolhe uma: ");
		System.out.println("1 = soma.");
		System.out.println("2 = subtração.");
		System.out.println("3 = multiplicação.");
		System.out.println("4 = divisão.");
		System.out.print("sua escolha é: ");
		escolhaOperações = entrada.nextInt();
		
		System.out.print("escolha o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("escolha o segundo numero: ");
		numero2 = entrada.nextInt();
		
		if(escolhaOperações == 1) {
			System.out.println("A soma dos dois numeros é igual a " + (numero1+numero2));
		
		}else if(escolhaOperações == 2) {
			System.out.println("A subtração dos dois numeros é igual a "+ (numero1-numero2));
			
		
		}else if(escolhaOperações == 3) {
			System.out.println("A multiplicação dos dois numeros é igual a " + (numero1 * numero2));
		
		}else if(escolhaOperações == 4) {
			if(numero2 == 0) {
				System.out.println("não pode denominador igual a 0!");
			}else {
				System.out.println("A divisão dos dois numeros é igual a " + (numero1/numero2));
			}
			
		
		}else {
			System.out.println("opcão de operação invalida!");
		}
		
		
	}

}
