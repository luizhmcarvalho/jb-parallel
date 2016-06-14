package net.parallel.jb.tarefas;


import java.awt.EventQueue;
import net.parallel.jb.tarefas.view.MainFrame;

//import net.parallel.jb.tarefas.controller.TarefaController;
//import net.parallel.jb.tarefas.model.*;

public class Tarefas {

	/*public static void main(String[] args) {

		Tarefa tarefa = Tarefa.iniciarTarefa("Compilar", "Compilar o prj");

		TarefaController controller = new TarefaController();
		int id = controller.save(tarefa);

		controller.delete(tarefa);
		controller.delete(Tarefa.iniciarTarefa("Teste", "Exceção"));
		
	}*/
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}








