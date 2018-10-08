package exemploOO;

import java.util.Random;
import java.util.Scanner;

public class ProgramaMeusBens {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		Bens meusBens = new Bens();
		Scanner teclado = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Moto moto = new Moto();
		Carro carro = new Carro();
		Apto apto = new Apto();
		Casa casa = new Casa();
		
		System.out.println("Digite nome: ");
		String nome = teclado.nextLine();
		p1.setNome(nome);
		
		System.out.print("Digite sua idade: ");
		p1.setIdade(teclado.nextInt());
		
		System.out.print("Digite o CPF: ");
		p1.setCpf(teclado.next());
		
		p1.setCapacidadeFinanceira(gerador.nextInt(2000000));
		
		carro.setFabricante("Honda");
		carro.setModelo("Civic");
		carro.setAno(2017);
		carro.setCor("Branco");
		carro.setValor(gerador.nextInt(100000));
		
		moto.setFabricante("Honda");
		moto.setModelo("CG");
		moto.setAno(2015);
		moto.setCor("Preto");
		moto.setValor(gerador.nextInt(20000));
		
		apto.setArea(200);
		apto.setCor("Branco e marrom");
		apto.setNomeCondominio("Residencial Urbano Rosa");
		apto.setNumero(68);
		apto.setValor(gerador.nextInt(1000000));
		
		casa.setArea(300);
		casa.setCor("Bege");
		casa.setValor(gerador.nextInt(800000));
		
		
		
		System.out.println("------------ PESSOA ------------");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("CPF: " + p1.getCpf());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Finança inicial: " + p1.getCapacidadeFinanceira());
		System.out.println("------------ BENS ------------");
		
		if (p1.getCapacidadeFinanceira() > carro.getValor()){
		
		p1.setCapacidadeFinanceira(p1.getCapacidadeFinanceira() - carro.getValor());
		meusBens.setCarro(carro);
		}
		
		
		if (p1.getCapacidadeFinanceira() > moto.getValor()){
		
		p1.setCapacidadeFinanceira(p1.getCapacidadeFinanceira() - moto.getValor());
		meusBens.setMoto(moto);
		} 
		
		if (p1.getCapacidadeFinanceira() > apto.getValor()){
		
		p1.setCapacidadeFinanceira(p1.getCapacidadeFinanceira() - apto.getValor());
		meusBens.setApto(apto);
		}
		
		if (p1.getCapacidadeFinanceira() > casa.getValor()){
		
		p1.setCapacidadeFinanceira(p1.getCapacidadeFinanceira() - casa.getValor());
		meusBens.setCasa(casa);
		}
		
		
		p1.setMeusBens(meusBens);
		
		System.out.println("Finança final: " + p1.getCapacidadeFinanceira());
		
		if(p1.getMeusBens().getCarro() != null){
		System.out.println("Carro: " + p1.getMeusBens().getCarro().getValor());
		} else {
			System.out.println("Não possui carro.");
		}
		
		if(p1.getMeusBens().getMoto() != null) {
		System.out.println("Moto: " + p1.getMeusBens().getMoto().getValor());
		}
		else {
			System.out.println("Não possui moto.");
		}
		
		if(p1.getMeusBens().getApto() != null) {
		System.out.println("Apartamento: " + p1.getMeusBens().getApto().getValor());
		} else {
			System.out.println("Não possui apartamento.");
		}
		
		if(p1.getMeusBens().getCasa() != null) {
		System.out.println("Casa: " + p1.getMeusBens().getCasa().getValor());
	} else {
		System.out.println("Não possui casa.");
	}
		
		
	}

}

/*System.out.println("------------ CARRO ------------");
System.out.println("Carro da marca: " + carro.getFabricante() + " / Modelo: " + carro.getModelo());
System.out.println("Ano: " + carro.getAno());
System.out.println("Cor: " + carro.getCor());
System.out.println("Valor: " + carro.getValor());*/

/*System.out.println("------------ MOTO ------------");
System.out.println("Moto da marca: " + moto.getFabricante());
System.out.println("Modelo: " + moto.getModelo());
System.out.println("Cor: " + moto.getCor() + " / Ano: " + moto.getAno());
System.out.println("Valor: " + moto.getValor());*/

/*System.out.println("------------ APARTAMENTO ------------");
		System.out.println("Aréa: " + apto.getArea());
		System.out.println("Cor: " + apto.getCor());
		System.out.println("Nome do condomínio: " + apto.getNomeCondominio());
		System.out.println("Núm: " + apto.getNumero());
		System.out.println("Valor: " + apto.getValor());*/

/*System.out.println("------------ CASA ------------");
		System.out.println("Área: " + casa.getArea());
		System.out.println("Cor: " + casa.getCor());
		System.out.println("Valor: " + casa.getValor());*/

