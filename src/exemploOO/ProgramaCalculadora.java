package exemploOO;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		MenuCalculadora menu = new MenuCalculadora();
		menu.apresentaMenu();
		
	}

}







/* DecimalFormat formata = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);
Calculadora calculadora = new Calculadora();
System.out.println("Digite o primeiro n�mero: ");
double valor1 = teclado.nextDouble();
System.out.println("Digite o segundo n�mero: ");
double valor2 = teclado.nextDouble();


System.out.println("Soma: " + calculadora.somar(valor1, valor2));
System.out.println("Divis�o: " + formata.format(calculadora.dividir(valor1, valor2)));
System.out.println("Multiplica��o: " + formata.format(calculadora.multiplicar(valor1, valor2)));
System.out.println("Subtra��o: " + calculadora.subtrair(valor1, valor2));	*/
