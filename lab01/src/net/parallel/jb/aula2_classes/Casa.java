package net.parallel.jb.classes;

import java.util.*;

public class Casa extends Imovel {

	public Casa(){
		super.moradores = new ArrayList<Pessoa>();
	}
	
	public String toString(){
		String retorno = "Casa: " + getId() +
				" End.: " + getEndereco();
		
		// "\n"
		for(Pessoa morador : moradores)
			retorno += "\n" + morador.toString();
		
		
		return retorno;
	}
}
