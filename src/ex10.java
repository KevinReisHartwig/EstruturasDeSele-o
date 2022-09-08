/*10. Leia três números e imprima o maior deles. Não é necessário verificar se os números são iguais.
 
 */
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	int nu1, nu2, nu3, maior;
	
	System.out.println("digite o numero 1: ");
	nu1 = entrada.nextInt();
	
	System.out.println("digite o numero 2: ");
	nu2 = entrada.nextInt();
	
	System.out.println("digite o numero 3: ");
	nu3 = entrada.nextInt();
	
	if(nu1 > nu2 && nu1 > nu3) {
		maior = nu1;
	}else if(nu2 > nu1 && nu2 > nu3){
		maior = nu2;
		
	}else {
		maior = nu3;
	}
	System.out.println("o maior numero foi : "+ maior);
	
	
	
	}
}
