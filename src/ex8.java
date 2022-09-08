/*8. Dois carros percorreram diferentes distâncias em diferentes tempos. Sabendo que a velocidade média é a 
razão entre a distância percorrida e o tempo levado para percorrê-la, faça um programa para ler as distâncias 
que cada carro percorreu e o tempo que cada um levou, e indique o carro que teve maior velocidade média. */

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double distancia1, distancia2, tempo1, tempo2, media1, media2;
		
		System.out.print("digite a distancia1: ");
		distancia1 = entrada.nextDouble();
		
		
		System.out.print("digite a distancia2: ");
		distancia2 = entrada.nextDouble();
		
		System.out.print("digite o tempo1: ");
		tempo1 = entrada.nextDouble();
		
		System.out.print("digite o tempo2: ");
		tempo2 = entrada.nextDouble();
		
		media1 = distancia1 / tempo1;
		media2 = distancia2 / tempo2;
		
		if(media1 > media2) {
			System.out.println("o primeiro carro foi mais rapido");
		
		}else if(media1 < media2){
			System.out.println("o segundo carro foi mais rapido");
			
		}else {
			System.out.println("os dois carros foram tiveram a mesma velocidade media");
		}
				
	}

}
