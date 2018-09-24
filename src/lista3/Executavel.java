package lista3;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco endP1 = new Endereco("Rua das Acácias", 200, "Campinas", "São José", "SC");
		Pessoa p1 = new Pessoa("Ana", 23, "07158483828", endP1, "Feminino");
		
		Endereco endP2 = new Endereco("Rua das Margaridas", 34, "Ingleses", "Floripa", "SC");
		Pessoa p2 = new Pessoa("Carla", 45, "01155083679", endP2, "Feminino");
		
		Endereco endP3 = new Endereco("Rua das Rosas", 1150, "Aririú", "Palhoça", "SC");
		Pessoa p3 = new Pessoa("Cintia",32 , "09876456781", endP3, "Feminino");
		
		Endereco endP4 = new Endereco("Rua das Esmeraldas", 522, "Pedra Branca", "Palhoça", "SC");
		Pessoa p4 = new Pessoa("Bruna", 29, "09876456781", endP4, "Feminino");
		
		Endereco endP5 = new Endereco("Rua das Figueiras", 16, "Estreito", "Floripa", "SC");
		Pessoa p5 = new Pessoa("Zeca", 21, "02518492468", endP5, "Masculino");
		
		Endereco endP6 = new Endereco("Rua dos Eucaliptos", 1255, "Barreiros", "São José", "SC");
		Pessoa p6 = new Pessoa("Pedro", 33, "00137512290", endP6, "Masculino");
		
		Endereco endP7 = new Endereco("Rua dos Diamantes", 9, "Centro", "Biguaçu", "SC");
		Pessoa p7 = new Pessoa("Paulo", 41, "31277448765", endP7, "Masculino");
		
		
		Pessoa[] funcionariosRH = {p1,p2,p3};
		Departamento deptoRH = new Departamento("RH", funcionariosRH);
		Pessoa[] funcionariosComercial = {p4,p5,p6,p7};
		Departamento deptoComercial = new Departamento("Comercial", funcionariosComercial);
		
		Departamento[] deptoEmp1 = {deptoRH, deptoComercial};
		Endereco endEmp1 = new Endereco("Rua Silva Jardim", 360, "Centro", "Floripa", "SC");
		
		Empresa empresa1 = new Empresa("Senac Floripa", "1234567890123456", "WWW.SC.SENAC.BR", deptoEmp1, endEmp1);
		
		System.out.println(empresa1.SomaPorDepto(deptoRH));
		System.out.println(empresa1.SomaPorDepto(deptoComercial));
		System.out.println(empresa1.SomaGeral());
		System.out.println(empresa1.IdadePorDepto(deptoRH));
		System.out.println(empresa1.IdadePorDepto(deptoComercial));
		System.out.println(empresa1.IdadeGeral());
		
		
}
	}
