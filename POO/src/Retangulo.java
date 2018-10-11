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

	public Retangulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	public double calculaArea() 
	{
		double area = ladoA * ladoB;
		return area;
	}
	public double calculaPerimetro() 
	{
		double per = 2*(ladoA + ladoB);
		return per;
	}
	public String toString() 
	{
		return (
				"\nNome: " + this.getNome() +
				"\nLado A: " + this.getLadoA() +
				"\nLado B: " + this.getLadoB() +
				"\nÁrea: " + this.calculaArea() +
				"\nPerímetro: " + this.calculaPerimetro()
				);
	}
}
