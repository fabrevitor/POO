package lista3;

public class Empresa {
	private String nome;
	private String cnpj;
	private String site;
	private Departamento[] depto;
	private Endereco endereco;
	
	public Empresa(String nome, String cnpj, String site, Departamento[] depto, Endereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.site = site;
		this.depto = depto;
		this.endereco = endereco;
	}
	
	public Empresa() {
		super();
	}

	public Departamento[] getDepto() {
		return depto;
	}

	public void setDepto(Departamento[] depto) {
		this.depto = depto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String SomaPorDepto(Departamento depto) {
		int somaidade = 0;
		for (int i = 0; i < depto.getPessoa().length; i++) {
			somaidade = somaidade + depto.getPessoa()[i].getIdade();
		}
		return ("Somatório idades do departamento " + depto.getArea()+ ": " + somaidade); 
	}
	public String SomaGeral() {
		int somaidade = 0;
		for(int i = 0; i < depto.length; i++) {
		for (int j = 0; j < depto[i].getPessoa().length; j++) {
			somaidade = somaidade + depto[i].getPessoa()[j].getIdade();
		}
		}
		return ("Somatório idades do da empresa é: "+ somaidade); 
	}
	
	public String IdadePorDepto(Departamento depto) {
		Pessoa maisNova = depto.getPessoa()[0];
		Pessoa maisVelha = depto.getPessoa()[0];
		
		
		return ("Pessoa mais nova: " + maisNova + "\nPessoa mais velha: " + maisVelha);
	}
	public String IdadeGeral() {
		Pessoa maisNova = depto[0].getPessoa()[0];
		Pessoa maisVelha = depto[0].getPessoa()[0];
		
		return ("Pessoa mais nova: " + maisNova + "\nPessoa mais velha: " + maisVelha);
	}
}
