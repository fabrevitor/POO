/*	package lista1;

import java.util.Arrays;
import java.util.Random;

public class Desafio_1 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] numeros = new int[10];
		
		for(int i = 0; i < 10; i ++) {
			numeros[i] = gerador.nextInt(50);
		}

		Arrays.sort(numeros);
		for(int i = 0; i < 10; i ++) {
			System.out.println(numeros[i]);
		}
		
	}

}

*/
		
		package lista1;

		import java.util.Random;

		public class Desafio_1 {

			public static void main(String[] args) {
				Random gerador = new Random();
				int[] numeros = new int[10];
				
				for(int i = 0; i < 10; i ++) {
					numeros[i] = gerador.nextInt(10);
				}
				
				for(int i = 0; i<10; i++) {
					for(int j = 0; j < 9; j++) {
						if (numeros[j] > numeros[j + 1]) {
							int aux = numeros[j];
							numeros [j] = numeros[j +1];
							numeros [j+1] = aux;
						}
						
						
					}
				}
				
				for(int i = 0; i < 10; i ++) {
					System.out.println(numeros[i]);

			}

		}
		}
