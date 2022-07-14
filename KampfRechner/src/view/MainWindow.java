package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.UIManager;

import main.Main;
import model.Artefakt;
import model.Teilnehmer;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MainWindow {

	Main main = new Main();
	public JFrame frame;
	private JPanel panelMainMenu;
	ArrayList<Teilnehmer> spieler1kampfEinheiten = new ArrayList<Teilnehmer>();
	ArrayList<Teilnehmer> spieler2kampfEinheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer heldSpieler1;
	private Teilnehmer heldSpieler2;
	private int arrayCommander1Stelle = 0;
	private int arrayCommander2Stelle = 0;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindow window = new MainWindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/source/gwent-nilfgaard-icon-01-ps4-us-16nov18.png")));
		frame.setTitle("Kampfrechner");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panelKampfErstellen = new JPanel();
		panelKampfErstellen.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panelKampfErstellen);
		panelKampfErstellen.setLayout(null);
		panelKampfErstellen.hide();
		

		JButton btnBerechne = new JButton("Berechne");
		btnBerechne.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		btnBerechne.setBackground(new Color(230, 230, 250));
		btnBerechne.setBounds(492, 110, 200, 56);
		panelKampfErstellen.add(btnBerechne);
		
		JButton btnNewButton = new JButton("Zur\u00FCck");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelKampfErstellen.hide();
				panelMainMenu.show();
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(10, 22, 164, 40);
		panelKampfErstellen.add(btnNewButton);
		
		JLabel lblUnitPreview = new JLabel("");
		lblUnitPreview.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Heckenschuetzen.png")));
		lblUnitPreview.setBounds(542, 634, 100, 100);
		panelKampfErstellen.add(lblUnitPreview);
		
		JComboBox comboBoxTroops = new JComboBox();
		comboBoxTroops.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Teilnehmer einheit = null;
				
				einheit = declareUnit(comboBoxTroops, einheit);
				lblUnitPreview.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
				
			}
		});

		comboBoxTroops.setBounds(510, 454, 164, 40);
		panelKampfErstellen.add(comboBoxTroops);
		
		JLabel lblCommander2Einheit2 = new JLabel("");
		lblCommander2Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit2.setBounds(904, 648, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit2);
		
		JLabel lblCommander2Einheit1 = new JLabel("");
		lblCommander2Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit1.setBounds(1014, 648, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit1);
		
		JLabel lblCommander2Einheit6 = new JLabel("");
		lblCommander2Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit6.setBounds(684, 537, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit6);
		
		JLabel lblCommander2Einheit4 = new JLabel("");
		lblCommander2Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit4.setBounds(684, 648, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit4);
		
		JLabel lblCommander2Einheit3 = new JLabel("");
		lblCommander2Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit3.setBounds(794, 648, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit3);
		
		JLabel lblCommander2Einheit8 = new JLabel("");
		lblCommander2Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit8.setBounds(684, 431, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit8);
		
		JLabel lblCommander2Einheit5 = new JLabel("");
		lblCommander2Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit5.setBounds(794, 537, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit5);
		
		JLabel lblCommander2Einheit7 = new JLabel("");
		lblCommander2Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit7.setBounds(794, 431, 100, 100);
		panelKampfErstellen.add(lblCommander2Einheit7);
		
		JLabel lblCommander1Einheit7 = new JLabel("");
		
		lblCommander1Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit7.setBounds(290, 431, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit7);
		
		JLabel lblCommander1Einheit8 = new JLabel("");
		lblCommander1Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit8.setBounds(400, 431, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit8);
		
		JLabel lblCommander1Einheit4 = new JLabel("");
		lblCommander1Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit4.setBounds(400, 648, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit4);
		
		JLabel lblCommander1Einheit6 = new JLabel("");
		lblCommander1Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit6.setBounds(400, 537, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit6);
		
		JLabel lblCommander1Einheit2 = new JLabel("New label");
		lblCommander1Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit2.setBounds(180, 648, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit2);
		
		JLabel lblCommander1Einheit3 = new JLabel("New label");
		lblCommander1Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit3.setBounds(290, 648, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit3);
		
		JLabel lblCommander1Einheit5 = new JLabel("");
		lblCommander1Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit5.setBounds(290, 537, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit5);
		
		JLabel lblCommander1Einheit1 = new JLabel("New label");
		lblCommander1Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit1.setBounds(70, 648, 100, 100);
		panelKampfErstellen.add(lblCommander1Einheit1);
		
		JButton btnGiveLeft = new JButton("Gebe links");
		btnGiveLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Teilnehmer einheit = null;
				einheit = declareUnit(comboBoxTroops, einheit);
				
				if(heldSpieler1 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(spieler1kampfEinheiten.size()>=heldSpieler1.getKommandoWert())
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Einheiten befehligen!");
					else if(spieler1kampfEinheiten.size()<heldSpieler1.getKommandoWert() && spieler1kampfEinheiten != null) {
						
						spieler1kampfEinheiten.add(einheit);
						
						setTroopIconsLeft(lblCommander1Einheit7, lblCommander1Einheit8, lblCommander1Einheit4,
								lblCommander1Einheit6, lblCommander1Einheit2, lblCommander1Einheit3,
								lblCommander1Einheit5, lblCommander1Einheit1, einheit);
						
					}
				}
				
				
			}
		});
		btnGiveLeft.setBackground(new Color(230, 230, 250));
		btnGiveLeft.setBounds(510, 505, 164, 23);
		panelKampfErstellen.add(btnGiveLeft);
		
		JButton btnGiveRight = new JButton("Gebe rechts");
		btnGiveRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Teilnehmer einheit = null;
				einheit = declareUnit(comboBoxTroops, einheit);
				
				if(heldSpieler2 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(spieler2kampfEinheiten.size()>=heldSpieler2.getKommandoWert())
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Einheiten befehligen!");
					else if(spieler2kampfEinheiten.size()<heldSpieler2.getKommandoWert() && spieler2kampfEinheiten != null) {
						
						spieler2kampfEinheiten.add(einheit);
						
						setTroopIconsRight(lblCommander2Einheit2, lblCommander2Einheit1, lblCommander2Einheit6,
								lblCommander2Einheit4, lblCommander2Einheit3, lblCommander2Einheit8,
								lblCommander2Einheit5, lblCommander2Einheit7, einheit);
						
					}
				}
				
				
			}
		});
		btnGiveRight.setBackground(new Color(230, 230, 250));
		btnGiveRight.setBounds(510, 537, 164, 23);
		panelKampfErstellen.add(btnGiveRight);
		
		JButton btnTakeLeft = new JButton("entferne links");
		btnTakeLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(heldSpieler1 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(spieler1kampfEinheiten.size() == 0)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Einheiten zum befehligen!");
					else if(spieler1kampfEinheiten.size()>0 && spieler1kampfEinheiten != null) {
						
						spieler1kampfEinheiten.remove(spieler1kampfEinheiten.size()-1);
						
						removeTroopIconsLeft(lblCommander1Einheit7, lblCommander1Einheit8, lblCommander1Einheit4,
								lblCommander1Einheit6, lblCommander1Einheit2, lblCommander1Einheit3,
								lblCommander1Einheit5, lblCommander1Einheit1);
						
					}
				}
				
			}
		});
		btnTakeLeft.setBackground(new Color(230, 230, 250));
		btnTakeLeft.setBounds(510, 570, 164, 23);
		panelKampfErstellen.add(btnTakeLeft);
		
		JButton btnTakeRight = new JButton("entferne rechts");
		btnTakeRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(heldSpieler2 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(spieler2kampfEinheiten.size() == 0)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Einheiten zum befehligen!");
					else if(spieler2kampfEinheiten.size()>0 && spieler2kampfEinheiten != null) {
						
						spieler2kampfEinheiten.remove(spieler2kampfEinheiten.size()-1);
						
						removeTroopIconsRight(lblCommander2Einheit2, lblCommander2Einheit1, lblCommander2Einheit6,
								lblCommander2Einheit4, lblCommander2Einheit3, lblCommander2Einheit8,
								lblCommander2Einheit5, lblCommander2Einheit7);
						
					}
				}
				
			}
		});
		btnTakeRight.setBackground(new Color(230, 230, 250));
		btnTakeRight.setBounds(510, 600, 164, 23);
		panelKampfErstellen.add(btnTakeRight);
		
		
		JLabel lblCommander2Name = new JLabel("Bitte w\u00E4hlen");
		lblCommander2Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCommander2Name.setForeground(Color.WHITE);
		lblCommander2Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 42));
		lblCommander2Name.setBounds(602, 110, 512, 67);
		panelKampfErstellen.add(lblCommander2Name);
		
		JLabel lblCommander1Name = new JLabel("Bitte w\u00E4hlen");
		lblCommander1Name.setHorizontalAlignment(SwingConstants.LEFT);
		lblCommander1Name.setForeground(Color.WHITE);
		lblCommander1Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 42));
		lblCommander1Name.setBounds(70, 110, 512, 67);
		panelKampfErstellen.add(lblCommander1Name);
		
		JComboBox comboBoxArtefakte2 = new JComboBox();
		comboBoxArtefakte2.setBounds(914, 537, 200, 30);
		panelKampfErstellen.add(comboBoxArtefakte2);
		
		JComboBox comboBoxArtefakte1 = new JComboBox();
		comboBoxArtefakte1.setBounds(70, 537, 200, 30);
		panelKampfErstellen.add(comboBoxArtefakte1);
		
		JLabel lblCommander2Artefakt3 = new JLabel("");
		lblCommander2Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt3.setBounds(1054, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt3);
		
		JLabel lblCommander2Artefakt2 = new JLabel("");
		lblCommander2Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt2.setBounds(984, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt2);
		
		JLabel lblCommander2Artefakt1 = new JLabel("");
		lblCommander2Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt1.setBounds(914, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt1);
		
		JLabel lblCommander1Artefakt2 = new JLabel("");
		lblCommander1Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt2.setBounds(139, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt2);
		
		JLabel lblCommander1Artefakt3 = new JLabel("");
		lblCommander1Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt3.setBounds(209, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt3);
		
		JLabel lblCommander1Artefakt1 = new JLabel("");
		lblCommander1Artefakt1.setToolTipText("Krumms\u00E4bel: (+25 Angriff f\u00FCr den Helden)");
		lblCommander1Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt1.setBounds(70, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt1);
		
		JComboBox comboBoxSkillCommander2 = new JComboBox();
		comboBoxSkillCommander2.setBounds(649, 380, 200, 40);
		panelKampfErstellen.add(comboBoxSkillCommander2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(602, 177, 247, 200);
		panelKampfErstellen.add(panel_1);
		
		JLabel lblheadlineSkillsCommander2 = new JLabel("F\u00E4higkeiten des Verteidigers:");
		lblheadlineSkillsCommander2.setHorizontalAlignment(SwingConstants.CENTER);
		lblheadlineSkillsCommander2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblheadlineSkillsCommander2.setBounds(0, 0, 247, 38);
		panel_1.add(lblheadlineSkillsCommander2);
		
		JList listCommander2Skills = new JList();
		listCommander2Skills.setModel(new AbstractListModel() {
			String[] values = new String[] {"Schlachtruf", "Test1", "Test2", "Test3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listCommander2Skills.setVisibleRowCount(5);
		listCommander2Skills.setBounds(10, 37, 227, 152);
		panel_1.add(listCommander2Skills);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Panel.background"));
		panel.setBounds(335, 177, 247, 200);
		panelKampfErstellen.add(panel);
		panel.setLayout(null);
		
		JLabel lblheadlineSkillsCommander1 = new JLabel("F\u00E4higkeiten des Angreifers:");
		lblheadlineSkillsCommander1.setBackground(Color.WHITE);
		lblheadlineSkillsCommander1.setHorizontalAlignment(SwingConstants.CENTER);
		lblheadlineSkillsCommander1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblheadlineSkillsCommander1.setBounds(0, 0, 247, 38);
		panel.add(lblheadlineSkillsCommander1);
		
		JList listCommander1Skills = new JList();
		listCommander1Skills.setBackground(Color.WHITE);
		listCommander1Skills.setModel(new AbstractListModel() {
			String[] values = new String[] {"Dezimieren", "Test1", "Test2", "Test3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listCommander1Skills.setVisibleRowCount(5);
		listCommander1Skills.setBounds(10, 37, 227, 152);
		panel.add(listCommander1Skills);
		
		JButton btnAddSkills = new JButton("Hinzuf\u00FCgen");
		btnAddSkills.setToolTipText("Mit Hinzuf\u00FCgen werden die ausgew\u00E4hlten F\u00E4higkeiten den jeweiligen Kommandanten hinzugef\u00FCgt.");
		btnAddSkills.setBackground(new Color(230, 230, 250));
		btnAddSkills.setBounds(538, 380, 108, 40);
		panelKampfErstellen.add(btnAddSkills);
		
		JComboBox comboBoxSkillCommander1 = new JComboBox();
		comboBoxSkillCommander1.setBounds(335, 380, 200, 40);
		panelKampfErstellen.add(comboBoxSkillCommander1);
		
		JLabel lblCommander2Specialty = new JLabel("-----");
		lblCommander2Specialty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander2Specialty.setForeground(Color.WHITE);
		lblCommander2Specialty.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander2Specialty.setBounds(914, 388, 200, 55);
		panelKampfErstellen.add(lblCommander2Specialty);
		
		JLabel lblCommander1Specialty = new JLabel("-----");
		lblCommander1Specialty.setForeground(new Color(255, 255, 255));
		lblCommander1Specialty.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander1Specialty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander1Specialty.setBounds(70, 388, 200, 55);
		panelKampfErstellen.add(lblCommander1Specialty);
		
		JLabel lblCommander2 = new JLabel("");
		lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/kommandantnichtgewaehkt.png")));
		lblCommander2.setBounds(914, 177, 200, 200);
		panelKampfErstellen.add(lblCommander2);
		
		JLabel lblCommander1 = new JLabel("New label");
		lblCommander1.setToolTipText("");
		lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/kommandantnichtgewaehkt.png")));
		lblCommander1.setBounds(70, 177, 200, 200);
		panelKampfErstellen.add(lblCommander1);
		
		JButton btnCommander2ArtefaktPlus = new JButton("+");
		btnCommander2ArtefaktPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artefakt artefakt = null;
				artefakt = declareArtefakt(comboBoxArtefakte2, artefakt);
				 
				if(heldSpieler2 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
					Artefakt[] artefakte = heldSpieler2.getArtefakte();
					if(artefakte[2] != null)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Artefakte tragen!");

					if(heldSpieler2.getArtefakte()[0] == null) {
						
						heldSpieler2.getArtefakte()[0] = artefakt;
						setIconArtefakt("2-1", artefakt);
					}
					else if(heldSpieler2.getArtefakte()[1] == null) {
						
						heldSpieler2.getArtefakte()[1] = artefakt;
						setIconArtefakt("2-2", artefakt);
					}
					else if(heldSpieler2.getArtefakte()[2] == null) {
						
						heldSpieler2.getArtefakte()[2] = artefakt;
						setIconArtefakt("2-3", artefakt);
					}
					
				}
					
			}
			
			private void setIconArtefakt(String labelID, Artefakt artefakt) {
				if(labelID.equals("2-1")) {
					lblCommander2Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander2Artefakt1.setToolTipText(artefakt.getBeschreibung());
				}
				if(labelID.equals("2-2")) {
					lblCommander2Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander2Artefakt2.setToolTipText(artefakt.getBeschreibung());
				}
				if(labelID.equals("2-3")) {
					lblCommander2Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander2Artefakt3.setToolTipText(artefakt.getBeschreibung());
				}
			
			}
		});
		btnCommander2ArtefaktPlus.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnCommander2ArtefaktPlus.setBackground(new Color(230, 230, 250));
		btnCommander2ArtefaktPlus.setBounds(914, 589, 89, 34);
		panelKampfErstellen.add(btnCommander2ArtefaktPlus);
		
		JButton btnCommander2ArtefaktMinus = new JButton("-");
		btnCommander2ArtefaktMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Artefakt artefakt = null;
				artefakt = declareArtefakt(comboBoxArtefakte2, artefakt);
				 
				
				if(heldSpieler2 == null) {
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
					return;
				}
				if(heldSpieler2.getArtefakte()[0] == null)
					JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Artefakte!");
				else if (heldSpieler2.getArtefakte()[0] != null && heldSpieler2 != null) {
				

					
					Artefakt[] artefakte = heldSpieler2.getArtefakte();
					
					if(heldSpieler2.getArtefakte()[1] == null)
						heldSpieler2.getArtefakte()[0] = null;
					if(heldSpieler2.getArtefakte()[2] == null)
						heldSpieler2.getArtefakte()[1] = null;
					if(heldSpieler2.getArtefakte()[2] != null)
						heldSpieler2.getArtefakte()[2] = null;
						
						
						resetArtefakt1Icons(lblCommander2Artefakt2, lblCommander2Artefakt3, lblCommander2Artefakt1,
								artefakt, artefakte);
						
					
				}
				
			}
		});
		btnCommander2ArtefaktMinus.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnCommander2ArtefaktMinus.setBackground(new Color(230, 230, 250));
		btnCommander2ArtefaktMinus.setBounds(1025, 589, 89, 34);
		panelKampfErstellen.add(btnCommander2ArtefaktMinus);
		
		JButton btnCommander1ArtefaktPlus = new JButton("+");
		btnCommander1ArtefaktPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Artefakt artefakt = null;
				artefakt = declareArtefakt(comboBoxArtefakte1, artefakt);
				 
				if(heldSpieler1 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
					Artefakt[] artefakte = heldSpieler1.getArtefakte();
					if(artefakte[2] != null)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Artefakte tragen!");

					if(heldSpieler1.getArtefakte()[0] == null) {
						
						heldSpieler1.getArtefakte()[0] = artefakt;
						setIconArtefakt("1-1", artefakt);
					}
					else if(heldSpieler1.getArtefakte()[1] == null) {
						
						heldSpieler1.getArtefakte()[1] = artefakt;
						setIconArtefakt("1-2", artefakt);
					}
					else if(heldSpieler1.getArtefakte()[2] == null) {
						
						heldSpieler1.getArtefakte()[2] = artefakt;
						setIconArtefakt("1-3", artefakt);
					}
					
				}
					
			}
			
			private void setIconArtefakt(String labelID, Artefakt artefakt) {
				if(labelID.equals("1-1")) {
					lblCommander1Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander1Artefakt1.setToolTipText(artefakt.getBeschreibung());
				}
				if(labelID.equals("1-2")) {
					lblCommander1Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander1Artefakt2.setToolTipText(artefakt.getBeschreibung());
				}
				if(labelID.equals("1-3")) {
					lblCommander1Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource(artefakt.getPictureURI())));
					lblCommander1Artefakt3.setToolTipText(artefakt.getBeschreibung());
				}
			}

		});
		btnCommander1ArtefaktPlus.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnCommander1ArtefaktPlus.setBackground(new Color(230, 230, 250));
		btnCommander1ArtefaktPlus.setBounds(70, 589, 89, 34);
		panelKampfErstellen.add(btnCommander1ArtefaktPlus);
		
		JButton btnCommander1ArtefaktMinus = new JButton("-");
		btnCommander1ArtefaktMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Artefakt artefakt = null;
				artefakt = declareArtefakt(comboBoxArtefakte1, artefakt);
				 
				
				if(heldSpieler1 == null) {
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
					return;
				}
				if(heldSpieler1.getArtefakte()[0] == null)
					JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Artefakte!");
				else if (heldSpieler1.getArtefakte()[0] != null && heldSpieler1 != null) {
				

					
					Artefakt[] artefakte = heldSpieler1.getArtefakte();
					
					if(heldSpieler1.getArtefakte()[1] == null)
						heldSpieler1.getArtefakte()[0] = null;
					if(heldSpieler1.getArtefakte()[2] == null)
						heldSpieler1.getArtefakte()[1] = null;
					if(heldSpieler1.getArtefakte()[2] != null)
						heldSpieler1.getArtefakte()[2] = null;
						
						
						resetArtefakt1Icons(lblCommander1Artefakt2, lblCommander1Artefakt3, lblCommander1Artefakt1,
								artefakt, artefakte);
						
					
				}
				
			}
		});
		btnCommander1ArtefaktMinus.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnCommander1ArtefaktMinus.setBackground(new Color(230, 230, 250));
		btnCommander1ArtefaktMinus.setBounds(181, 589, 89, 34);
		panelKampfErstellen.add(btnCommander1ArtefaktMinus);
		
		
		JButton btnCommander1Down = new JButton("");
		btnCommander1Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				heldSpieler1 = null;
				
				if(arrayCommander1Stelle==0)
					arrayCommander1Stelle=main.getPreviewCommanders().size()-1;
				else
					arrayCommander1Stelle--;
				
				heldSpieler1 = main.getPreviewCommanders().get(arrayCommander1Stelle);
				lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler1.getPictureURI())));
				lblCommander1.setToolTipText(heldSpieler1.getBeschreibung());
				lblCommander1Name.setText(heldSpieler1.getName());
				lblCommander1Specialty.setText(heldSpieler1.getKlasse());
				
				if(spieler1kampfEinheiten.size()>heldSpieler1.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Zu dem Kampf werden die überschüssigen Einheiten entfallen!");
				
			}
		});
		btnCommander1Down.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowDown.png")));
		btnCommander1Down.setBackground(new Color(0, 0, 0));
		btnCommander1Down.setBounds(280, 308, 45, 40);
		panelKampfErstellen.add(btnCommander1Down);
		
		JButton btnCommander1Up = new JButton("");
		btnCommander1Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				heldSpieler1 = null;
				
				if(arrayCommander1Stelle==main.getPreviewCommanders().size()-1)
					arrayCommander1Stelle=0;
				else
					arrayCommander1Stelle++;
				
				heldSpieler1 = main.getPreviewCommanders().get(arrayCommander1Stelle);
				lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler1.getPictureURI())));
				lblCommander1.setToolTipText(heldSpieler1.getBeschreibung());
				lblCommander1Name.setText(heldSpieler1.getName());
				lblCommander1Specialty.setText(heldSpieler1.getKlasse());
				
				if(spieler1kampfEinheiten.size()>heldSpieler1.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Zu dem Kampf werden die überschüssigen Einheiten entfallen!");
				
			}
		});
		btnCommander1Up.setBackground(new Color(0, 0, 0));
		btnCommander1Up.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowUp.png")));
		btnCommander1Up.setBounds(280, 206, 45, 40);
		panelKampfErstellen.add(btnCommander1Up);
		
		JButton btnCommander2Down = new JButton("");
		btnCommander2Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				heldSpieler2 = null;
				
				if(arrayCommander2Stelle==0)
					arrayCommander2Stelle=main.getPreviewCommanders().size()-1;
				else
					arrayCommander2Stelle--;
				
				heldSpieler2 = main.getPreviewCommanders().get(arrayCommander2Stelle);
				lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler2.getPictureURI())));
				lblCommander2.setToolTipText(heldSpieler2.getBeschreibung());
				lblCommander2Name.setText(heldSpieler2.getName());
				lblCommander2Specialty.setText(heldSpieler2.getKlasse());
				
				if(spieler2kampfEinheiten.size()>heldSpieler2.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Zu dem Kampf werden die überschüssigen Einheiten entfallen!");
				
			}
		});
		btnCommander2Down.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowDown.png")));
		btnCommander2Down.setBackground(Color.BLACK);
		btnCommander2Down.setBounds(859, 308, 45, 40);
		panelKampfErstellen.add(btnCommander2Down);
		
		JButton btnCommander2Up = new JButton("");
		btnCommander2Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				heldSpieler2 = null;
				
				if(arrayCommander2Stelle==main.getPreviewCommanders().size()-1)
					arrayCommander2Stelle=0;
				else
					arrayCommander2Stelle++;
				
				heldSpieler2 = main.getPreviewCommanders().get(arrayCommander2Stelle);
				lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler2.getPictureURI())));
				lblCommander2.setToolTipText(heldSpieler2.getBeschreibung());
				lblCommander2Name.setText(heldSpieler2.getName());
				lblCommander2Specialty.setText(heldSpieler2.getKlasse());
				
				if(spieler2kampfEinheiten.size()>heldSpieler2.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Zu dem Kampf werden die überschüssigen Einheiten entfallen!");
				
			}
		});
		btnCommander2Up.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowUp.png")));
		btnCommander2Up.setBackground(Color.BLACK);
		btnCommander2Up.setBounds(859, 206, 45, 40);
		panelKampfErstellen.add(btnCommander2Up);
		
		JLabel lblUberschriftCreateBattle = new JLabel("Kampf erstellen");
		lblUberschriftCreateBattle.setHorizontalAlignment(SwingConstants.CENTER);
		lblUberschriftCreateBattle.setForeground(Color.WHITE);
		lblUberschriftCreateBattle.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 52));
		lblUberschriftCreateBattle.setBounds(10, 22, 1164, 77);
		panelKampfErstellen.add(lblUberschriftCreateBattle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/source/700286-best-medieval-battle-wallpaper-1920x1080.jpg")));
		lblNewLabel.setBounds(0, 0, 1184, 761);
		panelKampfErstellen.add(lblNewLabel);
		
		panelMainMenu = new JPanel();
		panelMainMenu.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panelMainMenu);
		panelMainMenu.setLayout(null);
		
		JLabel lblVersion = new JLabel("V1.0.0");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(0, 718, 109, 43);
		panelMainMenu.add(lblVersion);
		
		JLabel lblueberschrift_1 = new JLabel("Geiler Kampfrechner");
		lblueberschrift_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblueberschrift_1.setForeground(Color.WHITE);
		lblueberschrift_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 52));
		lblueberschrift_1.setBounds(10, 90, 1164, 77);
		panelMainMenu.add(lblueberschrift_1);
		
		JButton btnKampferstellen_1 = new JButton("Kampf erstellen");
		btnKampferstellen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fülle Combobox für Truppen
				String[] einheitenNamen = new String[main.getPreviewTroops().size()];
				
				for(int i=0;i<main.getPreviewTroops().size();i++) {
					
					einheitenNamen[i] = main.getPreviewTroops().get(i).getName();
					
				}
				DefaultComboBoxModel dm = new DefaultComboBoxModel(einheitenNamen);
				comboBoxTroops.setModel(dm);
				
				//Fülle Combobox für Artefakte
				String[] artefaktNamen = new String[main.getPreviewArtefakte().size()];
				
				for(int i=0;i<main.getPreviewArtefakte().size();i++) {
					
					artefaktNamen[i] = main.getPreviewArtefakte().get(i).getName();
					
				}
				DefaultComboBoxModel dmArtefakte = new DefaultComboBoxModel(artefaktNamen);
				comboBoxArtefakte1.setModel(dmArtefakte);
				comboBoxArtefakte2.setModel(dmArtefakte);
				
				panelKampfErstellen.show();
				panelMainMenu.hide();
			}
		});
		btnKampferstellen_1.setForeground(Color.BLACK);
		btnKampferstellen_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 28));
		btnKampferstellen_1.setBackground(new Color(230, 230, 250));
		btnKampferstellen_1.setBounds(319, 228, 545, 77);
		panelMainMenu.add(btnKampferstellen_1);
		
		JButton btnKampfHistorie_1 = new JButton("Kampfhistorie");
		btnKampfHistorie_1.setForeground(Color.BLACK);
		btnKampfHistorie_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 28));
		btnKampfHistorie_1.setBackground(new Color(230, 230, 250));
		btnKampfHistorie_1.setBounds(319, 343, 545, 77);
		panelMainMenu.add(btnKampfHistorie_1);
		
		JButton btnExit_1 = new JButton("Beenden");
		btnExit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit_1.setForeground(Color.BLACK);
		btnExit_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 28));
		btnExit_1.setBackground(new Color(230, 230, 250));
		btnExit_1.setBounds(319, 518, 545, 77);
		panelMainMenu.add(btnExit_1);
		
		JLabel lblBackground_1_1 = new JLabel("");
		lblBackground_1_1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/700286-best-medieval-battle-wallpaper-1920x1080.jpg")));
		lblBackground_1_1.setBackground(new Color(230, 230, 250));
		lblBackground_1_1.setBounds(0, 0, 1184, 761);
		panelMainMenu.add(lblBackground_1_1);
		frame.setForeground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private Teilnehmer declareUnit(JComboBox comboBoxTroops, Teilnehmer einheit) {
		for(int i=0;i<main.getPreviewTroops().size();i++) {
			if(main.getPreviewTroops().get(i).getName().equals(comboBoxTroops.getSelectedItem()))
				einheit = main.getPreviewTroops().get(i);
		}
		return einheit;
	}
	
	private Artefakt declareArtefakt(JComboBox comboBoxArtefakt, Artefakt artefakt) {
		for(int i=0;i<main.getPreviewArtefakte().size();i++) {
			if(main.getPreviewArtefakte().get(i).getName().equals(comboBoxArtefakt.getSelectedItem()))
				artefakt = main.getPreviewArtefakte().get(i);
		}
		return artefakt;
	}

	private void setTroopIconsLeft(JLabel lblCommander1Einheit7, JLabel lblCommander1Einheit8, JLabel lblCommander1Einheit4,
			JLabel lblCommander1Einheit6, JLabel lblCommander1Einheit2, JLabel lblCommander1Einheit3,
			JLabel lblCommander1Einheit5, JLabel lblCommander1Einheit1, Teilnehmer einheit) {
		if (spieler1kampfEinheiten.size() == 1) {
			lblCommander1Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit1.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 2) {
			lblCommander1Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit2.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 3) {
			lblCommander1Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit3.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 4) {
			lblCommander1Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit4.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 5) {
			lblCommander1Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit5.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 6) {
			lblCommander1Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit6.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 7) {
			lblCommander1Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit7.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler1kampfEinheiten.size() == 8) {
			lblCommander1Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander1Einheit8.setToolTipText(einheit.getBeschreibung());
		}
	}

	private void removeTroopIconsLeft(JLabel lblCommander1Einheit7, JLabel lblCommander1Einheit8,
			JLabel lblCommander1Einheit4, JLabel lblCommander1Einheit6, JLabel lblCommander1Einheit2,
			JLabel lblCommander1Einheit3, JLabel lblCommander1Einheit5, JLabel lblCommander1Einheit1) {
		
		String uri = "/source/unknownTroop.png";
		
		if (spieler1kampfEinheiten.size() == 0) {
			lblCommander1Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit1.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 1) {
			lblCommander1Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit2.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 2) {
			lblCommander1Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit3.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 3) {
			lblCommander1Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit4.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 4) {
			lblCommander1Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit5.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 5) {
			lblCommander1Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit6.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 6) {
			lblCommander1Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit7.setToolTipText("");
		}
		if (spieler1kampfEinheiten.size() == 7) {
			lblCommander1Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Einheit8.setToolTipText("");
		}
	}

	private void setTroopIconsRight(JLabel lblCommander2Einheit2, JLabel lblCommander2Einheit1,
			JLabel lblCommander2Einheit6, JLabel lblCommander2Einheit4, JLabel lblCommander2Einheit3,
			JLabel lblCommander2Einheit8, JLabel lblCommander2Einheit5, JLabel lblCommander2Einheit7,
			Teilnehmer einheit) {
		if (spieler2kampfEinheiten.size() == 1) {
			lblCommander2Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit1.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 2) {
			lblCommander2Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit2.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 3) {
			lblCommander2Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit3.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 4) {
			lblCommander2Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit4.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 5) {
			lblCommander2Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit5.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 6) {
			lblCommander2Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit6.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 7) {
			lblCommander2Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit7.setToolTipText(einheit.getBeschreibung());
		}
		if (spieler2kampfEinheiten.size() == 8) {
			lblCommander2Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource(einheit.getPictureURI())));
			lblCommander2Einheit8.setToolTipText(einheit.getBeschreibung());
		}
	}

	private void removeTroopIconsRight(JLabel lblCommander2Einheit2, JLabel lblCommander2Einheit1,
			JLabel lblCommander2Einheit6, JLabel lblCommander2Einheit4, JLabel lblCommander2Einheit3,
			JLabel lblCommander2Einheit8, JLabel lblCommander2Einheit5, JLabel lblCommander2Einheit7) {
		String uri = "/source/unknownTroop.png";
		
		if (spieler2kampfEinheiten.size() == 0) {
			lblCommander2Einheit1.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit1.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 1) {
			lblCommander2Einheit2.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit2.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 2) {
			lblCommander2Einheit3.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit3.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 3) {
			lblCommander2Einheit4.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit4.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 4) {
			lblCommander2Einheit5.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit5.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 5) {
			lblCommander2Einheit6.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit6.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 6) {
			lblCommander2Einheit7.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit7.setToolTipText("");
		}
		if (spieler2kampfEinheiten.size() == 7) {
			lblCommander2Einheit8.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander2Einheit8.setToolTipText("");
		}
	}
	
	private void resetArtefakt1Icons(JLabel lblCommander1Artefakt2, JLabel lblCommander1Artefakt3,
			JLabel lblCommander1Artefakt1, Artefakt artefakt, Artefakt[] artefakte) {
		
		String uri = "/source/noitem.png";
		
		if(artefakte[0] != null && artefakte[1] != null && artefakte[2] == null) {
			lblCommander1Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Artefakt3.setToolTipText("");
		}
		if(artefakte[0] != null && artefakte[1] == null && artefakte[2] == null) {
			lblCommander1Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Artefakt2.setToolTipText("");
		}
		if(artefakte[0] == null && artefakte[1] == null && artefakte[2] == null) {
			lblCommander1Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource(uri)));
			lblCommander1Artefakt1.setToolTipText("");
		}
	}
}
