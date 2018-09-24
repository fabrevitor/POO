package lista3;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private Endereco endereco;
	private String sexo;
	
	public Pessoa(String nome, int idade, String cpf, Endereco endereco, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return ("Nome: " + nome + 
				"\nIdade: " + idade + 
				"\nCpf: " + cpf +
				"\nEndereço: " + endereco 
				+ "\nSexo: "+ sexo);
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
