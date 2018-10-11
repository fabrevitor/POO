package lista4;

public class TrianguloIsosceles extends Triangulo
{
	private double base;
	private double altura;
	
public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calculaArea() {
		double per = base * altura / 2;
		return per;
	}
	@Override
	public double calculaPerimetro() {
		double hipotenusa = Math.sqrt((altura * altura) + (base * base));
		double per =  hipotenusa + base + altura; 
		return per;
	}
	
	public TrianguloIsosceles(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public TrianguloIsosceles() {
		super();
		
	}
	
	@Override
	public String toString() {
		return ("\nNome: " + this.getNome() +
				"\nBase: " + this.getBase()+
				"\nAltura: " + this.getAltura()+
				"\nÁrea: " + this.calculaArea()+
				"\nPerímetro: " + this.calculaPerimetro()
				);
}
}