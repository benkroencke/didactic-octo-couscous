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
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	public JFrame frame;
	private JPanel panelMainMenu;

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
		lblUnitPreview.setIcon(new ImageIcon(MainWindow.class.getResource("/source/RedanienRitter.png")));
		lblUnitPreview.setBounds(542, 634, 100, 100);
		panelKampfErstellen.add(lblUnitPreview);
		
		JButton btnTakeLeft = new JButton("entferne links");
		btnTakeLeft.setBackground(new Color(230, 230, 250));
		btnTakeLeft.setBounds(510, 570, 164, 23);
		panelKampfErstellen.add(btnTakeLeft);
		
		JButton btnTakeRight = new JButton("entferne rechts");
		btnTakeRight.setBackground(new Color(230, 230, 250));
		btnTakeRight.setBounds(510, 600, 164, 23);
		panelKampfErstellen.add(btnTakeRight);
		
		JButton btnGiveLeft = new JButton("Gebe links");
		btnGiveLeft.setBackground(new Color(230, 230, 250));
		btnGiveLeft.setBounds(510, 505, 164, 23);
		panelKampfErstellen.add(btnGiveLeft);
		
		JComboBox comboBoxTroops = new JComboBox();
		comboBoxTroops.setBounds(510, 454, 164, 40);
		panelKampfErstellen.add(comboBoxTroops);
		
		JButton btnGiveRight = new JButton("Gebe rechts");
		btnGiveRight.setBackground(new Color(230, 230, 250));
		btnGiveRight.setBounds(510, 537, 164, 23);
		panelKampfErstellen.add(btnGiveRight);
		
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
		
		JLabel lblCommander2Name = new JLabel("K\u00F6nig Foltest");
		lblCommander2Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCommander2Name.setForeground(Color.WHITE);
		lblCommander2Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 42));
		lblCommander2Name.setBounds(602, 110, 512, 67);
		panelKampfErstellen.add(lblCommander2Name);
		
		JLabel lblCommander1Name = new JLabel("Geralt von Riva");
		lblCommander1Name.setHorizontalAlignment(SwingConstants.LEFT);
		lblCommander1Name.setForeground(Color.WHITE);
		lblCommander1Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 42));
		lblCommander1Name.setBounds(70, 110, 512, 67);
		panelKampfErstellen.add(lblCommander1Name);
		
		JComboBox comboBoxCommander2Artefakt2 = new JComboBox();
		comboBoxCommander2Artefakt2.setBounds(914, 566, 200, 30);
		panelKampfErstellen.add(comboBoxCommander2Artefakt2);
		
		JComboBox comboBoxCommander2Artefakt3 = new JComboBox();
		comboBoxCommander2Artefakt3.setBounds(914, 607, 200, 30);
		panelKampfErstellen.add(comboBoxCommander2Artefakt3);
		
		JComboBox comboBoxCommander2Artefakt1 = new JComboBox();
		comboBoxCommander2Artefakt1.setBounds(914, 525, 200, 30);
		panelKampfErstellen.add(comboBoxCommander2Artefakt1);
		
		JComboBox comboBoxCommander1Artefakt3 = new JComboBox();
		comboBoxCommander1Artefakt3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		comboBoxCommander1Artefakt3.setBounds(70, 607, 200, 30);
		panelKampfErstellen.add(comboBoxCommander1Artefakt3);
		
		JComboBox comboBoxCommander1Artefakt2 = new JComboBox();
		comboBoxCommander1Artefakt2.setBounds(69, 566, 200, 30);
		panelKampfErstellen.add(comboBoxCommander1Artefakt2);
		
		JComboBox comboBoxCommander1Artefakt1 = new JComboBox();
		comboBoxCommander1Artefakt1.setBounds(70, 525, 200, 30);
		panelKampfErstellen.add(comboBoxCommander1Artefakt1);
		
		JLabel lblCommander2Artefakt3 = new JLabel("");
		lblCommander2Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Donner.png")));
		lblCommander2Artefakt3.setBounds(1054, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt3);
		
		JLabel lblCommander2Artefakt2 = new JLabel("");
		lblCommander2Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Koenigsamulett.png")));
		lblCommander2Artefakt2.setBounds(984, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt2);
		
		JLabel lblCommander2Artefakt1 = new JLabel("");
		lblCommander2Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Widerhaken.png")));
		lblCommander2Artefakt1.setBounds(914, 454, 60, 60);
		panelKampfErstellen.add(lblCommander2Artefakt1);
		
		JLabel lblCommander1Artefakt2 = new JLabel("");
		lblCommander1Artefakt2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Mittagserscheinung.png")));
		lblCommander1Artefakt2.setBounds(139, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt2);
		
		JLabel lblCommander1Artefakt3 = new JLabel("");
		lblCommander1Artefakt3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Nachtwache.png")));
		lblCommander1Artefakt3.setBounds(209, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt3);
		
		JLabel lblCommander1Artefakt1 = new JLabel("");
		lblCommander1Artefakt1.setToolTipText("Krumms\u00E4bel: (+25 Angriff f\u00FCr den Helden)");
		lblCommander1Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Krummsaebel.png")));
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
		
		JButton btnCommander2Down = new JButton("");
		btnCommander2Down.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowDown.png")));
		btnCommander2Down.setBackground(Color.BLACK);
		btnCommander2Down.setBounds(859, 308, 45, 40);
		panelKampfErstellen.add(btnCommander2Down);
		
		JButton btnCommander2Up = new JButton("");
		btnCommander2Up.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowUp.png")));
		btnCommander2Up.setBackground(Color.BLACK);
		btnCommander2Up.setBounds(859, 206, 45, 40);
		panelKampfErstellen.add(btnCommander2Up);
		
		JButton btnCommander1Down = new JButton("");
		btnCommander1Down.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowDown.png")));
		btnCommander1Down.setBackground(new Color(0, 0, 0));
		btnCommander1Down.setBounds(280, 308, 45, 40);
		panelKampfErstellen.add(btnCommander1Down);
		
		JButton btnCommander1Up = new JButton("");
		btnCommander1Up.setBackground(new Color(0, 0, 0));
		btnCommander1Up.setIcon(new ImageIcon(MainWindow.class.getResource("/source/arrowUp.png")));
		btnCommander1Up.setBounds(280, 206, 45, 40);
		panelKampfErstellen.add(btnCommander1Up);
		
		JLabel lblCommander2Specialty = new JLabel("Unterst\u00FCtzer");
		lblCommander2Specialty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander2Specialty.setForeground(Color.WHITE);
		lblCommander2Specialty.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander2Specialty.setBounds(914, 388, 200, 55);
		panelKampfErstellen.add(lblCommander2Specialty);
		
		JLabel lblCommander1Specialty = new JLabel("K\u00E4mpfer");
		lblCommander1Specialty.setForeground(new Color(255, 255, 255));
		lblCommander1Specialty.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander1Specialty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander1Specialty.setBounds(70, 388, 200, 55);
		panelKampfErstellen.add(lblCommander1Specialty);
		
		JLabel lblCommander2 = new JLabel("");
		lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/foltest.png")));
		lblCommander2.setBounds(914, 177, 200, 200);
		panelKampfErstellen.add(lblCommander2);
		
		JLabel lblCommander1 = new JLabel("New label");
		lblCommander1.setToolTipText("Geralt von Riva: K\u00E4mpfer, Angriff: 250, Initiative: 150, Kommandowert: 6");
		lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/geralt.png")));
		lblCommander1.setBounds(70, 177, 200, 200);
		panelKampfErstellen.add(lblCommander1);
		
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
}
