package net.parallel.jb.classes;

import java.util.List;

public abstract class Imovel {
	private int id; 
	private String endereco;
	protected List<Pessoa> moradores;
		
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public List<Pessoa> getMoradores(){
		return this.moradores;
	}
	
	public void setMorador(int index, Pessoa morador){
		this.moradores.set(index, morador);
	}
	
	public void addMorador(Pessoa morador){
		this.moradores.add(morador);
	}
	
}
