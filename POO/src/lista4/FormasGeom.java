package lista4;

public abstract class FormasGeom 
{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FormasGeom(String nome) {
		super();
		this.nome = nome;
	}

	public FormasGeom() {
		super();
		
	}
	
	public abstract double calculaArea();
	public abstract double calculaPerimetro();


}
	
	

