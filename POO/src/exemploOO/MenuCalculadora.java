package exemploOO;
import java.util.Scanner;
public class MenuCalculadora {
	Scanner teclado = new Scanner(System.in);
	public void apresentaMenu() {
		System.out.println("Menu Calculadora");
		System.out.println("Opções:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Sair");
		System.out.print("Digite uma opção: ");
		
		int opcao = teclado.nextInt();
		while(opcao != 5) {
		switch(opcao) {
			case 1: {
				this.somar();
				break;
			}
			case 2: {
				this.subtrair();
				break;
			}
			case 3: {
				this.multiplicar();
				break;
			}
			case 4: {
				this.dividir();
				break;
			}
			default: {
				System.out.println("Opção inválida.");
			}
		}
		System.out.println("\nMenu Calculadora");
		System.out.println("Opções:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Sair");
		System.out.print("Digite uma opção: ");
		
		opcao = teclado.nextInt();
		}
		
		
	}

	private void dividir() {
		System.out.print("Digite o dividendo: ");
		double dividendo = teclado.nextDouble();
		System.out.print("Digite o divisor: ");
		double divisor = teclado.nextDouble();
				
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.dividir(dividendo, divisor));
	}

	private void multiplicar() {
		System.out.print("Digite o multiplicando: ");
		double multiplicando = teclado.nextDouble();
		System.out.print("Digite o multiplicador: ");
		double multiplicador = teclado.nextDouble();
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.multiplicar(multiplicando, multiplicador));
	}

	private void subtrair() {
		System.out.print("Digite o minuendo: ");
		double minuendo = teclado.nextDouble();
		System.out.print("Digite o subtraendo: ");
		double subtraendo = teclado.nextDouble();	
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.subtrair(minuendo, subtraendo));
	}

	private void somar() {
		System.out.print("Digite a parcela 1: ");
		double parcela1 = teclado.nextDouble();
		System.out.print("Digite a parcela 2: ");
		double parcela2 = teclado.nextDouble();
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.somar(parcela1, parcela2));
	}

}
