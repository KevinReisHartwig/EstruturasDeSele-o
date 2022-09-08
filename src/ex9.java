/*9. Faça um programa que leia o nome e idade de duas pessoas e imprima o nome da pessoa mais nova, e seu 
ano de nascimento (o programa deve funcionar corretamente para qualquer que seja o ano atual). 
*/
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Date date = new Date();
		
		int ano1, ano2, idade1, idade2;
		String nome1,nome2;
		
		SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy"); //pegar somendo o ano do date
        String currentYear = getYearFormat.format(date);
        System.out.println(currentYear);
		
        System.out.println("digite seu nome: ");
        nome1=entrada.next();
        
        System.out.println("digite seu ano de nascimento:");
        ano1 = entrada.nextInt();
        
        System.out.println("digite o segundo nome: ");
        nome2 = entrada.next();
        
        System.out.println("digite a segunda data de nascimento: ");
        ano2 = entrada.nextInt();
        
        int ano = Integer.parseInt(currentYear); //tranforma String em inteiro
        
        idade1 = ano - ano1;
        idade2 = ano - ano2;
        
        if(idade1 < idade2) {
        	System.out.println("a pessoa mais nova é " + nome1);
        }else {
        	System.out.println("a pessoa mais nova é " + nome2);
        }
        
        
        
		
		
		
		
	}

}
