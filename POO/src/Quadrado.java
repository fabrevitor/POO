package lista4;

public class Quadrado extends FormasGeom
{
	
	private double lado;

	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado)
	{
		this.lado = lado;
	}

	public double calculaArea() 
	{
		double area = lado * lado;
		return area;
	}
	
	public double calculaPerimetro()
	{
		double per = lado * 4;
		return per;
	}
	
	public String toString() 
	{
		return (
				"\nNome: " + this.getNome() +
				"\nLado: " + this.getLado() + 
				"\nÁrea: " + this.calculaArea() +
				"\nPerímetro: " + this.calculaPerimetro()
				);
				
	}
}
	
