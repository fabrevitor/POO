package lista1;

import java.util.Scanner;

public class Ex7_palavralinha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		
		String [] palavras = frase.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}

	}

}
