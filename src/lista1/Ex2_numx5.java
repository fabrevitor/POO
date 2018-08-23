package lista1;

import java.util.Random;

public class Ex2_numx5 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] numeros = new int[8+1];
		int[] numerosx5 = new int [8+1];
		
		for (int i = 1; i <= 8; i++) {
			numeros [i] = gerador.nextInt(100);
			numerosx5 [i] = numeros[i] * 5; 
			
		}
		
		for(int i = 1; i <= 8 ; i++) {
			System.out.println("O " + i + "º número aleatório é: " + numeros[i]);
			System.out.println("O número multiplicado por 5 resulta em: " + numerosx5[i]);
			
		}
		
		
		

	}

}
