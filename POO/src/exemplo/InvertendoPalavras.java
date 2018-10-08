package exemplo;

import java.util.Scanner;

public class InvertendoPalavras {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.next();
		
		for (int i = palavra.length(); i > 0 ; i--) {
			System.out.print(palavra.charAt(i-1));
					
		}
		
		
		
		

	}

}
