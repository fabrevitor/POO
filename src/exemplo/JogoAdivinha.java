package exemplo;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int numero = gerador.nextInt(9) + 1;
		int valorDigitado = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um n�mero de 1 a 9: ");
			valorDigitado = teclado.nextInt();
			if(numero == valorDigitado) {
				System.out.println("Parab�ns voc� venceu!");
				break;
			} else {
				if(i < 4) {
					System.out.println("Voc� errou... Tente novamente.");
				} else {
					System.out.println("Voc� perdeu!!! O n�mero correto era: " + numero);
					
				}
				
			}
			
			
		}

	}

}
