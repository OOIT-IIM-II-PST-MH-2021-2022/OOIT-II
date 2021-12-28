package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class FrmTest extends JFrame {

	/*
	 * contentPane se pravi po defaultu kada napravimo JFrame i njegov defaultni 
	 * layout manager je BorderLayout
	 */
	private JPanel contentPane;
	/*
	 * ButtonGroup nam omogucuje da samo jedan toggleButton
	 * ,koji je dodat u ButtonGroup, bude selektovan u jednom trenutku
	 * 
	 */
	private ButtonGroup group = new ButtonGroup();
	/*
	 * DLM sadrzi sve podatke koji se ispisuju u JList komponenti, dodavanje necega
	 * direktno u listu nije moguce.
	 */
	private DefaultListModel<String> dlm = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnDugme = new JButton("Antistres dugme");
		btnDugme.addActionListener(new ActionListener() {
			//U okviru tela metode actionPerformed se pise logika koja se desava
			//kada se dugme pritisne
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Smiri se", "Stres nestaje", 
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnDugme.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelSouth.add(btnDugme);
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 82, 85, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblCrveno = new JLabel("Crveno");
		GridBagConstraints gbc_lblCrveno = new GridBagConstraints();
		gbc_lblCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrveno.gridx = 1;
		gbc_lblCrveno.gridy = 1;
		panelCenter.add(lblCrveno, gbc_lblCrveno);
		
		JToggleButton btnCrveno = new JToggleButton("Crveno");
		btnCrveno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.add(0, btnCrveno.getText());
				panelCenter.setBackground(Color.RED);
			}
		});
		GridBagConstraints gbc_btnCrveno = new GridBagConstraints();
		gbc_btnCrveno.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrveno.gridx = 2;
		gbc_btnCrveno.gridy = 1;
		panelCenter.add(btnCrveno, gbc_btnCrveno);
		group.add(btnCrveno);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		//Za listu je neophodno podesiti objekat klase DefaultListModel koji sadrzi podatke
		// koji ce se prikazivati u listi
		list.setModel(dlm);
		
		JLabel lblPlavo = new JLabel("Plavo");
		GridBagConstraints gbc_lblPlavo = new GridBagConstraints();
		gbc_lblPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlavo.gridx = 1;
		gbc_lblPlavo.gridy = 2;
		panelCenter.add(lblPlavo, gbc_lblPlavo);
		
		JToggleButton btnPlavo = new JToggleButton("Plavo");
		btnPlavo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Putem objekta klase DefaultListModel i njegove metode add
				//u listu na nultu poziciju dodajemo vrednost obelezja text dugmeta
				// btnPlavo
				dlm.add(0, btnPlavo.getText());
				//metodom setBackground panela mozemo da podesavamo njegovu boju
				// u ovom slucaju na svaki klik dugmeta btnPlavo se boja panela boji u plavo
				panelCenter.setBackground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnPlavo = new GridBagConstraints();
		gbc_btnPlavo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlavo.gridx = 2;
		gbc_btnPlavo.gridy = 2;
		panelCenter.add(btnPlavo, gbc_btnPlavo);
		group.add(btnPlavo);
		
		JLabel lblZuto = new JLabel("Zuto");
		GridBagConstraints gbc_lblZuto = new GridBagConstraints();
		gbc_lblZuto.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuto.gridx = 1;
		gbc_lblZuto.gridy = 3;
		panelCenter.add(lblZuto, gbc_lblZuto);
		
		JToggleButton btnZuto = new JToggleButton("Zuto");
		btnZuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, btnZuto.getText());
				panelCenter.setBackground(Color.YELLOW);
			}
		});
		GridBagConstraints gbc_btnZuto = new GridBagConstraints();
		gbc_btnZuto.insets = new Insets(0, 0, 5, 5);
		gbc_btnZuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZuto.gridx = 2;
		gbc_btnZuto.gridy = 3;
		panelCenter.add(btnZuto, gbc_btnZuto);
		group.add(btnZuto);
	}

}
