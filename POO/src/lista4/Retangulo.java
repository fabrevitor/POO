package lista4;

public class Retangulo extends FormasGeom
{
	private double ladoA;
	private double ladoB;
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public Retangulo(double ladoA, double ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	public void calculaArea() 
	{
		double area = ladoA * ladoB;
		System.out.println("\nA área do retângulo é: " + area);
	}
	public void calculaPerimetro() 
	{
		double per = 2*(ladoA + ladoB);
		System.out.println("O perímetro do retângulo é: " + per);
	}
}
