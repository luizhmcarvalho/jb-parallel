package net.parallel.jb.aula1;

public class Exe04 {
	
	public void printNumeros(){
		
		//Variável de controle
		int cont = 0;
		
		//While:  Laço de Repetição com validação inicial
		//(cont <= 10): Condição de execução do laço
		while(cont <= 10){
			//Instrução
			System.out.println("Iteração núm " + cont);
			//Incremento da variável de controle
			//cont++ é a mesma coisa que cont = cont + 1
			cont ++;
		}
		
		
		//do While:  Laço de Repetição com validação final
		do{
			
			//Instrução
			System.out.println("Iteração núm " + cont);
			//Decremento da variável de controle
			//cont-- é a mesma coisa que cont = cont - 1
			cont --;
			
		}while(cont > 0);
		
		
		//for:  Laço de Repetição controlado
		//contador = variavel de controle
		//contador < 10 = condição de execução
		//contador ++ = incremento da variavel de controle
		for(int contador = 1; contador < 10; contador ++){
			//Instrução
			System.out.println("Iteração controlada " + contador);
		}
		
	}

}
