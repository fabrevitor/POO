package lista3;

public class Empresa{
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

	public void SomaPorDepto(Departamento depto) {
		int somaidade = 0;
		for (int i = 0; i < depto.getFuncionarios().length; i++) {
			somaidade = somaidade + depto.getFuncionarios()[i].getIdade();
		}
		System.out.println(("Somatório idades do departamento " + depto.getArea()+ ": " + somaidade)); 
	}
	public String SomaGeral() {
		int somaidade = 0;
		for(int i = 0; i < depto.length; i++) {
		for (int j = 0; j < depto[i].getFuncionarios().length; j++) {
			somaidade = somaidade + depto[i].getFuncionarios()[j].getIdade();
		}
		}
		return ("Somatório idades da empresa: "+ somaidade); 
	}
	public String IdadePorDepto(Departamento depto) 
	{
		Pessoa maisNova = depto.getFuncionarios()[0];
		Pessoa maisVelha = depto.getFuncionarios()[0];
		for (int j = 0; j < depto.getFuncionarios().length; j++) 
		{
			if (maisNova.getIdade() > depto.getFuncionarios()[j].getIdade()) 
			{
			maisNova = depto.getFuncionarios()[j];
			}
			if(maisVelha.getIdade() < depto.getFuncionarios()[j].getIdade()) 
			{
			maisVelha = depto.getFuncionarios()[j];
			}
		}
		return ("\nPessoa mais nova: " + maisNova + "\nPessoa mais velha: " + maisVelha);
	}
	public String IdadeGeral() 
	
	{
		Pessoa maisNova = depto[0].getFuncionarios()[0];
		Pessoa maisVelha = depto[0].getFuncionarios()[0];
		for (int i = 0; i < depto.length; i ++) 
		{
			for(int j = 0; j < depto[i].getFuncionarios().length; j ++) 
			{
				if(maisNova.getIdade() > depto[i].getFuncionarios()[j].getIdade()) 
				{
					maisNova = depto[i].getFuncionarios()[j];
				}
				if(maisVelha.getIdade() < depto[i].getFuncionarios()[j].getIdade()) 
				{
					maisVelha = depto[i].getFuncionarios()[j]; 
				}
			}
		} 		
		return ("---Mais novo e mais velho da empresa---\n" + "Pessoa mais nova: " + maisNova + "\nPessoa mais velha: " + maisVelha);
	}
	public String QtdeSexoDepto(Departamento depto) 
	{
		int qtdeMasc = 0;
		int qtdeFem = 0;
		for (int j = 0; j < depto.getFuncionarios().length; j++) 
		{
			if (depto.getFuncionarios()[j].getSexo() == "Masculino") 
			{
				qtdeMasc = qtdeMasc + 1;
			}
			else
			{
				qtdeFem = qtdeFem + 1;
			}
		}
		return("\nQuantidade de homens: " + qtdeMasc + "\nQuantidade de mulheres: " + qtdeFem);
	}
	public String QtdeSexoGeral() 
	{
		int qtdeMasc = 0;
		int qtdeFem = 0;
		
		for (int i = 0; i < depto.length; i ++) 
		{
			for(int j = 0; j < depto[i].getFuncionarios().length; j ++)
			{
				if (depto[i].getFuncionarios()[j].getSexo() == "Masculino") 
				{
					qtdeMasc = qtdeMasc + 1;
				}
				else
				{
					qtdeFem = qtdeFem + 1;
				}
			}
		}
		return ("\n--- Quantidade de homens e mulheres na empresa ----" + "\nHomens: " + qtdeMasc + "\nMulheres: " + qtdeFem);
	}
	public String EscolherCidade(String cidade)
	{
		
		for (int i = 0; i < depto.length; i ++) 
		{
			for(int j = 0; j < depto[i].getFuncionarios().length; j ++)
			{
				String cidade2 = depto[i].getFuncionarios()[j].getEndereco().getCidade();
				if (cidade.equals(cidade2)) 
				{
					System.out.println("\nNome: " + depto[i].getFuncionarios()[j].getNome() + "\n" + depto[i].getFuncionarios()[j].getEndereco());
				}
			}
		}
		return "Acima nomes e endereços das pessoas que moram em: " + cidade;
	}
	public double CalcularSalariosBrutos() 
	{
		double salariosbrutos = 0;
		for(int i = 0; i < depto.length; i++) {
		for (int j = 0; j < depto[i].getFuncionarios().length; j++) {
			salariosbrutos = salariosbrutos + depto[i].getFuncionarios()[j].getSalario();
		}
		salariosbrutos = salariosbrutos + depto[i].getGerente().getSalario();
		}
		return (salariosbrutos); 
	}
	public double CalcularImposto(Empresa empresa) 
	{
		double imposto = 0;
		imposto = this.CalcularSalariosBrutos() * 0.9;
		return (imposto);
	}
	public double CalcularSalarioLiq(Funcionario funcionarios) 
	{
		double salarioliq = 0;
		double inss = funcionarios.getSalario() * 0.1;
		double IR = funcionarios.getSalario() * 0.15;
		salarioliq = funcionarios.getSalario() - inss;	
		if (salarioliq > 2000)
		{	
			salarioliq = (funcionarios.getSalario() - inss) - IR;	
		}
	return (salarioliq);
	}
	public double TotalMetas(Empresa empresa) 
	{
		double total = 0;
		for (int i = 0; i < empresa.getDepto().length; i ++)
		{
			total = total + empresa.getDepto()[i].getMeta();
		}
			return total;
	}
	public String MaiorMenorSalario(Empresa empresa)
	{
		Funcionario maiorSalFunc = empresa.getDepto()[0].getFuncionarios()[0];
		Funcionario menorSalFunc = empresa.getDepto()[0].getFuncionarios()[0];
		Gerente maiorSalGer = empresa.getDepto()[0].getGerente();
		Gerente menorSalGer = empresa.getDepto()[0].getGerente();
		
		for (int i = 0; i < empresa.getDepto().length; i++) 
		{
			if(maiorSalGer.getSalario() < empresa.getDepto()[i].getGerente().getSalario())
			{
				maiorSalGer = empresa.getDepto()[i].getGerente();
			}
			if(menorSalGer.getSalario() > empresa.getDepto()[i].getGerente().getSalario())
			{
				menorSalGer = empresa.getDepto()[i].getGerente();
			}
			for (int j = 0; j < empresa.getDepto()[i].getFuncionarios().length ; j ++)
			{
				if(maiorSalFunc.getSalario() < empresa.getDepto()[i].getFuncionarios()[j].getSalario())
				{
					maiorSalFunc = empresa.getDepto()[i].getFuncionarios()[j];
				}
				if(menorSalFunc.getSalario() > empresa.getDepto()[i].getFuncionarios()[j].getSalario())
				{
					menorSalFunc = empresa.getDepto()[i].getFuncionarios()[j];
				}
			}
		}	
		return (
				"\nGerente de maior salário: " + maiorSalGer +
				"\nGerente de menor salário: " + menorSalGer +
				"\nFuncionário de maior salário: " + maiorSalFunc +
				"\nFuncionário de menor salário: " + menorSalFunc
				
				);
	}

		
	}

