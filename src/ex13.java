/*13. A loja Constrói em Partes produz dois tipos de hastes: cobre e alumínio. Cada haste de cobre é vendida por 
R$ 2,00, e cada haste de alumínio é vendida por R$ 4,00. O desconto dado dependerá da quantidade de 
hastes compradas, conforme tabela abaixo. Fazer um algoritmo para ler a quantidade comprada de cada tipo 
de haste e imprima o total pago. */

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String escolha;
		double quantidade, compra, cobrePreço, aluminioPreço;
		
		System.out.print("Digite a quantidade comprada: ");
		quantidade = entrada.nextDouble();
		
		System.out.print("digite qual voçe comprou cobre ou aluminio: ");
		escolha = entrada.next();
		
		cobrePreço = quantidade * 2.0;
		aluminioPreço = quantidade * 4.0;
		
		
		
		if(escolha.equals("cobre") && quantidade <= 5) {
			System.out.println("ele recebeu 0 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
			
			
		}else if(escolha.equals("cobre") && quantidade <= 20) {
			System.out.println("ele recebeu 15 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
			
		}else if(escolha.equals("cobre") && quantidade > 20) {
			System.out.println("ele recebeu 20 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
			
		}else if(escolha.equals("aluminio") && quantidade <= 5) {
			System.out.println("ele recebeu 0 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
		
		}else if(escolha.equals("aluminio") && quantidade <= 20) {
			System.out.println("ele recebeu 15 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
			
		}else if(escolha.equals("aluminio") && quantidade > 20) {
			System.out.println("ele recebeu 20 de desconto, ele comprou "+ quantidade+" de hates e pagou R$"+cobrePreço);
			
		}else {
			System.out.println("vocçe pode ter escrevido algo errado tente novamente!");
		}
			
		
	}

}
