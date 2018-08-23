package lista1;
public class Desafio_2 {

	public static void main(String[] args) {
		
		String nomes[] = {"Vitor", "Julia", "Arthur", "Murilo", "Felipe"};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				
				int valor = nomes[j].compareTo(nomes[j+1]);
				
				if (valor > 0){
					String aux = nomes[j];
					nomes [j] = nomes[j +1];
					nomes [j+1] = aux;
					
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(nomes[i]);
		}
	
	}

}
