package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		double kmLitro = 10;
		double velocidade; 
		int tempoh, tempom;
			System.out.println("Digite a velocidade m�dia(Para encerrar digite: '0'): ");
			velocidade = teclado.nextDouble();
			while (velocidade != 0.0) {
			System.out.println("Digite as horas de viagem: ");
			tempoh = teclado.nextInt();
			System.out.println("Digite os minutos al�m das horas completas: ");
			tempom = teclado.nextInt();
				double tempotot = tempoh + tempom/60;
				double distancia = velocidade*tempotot;
				double combustivel = distancia/kmLitro;
					System.out.println("Dist�ncia percorrida: "+ formata.format(distancia) + "km.");
					System.out.println("Tempo para percorrer o projeto: "+ tempoh+ " horas e "+ tempom + " minutos.");
					System.out.println("Velocidade m�dia da viagem: "+ formata.format(velocidade) + "km/h.");
					System.out.println("Quantidade de litros de combust�vel utilizado: "+ formata.format(combustivel) + "L");
					System.out.println("Digite a velocidade m�dia novamente ou 0 p/ encerrar: ");
					velocidade = teclado.nextDouble();				
		}	
		}

}
