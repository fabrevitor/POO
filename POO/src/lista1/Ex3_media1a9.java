package lista1;

import java.util.Scanner;

public class Ex3_media1a9 {

	public static void main(String[] args) {
		Scanner valorDigitado = new Scanner(System.in);
		int[] valores = new int [10];
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor de 1 a 9: ");
			valores[i] = valorDigitado.nextInt();
			
			while (valores [i] < 1 || valores[i] > 9) {
				System.out.println("Valor fora da faixa. Digite novamente: ");
				valores[i] = valorDigitado.nextInt();
			}
			
			
			soma = valores[i] + soma;
		}
		
		int media = soma / valores.length;
		System.out.println("A média dos 10 números é: " + media);
		

	}

}
