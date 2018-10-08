package lista4;

public class Quadrado extends FormasGeom
{
	
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public void calculaArea() 
	{
		double area = lado * lado;
		System.out.println("\nÁrea do quadrado é: " + area);
	}
	
	public void calculaPerimetro()
	{
		double per = lado * 4;
		System.out.println("Perímetro do quadrado é: " + per);
	}
}
	
