package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NumberFormat formatar = new DecimalFormat("0.00");
		String tipo;
		double temperatura, conversao;

		System.out.println("Se você quer converter para Fahrenheit digite 'F', para Celsius digite 'C' ou FIM p/ encerrar: ");
		tipo = teclado.next();

		while (!tipo.equals("FIM")) {
			if (tipo.equals("F")) {
				System.out.println("Digite a temperatura em Celsius: ");
				temperatura = teclado.nextDouble();
				conversao = temperatura * 1.8 + 32;
				System.out.println(temperatura + " °C equivalem a: " + conversao + "°F");
			} 	
			if (tipo.equals("C")) {
					System.out.println("Digite a temperatura em Fahrenheit: ");
					temperatura = teclado.nextDouble();
					conversao = (temperatura - 32) / 1.8;
					System.out.println(temperatura + "°F equivalem a: " + conversao + "°C");
			}
			if(tipo.equals("F") || tipo.equals("C")) {
				System.out.println("Se você quer converter para Fahrenheit digite 'F', para Celsius digite 'C' ou FIM p/ encerrar: ");
				tipo = teclado.next();
			} else {
				System.out.println("Entrada Inválida...");
				System.out.println("Se você quer converter para Fahrenheit digite 'F', para Celsius digite 'C' ou FIM p/ encerrar: ");
				tipo = teclado.next();
				
			}
			
		}

	}
}
