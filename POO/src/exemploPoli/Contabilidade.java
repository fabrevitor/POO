package exemploPoli;

public class Contabilidade {
	public void gerarDemonstrativo(Funcionario func) {
		System.out.println("O(a) funcion�rio(a) " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento() + " reais.");
	}
}
