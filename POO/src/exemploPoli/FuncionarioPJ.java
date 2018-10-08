package exemploPoli;

public class FuncionarioPJ extends Funcionario{
	public FuncionarioPJ(String nome, int idade, int matricula) {
		super(nome, idade, matricula);
	}

	public double calculaPagamento() {
		double pagamento = 0.0;
		pagamento = 1000 * 2.5 + 5000;
		return pagamento;
	}
}
