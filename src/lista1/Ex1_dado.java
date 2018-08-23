package lista1;

import java.util.Random;

public class Ex1_dado {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] dado = {1,2,3,4,5,6};
		
		for (int i = 1; i <= 10; i ++) {
			System.out.println("O "+ i + "º número sorteado no dado foi: "  + dado[gerador.nextInt(6)] );
			}
			 
			
		}
		
		

	}


