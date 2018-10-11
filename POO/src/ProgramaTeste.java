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
			switch (gerador.nextInt(7)) 
			{
				case 0:
					Circulo circ1 = new Circulo("Círculo", gerador.nextInt(9)+1);
					formas[i] = circ1;
					break;
				case 1:
					Quadrado quad1 = new Quadrado("Quadrado", gerador.nextInt(9)+1);
					formas[i] = quad1;
					break;
				case 2:
					Retangulo ret1 = new Retangulo("Retângulo", gerador.nextInt(9)+1,gerador.nextInt(9)+1);
					formas[i] = ret1;
					break;
				case 3:
					Losango los1 = new Losango("Losango", gerador.nextInt(9)+1,gerador.nextInt(9)+1, gerador.nextInt(9)+1, gerador.nextInt(9)+1);
					formas[i] = los1;
				
					break;
				case 4:
					TrianguloEquilatero triang1 = new TrianguloEquilatero("Triângulo Equilátero", gerador.nextInt(9)+1);
					formas[i] = triang1;
					break;
				case 5:
					TrianguloIsosceles triang2 = new TrianguloIsosceles("Triângulo Isósceles",gerador.nextInt(9)+1,gerador.nextInt(9)+1);
					formas[i] = triang2;
					break;
				case 6:
					TrianguloRetangulo triang3 = new TrianguloRetangulo("Triângulo Retângulo", gerador.nextInt(9)+1, gerador.nextInt(9)+1);
					formas[i] = triang3;
					break;
			}
		System.out.println("\nPosição " + (i + 1) + ": " + formas[i]);
		}
	}
}
