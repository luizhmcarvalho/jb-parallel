package net.parallel.jb.classes;
import java.util.*;
public class CorretoraXyz implements Corretora {

	ArrayList<Imovel> imoveis;
	
	public CorretoraXyz(){
		imoveis = new ArrayList<Imovel>();
	}
	
	@Override
	public void alugarImovel(Imovel imv) {
		imoveis.add(imv);
	}

	@Override
	public int numeroImoveisAlugados() {
		
		return imoveis.size();
	}

}
