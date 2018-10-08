package exercicios;

import java.util.Random;
import java.util.Scanner;

public class sobremesa {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		String [] frutas = new String [6];
		
		for (int i = 0; i < frutas.length; i ++) {
			System.out.println("Digite o nome da fruta: ");
			frutas [i] = teclado.next();
		}
		
		
		for (int i = 1; i < 4 ; i ++) {
			System.out.print(frutas[gerador.nextInt(6)]+" ");
			System.out.print(frutas[gerador.nextInt(6)]+" ");
			System.out.println(frutas[gerador.nextInt(6)]);		
		}
		}
}
