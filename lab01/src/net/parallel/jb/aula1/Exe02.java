package net.parallel.jb.aula1;

public class Exe02 {

	private int valor1 = 0, valor2 = 0;
	
	public Exe02(int v1, int v2){
		valor1 = v1;
		valor2 = v2;
	}
		
	public int soma(){
		return valor1 + valor2;
	}
	
	public int subtracao(){
		return valor1 - valor2;
	}
	
	public int multiplicacao(){
		return valor1 * valor2;
	}
	
	public float divisao(){
		if(valor2 == 0)
			return 0;
		
		return (float)valor1 / (float)valor2;
	}
	
	public boolean ehPar(int valor){
		//Resto da divisão = % exemplo 3%2 == 1
		
		/*if(valor%2 == 0)
			return true;
		return false;*/
		return (valor%2 == 0);
	}
	
	public boolean ehImpar(int valor){
		return !ehPar(valor);
	}
}
