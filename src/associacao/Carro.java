package associacao;

import java.util.Arrays;

public class Carro {
	private String modelo;
	private String fabricante;
	private int ano;
	private double km;
	private  Motor motor;
	private Roda[] rodas;
	
	public Carro(String modelo, String fabricante, int ano, double km, Motor motor, Roda[] rodas) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.km = km;
		this.motor = motor;
		this.rodas = rodas;
	}

	public Carro() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Roda[] getRodas() {
		return rodas;
	}

	public void setRodas(Roda[] rodas) {
		this.rodas = rodas;
	}

	
	@Override
	public String toString() {
		return "Carro"
				+ "\nModelo: " + modelo
			    + "\nFabricante: " + fabricante
			    + "\nAno: " + ano
			    + "\nKm: " + km 
			    + "\n"+ motor 
			    + "\n\n" + Arrays.toString(rodas);
	}
	

	
}
