package net.parallel.jb.tarefas.controller;

import java.util.ArrayList;

import net.parallel.jb.tarefas.model.IModel;


public interface IController<T extends IModel> {
	
	ArrayList<T> getAll();
	T getById(int id);
	void delete(T obj);
	int save(T obj);	
}
