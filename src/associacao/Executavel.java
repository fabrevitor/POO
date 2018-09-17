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
		Pessoa[] pessoas = {p1,p2};
		
		String modelo = " ";
		int ano = 0;
		for (int i = 0; i < pessoas.length; i++) {
			for(int j = 0 ;   j < pessoas[i].getCarros().length  ; j++) {
				if(pessoas[i].getCarros()[j].getAno() > ano) {
					ano = pessoas[i].getCarros()[j].getAno();
					modelo = pessoas[i].getCarros()[j].getModelo();
				}
			}
		}
		double potencia = 0;
		String modelopot = " ";
		String nome = " ";
		for (int i = 0; i < pessoas.length; i ++) {
			for(int j = 0 ;   j < pessoas[i].getCarros().length  ; j++) {
				if(pessoas[i].getCarros()[j].getMotor().getPotencia() > potencia) {
					potencia = pessoas[i].getCarros()[j].getMotor().getPotencia();
					modelopot = pessoas[i].getCarros()[j].getModelo();
					nome = pessoas[i].getNome();
				}						
			}		
		}
		String nomenovo = pessoas[0].getNome();
		int idadenovo = pessoas[0].getIdade();
		String cpfnovo = pessoas[0].getDoc().getCpf();
		String rgnovo = pessoas[0].getDoc().getRg();
		
		for (int i = 1; i < pessoas.length; i ++) {
			if(pessoas[i].getIdade() < idadenovo) {
				nomenovo = pessoas[i].getNome();
				idadenovo = pessoas[i].getIdade();
				cpfnovo = pessoas[i].getDoc().getCpf();
				rgnovo = pessoas[i].getDoc().getRg();
			}
		}
		
		String nomevelho = pessoas[0].getNome();
		int idadevelho = pessoas[0].getIdade();
		Endereco[] enderecovelho = pessoas[0].getEnderecos(); 
		
		for (int i = 1; i < pessoas.length; i ++) {
			if(pessoas[i].getIdade() > idadevelho) {
				nomevelho = pessoas[i].getNome();
				idadevelho = pessoas[i].getIdade();		
				enderecovelho = pessoas[i].getEnderecos();
			}
		}	
	System.out.println("\n---- Carro mais novo ----" + "\nModelo: " + modelo + "\nAno: " + ano);
	System.out.println("\n---- Carro mais potente ----" + "\nPotência: " + potencia + "\nModelo: " + modelopot + "\nProprietário: " + nome);
	System.out.println("\n---- Mais velho ----" + "\nNome: " + nomevelho + "\nIdade: " + idadevelho + "\nEndereços: " + Arrays.toString(enderecovelho));
	System.out.println("\n---- Mais novo ----" + "\nNome: " + nomenovo + "\nIdade: " + idadenovo + "\nCPF: " + cpfnovo + "\nRG: " + rgnovo);
	}

}
