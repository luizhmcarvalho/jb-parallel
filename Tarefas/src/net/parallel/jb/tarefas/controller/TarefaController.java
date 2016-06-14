package net.parallel.jb.tarefas.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.parallel.jb.tarefas.model.Tarefa;

public class TarefaController extends AController<Tarefa> {

	public void loadFromFile() {
		String fileName = "C:\\parallel\\workspace\\javabasico\\Tarefas.txt";
		try {

			repositorio.clear();
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;
			while ((line = bufferReader.readLine()) != null) {
				Tarefa obj = Tarefa.iniciarTarefa(line.split("\\|")[0],
						line.split("\\|")[1]);
				save(obj);
			}
			bufferReader.close();
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo:" + e.getMessage());
		}
	}

	public void saveToFile() {
		try {
			BufferedWriter writer = null;
			String lineSep = System.getProperty("line.separator");
			try {

				writer = new BufferedWriter(new FileWriter("C:\\parallel\\workspace\\javabasico\\Tarefas.txt", 
						false));

				for (Tarefa obj : repositorio) {
					writer.write(obj.getTitulo() + "|" + obj.getDescricao()
					+ lineSep);
				}
		writer.flush();
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
