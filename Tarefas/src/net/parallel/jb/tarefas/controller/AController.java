package net.parallel.jb.tarefas.controller;
import java.util.ArrayList;

import net.parallel.jb.tarefas.model.IModel;

public abstract class AController<T extends IModel> 
									implements IController<T> {
	
	protected ArrayList<T> repositorio = new ArrayList<T>();
	
	@Override
	public ArrayList<T> getAll() {
		
		return repositorio;
	}

	@Override
	public T getById(int id) {
		
		for(T obj : repositorio){
			if(obj.getId()== id){ 
				return obj;
			}
		}
		return null;
	
	}

	@Override
	public void delete(T obj) {
		if(obj == null)
			return;
		try{
			int index = repositorio.indexOf(obj);
			repositorio.remove(index);
		}
		catch(Exception ex){
			
			if(ex.getMessage().equals("-1"))
				System.out.println("O item não está presente no repositório");
			else
				System.out.println(ex.getMessage());
			
		}
		
	}

	@Override
	public int save(T obj) {
		int id = 0;
		if(repositorio.size()> 0)
		id = repositorio.get(repositorio.size() -1).getId();
		id++;
		obj.setId(id);
		repositorio.add(obj);
		return id;
	}
}







