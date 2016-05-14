package net.parallel.jb.aula1;

public class Exe04 {
	
	public void printNumeros(){
		
		//Vari�vel de controle
		int cont = 0;
		
		//While:  La�o de Repeti��o com valida��o inicial
		//(cont <= 10): Condi��o de execu��o do la�o
		while(cont <= 10){
			//Instru��o
			System.out.println("Itera��o n�m " + cont);
			//Incremento da vari�vel de controle
			//cont++ � a mesma coisa que cont = cont + 1
			cont ++;
		}
		
		
		//do While:  La�o de Repeti��o com valida��o final
		do{
			
			//Instru��o
			System.out.println("Itera��o n�m " + cont);
			//Decremento da vari�vel de controle
			//cont-- � a mesma coisa que cont = cont - 1
			cont --;
			
		}while(cont > 0);
		
		
		//for:  La�o de Repeti��o controlado
		//contador = variavel de controle
		//contador < 10 = condi��o de execu��o
		//contador ++ = incremento da variavel de controle
		for(int contador = 1; contador < 10; contador ++){
			//Instru��o
			System.out.println("Itera��o controlada " + contador);
		}
		
	}

}
