package lista1;

import java.util.Random;

public class Ex5_adicaomatriz {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int [][] matrizA = new int[4][4];
		int [][] matrizB = new int[4][4];
		int [][] matrizC = new int[4][4];
		
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = gerador.nextInt(100);
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = gerador.nextInt(100);
			}
		}
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		
			for (int i = 0; i < matrizC.length; i++) {
				for (int j = 0; j < matrizC.length; j++) {
					System.out.print(matrizC[i][j] + " ");
				
				}
					System.out.println();
			}

	}

}
