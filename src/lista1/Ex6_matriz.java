package lista1;

import java.util.Random;

public class Ex6_matriz {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int [][] matrizA = new int[4][4];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = gerador.nextInt(10);
			}
		}
		
		System.out.println("Matriz preenchida: ");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				
				if (i == j) {
					matrizA[i][j] = matrizA[i][j] * 2;
				}
				else {
					matrizA[i][j] = matrizA[i][j] * 3;
				}
			
			}
		
		} 
		
		System.out.println("Matriz depois das multiplicações: ");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
				
	}

}
