package lista1;

import java.util.Scanner;

public class Ex9_inverter {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.next();
		
		char[] palavrainvert = new char [palavra.length()];
		
		palavra.getChars(0, palavra.length() , palavrainvert, 0);
		
		for(int i = 1; i <= palavrainvert.length; i++) {
			System.out.print(palavrainvert[palavrainvert.length - i]);
		}
		
		

	}

}
