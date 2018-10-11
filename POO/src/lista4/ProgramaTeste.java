package lista4;

import java.util.Random;

public class ProgramaTeste 
{
	
	public static void main(String[] args)
	{
		Random gerador = new Random();
		FormasGeom[] formas = new FormasGeom[7];
		
		for (int i = 0; i < formas.length; i++) 
		{
			switch (gerador.nextInt(3)) 
			{
				case 0:
					Circulo circ1 = new Circulo(gerador.nextInt(15));
					formas[i] = circ1;
					circ1.setNome("Círculo");
					break;
				case 1:
					Quadrado quad1 = new Quadrado(gerador.nextInt(15));
					formas[i] = quad1;
					quad1.setNome("Quadrado");
					break;
				case 2:
					Retangulo ret1 = new Retangulo(gerador.nextInt(15),gerador.nextInt(15));
					formas[i] = ret1;
					ret1.setNome("Retângulo");
					break;
				case 3:
					Losango los1 = new Losango(gerador.nextInt(15),gerador.nextInt(15), gerador.nextInt(15), gerador.nextInt(15));
					formas[i] = los1;
					los1.setNome("Losango");
					break;
			}
		System.out.println("\nPosição " + (i + 1) + ": " + formas[i]);
		}
		TrianguloEquilatero triang1 = new TrianguloEquilatero();
		triang1.setLado(gerador.nextInt(50));
		triang1.setNome("Triângulo Equilátero");
		
		TrianguloIsosceles triang2 = new TrianguloIsosceles();
		triang2.setAltura(gerador.nextInt(50));
		triang2.setBase(gerador.nextInt(50));
		triang2.setNome("Triângulo Isósceles");
		
		TrianguloRetangulo triang3 = new TrianguloRetangulo();
		triang3.setAltura(gerador.nextInt(50));
		triang3.setBase(gerador.nextInt(50));
		triang3.setNome("Triângulo Retângulo");
		
		Triangulo[] triangulos = {triang1, triang2, triang3};
		for (int i = 0; i < triangulos.length; i ++) 
		{
			System.out.println(triangulos[i]);
		}
	}
}
