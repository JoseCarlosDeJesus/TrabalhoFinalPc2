package br.com.prog2.tf.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {

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
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setMaximumSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		setResizable(false);
		setBackground(Color.BLACK);
		setTitle("Pacotes Uva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 609);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaption);
		menuBar.setToolTipText("Página Inicial");
		setJMenuBar(menuBar);
		
		JMenu menuConsulta = new JMenu("Consulta");
		menuConsulta.setForeground(SystemColor.desktop);
		menuConsulta.setBackground(SystemColor.menu);
		menuConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(menuConsulta);
		
		JButton btnNewButtonConsultaCliente = new JButton("Cliente");
		btnNewButtonConsultaCliente.setBorderPainted(false);
		btnNewButtonConsultaCliente.setBackground(SystemColor.menu);
		btnNewButtonConsultaCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuConsulta.add(btnNewButtonConsultaCliente);
		
		JButton Hospedagem_1 = new JButton("Hospedagem");
		Hospedagem_1.setBorderPainted(false);
		Hospedagem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuConsulta.add(Hospedagem_1);
		
		JButton Chale_1 = new JButton("Chal\u00E9");
		Chale_1.setBorderPainted(false);
		menuConsulta.add(Chale_1);
		Chale_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JMenu menuCliente = new JMenu("Cadastro");
		menuCliente.setBackground(SystemColor.menu);
		menuCliente.setForeground(SystemColor.desktop);
		menuCliente.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(menuCliente);
		
		JButton btnNewButtonCadastroCliente = new JButton("Cliente");
		btnNewButtonCadastroCliente.setBorderPainted(false);
		btnNewButtonCadastroCliente.setBackground(UIManager.getColor("Button.background"));
		menuCliente.add(btnNewButtonCadastroCliente);
		btnNewButtonCadastroCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnNewButtonCadastroHospedagem = new JButton("Hospedagem");
		btnNewButtonCadastroHospedagem.setBorderPainted(false);
		btnNewButtonCadastroHospedagem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuCliente.add(btnNewButtonCadastroHospedagem);
		
		JButton btnNewButtonCadastroChale = new JButton("Chal\u00E9");
		btnNewButtonCadastroChale.setBorderPainted(false);
		btnNewButtonCadastroChale.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuCliente.add(btnNewButtonCadastroChale);
		
		JMenu menuSair = new JMenu("Sair");
		menuSair.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuSair.setBackground(SystemColor.menu);
		menuSair.setForeground(SystemColor.desktop);
		menuBar.add(menuSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-134, 0, 920, 545);
		lblNewLabel.setIcon(new ImageIcon("D:\\PC2-TRAB1\\Pc2Trabalho\\src\\images\\principal.jpg"));
		panel.add(lblNewLabel);
		
		btnNewButtonConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente();
		    	TelaPrincipal.this.dispose();
		    	telaConsultaCliente.setVisible(true);
		    }
		});
		btnNewButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		    	TelaPrincipal.this.dispose();
		    	telaCadastroCliente.setVisible(true);
		    }
		});
		btnNewButtonCadastroChale.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	CadastrarChale telaCadastroChale = new CadastrarChale();
		    	TelaPrincipal.this.dispose();
		    	telaCadastroChale.setVisible(true);
		    }
		});
		btnNewButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		    	TelaPrincipal.this.dispose();
		    	telaCadastroCliente.setVisible(true);
		    }
		});
		btnNewButtonCadastroHospedagem.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	TelaCadastroHospedagem telaCadastroHospedagem = new TelaCadastroHospedagem();
		    	TelaPrincipal.this.dispose();
		    	telaCadastroHospedagem.setVisible(true);
		    }
		});
	}
}
