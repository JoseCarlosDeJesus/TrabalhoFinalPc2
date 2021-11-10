package br.com.prog2.tf.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.prog2.tf.controller.HospedagemController;

public class TelaCadastroHospedagem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCodChale;
	private JTextField textFieldDesconto;
	private JTextField textFieldDataInicio;
	private JTextField textFieldValorFinal;
	private JTextField textFieldDataFim;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroHospedagem frame = new TelaCadastroHospedagem();
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
	public TelaCadastroHospedagem() {
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
		
		JLabel lblNewLabelCodChale = new JLabel("C\u00F3digo Chal\u00E9:");
		lblNewLabelCodChale.setBackground(new Color(255, 255, 0));
		lblNewLabelCodChale.setToolTipText("");
		lblNewLabelCodChale.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabelCodChale.setForeground(new Color(192, 192, 192));
		lblNewLabelCodChale.setBounds(68, 52, 106, 37);
		contentPane.add(lblNewLabelCodChale);
		
		textFieldCodChale = new JTextField();
		textFieldCodChale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldCodChale.setBounds(173, 64, 111, 19);
		contentPane.add(textFieldCodChale);
		textFieldCodChale.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(43, 46, 50));
		panel_1.setBounds(0, 43, 38, 529);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(43, 46, 50));
		panel_1_1.setBounds(758, 43, 38, 529);
		contentPane.add(panel_1_1);
		
		textFieldDesconto = new JTextField();
		textFieldDesconto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldDesconto.setColumns(10);
		textFieldDesconto.setBounds(173, 282, 70, 19);
		contentPane.add(textFieldDesconto);
		
		JLabel lblDataInicio = new JLabel("Data de In\u00EDcio:");
		lblDataInicio.setForeground(Color.LIGHT_GRAY);
		lblDataInicio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDataInicio.setBounds(68, 141, 106, 37);
		contentPane.add(lblDataInicio);
		
		textFieldDataInicio = new JTextField();
		textFieldDataInicio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldDataInicio.setColumns(10);
		textFieldDataInicio.setBounds(173, 152, 111, 19);
		contentPane.add(textFieldDataInicio);
		
		JLabel lblQtdPessoas = new JLabel("Quantidade de Pessoas:");
		lblQtdPessoas.setForeground(Color.LIGHT_GRAY);
		lblQtdPessoas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblQtdPessoas.setBounds(48, 235, 178, 37);
		contentPane.add(lblQtdPessoas);
		
		JLabel lblDesconto = new JLabel("Desconto:");
		lblDesconto.setToolTipText("Insira o nome do cliente");
		lblDesconto.setForeground(Color.LIGHT_GRAY);
		lblDesconto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDesconto.setBackground(Color.YELLOW);
		lblDesconto.setBounds(97, 271, 77, 37);
		contentPane.add(lblDesconto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(Color.LIGHT_GRAY);
		lblEstado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblEstado.setBounds(113, 94, 61, 37);
		contentPane.add(lblEstado);
		
		JLabel lblValorFinal = new JLabel("Valor Final:");
		lblValorFinal.setForeground(Color.LIGHT_GRAY);
		lblValorFinal.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblValorFinal.setBounds(83, 311, 91, 37);
		contentPane.add(lblValorFinal);
		
		textFieldValorFinal = new JTextField();
		textFieldValorFinal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldValorFinal.setColumns(10);
		textFieldValorFinal.setBounds(173, 322, 70, 19);
		contentPane.add(textFieldValorFinal);
		
		JComboBox <String>jcomboBoxEstado = new JComboBox <String>();
		jcomboBoxEstado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		jcomboBoxEstado.setModel(new DefaultComboBoxModel<>(new String[] {"Selecione um Estado", "Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA)", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		jcomboBoxEstado.setBounds(173, 104, 278, 21);
		contentPane.add(jcomboBoxEstado);
		
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
		
		JLabel lblDataDeFim = new JLabel("Data de Fim:");
		lblDataDeFim.setForeground(Color.LIGHT_GRAY);
		lblDataDeFim.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDataDeFim.setBounds(78, 188, 106, 37);
		contentPane.add(lblDataDeFim);
		
		textFieldDataFim = new JTextField();
		textFieldDataFim.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldDataFim.setColumns(10);
		textFieldDataFim.setBounds(173, 200, 111, 19);
		contentPane.add(textFieldDataFim);
		
		JSpinner spinnerQtdPessoas = new JSpinner();
		spinnerQtdPessoas.setBounds(223, 242, 61, 29);
		contentPane.add(spinnerQtdPessoas);
		
		btnNewButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    		String estado = jcomboBoxEstado.getSelectedItem().toString();
		    		Integer qtdPessoa = Integer.parseInt(spinnerQtdPessoas.getValue().toString());
		    		Double desconto = Double.parseDouble(textFieldDesconto.getText());
		    		Double valorFinal = Double.parseDouble(textFieldValorFinal.getText());
		    		Integer codChale = Integer.parseInt(textFieldCodChale.getText().toString());
		    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    		String data1 = textFieldDataInicio.getText();
		    		String data2 = textFieldDataFim.getText();
					Date dateConvertida1 = null;
					Date dateConvertida2 = null;
					try {
						dateConvertida1 = sdf.parse(data1);
					} catch (ParseException e) {
						JOptionPane.showMessageDialog(null, "Erro! Data não preenchida no formato: dd/MM/yyyy\n" + e);
					}
					try {
						dateConvertida2 = sdf.parse(data2);
					} catch (ParseException e) {
						JOptionPane.showMessageDialog(null, "Erro! Data não preenchida no formato: dd/MM/yyyy\n" + e);
					}
		    		Boolean sucesso;
		    		try {
		    			HospedagemController hospedagemController = new HospedagemController();
		    			sucesso = hospedagemController.cadastrarHospedagem(codChale, estado, dateConvertida1,
		    										dateConvertida2, qtdPessoa, desconto, valorFinal);
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
		    	TelaCadastroHospedagem.this.dispose();
		    	telaPrincipal.setVisible(true);
		    }
		});
		
		btnNewButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	textFieldCodChale.setText("");
		    	jcomboBoxEstado.setSelectedIndex(-1);
		    	textFieldDataInicio.setText("");
		    	textFieldDataFim.setText("");
		    	spinnerQtdPessoas.setValue(0);
		    	textFieldDesconto.setText("");
		    	textFieldValorFinal.setText("");
		    }
		});
		
		btnNewButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaConsultaHospedagem telaConsultaHospedagem = new TelaConsultaHospedagem();
		    	TelaCadastroHospedagem.this.dispose();
		    	telaConsultaHospedagem.setVisible(true);
		    }
		});
		

	}
}
