package net.parallel.jb.tarefas.view.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.parallel.jb.tarefas.model.Tarefa;

public class ListTableModel extends AbstractTableModel {

private static final long serialVersionUID = 1L;
	
	List<Tarefa> data;
    String[] columnNames = {"Id", "Título", "Descrição"};

    public ListTableModel() {
        data = new ArrayList<Tarefa>();
    }

    public ListTableModel(ArrayList<Tarefa> data) {
        this.data = data;
    }
    
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarefa tarefa = data.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return tarefa.getId();
        case 1:
            return tarefa.getTitulo();
        case 2:
            return tarefa.getDescricao();
        default:
            return null;
        }
    }

	public void setData(ArrayList<Tarefa> data) {
		
		this.data = data;
		
	}
}



