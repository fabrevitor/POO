package lista4;

public class Circulo extends FormasGeom {
	private double raio;

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	public void calculaArea() 
	{
		double area = (raio*raio) * 3.14;
		System.out.println("\nA área do círculo é: " + area);
	}
	
	public void calculaPerimetro() 
	{
		double per = (2*3.14) * (raio * raio);
		System.out.println("O perímetro do círculo é: " + per);
	}
}
