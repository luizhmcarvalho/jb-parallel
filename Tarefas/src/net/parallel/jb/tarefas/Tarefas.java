package net.parallel.jb.tarefas;

import javax.swing.JFrame;

import net.parallel.jb.tarefas.controller.TarefaController;
import net.parallel.jb.tarefas.model.*;
import net.parallel.jb.tarefas.view.*;

public class Tarefas {

	public static void main(String[] args) {

		Tarefa tarefa = Tarefa.iniciarTarefa("Compilar", "Compilar o prj");

		TarefaController controller = new TarefaController();
		int id = controller.save(tarefa);

		Tarefa tarefa2 = controller.getById(id);

		tarefa2.finalizarTarefa();

		controller.save(tarefa2);
		

	}

}
