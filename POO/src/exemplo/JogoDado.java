package exemplo;

import java.util.Random;

public class JogoDado {

	public static void main(String[] args) {
	
		Random gerador = new Random();
		int[] numerosSorteados = new int[5];
		
		for (int i = 0; i < numerosSorteados.length; i ++) {
			numerosSorteados [i] = gerador.nextInt(6) + 1;
		}
		for (int i = 0; i < numerosSorteados.length; i ++) {
			System.out.println("Número sorteado: " + numerosSorteados[i]);
		}
		
		 

	}

}
