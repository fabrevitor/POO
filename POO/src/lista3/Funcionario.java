package lista3;

public class Funcionario extends Pessoa {
	
	private double salario;

	public Funcionario(String nome, int idade, String cpf, Endereco endereco, String sexo, double salario, Contato contato) {
		
		super(nome, idade, cpf, endereco, sexo, contato);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	/*toString para pegar os dados do func de maior sal*/
	@Override
	public String toString() {
		return (
				"\n\n" + super.toString() +
				"\nSalario: " + salario + "\n" 
				);
				
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	}
	
