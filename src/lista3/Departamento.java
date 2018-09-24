package lista3;

public class Departamento {
	private String area;
	private Pessoa[] pessoa;
	
	public String getArea() {
		return area;
	}

	public Pessoa[] getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa[] pessoa) {
		this.pessoa = pessoa;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Departamento(String area, Pessoa[] pessoa) {
		super();
		this.area = area;
		this.pessoa = pessoa;
	}

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
}
