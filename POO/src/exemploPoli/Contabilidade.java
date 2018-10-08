package exemploPoli;

public class Contabilidade {
	public void gerarDemonstrativo(Funcionario func) {
		System.out.println("O(a) funcionário(a) " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento() + " reais.");
	}
}
