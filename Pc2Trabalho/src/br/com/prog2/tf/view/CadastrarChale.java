package br.com.prog2.tf.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.prog2.tf.controller.ChaleController;

public class CadastrarChale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldLocalizacao;
	private JTextField textFieldValorAltaEstacao;
	private JTextField textFieldValorBaixaEstacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarChale frame = new CadastrarChale();
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
	public CadastrarChale() {
		setFocusCycleRoot(false);
		setBackground(new Color(0, 204, 255));
		setTitle("Cadastrar Hospedagem");
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
		txtrCadastrarCliente.setText("Cadastrar Hospedagem");
		panel.add(txtrCadastrarCliente);
		
		JLabel lblNewLabelCodChale = new JLabel("Localiza\u00E7\u00E3o:");
		lblNewLabelCodChale.setBackground(new Color(255, 255, 0));
		lblNewLabelCodChale.setToolTipText("");
		lblNewLabelCodChale.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabelCodChale.setForeground(new Color(192, 192, 192));
		lblNewLabelCodChale.setBounds(126, 52, 106, 37);
		contentPane.add(lblNewLabelCodChale);
		
		textFieldLocalizacao = new JTextField();
		textFieldLocalizacao.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldLocalizacao.setBounds(224, 63, 111, 19);
		contentPane.add(textFieldLocalizacao);
		textFieldLocalizacao.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(43, 46, 50));
		panel_1.setBounds(0, 43, 38, 529);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(43, 46, 50));
		panel_1_1.setBounds(758, 43, 38, 529);
		contentPane.add(panel_1_1);
		
		JLabel lblDataInicio = new JLabel("Valor Alta Esta\u00E7\u00E3o:");
		lblDataInicio.setForeground(Color.LIGHT_GRAY);
		lblDataInicio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDataInicio.setBounds(83, 141, 136, 37);
		contentPane.add(lblDataInicio);
		
		textFieldValorAltaEstacao = new JTextField();
		textFieldValorAltaEstacao.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldValorAltaEstacao.setColumns(10);
		textFieldValorAltaEstacao.setBounds(224, 152, 91, 19);
		contentPane.add(textFieldValorAltaEstacao);
		
		JLabel lblQtdPessoas = new JLabel("Capacidade:");
		lblQtdPessoas.setForeground(Color.LIGHT_GRAY);
		lblQtdPessoas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblQtdPessoas.setBounds(126, 94, 91, 37);
		contentPane.add(lblQtdPessoas);
		
		JButton btnNewButtonSalvar = new JButton("Salvar");
		btnNewButtonSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButtonSalvar.setBounds(110, 452, 112, 43);
		contentPane.add(btnNewButtonSalvar);
		
		JButton btnNewButtonLimpar = new JButton("Limpar");
		btnNewButtonLimpar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButtonLimpar.setBounds(277, 452, 112, 43);
		contentPane.add(btnNewButtonLimpar);
		
		JButton btnNewButtonCancelar = new JButton("Cancelar");
		btnNewButtonCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButtonCancelar.setBounds(451, 452, 112, 43);
		contentPane.add(btnNewButtonCancelar);
		
		JButton btnNewButtonConsultar = new JButton("Consultar");
		btnNewButtonConsultar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButtonConsultar.setBounds(617, 452, 112, 43);
		contentPane.add(btnNewButtonConsultar);
		
		JLabel lblDataDeFim = new JLabel("Valor Baixa Esta\u00E7\u00E3o:");
		lblDataDeFim.setForeground(Color.LIGHT_GRAY);
		lblDataDeFim.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDataDeFim.setBounds(78, 188, 141, 37);
		contentPane.add(lblDataDeFim);
		
		textFieldValorBaixaEstacao = new JTextField();
		textFieldValorBaixaEstacao.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldValorBaixaEstacao.setColumns(10);
		textFieldValorBaixaEstacao.setBounds(224, 199, 91, 19);
		contentPane.add(textFieldValorBaixaEstacao);
		
		JSpinner spinnerCapacidade = new JSpinner();
		spinnerCapacidade.setBounds(224, 99, 61, 29);
		contentPane.add(spinnerCapacidade);
		
		btnNewButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					Integer capacidade = Integer.parseInt(spinnerCapacidade.getValue().toString());
			    	Double valorAltaEstacao = Double.parseDouble(textFieldValorAltaEstacao.getText());
			    	Double valorBaixaEstacao = Double.parseDouble(textFieldValorBaixaEstacao.getText());
		    		Boolean sucesso;
		    		
		    		try {
		    			ChaleController chaleController = new ChaleController();
		    			sucesso = chaleController.cadastrarChale(textFieldLocalizacao.getText(), capacidade, valorAltaEstacao,
		    										valorBaixaEstacao);
		    			if(sucesso == true) {
		    				JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso");
		    			}
		    			else {
		    				JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente!");
		    			}
		    		} catch (Exception ex) {
		    			JOptionPane.showMessageDialog(null, "Erro!" + ex);
		    		}
		  
		    }
		});
		
		btnNewButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaPrincipal telaPrincipal = new TelaPrincipal();
		    	CadastrarChale.this.dispose();
		    	telaPrincipal.setVisible(true);
		    }
		});
		
		btnNewButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	textFieldLocalizacao.setText("");
		    	spinnerCapacidade.setValue(0);
		    	textFieldValorAltaEstacao.setText("");
		    	textFieldValorBaixaEstacao.setText("");
		    }
		});
		btnNewButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaConsultaChale telaConsultaChale = new TelaConsultaChale();
		    	CadastrarChale.this.dispose();
		    	telaConsultaChale.setVisible(true);
		    }
		});
	}

}
