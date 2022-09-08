/*Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo, 
conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o 
novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o 
salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA*/

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigo;
		double salario, aumento;
		
		System.out.print("Digite o salario: ");
		salario = entrada.nextDouble();
		
		System.out.println("codigo de cargos: ");
		System.out.println("Gerente é igual a 101");
		System.out.println("Engenheiro é igual a 102");
		System.out.println("Tecnico é igual a 103");
		System.out.println("Outros digite outro numero");
		System.out.print("Digite o codico do cargo: ");
		codigo = entrada.nextInt();
		
		if(codigo==101) {
			aumento = salario + (salario * 0.10);
			System.out.println("Escolheu Gerente:");
			System.out.println("O aumento do salario " + salario + " foi para " + aumento);
		
		}else if(codigo==102) {
			aumento = salario + (salario * 0.20);
			System.out.println("Escolheu engenheiro:");
			System.out.println("O aumento do salario " + salario + " foi para " + aumento);
		
		}else if(codigo==103) {
			aumento = salario + (salario * 0.30);
			System.out.println("Escolheu tecnico: ");
			System.out.println("O aumento do salario " + salario + (" foi para " + aumento));
				
			
		}else {
			aumento = salario + (salario * 0.05);
			System.out.println("Outra escolha de cargo:");
			System.out.println("O aumento do salario " + salario + (" foi para " + aumento));
		}

		
			
		
	}

}
