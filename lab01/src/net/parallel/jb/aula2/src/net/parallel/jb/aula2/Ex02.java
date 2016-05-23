package net.parallel.jb.aula2;

public class Ex02 {
	
	public static void imprimeVetores(){
	
		int[] vetor = {45,24,23,47,51};
		int[] vetor2 = new int[5];
		
		int cont = 0;
		
		for(int i : vetor){
			
			vetor2[cont]=i;
			
			cont++;
		}
		
		for(int j : vetor2){
			System.out.println(j);
		}
	}
	
}
