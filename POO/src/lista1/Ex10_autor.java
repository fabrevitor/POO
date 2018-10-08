package lista1;

import java.util.Scanner;

public class Ex10_autor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do autor: ");
		String nome = teclado.nextLine();
		
		String[] palavras = nome.split(" ");
			
			System.out.print(palavras[palavras.length-1] + ", ");
			
			for(int i = 0; i < palavras.length - 1; i++) {
				System.out.print(palavras[i]+ " ");
				
			}
			
		
		
		
		

	}

}
