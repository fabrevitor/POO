package lista2;

import java.util.Scanner;

public class ProgramaCozinha {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Microondas micro = new Microondas();
		Geladeira geladeira = new Geladeira();
		LavaLouca laval = new LavaLouca();
		LavaRoupa lavar = new LavaRoupa();
		Fogao fogao = new Fogao();
		Forno forno = new Forno();
	
		
		geladeira.setFabricante("Consul");
		geladeira.setCapacidade(300);
		geladeira.setModelo("110KQ");
		geladeira.setConsumo(100);
		
		micro.setFabricante("Eletrolux");
		micro.setCapacidadeL(20);
		micro.setConsumo(110);
		micro.setModelo("K20L");
		
		laval.setFabricante("Eletrolux Day");
		laval.setCapacidadeL(100);
		laval.setConsumo(75);
		laval.setModelo("J110");
		
		lavar.setFabricante("Lavalux");
		lavar.setCapacidadeKg(12);
		lavar.setConsumo(100);
		lavar.setModelo("IY110");
		
		fogao.setFabricante("MakeFood");
		fogao.setQtdebocas(6);
		fogao.setConsumo(50);
		fogao.setModelo("Food123");	
		
		forno.setFabricante("Kasper");
		forno.setCapacidadeL(20);
		forno.setConsumo(200);
		forno.setConsumo(forno.getConsumo() + (forno.getConsumo() * 0.25));
		forno.setModelo("Food3000");
		
		
		double consumodiario = fogao.getConsumo() + lavar.getConsumo() + laval.getConsumo() + micro.getConsumo() + geladeira.getConsumo() + forno.getConsumo();
		
		getcalcularConsumo(consumodiario);
		
		
		
}
	private static void getcalcularConsumo(double consdiario) {
		
			System.out.println("Digite o número de dias: ");
			int numdias = teclado.nextInt();
			double consumototal = numdias * consdiario;
			
			System.out.println("Consumo em "+ numdias + " dias: " +consumototal+"Kw");
			System.out.println("Consumo mensal: " + (consdiario * 30)+ "Kw");
			}

}


