package lista3;

public class Gerente extends Pessoa {
	
	private double salario;
	public Gerente(String nome, int idade, String cpf, Endereco endereco, String sexo, double salario,Contato contato) {
		super(nome, idade, cpf, endereco, sexo, contato);
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double CalcularComissao(Gerente gerente){
		  double salario = (gerente.getSalario() * 0.20);
		  return salario;
		}
	/*toString para pegar os dados do gerente de maior sal*/
	@Override
	public String toString() {
		return (
				"\n\n" + super.toString() + 
				"\nSalario: \" + salario " + "\n"
				);
				
	}
}
