package lista3;

public class Departamento {
	private String area;
	private Funcionario[] funcionarios;
	private Gerente gerente;
	private double meta;
	
	public Departamento(String area, Funcionario[] funcionarios, Gerente gerente, double meta) {
		super();
		this.area = area;
		this.funcionarios = funcionarios;
		this.gerente = gerente;
		this.meta = meta;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public String getArea() {
		return area;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
}