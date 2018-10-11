package lista4;

public class Losango extends FormasGeom 
{
	
	private double ladoA;
	private double ladoB;
	private double diagA;
	private double diagB;
	
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
	
	
	public double getDiagA() {
		return diagA;
	}
	public void setDiagA(double diagA) {
		this.diagA = diagA;
	}
	public double getDiagB() {
		return diagB;
	}
	public void setDiagB(double diagB) {
		this.diagB = diagB;
	}
	
	
	public Losango(double ladoA, double ladoB, double diagA, double diagB) {
		super();
		
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagA = diagA;
		this.diagB = diagB;
	}
	public double calculaArea() 
	{
		double area = (diagA * diagB)/2;
		return area;
	}
	public double calculaPerimetro() 
	{
		double per = (ladoA * 2) + (ladoB * 2);
		return per;
	}
	public String toString() 
	{
	return (
			"\nNome: " + this.getNome() +
			"\nLado A: " + this.getLadoA() +
			"\nLado B: " + this.getLadoB() +
			"\nDiagonal A: " + this.getLadoA() +
			"\nDiagonal B: " + this.getDiagB() +
			"\nÁrea: " + this.calculaArea() +
			"\nPerímetro: " + this.calculaPerimetro()
			);
	}
}
