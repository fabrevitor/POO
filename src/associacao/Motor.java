package associacao;

public class Motor {
	private int qtdeValvulas;
	private double potencia;
	private String fabricante;
	public Motor(int qtdeValvulas, double potencia, String fabricante) {
		super();
		this.qtdeValvulas = qtdeValvulas;
		this.potencia = potencia;
		this.fabricante = fabricante;
	}
	
	public Motor() {
		super();

	}
	
	public int getQtdeValvulas() {
		return qtdeValvulas;
	}
	public void setQtdeValvulas(int qtdeValvulas) {
		this.qtdeValvulas = qtdeValvulas;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "\nMotor"
				+ "\nQuantidade de Valvulas: " + qtdeValvulas 
				+ "\n Potência: " + potencia
				+ "\n Fabricante: " + fabricante ;
	}
	
	
	
}
