package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tipo;
		
		System.out.print("1 - °C > °F / 2 - °F > °C / 3 - °C > K / 4 - K > °C / 5 - °F > K / 6 - K > °F ou 0 para encerrar: ");
		tipo = teclado.nextInt();

		while (tipo != 0) {
			
			switch(tipo) {	
			
			case 1:
				converteCelsiusFahrenheit();
			break;
			 	
			case 2:
				converteFahrenheitCelsius();
			break;
			
			case 3: 
				converteCelsiusKelvin();
			break;
			
			case 4: 
				converteKelvinCelsius();
			break;
			
			case 5:
				converteFahrenheitKelvin();
			break;
			
			case 6:
				converteKelvinFahrenheit();
			break;
			
			default:
					System.out.println("Número inválido. ");
			break;
				
			
				
			}
			
			System.out.print("1 - °C > °F / 2 - °F > °C / 3 - °C > K / 4 - K > °C / 5 - °F > K / 6 - K > °F ou 0 para encerrar: ");
			tipo = teclado.nextInt();
		
		}	

	}

	private static void converteKelvinFahrenheit() {
		
		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Kelvin: ");
		temperatura = teclado.nextDouble();
		conversao = (temperatura * 9/5) - 459.67;
		System.out.println(temperatura + " K equivalem a: " + formata.format(conversao) + "°F");
		
	}

	private static void converteFahrenheitKelvin() {
		
		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperatura = teclado.nextDouble();
		conversao = (temperatura + 459.67) * (5/9) ;
		System.out.println(temperatura + " °F equivalem a: " + formata.format(conversao) + "°K");
		
	}

	private static void converteKelvinCelsius() {
		
		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Kelvin: ");
		temperatura = teclado.nextDouble();
		conversao = temperatura - 273;
		System.out.println(temperatura + " K equivalem a: " + formata.format(conversao) + "°C");
	
		
	}

	private static void converteCelsiusKelvin() {
		
		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Celsius: ");
		temperatura = teclado.nextDouble();
		conversao = temperatura + 273;
		System.out.println(temperatura + " °C equivalem a: " + formata.format(conversao) + "K");
		
		
	}

	private static void converteFahrenheitCelsius() {

		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperatura = teclado.nextDouble();
		conversao = (temperatura - 32) / 1.8;
		System.out.println(temperatura + "°F equivalem a: " + formata.format(conversao) + "°C");
	
		
	}

	private static void converteCelsiusFahrenheit() {
		
		double temperatura, conversao;
		Scanner teclado = new Scanner(System.in);
		NumberFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite a temperatura em Celsius: ");
		temperatura = teclado.nextDouble();
		conversao = temperatura * 1.8 + 32;
		System.out.println(temperatura + " °C equivalem a: " + formata.format(conversao) + "°F");
		
	}
}
