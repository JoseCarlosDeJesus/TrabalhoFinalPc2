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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.prog2.tf.controller.ClienteController;

@SuppressWarnings("serial")
public class TelaCadastroCliente extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldRg;
	private JTextField textFieldEndereco;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;
	private JTextField textFieldCep;
	private JTextField textFieldDataDeNascimento;
	private JComboBox <String>jcomboBoxEstado = new JComboBox <String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
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
		txtrCadastrarCliente.setText("Cadastrar Cliente");
		panel.add(txtrCadastrarCliente);
		
		JLabel lblNewLabelNome = new JLabel("Nome:");
		lblNewLabelNome.setBackground(new Color(255, 255, 0));
		lblNewLabelNome.setToolTipText("Insira o nome do cliente");
		lblNewLabelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabelNome.setForeground(new Color(192, 192, 192));
		lblNewLabelNome.setBounds(68, 52, 61, 37);
		contentPane.add(lblNewLabelNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldNome.setBounds(130, 64, 618, 19);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(43, 46, 50));
		panel_1.setBounds(0, 43, 38, 529);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(43, 46, 50));
		panel_1_1.setBounds(758, 43, 38, 529);
		contentPane.add(panel_1_1);
		
		textFieldRg = new JTextField();
		textFieldRg.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldRg.setColumns(10);
		textFieldRg.setBounds(130, 112, 154, 19);
		contentPane.add(textFieldRg);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setForeground(Color.LIGHT_GRAY);
		lblEndereo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblEndereo.setBounds(48, 141, 81, 37);
		contentPane.add(lblEndereo);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(130, 152, 618, 19);
		contentPane.add(textFieldEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.LIGHT_GRAY);
		lblBairro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblBairro.setBounds(76, 188, 53, 37);
		contentPane.add(lblBairro);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(130, 199, 278, 19);
		contentPane.add(textFieldBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.LIGHT_GRAY);
		lblCidade.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCidade.setBounds(68, 235, 61, 37);
		contentPane.add(lblCidade);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(130, 246, 278, 19);
		contentPane.add(textFieldCidade);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setToolTipText("Insira o nome do cliente");
		lblRg.setForeground(Color.LIGHT_GRAY);
		lblRg.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblRg.setBackground(Color.YELLOW);
		lblRg.setBounds(91, 99, 38, 37);
		contentPane.add(lblRg);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(Color.LIGHT_GRAY);
		lblEstado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblEstado.setBounds(68, 282, 61, 37);
		contentPane.add(lblEstado);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.LIGHT_GRAY);
		lblCep.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCep.setBounds(91, 329, 38, 37);
		contentPane.add(lblCep);
		
		textFieldCep = new JTextField();
		textFieldCep.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldCep.setColumns(10);
		textFieldCep.setBounds(130, 339, 278, 19);
		contentPane.add(textFieldCep);
		
		JLabel lblDataDeNascimento = new JLabel("Data \r\nde \r\nNascimento:");
		lblDataDeNascimento.setForeground(Color.LIGHT_GRAY);
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDataDeNascimento.setBounds(48, 368, 154, 37);
		contentPane.add(lblDataDeNascimento);
		
		textFieldDataDeNascimento = new JTextField();
		textFieldDataDeNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldDataDeNascimento.setColumns(10);
		textFieldDataDeNascimento.setBounds(198, 380, 210, 19);
		contentPane.add(textFieldDataDeNascimento);
		
		jcomboBoxEstado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		jcomboBoxEstado.setModel(new DefaultComboBoxModel<>(new String[] {"Selecione um Estado", "Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA)", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		jcomboBoxEstado.setBounds(130, 293, 278, 21);
		contentPane.add(jcomboBoxEstado);
		
		JButton btnNewButtonSalvar = new JButton("Salvar");
		btnNewButtonSalvar.setActionCommand("");
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
		
		btnNewButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    		String estado = jcomboBoxEstado.getSelectedItem().toString();
		    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    		String data = textFieldDataDeNascimento.getText();
						Date dateConvertida = null;
						try {
							dateConvertida = sdf.parse(data);
						} catch (ParseException e) {
							JOptionPane.showMessageDialog(null, "Erro! Data não preenchida no formato: dd/MM/yyyy\n" + e);
						}
		    		Boolean sucesso;
		    		try {
		    			ClienteController clienteController = new ClienteController();
		    			sucesso = clienteController.cadastrarCliente(textFieldNome.getText(), textFieldRg.getText(), textFieldEndereco.getText(),
		    										textFieldBairro.getText(), textFieldCidade.getText(), estado, textFieldCep.getText(),
		    										dateConvertida);
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
		    	TelaCadastroCliente.this.dispose();
		    	telaPrincipal.setVisible(true);
		    }
		});
		
		btnNewButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	textFieldNome.setText("");
		    	textFieldRg.setText("");
		    	textFieldEndereco.setText("");
		    	textFieldBairro.setText("");
		    	textFieldCidade.setText("");
		    	jcomboBoxEstado.setSelectedIndex(-1);
		    	textFieldCep.setText("");
		    	textFieldDataDeNascimento.setText("");
		    }
		});
		
		btnNewButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente();
		    	TelaCadastroCliente.this.dispose();
		    	telaConsultaCliente.setVisible(true);
		    }
		});

	}
}
