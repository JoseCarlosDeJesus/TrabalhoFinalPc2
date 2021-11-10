package br.com.prog2.tf.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.logging.Level;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.prog2.tf.controller.ClienteController;
import br.com.prog2.tf.model.Cliente;;

public class TelaConsultaCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaCliente frame = new TelaConsultaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaConsultaCliente() {
		setFocusCycleRoot(false);
		setBackground(new Color(0, 204, 255));
		setTitle("Consultar Cliente");
		setMinimumSize(new Dimension(800, 600));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 46, 50));
		contentPane.setFont(new Font("Segoe UI", Font.BOLD, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 786, 37);
		panel.setBackground(new Color(87, 91, 100));
		contentPane.add(panel);
		
		JTextArea txtrCadastrarCliente = new JTextArea();
		txtrCadastrarCliente.setEditable(false);
		txtrCadastrarCliente.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrCadastrarCliente.setSelectionColor(SystemColor.desktop);
		txtrCadastrarCliente.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtrCadastrarCliente.setForeground(new Color(171, 173, 177));
		txtrCadastrarCliente.setDisabledTextColor(new Color(0, 0, 0));
		txtrCadastrarCliente.setCaretColor(new Color(255, 255, 255));
		txtrCadastrarCliente.setBorder(null);
		txtrCadastrarCliente.setBackground(new Color(87, 91, 100));
		txtrCadastrarCliente.setText("Consultar Cliente");
		panel.add(txtrCadastrarCliente);
		
		JLabel lblNewLabelNome = new JLabel("Informe o nome do cliente:");
		lblNewLabelNome.setBackground(new Color(255, 255, 0));
		lblNewLabelNome.setToolTipText("Insira o nome do cliente");
		lblNewLabelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabelNome.setForeground(new Color(192, 192, 192));
		lblNewLabelNome.setBounds(68, 58, 197, 37);
		contentPane.add(lblNewLabelNome);
		
		JTextArea textAreaNomeCliente = new JTextArea();
		textAreaNomeCliente.setBounds(259, 67, 423, 22);
		contentPane.add(textAreaNomeCliente);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.setIcon(new ImageIcon("D:\\PC2-TRAB1\\Pc2Trabalho\\src\\images\\lupa.png"));
		btnConsultar.setSelectedIcon(new ImageIcon("D:\\PC2-TRAB1\\Pc2Trabalho\\src\\images\\lupa.png"));
		btnConsultar.setBounds(681, 61, 28, 28);
		contentPane.add(btnConsultar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 119, 658, 418);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CodCliente", "Nome", "RG", "Endere\u00E7o", "Bairro", "Cidade", "Estado", "CEP", "Nascimento"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(65);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(60);
		scrollPane.setViewportView(table_1);
		
		btnConsultar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	String nome = textAreaNomeCliente.getText();
		    	DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
		    	tableModel.setRowCount(0);
		    	ClienteController clienteController = new ClienteController();
		    	try {
					ArrayList<Cliente> clientes = clienteController.listarClientes(nome);
					clientes.forEach((Cliente cliente) -> {
						tableModel.addRow(new Object [] {	cliente.getCodCliente(),
															cliente.getNomeCliente(),
															cliente.getRgCliente(),
															cliente.getEnderecoCliente(),
															cliente.getBairroCliente(),
															cliente.getCidadeCliente(),
															cliente.getEstadoCliente(),
															cliente.getCEPCliente(),
															cliente.getNascimentoCliente()
														});
					});
					table_1.setModel(tableModel);
				} catch (Exception e) {
					java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, e);
				}
		    }
		});
		
	}
}
