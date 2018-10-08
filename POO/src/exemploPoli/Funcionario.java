package exemploPoli;

public abstract class Funcionario extends Pessoa {
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Funcionario(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public abstract double calculaPagamento();

}
