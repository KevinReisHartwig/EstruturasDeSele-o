/*12. Leia sexo e idade de uma pessoa e imprima maior idade ou menor idade, considerando que sexo masculino 
e maior idade se maior igual a 21 anos e sexo feminino e maior idade se maior igual a 18 anos
 */

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String sexo;
		int idade;
		
		System.out.print("digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.print("digite seu sexo F/M: ");
		sexo = entrada.next();
		
		if(sexo.equals("M") && idade >= 21) {
			System.out.println("você é maior de idade");
			
		}else if(sexo.equals("M") && idade < 21) {
			System.out.println("vocçe é menor de idade");
		
		}else if(sexo.equals("Ff") && idade >= 18) {
			System.out.println("vocçe é maior de idade");
		
		}else if(sexo.equals("F") && idade < 18) {
			System.out.println("voçe é menor de idade");
		
		}else {
			System.out.println("voçe digitou o sexo errado!");
		}
		
		
		
		
	}

}
