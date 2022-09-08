/*6. Criar um algoritmo que leia o código da carga e o peso (em toneladas) da carga de um caminhão. Caso o 
código não esteja entre os intervalos descritos na tabela, imprimir mensagem: “código inválido”. Calcule e 
imprima: o peso da carga do caminhão convertido em quilos (1 ton – 1000kg) e o preço da carga do 
caminhão, de acordo com a tabela abaixo*/

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codCarga;
		double pesoCarga;
		
		System.out.print("Digite o Peso da carga: ");
		pesoCarga = entrada.nextDouble();
		
		System.out.print("Digite o codigo da carga: ");
		codCarga = entrada.nextInt();
		
		if(codCarga >= 10 || codCarga <= 20) {
			System.out.println("o peso em quilos é de "+ (pesoCarga*1000)+ " e o preço da carga é de R$: "+ (pesoCarga*1000*(100)));
		
		}else if(codCarga >= 21 || codCarga <=30) {
			System.out.println("o peso em quilos é de "+ (pesoCarga*1000) + " e o preço de carga é de R$: "+(pesoCarga*1000*(250)));
		
		}else if(codCarga >=31 || codCarga <=40) {
			System.out.println("o peso em quilos é de "+ (pesoCarga*1000) + " e o preço de carga é de R$: " +(pesoCarga*1000*(330)));
		
		}else {
			System.out.println("algo errado!");
		}
		
		
			
		
	}

}
