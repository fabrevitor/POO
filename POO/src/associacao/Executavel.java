package associacao;

import java.util.Arrays;

public class Executavel {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(16, 250, "Porsche");
		Roda r1 = new Roda("P200", 21, "Roda legal");
		Roda r2 = new Roda("P200", 21, "Roda legal");
		Roda r3 = new Roda("P200", 21, "Roda legal");
		Roda r4 = new Roda("P200", 21, "Roda legal");
		Roda r5 = new Roda("P200", 21, "Roda legal");
		Roda[] rodas1 = {r1, r2, r3, r4, r5};
		Carro c1 = new Carro();
		c1.setModelo("Cayanne");
		c1.setFabricante("Porsche");
		c1.setAno(2019);
		c1.setKm(0);
		c1.setMotor(m1);
		c1.setRodas(rodas1);
		
		Motor m2 = new Motor(8, 82, "VW");
		Roda r6 = new Roda("V82", 14, "Roda legal");
		Roda r7 = new Roda("V82", 14, "Roda legal");
		Roda r8 = new Roda("V82", 14, "Roda legal");
		Roda r9 = new Roda("V82", 14, "Roda legal");
		Roda[] rodas2 = {r6, r7, r8, r9};
		Carro c2 = new Carro();
		c2.setModelo("Gol");
		c2.setFabricante("VW");
		c2.setAno(2001);
		c2.setKm(89654);
		c2.setMotor(m2);
		c2.setRodas(rodas2);
		
		
		Carro[] carrosp1 = {c1, c2};
		
		Endereco end1 = new Endereco();
		end1.setRua("Rua do Senac");
		end1.setNumero(500);
		end1.setBairro("Centro");
		
		Endereco end2 = new Endereco("Rua da minha Casa", 1, "Barreiros");
		
		Endereco[] enderecosp1 = {end1, end2};
		
		Documento docp1 = new Documento();
		docp1.setCpf("01234567890");
		docp1.setRg("0123456");
		
		Pessoa p1 = new Pessoa("Adriano", 40, docp1, enderecosp1, carrosp1);
	//	----------------------------------------------------//
		
		Motor motor1 = new Motor(16, 170, "Honda");
		Roda roda1 = new Roda("HX30", 19, "Roda top");
		Roda roda2 = new Roda("HX30", 19, "Roda top");
		Roda roda3 = new Roda("HX30", 19, "Roda top");
		Roda roda4 = new Roda("HX30", 19, "Roda top");
		Roda roda5 = new Roda("HX30", 19, "Roda top");
		Roda[] rodascarro1 = {roda1, roda2, roda3, roda4, roda5};
		Carro carro1 = new Carro();
		carro1.setModelo("Civic");
		carro1.setFabricante("Honda");
		carro1.setAno(2018);
		carro1.setKm(23875);
		carro1.setMotor(motor1);
		carro1.setRodas(rodascarro1);
		
		Motor motor2 = new Motor(8, 110, "Citroen");
		Roda roda6 = new Roda("C40", 15, "Roda normal");
		Roda roda7 = new Roda("C40", 15, "Roda normal");
		Roda roda8 = new Roda("C40", 15, "Roda normal");
		Roda roda9 = new Roda("C40", 15, "Roda normal");
		Roda[] rodascarro2 = {roda6, roda7, roda8, roda9};
		Carro carro2 = new Carro();
		carro2.setModelo("C3");
		carro2.setFabricante("Citroen");
		carro2.setAno(2013);
		carro2.setKm(52451);
		carro2.setMotor(motor2);
		carro2.setRodas(rodascarro2);
		
		
		Carro[] carrosp2 = {carro1, carro2};
		
		Endereco ender1 = new Endereco();
		end1.setRua("Serv. Aug Haeming");
		end1.setNumero(68);
		end1.setBairro("Centro");
		
		Endereco ender2 = new Endereco("Prof Evanda Sueli", 30, "Centro");
		
		Endereco[] enderecosp2 = {ender1, ender2};
		
		Documento docp2 = new Documento();
		docp2.setCpf("01234567890");
		docp2.setRg("0123456");
		
		Pessoa p2 = new Pessoa("Vitor",20, docp2, enderecosp2, carrosp2);
// --------------------------//
		
		Pessoa[] pessoas = {p1,p2};
		
	Carro maisNovo = pessoas[0].getCarros()[0];
		for (int i = 0; i < pessoas.length; i++) {
			for(int j = 0 ;   j < pessoas[i].getCarros().length  ; j++) {
				if(pessoas[i].getCarros()[j].getAno() > maisNovo.getAno()) {
					maisNovo = pessoas[i].getCarros()[j];
				}
			}
		}
		
		Pessoa pessoaPotente = pessoas[0];
		for(int i = 1; i < pessoas.length; i++) {
			if(pessoaPotente.getCarroMaisPotente().getMotor().getPotencia() < pessoas[i].getCarroMaisPotente().getMotor().getPotencia()) {
				pessoaPotente = pessoas[i];
			}
		}
		
		Pessoa PessoaNova = pessoas[0]; 
		for (int i = 1; i < pessoas.length; i ++) {
			if(pessoas[i].getIdade() < PessoaNova.getIdade()) {
				PessoaNova = pessoas[i];
			}
		}
		
		
		Pessoa maisVelha = pessoas[0];
		for (int i = 1; i < pessoas.length; i ++) {
			if(pessoas[i].getIdade() > maisVelha.getIdade()) {
				maisVelha = pessoas[i];
			}
		}	
	System.out.println("\n---- Carro mais novo ----" + "\nModelo: " + maisNovo.getModelo() + "\nAno: " + maisNovo.getAno());
	System.out.println("\n---- Carro mais potente ----" + "\nPotência: " + pessoaPotente.getCarroMaisPotente().getMotor().getPotencia() + "\nModelo: " + pessoaPotente.getCarroMaisPotente().getModelo() + "\nProprietário: " + pessoaPotente.getNome());
	System.out.println("\n---- Mais velho ----" + "\nNome: " + maisVelha.getNome() + "\nIdade: " + maisVelha.getIdade() + "\nEndereços: " + Arrays.toString(maisVelha.getEnderecos()));
	System.out.println("\n---- Mais novo ----" + "\nNome: " + PessoaNova.getNome() + "\nIdade: " + PessoaNova.getIdade() + "\nCPF: " + PessoaNova.getDoc().getCpf() + "\nRG: " + PessoaNova.getDoc().getRg());
	}

}
