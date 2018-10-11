package lista4;

public class TrianguloRetangulo extends Triangulo{
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
	
	public double calculaArea() {
		double per = base * altura / 2;
		return per;
	}
	
	public double calculaPerimetro() 
	{
		double hipotenusa = Math.sqrt((altura * altura) + (base * base));
		double per =  hipotenusa + base + altura; 
		return per;
	}
	
	
	public TrianguloRetangulo(String nome, double base, double altura) 
	{
		super(nome);
		this.base = base;
		this.altura = altura;
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
