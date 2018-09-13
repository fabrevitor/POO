package associacao;

public class Executavel {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(16, 250, "Porsche");
		Roda r1 = new Roda("P200", 21, "Roda legal");
		Roda r2 = new Roda("P200", 21, "Roda legal");
		Roda r3 = new Roda("P200", 21, "Roda legal");
		Roda r4 = new Roda("P200", 21, "Roda legal");
		Roda r5 = new Roda("P200", 21, "Roda legal");
		Roda[] rodas = {r1, r2, r3, r4, r5};
		
		Carro c1 = new Carro();
		
		c1.setModelo("Cayanne");
		c1.setFabricante("Porsche");
		c1.setAno(2019);
		c1.setKm(0);
		c1.setMotor(m1);
		c1.setRodas(rodas);
		
		System.out.println(c1);
	}

}
