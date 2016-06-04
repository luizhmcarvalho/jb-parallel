package net.parallel.jb.tarefas.model;

import java.util.Calendar;
import java.util.Date;

public class Tarefa implements IModel {
	
	//Attributes
	private int id;
	private Date data;
	private String titulo;
	private String descricao;
	private boolean concluido;
	

	//Gets e Sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConcluido() {
		return concluido;
	}
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
	
	//Behaviors
	public static Tarefa iniciarTarefa(String titulo, String descricao){
		
		Tarefa tarefa = new Tarefa();
		
		tarefa.setTitulo(titulo);
		tarefa.setDescricao(descricao);
		
		Calendar today = Calendar.getInstance();
		
		tarefa.setData(today.getTime());
		
		return tarefa;
	}
	
	public void finalizarTarefa(){
		
		this.setConcluido(true);
	}
	
}










