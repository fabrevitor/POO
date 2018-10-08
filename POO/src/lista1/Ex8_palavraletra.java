

package lista1;

import java.util.Scanner;

public class Ex8_palavraletra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.next();
		
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.substring(0, i));
			
		}
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.substring(0, palavra.length() - i));
			
		}
		
	}

}


