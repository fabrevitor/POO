package lista4;
 
public class TrianguloEquilatero extends Triangulo
{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public TrianguloEquilatero(double lado) {
		super();
		this.lado = lado;
	}

	public TrianguloEquilatero() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaArea() {
		double area = (Math.sqrt(3)/4) * (lado * lado);
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double lado2 = lado/2;
		double h = Math.sqrt((lado * lado) + (lado2 * lado2)); 
		double per = lado + lado2 + h;
		return per;
	}

	@Override
	public String toString() {
		return ("\nNome: " + this.getNome() +
				"\nLado: " + this.getLado()+
				"\nÁrea: " + this.calculaArea()+
				"\nPerímetro: " + this.calculaPerimetro()
				);
	}
	

}
