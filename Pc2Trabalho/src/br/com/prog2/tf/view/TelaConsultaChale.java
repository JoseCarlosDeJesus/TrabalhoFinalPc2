package br.com.prog2.tf.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

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

public class TelaConsultaChale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaChale frame = new TelaConsultaChale();
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
	public TelaConsultaChale() {
		setFocusCycleRoot(false);
		setBackground(new Color(0, 204, 255));
		setTitle("Cadastrar Cliente");
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
		txtrCadastrarCliente.setText("Consultar Chal\u00E9");
		panel.add(txtrCadastrarCliente);
		
		JLabel lblNewLabelNome = new JLabel("Informe a localiza\u00E7\u00E3o:");
		lblNewLabelNome.setBackground(new Color(255, 255, 0));
		lblNewLabelNome.setToolTipText("Insira o nome do cliente");
		lblNewLabelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabelNome.setForeground(new Color(192, 192, 192));
		lblNewLabelNome.setBounds(68, 58, 257, 37);
		contentPane.add(lblNewLabelNome);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(223, 67, 459, 22);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\PC2-TRAB1\\Pc2Trabalho\\src\\images\\lupa.png"));
		btnNewButton.setSelectedIcon(new ImageIcon("D:\\PC2-TRAB1\\Pc2Trabalho\\src\\images\\lupa.png"));
		btnNewButton.setBounds(681, 61, 28, 28);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 119, 658, 418);
		contentPane.add(scrollPane);
		
		JTable table_1 = new JTable();
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CodChale", "Localiza\u00E7\u00E3o", "Capacidade", "Valor Alta Esta\u00E7\u00E3o", "Valor Baixa Esta\u00E7\u00E3o"
			}
		));
		table_1.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(105);
		scrollPane.setViewportView(table_1);
	}

}
