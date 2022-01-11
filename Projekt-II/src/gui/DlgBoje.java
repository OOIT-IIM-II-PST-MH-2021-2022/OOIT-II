package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgBoje extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private int one,two,three;
	private JTextField textFieldOne;
	private JTextField textFieldTwo;
	private JTextField textFieldThree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgBoje dialog = new DlgBoje();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgBoje() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblOne = new JLabel("Crvena vrednost");
			GridBagConstraints gbc_lblOne = new GridBagConstraints();
			gbc_lblOne.anchor = GridBagConstraints.EAST;
			gbc_lblOne.insets = new Insets(0, 0, 5, 5);
			gbc_lblOne.gridx = 2;
			gbc_lblOne.gridy = 1;
			contentPanel.add(lblOne, gbc_lblOne);
		}
		{
			textFieldOne = new JTextField();
			textFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textFieldOne.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldOne = new GridBagConstraints();
			gbc_textFieldOne.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldOne.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldOne.gridx = 3;
			gbc_textFieldOne.gridy = 1;
			contentPanel.add(textFieldOne, gbc_textFieldOne);
			textFieldOne.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Zelena vrednost");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 2;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textFieldTwo = new JTextField();
			textFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textFieldTwo.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldTwo = new GridBagConstraints();
			gbc_textFieldTwo.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldTwo.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTwo.gridx = 3;
			gbc_textFieldTwo.gridy = 2;
			contentPanel.add(textFieldTwo, gbc_textFieldTwo);
			textFieldTwo.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Plava vrednost");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_2.gridx = 2;
			gbc_lblNewLabel_2.gridy = 3;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			textFieldThree = new JTextField();
			textFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textFieldThree.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldThree = new GridBagConstraints();
			gbc_textFieldThree.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldThree.gridx = 3;
			gbc_textFieldThree.gridy = 3;
			contentPanel.add(textFieldThree, gbc_textFieldThree);
			textFieldThree.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							one = Integer.parseInt(textFieldOne.getText());
							two = Integer.parseInt(textFieldTwo.getText());
							three = Integer.parseInt(textFieldThree.getText());
							if(one >= 0 && one<= 255 &&
									two >= 0 && two<= 255 && 
									three >= 0 && three<= 255) {
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "Vrednost brojeva mora biti izmedju 0 i 255", "Greska", JOptionPane.ERROR_MESSAGE);
							}
								
			
						} catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, "Tekstualna polja moraju biti popunjena", "Greska", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public JTextField getTextFieldOne() {
		return textFieldOne;
	}

	public void setTextFieldOne(JTextField textFieldOne) {
		this.textFieldOne = textFieldOne;
	}

	public JTextField getTextFieldTwo() {
		return textFieldTwo;
	}

	public void setTextFieldTwo(JTextField textFieldTwo) {
		this.textFieldTwo = textFieldTwo;
	}

	public JTextField getTextFieldThree() {
		return textFieldThree;
	}

	public void setTextFieldThree(JTextField textFieldThree) {
		this.textFieldThree = textFieldThree;
	}

	
	
}
