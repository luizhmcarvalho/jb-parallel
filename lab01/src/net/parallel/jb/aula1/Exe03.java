package net.parallel.jb.aula1;

public class Exe03 {
	
	private String opcao = "soma";
	
	public Exe03(String opt){
		opcao = opt;
	}
	
	public float calcula(){
		
		int opt  =0;
		if(opcao == "soma")
			 opt = 1;
		else 
			if(opcao == "multiplicacao")
				opt = 2;
			
		
		float resultado = 0;
		Exe02 calc = new Exe02(8,5);
		switch(opt){
		case 1 : {
			resultado = calc.soma();
			System.out.println(opcao);
		}
		break;
		case 2 : {
			resultado = calc.multiplicacao();
			System.out.println(opcao);
		}
		break;
		default:
			return 0;
		}
		return resultado;
	}
}
