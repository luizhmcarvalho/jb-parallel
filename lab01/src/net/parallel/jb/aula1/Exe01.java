package net.parallel.jb.aula1;

//modificador de acesso|tipo de estrutura|nome da estrutura
public class Exe01 {
	
	//Declara��o de Var�veis
	//Tipo | Nome
	static String valorImpresso;
		
	//Modificador de acesso|tipo de retorno|nome do m�todo|parametros
	public static void main(String [] args){
		
		//Atribui��o de Vari�veis
		//Vari�vel | Valor
		Exe01.valorImpresso = "Luiz Carvalho";
		
		//Bloco de instru��es.
		//M�todo da classe out do pacote System.
		System.out.println(Exe01.valorImpresso);
		
		//EX02
		Exe02 obj = new Exe02(3,6);
			
		System.out.println(obj.soma());
		System.out.println(obj.subtracao());
		System.out.println(obj.multiplicacao());
		System.out.println(obj.divisao());
		
		System.out.println(obj.ehPar(2));
		System.out.println(obj.ehImpar(2));
		
		System.out.println(obj.ehPar(3));
		System.out.println(obj.ehImpar(3));
		
		//EX03
		System.out.println(new Exe03("multiplicacao").calcula());
		System.out.println(new Exe03("soma").calcula());
		
		Exe04 obj2 = new Exe04();
		
		obj2.printNumeros();
		
	}

}
