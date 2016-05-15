package net.parallel.jb.aula1;

public class Exe03 {
	
	private String opcao = "soma";
	
	public Exe03(String opt){
		opcao = opt;
	}
	
	public float calcula(){
		
		float resultado = 0;
		
		Exe02 calc = new Exe02(8,5);
		switch(opcao){
		case "soma" : {
			resultado = calc.soma();
			System.out.println(opcao);
		}
		break;
		case "multiplicação" : {
			resultado = calc.multiplicacao();
			System.out.println(opcao);
		}
		break;
		case "subtração" : {
			resultado = calc.subtracao();
			System.out.println(opcao);
		}
		break;
		case "divisão" : {
			resultado = calc.divisao();
			System.out.println(opcao);
		}
		break;
		default:
			return 0;
		}
		return resultado;
	}
}
