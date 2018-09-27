package lista3;

import java.util.Scanner;

public class Executavel {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		/// Preenchendo funcionários e gerentes:
		Endereco endP1 = new Endereco("Rua das Acácias", 200, "Campinas", "São José", "SC");
		Contato contP1 = new Contato("999110022", "30333300", "ana@hot.com");
		Gerente p1 = new Gerente("Ana", 23, "07158483828", endP1, "Feminino", 1500.00, contP1);
		
		Endereco endP2 = new Endereco("Rua das Margaridas", 34, "Ingleses", "Floripa", "SC");
		Contato contP2 = new Contato("88103000", "32421111", "carla@gmail.com");
		Funcionario p2 = new Funcionario("Carla", 45, "01155083679", endP2, "Feminino", 1000.00, contP2);
		
		Endereco endP3 = new Endereco("Rua das Rosas", 1150, "Aririú", "Palhoça", "SC");
		Contato contP3 = new Contato("999441144", "30689191", "cintia@gmail.com");
		Funcionario p3 = new Funcionario("Cintia",32 , "09876456781", endP3, "Feminino", 2400.00, contP3);
		
		Endereco endP4 = new Endereco("Rua das Esmeraldas", 522, "Pedra Branca", "Palhoça", "SC");
		Contato contP4 = new Contato("99118015", "30331178", "bruna@hot.com");
		Funcionario p4 = new Funcionario("Bruna", 29, "09876456781", endP4, "Feminino", 2000.00, contP4);
		
		Endereco endP5 = new Endereco("Rua das Figueiras", 16, "Estreito", "Floripa", "SC");
		Contato contP5 = new Contato("999462677", "32426032", "zeka@gmail.com");
		Funcionario p5 = new Funcionario("Zeca", 21, "02518492468", endP5, "Masculino",2100.00, contP5);
		
		Endereco endP6 = new Endereco("Rua dos Eucaliptos", 1255, "Barreiros", "São José", "SC");
		Contato contP6 = new Contato("99901010", "30303030", "pedrin@senac.br");
		Funcionario p6 = new Funcionario("Pedro", 33, "00137512290", endP6, "Masculino", 3000.00, contP6);
		
		Endereco endP7 = new Endereco("Rua dos Diamantes", 9, "Centro", "Biguaçu", "SC");
		Contato contP7 = new Contato("90190101", "30339876", "paulo@senac.br");
		Gerente p7 = new Gerente("Paulo", 41, "31277448765", endP7, "Masculino", 4000.00, contP7);
	
		Endereco endP8 = new Endereco("RUA DAS BROMÉLIAS", 305, "SANTA MÔNICA", "Floripa", "SC");
		Contato contP8 = new Contato("999013040", "30331177", "tavares@ti.com");
		Gerente p8 = new Gerente("Tavares", 52, "44555283569", endP8, "Masculino", 5000.00, contP8);
		
		Endereco endP9 = new Endereco("RUA DOS RUBIS", 15, "Barreiros", "São José", "SC");
		Contato contP9 = new Contato("991783432", "30331234", "gui@senac.br");
		Funcionario p9 = new Funcionario("Guilherme", 25, "30134585818", endP9, "Masculino", 2370.00, contP9);
		
		Endereco endP10 = new Endereco("Rua das Ametistas", 5522, "Coqueiros", "Floripa", "SC");
		Contato contP10 = new Contato("999996677", "30338899", "luana@hotmail.com");
		Funcionario p10 = new Funcionario("Luana", 30, "78901485451", endP10, "Feminino", 1000.00, contP10);
		/// Acaba preenchimento de funcionários e gerentes.
		
		/// Preenche os deptos e cria array de funcionarios e gerentes / Cria Empresa
		Funcionario[] funcionariosRH = {p2,p3};
		Departamento deptoRH = new Departamento("RH",funcionariosRH,p1, -50000.00);
		Funcionario[] funcionariosComercial = {p4,p5,p6};
		Departamento deptoComercial = new Departamento("Comercial", funcionariosComercial,p7, 220000.00);
		Funcionario[] funcionariosTI = {p9,p10};
		Departamento deptoTI = new Departamento ("TI", funcionariosTI, p8, 75000.00);
		
		Funcionario[] funcionarios = {p2,p3,p4,p5,p6,p9,p10};
		Gerente[] gerentes = {p1,p7,p8};
		
		Departamento[] deptoEmp1 = {deptoRH, deptoComercial, deptoTI};
		
		Endereco endEmp1 = new Endereco("Rua Silva Jardim", 360, "Centro", "Floripa", "SC");
		
		Empresa empresa1 = new Empresa("Senac Floripa", "1234567890123456", "WWW.SC.SENAC.BR", deptoEmp1, endEmp1);
			
		// -----------Imprimir ------------ //	
		
		
		for (int i = 0; i < deptoEmp1.length; i++) {
			empresa1.SomaPorDepto(deptoEmp1[i]);
		}
		
		System.out.println("\n---Soma da empresa---\n" + empresa1.SomaGeral());
		
		for (int i = 0; i < deptoEmp1.length; i++) {
			System.out.println("\n--- Mais novo e mais velho do depto " + deptoEmp1[i].getArea() + "---\n"  + empresa1.IdadePorDepto(deptoEmp1[i]));
		}
		
		System.out.println(empresa1.IdadeGeral());
		
		for (int i = 0; i < deptoEmp1.length; i++)
		{
			System.out.println("\n--- Qtde de homens e mulheres do depto " + deptoEmp1[i].getArea() +"---\n" + empresa1.QtdeSexoDepto(deptoEmp1[i]));
		}
		
		System.out.println(empresa1.QtdeSexoGeral());
		System.out.println("\nDigite uma cidade como parâmetro: ");
		System.out.println(empresa1.EscolherCidade(teclado.nextLine()));
		
		System.out.println("\nComissão do Gerente de RH " + empresa1.getDepto()[0].getGerente().CalcularComissao(p1));
		System.out.println("\nComissão do Gerente de Comercial: " + empresa1.getDepto()[1].getGerente().CalcularComissao(p7));
		
		System.out.println("\nValor total de salários brutos a ser pago pela empresa: " + empresa1.CalcularSalariosBrutos());
		System.out.println("\nValor total de impostos a ser pago pela empresa: " + empresa1.CalcularImposto(empresa1));
		
		/// OPÇÃO DE FAZER UM FOR PARA RECEBER NOME E IMPRIMIR SALÁRIO DO NOME DESEJADO 
		/* Sem método */System.out.println("\nSalário: " + funcionarios[0].getSalario());
		System.out.println("\nSalário líquido:  " + empresa1.CalcularSalarioLiq(funcionarios[0]));
		
		System.out.println("\nTotal de metas da empresa: " + empresa1.TotalMetas(empresa1));
		System.out.println(empresa1.MaiorMenorSalario(empresa1));
		
		
		/* Sem método */ System.out.println("\nContato do funcionário: " + funcionarios[0].getContato());
	}
}