package net.parallel.jb.tarefas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import net.parallel.jb.tarefas.controller.TarefaController;
import net.parallel.jb.tarefas.model.Tarefa;
import net.parallel.jb.tarefas.view.adapters.ListTableModel;

import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textDescricao;
	private JTable table;

	private TarefaController controller = new TarefaController();
	private ListTableModel tableModel = new ListTableModel(controller.getAll());
	private JButton btnAtualizar;
	
	private int row = -1;
	private JButton btnExcluir;
	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				controller.loadFromFile();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 300);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				
				table.setBounds(12, 73, contentPane.getWidth() - 24, contentPane.getHeight() - 85);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setBounds(12, 13, 56, 16);
		contentPane.add(lblTtulo);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(165, 13, 257, 16);
		contentPane.add(lblDescricao);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(12, 38, 116, 22);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		textDescricao = new JTextField();
		textDescricao.setBounds(165, 38, 257, 22);
		contentPane.add(textDescricao);
		textDescricao.setColumns(10);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			  Tarefa obj = Tarefa.iniciarTarefa(textTitulo.getText(), textDescricao.getText());
			  controller.save(obj);
			  
			  controller.saveToFile();
			  
			  tableModel.setData(controller.getAll());
			  table.setModel(tableModel);
			  textTitulo.setText("");
			  textDescricao.setText("");
			  tableModel.fireTableDataChanged();
			  
			}
		});
		
		
		btnIniciar.setBounds(434, 37, 85, 25);
		contentPane.add(btnIniciar);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				row = table.getSelectedRow();
				textTitulo.setText(table.getValueAt(row, 1).toString());
				textDescricao.setText(table.getValueAt(row, 2).toString());
			}
		});
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setBounds(12, 73, 504, 175);
		table.setModel(tableModel);
		contentPane.add(table);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tarefa obj = controller.getAll().get(row);
				obj.setTitulo(textTitulo.getText());
				obj.setDescricao(textDescricao.getText());
				controller.getAll().set(row, obj);
				tableModel.setData(controller.getAll());
				 controller.saveToFile();
				table.setModel(tableModel);
				textTitulo.setText("");
				textDescricao.setText("");
				tableModel.fireTableDataChanged();
			}
		});
		btnAtualizar.setBounds(524, 37, 100, 25);
		contentPane.add(btnAtualizar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tarefa obj = controller.getAll().get(row);
				controller.delete(obj);
				 controller.saveToFile();
				tableModel.setData(controller.getAll());
				table.setModel(tableModel);
				textTitulo.setText("");
				textDescricao.setText("");
				tableModel.fireTableDataChanged();
			}
		});
		btnExcluir.setBounds(631, 37, 97, 25);
		contentPane.add(btnExcluir);
	}
}












