/*11. Leia um mês e ano e imprima a quantidade de dias que este mês possui. Lembre-se dos anos bissextos. 
 
 */
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes,ano;
		
		System.out.print("digite o Mês: ");
		mes = entrada.nextInt();
		
		System.out.print("digite o ano: ");
		ano = entrada.nextInt();
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("o mês tem 31 dias");
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("o mes tem 30 dias");
		}else if(mes ==2) {
			if(ano % 100 != 0 && ano % 4 == 0 || ano % 400 == 0) {
				System.out.println("o mês tem 29 dias");
			}else {
				System.out.println("o mês tem 28 dias");
			}
		}else {
			System.out.println("mês invalido");
		}
	}
	

}
