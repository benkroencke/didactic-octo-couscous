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
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panelKampfErstellen = new JPanel();
		panelKampfErstellen.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panelKampfErstellen);
		panelKampfErstellen.setLayout(null);
		
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
		lblCommander1Artefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/Krummsaebel.png")));
		lblCommander1Artefakt1.setBounds(70, 454, 60, 60);
		panelKampfErstellen.add(lblCommander1Artefakt1);
		
		JComboBox comboBoxSkillCommander2 = new JComboBox();
		comboBoxSkillCommander2.setBounds(649, 388, 200, 40);
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
		btnAddSkills.setBackground(Color.GRAY);
		btnAddSkills.setBounds(538, 388, 108, 40);
		panelKampfErstellen.add(btnAddSkills);
		
		JComboBox comboBoxSkillCommander1 = new JComboBox();
		comboBoxSkillCommander1.setBounds(335, 388, 200, 40);
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
		
		JLabel lblCommander2Name = new JLabel("K\u00F6nig Foltest");
		lblCommander2Name.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander2Name.setForeground(Color.WHITE);
		lblCommander2Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander2Name.setBounds(914, 388, 200, 55);
		panelKampfErstellen.add(lblCommander2Name);
		
		JLabel lblCommander1Name = new JLabel("Geralt");
		lblCommander1Name.setForeground(new Color(255, 255, 255));
		lblCommander1Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander1Name.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander1Name.setBounds(70, 388, 200, 55);
		panelKampfErstellen.add(lblCommander1Name);
		
		JLabel lblCommander2 = new JLabel("");
		lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/foltest.png")));
		lblCommander2.setBounds(914, 177, 200, 200);
		panelKampfErstellen.add(lblCommander2);
		
		JLabel lblCommander1 = new JLabel("New label");
		lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/geralt.png")));
		lblCommander1.setBounds(70, 177, 200, 200);
		panelKampfErstellen.add(lblCommander1);
		
		JLabel lblUberschriftCreateBattle = new JLabel("Erstelle Kommandanten und verteile Einheiten");
		lblUberschriftCreateBattle.setHorizontalAlignment(SwingConstants.CENTER);
		lblUberschriftCreateBattle.setForeground(Color.WHITE);
		lblUberschriftCreateBattle.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 52));
		lblUberschriftCreateBattle.setBounds(10, 89, 1164, 77);
		panelKampfErstellen.add(lblUberschriftCreateBattle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/source/700286-best-medieval-battle-wallpaper-1920x1080.jpg")));
		lblNewLabel.setBounds(0, 0, 1184, 761);
		panelKampfErstellen.add(lblNewLabel);
		
		JPanel panelMainMenu = new JPanel();
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
