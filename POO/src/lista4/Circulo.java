package lista4;

public class Circulo extends FormasGeom
{
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
	
	public double calculaArea() 
	{
		double area = (raio*raio) * 3.14;
		return area;
	}
	
	public double calculaPerimetro() 
	{
		double per = (2*3.14) * (raio * raio);
		return per;
	}
	
	public String toString() 
	{
		return (
				"\nNome: " + this.getNome() +
				"\nRaio: " + this.getRaio() + 
				"\nÁrea: " + this.calculaArea() +
				"\nPerímetro: " + this.calculaPerimetro()
				);
				
	}
}
