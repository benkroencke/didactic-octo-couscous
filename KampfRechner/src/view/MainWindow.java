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
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

import kampfrechner.Kampf;
import main.Main;
import model.Artefakt;
import model.Skill;
import model.Spieler;
import model.Teilnehmer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class MainWindow {

	public static JLabel lblVictory;
	
	Main main = new Main();
	public JFrame frame;
	private JPanel panelMainMenu;
	private JPanel panelKampfErstellen;
	private JPanel panelStatistik;
	ArrayList<Teilnehmer> spieler1kampfEinheiten = new ArrayList<Teilnehmer>();
	ArrayList<Teilnehmer> spieler2kampfEinheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer heldSpieler1;
	private Teilnehmer heldSpieler2;
	private int arrayCommander1Stelle = 0;
	private int arrayCommander2Stelle = 0;
	private DefaultListModel skillsLeft = new DefaultListModel();
	private DefaultListModel skillsRight = new DefaultListModel();
	private Teilnehmer teilnehmerFabrik = new Teilnehmer();
	private Skill skillFabrik = new Skill();
	private Artefakt artefaktFabrik = new Artefakt();
	private Artefakt[] artefakteSpieler1 = new Artefakt[3];
	private Artefakt[] artefakteSpieler2 = new Artefakt[3];
	private Skill s1skill1 = null;
	private Skill s1skill2 = null;
	private Skill s1skill3 = null;
	private Skill s1skill4 = null;
	private Skill s1Ulti = null;
	private Skill s2skill1 = null;
	private Skill s2skill2 = null;
	private Skill s2skill3 = null;
	private Skill s2skill4 = null;
	private Skill s2Ulti = null;
	private JPanel panelLog;
	
	private JLabel lblFraktionLinks;
	private JLabel lblFraktionRechts;
	
	private JLabel lblCommander1Statistik;
	private JLabel lblCommander2Statistik;
	
	private JLabel lblCommander1Einheit1Statistik;
	private JLabel lblCommander1Einheit2Statistik;
	private JLabel lblCommander1Einheit3Statistik;
	private JLabel lblCommander1Einheit4Statistik;
	private JLabel lblCommander1Einheit5Statistik;
	private JLabel lblCommander1Einheit6Statistik;
	private JLabel lblCommander1Einheit7Statistik;
	private JLabel lblCommander1Einheit8Statistik;
	
	private JLabel lblCommander2Einheit1Statistik;
	private JLabel lblCommander2Einheit2Statistik;
	private JLabel lblCommander2Einheit3Statistik;
	private JLabel lblCommander2Einheit4Statistik;
	private JLabel lblCommander2Einheit5Statistik;
	private JLabel lblCommander2Einheit6Statistik;
	private JLabel lblCommander2Einheit7Statistik;
	private JLabel lblCommander2Einheit8Statistik;
	
	private JLabel lblCommander1Skill1;
	private JLabel lblCommander1Skill2;
	private JLabel lblCommander1Skill3;
	private JLabel lblCommander1Skill4;
	private JLabel lblCommander1Ultimate;
	
	private JLabel lblCommander2Skill1;
	private JLabel lblCommander2Skill2;
	private JLabel lblCommander2Skill3;
	private JLabel lblCommander2Skill4;
	private JLabel lblCommander2Ultimate;
	
	private JLabel lblCommander1Artefakt1Statistik;
	private JLabel lblCommander1Artefakt2Statistik;
	private JLabel lblCommander1Artefakt3Statistik;
	
	private JLabel lblCommander2Artefakt1Statistik;
	private JLabel lblCommander2Artefakt2Statistik;
	private JLabel lblCommander2Artefakt3Statistik;
	
	private JProgressBar hpC1E1;
	private JProgressBar hpC1E2;
	private JProgressBar hpC1E3;
	private JProgressBar hpC1E4;
	private JProgressBar hpC1E5;
	private JProgressBar hpC1E6;
	private JProgressBar hpC1E7;
	private JProgressBar hpC1E8;
	
	private JProgressBar hpC2E1;
	private JProgressBar hpC2E2;
	private JProgressBar hpC2E3;
	private JProgressBar hpC2E4;
	private JProgressBar hpC2E5;
	private JProgressBar hpC2E6;
	private JProgressBar hpC2E7;
	private JProgressBar hpC2E8;
	
	private JProgressBar healthAllLeft;
	private JProgressBar healthAllRight;
	
	private JLabel lblCommander1Level;
	private JLabel lblCommander2Level;
	
	private JLabel lblAfterCommander1Name;
	private JLabel lblAfterCommander2Name;
	
	private JLabel lblSchaden11Value;
	private JLabel lblSchaden12Value;
	private JLabel lblSchaden13Value;
	private JLabel lblSchaden14Value;
	
	private JLabel lblSchaden21Value;
	private JLabel lblSchaden22Value;
	private JLabel lblSchaden23Value;
	private JLabel lblSchaden24Value;
	
	private JPanel schaden1Statistik;
	private JPanel schaden2Statistik;
	
	private JButton btnStatistik;
	
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
		
		panelStatistik = new JPanel();
		panelStatistik.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panelStatistik);
		panelStatistik.setLayout(null);
		panelStatistik.hide();
		
		JButton statisticMainMenu = new JButton("Hauptmen\u00FC");
		statisticMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelStatistik.hide();
				panelMainMenu.show();
				
			}
		});
		
		JButton btnKampfbericht = new JButton("Kampflog");
		btnKampfbericht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panelLog.isVisible()) {
					panelLog.hide();
					btnKampfbericht.setBackground(new Color(230, 230, 250));
				}
				else {
					panelLog.show();
					btnKampfbericht.setBackground(Color.BLACK);
				}
				
			}
		});
		btnKampfbericht.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		btnKampfbericht.setBackground(new Color(230, 230, 250));
		btnKampfbericht.setBounds(490, 596, 204, 88);
		panelStatistik.add(btnKampfbericht);
		
		btnStatistik = new JButton("Schaden");
		btnStatistik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(schaden1Statistik.isVisible() && schaden2Statistik.isVisible()) {
					schaden1Statistik.hide();
					schaden2Statistik.hide();
					btnStatistik.setBackground(new Color(230, 230, 250));
				}
				else {
					schaden1Statistik.show();
					schaden2Statistik.show();
					btnStatistik.setBackground(Color.BLACK);
				}
				
			}
		});
		btnStatistik.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		btnStatistik.setBackground(new Color(230, 230, 250));
		btnStatistik.setBounds(490, 485, 204, 88);
		panelStatistik.add(btnStatistik);
		
		lblCommander2Ultimate = new JLabel("New label");
		lblCommander2Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Ultimate.setBounds(704, 341, 50, 88);
		panelStatistik.add(lblCommander2Ultimate);
		
		lblCommander2Skill3 = new JLabel("New label");
		lblCommander2Skill3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill3.setBounds(775, 341, 40, 40);
		panelStatistik.add(lblCommander2Skill3);
		
		lblCommander2Skill1 = new JLabel("New label");
		lblCommander2Skill1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill1.setBounds(775, 239, 40, 40);
		panelStatistik.add(lblCommander2Skill1);
		
		lblCommander2Skill2 = new JLabel("New label");
		lblCommander2Skill2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill2.setBounds(775, 290, 40, 40);
		panelStatistik.add(lblCommander2Skill2);
		
		lblCommander2Skill4 = new JLabel("New label");
		lblCommander2Skill4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill4.setBounds(775, 389, 40, 40);
		panelStatistik.add(lblCommander2Skill4);
		
		lblVictory = new JLabel("");
		lblVictory.setIcon(new ImageIcon(MainWindow.class.getResource("/source/victory.png")));
		lblVictory.setForeground(new Color(240, 248, 255));
		lblVictory.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 40));
		lblVictory.setHorizontalAlignment(SwingConstants.CENTER);
		lblVictory.setBounds(467, 270, 250, 60);
		lblVictory.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		panelStatistik.add(lblVictory);
		
		lblCommander1Skill4 = new JLabel("New label");
		lblCommander1Skill4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill4.setBounds(369, 389, 40, 40);
		panelStatistik.add(lblCommander1Skill4);
		
		lblCommander1Skill2 = new JLabel("New label");
		lblCommander1Skill2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill2.setBounds(369, 290, 40, 40);
		panelStatistik.add(lblCommander1Skill2);
		
		lblCommander1Skill3 = new JLabel("New label");
		lblCommander1Skill3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill3.setBounds(369, 341, 40, 40);
		panelStatistik.add(lblCommander1Skill3);
		
		lblCommander1Skill1 = new JLabel("New label");
		lblCommander1Skill1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill1.setBounds(369, 239, 40, 40);
		panelStatistik.add(lblCommander1Skill1);
		
		lblCommander1Ultimate = new JLabel("New label");
		lblCommander1Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Ultimate.setBounds(430, 341, 50, 88);
		panelStatistik.add(lblCommander1Ultimate);
		
		lblCommander2Artefakt3Statistik = new JLabel("New label");
		lblCommander2Artefakt3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt3Statistik.setBounds(1057, 379, 60, 60);
		lblCommander2Artefakt3Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Artefakt3Statistik);
		
		lblCommander2Artefakt2Statistik = new JLabel("New label");
		lblCommander2Artefakt2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt2Statistik.setBounds(1057, 310, 60, 60);
		lblCommander2Artefakt2Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Artefakt2Statistik);
		
		lblCommander2Artefakt1Statistik = new JLabel("New label");
		lblCommander2Artefakt1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt1Statistik.setBounds(1057, 239, 60, 60);
		lblCommander2Artefakt1Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Artefakt1Statistik);
		
		hpC2E4 = new JProgressBar();
		hpC2E4.setMaximum(0);
		hpC2E4.setForeground(new Color(30, 144, 255));
		hpC2E4.setBackground(new Color(128, 0, 0));
		hpC2E4.setBounds(1034, 585, 100, 14);
		panelStatistik.add(hpC2E4);
		
		hpC2E7 = new JProgressBar();
		hpC2E7.setMaximum(0);
		hpC2E7.setForeground(new Color(30, 144, 255));
		hpC2E7.setBackground(new Color(128, 0, 0));
		hpC2E7.setBounds(924, 710, 100, 14);
		panelStatistik.add(hpC2E7);
		
		healthAllRight = new JProgressBar();
		healthAllRight.setValue(60);
		healthAllRight.setForeground(Color.BLUE);
		healthAllRight.setBackground(new Color(128, 0, 0));
		healthAllRight.setBounds(704, 450, 430, 24);
		panelStatistik.add(healthAllRight);
		
		hpC2E8 = new JProgressBar();
		hpC2E8.setMaximum(0);
		hpC2E8.setForeground(new Color(30, 144, 255));
		hpC2E8.setBackground(new Color(128, 0, 0));
		hpC2E8.setBounds(1034, 710, 100, 14);
		panelStatistik.add(hpC2E8);
		
		hpC2E6 = new JProgressBar();
		hpC2E6.setMaximum(0);
		hpC2E6.setForeground(new Color(30, 144, 255));
		hpC2E6.setBackground(new Color(128, 0, 0));
		hpC2E6.setBounds(814, 710, 100, 14);
		panelStatistik.add(hpC2E6);
		
		hpC2E1 = new JProgressBar();
		hpC2E1.setMaximum(0);
		hpC2E1.setForeground(new Color(30, 144, 255));
		hpC2E1.setBackground(new Color(128, 0, 0));
		hpC2E1.setBounds(704, 585, 100, 14);
		panelStatistik.add(hpC2E1);
		
		hpC2E5 = new JProgressBar();
		hpC2E5.setMaximum(0);
		hpC2E5.setForeground(new Color(30, 144, 255));
		hpC2E5.setBackground(new Color(128, 0, 0));
		hpC2E5.setBounds(704, 710, 100, 14);
		panelStatistik.add(hpC2E5);
		
		hpC2E2 = new JProgressBar();
		hpC2E2.setMaximum(0);
		hpC2E2.setForeground(new Color(30, 144, 255));
		hpC2E2.setBackground(new Color(128, 0, 0));
		hpC2E2.setBounds(814, 585, 100, 14);
		panelStatistik.add(hpC2E2);
		
		hpC2E3 = new JProgressBar();
		hpC2E3.setMaximum(0);
		hpC2E3.setForeground(new Color(30, 144, 255));
		hpC2E3.setBackground(new Color(128, 0, 0));
		hpC2E3.setBounds(924, 585, 100, 14);
		panelStatistik.add(hpC2E3);
		
		lblCommander2Einheit7Statistik = new JLabel("");
		lblCommander2Einheit7Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit7Statistik.setBounds(924, 610, 100, 100);
		lblCommander2Einheit7Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit7Statistik);
		
		
		lblCommander2Einheit8Statistik = new JLabel("");
		lblCommander2Einheit8Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit8Statistik.setBounds(1034, 610, 100, 100);
		lblCommander2Einheit8Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit8Statistik);
		
		lblCommander2Einheit3Statistik = new JLabel("");
		lblCommander2Einheit3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit3Statistik.setBounds(924, 485, 100, 100);
		lblCommander2Einheit3Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit3Statistik);
		
		lblCommander2Einheit1Statistik = new JLabel("");
		lblCommander2Einheit1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit1Statistik.setBounds(704, 485, 100, 100);
		lblCommander2Einheit1Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit1Statistik);
		
		lblCommander2Einheit4Statistik = new JLabel("");
		lblCommander2Einheit4Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit4Statistik.setBounds(1034, 485, 100, 100);
		lblCommander2Einheit4Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit4Statistik);
		
		lblCommander2Einheit2Statistik = new JLabel("");
		lblCommander2Einheit2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit2Statistik.setBounds(814, 485, 100, 100);
		lblCommander2Einheit2Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit2Statistik);
		
		lblCommander2Einheit5Statistik = new JLabel("");
		lblCommander2Einheit5Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit5Statistik.setBounds(704, 610, 100, 100);
		lblCommander2Einheit5Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit5Statistik);
		
		lblCommander2Einheit6Statistik = new JLabel("");
		lblCommander2Einheit6Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander2Einheit6Statistik.setBounds(814, 610, 100, 100);
		lblCommander2Einheit6Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Einheit6Statistik);
		
		lblCommander1Artefakt1Statistik = new JLabel("New label");
		lblCommander1Artefakt1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt1Statistik.setBounds(67, 239, 60, 60);
		lblCommander1Artefakt1Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Artefakt1Statistik);
		
		lblCommander1Artefakt2Statistik = new JLabel("New label");
		lblCommander1Artefakt2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt2Statistik.setBounds(67, 310, 60, 60);
		lblCommander1Artefakt2Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Artefakt2Statistik);
		
		lblCommander1Artefakt3Statistik = new JLabel("New label");
		lblCommander1Artefakt3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt3Statistik.setBounds(67, 379, 60, 60);
		lblCommander1Artefakt3Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Artefakt3Statistik);
		
		hpC1E5 = new JProgressBar();
		hpC1E5.setMaximum(0);
		hpC1E5.setForeground(new Color(30, 144, 255));
		hpC1E5.setBackground(new Color(128, 0, 0));
		hpC1E5.setBounds(50, 710, 100, 14);
		panelStatistik.add(hpC1E5);
		
		hpC1E6 = new JProgressBar();
		hpC1E6.setMaximum(0);
		hpC1E6.setForeground(new Color(30, 144, 255));
		hpC1E6.setBackground(new Color(128, 0, 0));
		hpC1E6.setBounds(160, 710, 100, 14);
		panelStatistik.add(hpC1E6);
		
		hpC1E8 = new JProgressBar();
		hpC1E8.setMaximum(0);
		hpC1E8.setForeground(new Color(30, 144, 255));
		hpC1E8.setBackground(new Color(128, 0, 0));
		hpC1E8.setBounds(380, 710, 100, 14);
		panelStatistik.add(hpC1E8);
		
		hpC1E7 = new JProgressBar();
		hpC1E7.setMaximum(0);
		hpC1E7.setForeground(new Color(30, 144, 255));
		hpC1E7.setBackground(new Color(128, 0, 0));
		hpC1E7.setBounds(270, 710, 100, 14);
		panelStatistik.add(hpC1E7);
		
		hpC1E2 = new JProgressBar();
		hpC1E2.setMaximum(0);
		hpC1E2.setForeground(new Color(30, 144, 255));
		hpC1E2.setBackground(new Color(128, 0, 0));
		hpC1E2.setBounds(160, 585, 100, 14);
		panelStatistik.add(hpC1E2);
		
		hpC1E4 = new JProgressBar();
		hpC1E4.setMaximum(0);
		hpC1E4.setForeground(new Color(30, 144, 255));
		hpC1E4.setBackground(new Color(128, 0, 0));
		hpC1E4.setBounds(380, 585, 100, 14);
		panelStatistik.add(hpC1E4);
		
		hpC1E3 = new JProgressBar();
		hpC1E3.setMaximum(0);
		hpC1E3.setForeground(new Color(30, 144, 255));
		hpC1E3.setBackground(new Color(128, 0, 0));
		hpC1E3.setBounds(270, 585, 100, 14);
		panelStatistik.add(hpC1E3);
		
		hpC1E1 = new JProgressBar();
		hpC1E1.setMaximum(0);
		hpC1E1.setForeground(new Color(30, 144, 255));
		hpC1E1.setBackground(new Color(128, 0, 0));
		hpC1E1.setBounds(50, 585, 100, 14);
		panelStatistik.add(hpC1E1);
		
		healthAllLeft = new JProgressBar();
		healthAllLeft.setMaximum(2500);
		healthAllLeft.setForeground(Color.BLUE);
		healthAllLeft.setBackground(new Color(128, 0, 0));
		healthAllLeft.setValue(1800);
		healthAllLeft.setBounds(50, 450, 430, 24);
		panelStatistik.add(healthAllLeft);
		
		lblCommander1Einheit6Statistik = new JLabel("");
		lblCommander1Einheit6Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit6Statistik.setBounds(160, 610, 100, 100);
		lblCommander1Einheit6Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit6Statistik);
		
		lblCommander1Einheit8Statistik = new JLabel("");
		lblCommander1Einheit8Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit8Statistik.setBounds(380, 610, 100, 100);
		lblCommander1Einheit8Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit8Statistik);
		
		lblCommander1Einheit7Statistik = new JLabel("");
		lblCommander1Einheit7Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit7Statistik.setBounds(270, 610, 100, 100);
		lblCommander1Einheit7Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit7Statistik);
		
		lblCommander1Einheit5Statistik = new JLabel("");
		lblCommander1Einheit5Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit5Statistik.setBounds(50, 610, 100, 100);
		lblCommander1Einheit5Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit5Statistik);
		
		lblCommander1Einheit3Statistik = new JLabel("");
		lblCommander1Einheit3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit3Statistik.setBounds(270, 485, 100, 100);
		lblCommander1Einheit3Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit3Statistik);
		
		lblCommander1Einheit4Statistik = new JLabel("");
		lblCommander1Einheit4Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit4Statistik.setBounds(380, 485, 100, 100);
		lblCommander1Einheit4Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit4Statistik);
		
		lblCommander1Einheit2Statistik = new JLabel("");
		lblCommander1Einheit2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit2Statistik.setBounds(160, 485, 100, 100);
		lblCommander1Einheit2Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit2Statistik);
		
		lblCommander1Einheit1Statistik = new JLabel("");
		lblCommander1Einheit1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/unknownTroop.png")));
		lblCommander1Einheit1Statistik.setBounds(50, 485, 100, 100);
		lblCommander1Einheit1Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Einheit1Statistik);
		
		lblCommander1Level = new JLabel("1");
		lblCommander1Level.setForeground(Color.WHITE);
		lblCommander1Level.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander1Level.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander1Level.setBounds(159, 389, 50, 50);
		panelStatistik.add(lblCommander1Level);
		
		lblCommander2Level = new JLabel("1");
		lblCommander2Level.setForeground(Color.WHITE);
		lblCommander2Level.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblCommander2Level.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommander2Level.setBounds(825, 389, 50, 50);
		panelStatistik.add(lblCommander2Level);
		
		lblCommander2Statistik = new JLabel("");
		lblCommander2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/yennefer.png")));
		lblCommander2Statistik.setBounds(825, 239, 200, 200);
		lblCommander2Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander2Statistik);
		
		lblCommander1Statistik = new JLabel("");
		lblCommander1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/geralt.png")));
		lblCommander1Statistik.setBounds(159, 239, 200, 200);
		lblCommander1Statistik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelStatistik.add(lblCommander1Statistik);
		
		JLabel blackStripe = new JLabel("");
		blackStripe.setIcon(new ImageIcon(MainWindow.class.getResource("/source/testStripe.png")));
		blackStripe.setBackground(Color.BLACK);
		blackStripe.setBounds(0, 217, 1184, 14);
		panelStatistik.add(blackStripe);
		
		lblAfterCommander2Name = new JLabel("Yennefer von Vengerberg");
		lblAfterCommander2Name.setForeground(Color.WHITE);
		lblAfterCommander2Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblAfterCommander2Name.setHorizontalAlignment(SwingConstants.LEFT);
		lblAfterCommander2Name.setBounds(825, 172, 349, 56);
		panelStatistik.add(lblAfterCommander2Name);
		
		lblAfterCommander1Name = new JLabel("Geralt von Riva");
		lblAfterCommander1Name.setForeground(Color.WHITE);
		lblAfterCommander1Name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblAfterCommander1Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAfterCommander1Name.setBounds(10, 172, 349, 56);
		panelStatistik.add(lblAfterCommander1Name);
		
		JLabel lblUeberschriftStatistik = new JLabel("Kampfstatistik");
		lblUeberschriftStatistik.setForeground(Color.WHITE);
		lblUeberschriftStatistik.setHorizontalAlignment(SwingConstants.CENTER);
		lblUeberschriftStatistik.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 48));
		lblUeberschriftStatistik.setBounds(369, 22, 446, 139);
		panelStatistik.add(lblUeberschriftStatistik);
		
		lblFraktionLinks = new JLabel("");
		lblFraktionLinks.setIcon(new ImageIcon(MainWindow.class.getResource("/source/nilfgaardIcon.png")));
		lblFraktionLinks.setBounds(209, 11, 150, 150);
		lblFraktionLinks.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		panelStatistik.add(lblFraktionLinks);
		
		lblFraktionRechts = new JLabel("");
		lblFraktionRechts.setIcon(new ImageIcon(MainWindow.class.getResource("/source/temerienIcon.png")));
		lblFraktionRechts.setBounds(825, 11, 150, 150);
		lblFraktionRechts.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		panelStatistik.add(lblFraktionRechts);
		statisticMainMenu.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		statisticMainMenu.setBackground(new Color(230, 230, 250));
		statisticMainMenu.setBounds(985, 11, 189, 56);
		panelStatistik.add(statisticMainMenu);
		
		JButton statisticZuruck = new JButton("Zur\u00FCck");
		statisticZuruck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelStatistik.hide();
				panelKampfErstellen.show();
				
			}
		});
		statisticZuruck.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		statisticZuruck.setBackground(new Color(230, 230, 250));
		statisticZuruck.setBounds(10, 11, 189, 56);
		panelStatistik.add(statisticZuruck);
		
		JLabel statisticBackground = new JLabel("");
		statisticBackground.setIcon(new ImageIcon(MainWindow.class.getResource("/source/statistic_background.jpg")));
		statisticBackground.setBounds(0, 0, 1184, 761);
		panelStatistik.add(statisticBackground);
		
		schaden1Statistik = new JPanel();
		schaden1Statistik.setBounds(50, 500, 430, 211);
		panelStatistik.add(schaden1Statistik);
		schaden1Statistik.hide();
		schaden1Statistik.setLayout(null);
		
		JLabel lblSchaden11Name = new JLabel("Kommandantenschaden");
		lblSchaden11Name.setForeground(new Color(255, 255, 255));
		lblSchaden11Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden11Name.setBounds(20, 15, 234, 34);
		schaden1Statistik.add(lblSchaden11Name);
		
		JLabel lblSchaden12Name = new JLabel("Soldatenschaden");
		lblSchaden12Name.setForeground(new Color(255, 255, 255));
		lblSchaden12Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden12Name.setBounds(20, 57, 234, 34);
		schaden1Statistik.add(lblSchaden12Name);
		
		JLabel lblSchaden13Name = new JLabel("Erlittener Schaden");
		lblSchaden13Name.setForeground(new Color(255, 255, 255));
		lblSchaden13Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden13Name.setBounds(20, 98, 234, 34);
		schaden1Statistik.add(lblSchaden13Name);
		
		JLabel lblSchaden14Name = new JLabel("Insgesamte Heilung");
		lblSchaden14Name.setForeground(new Color(255, 255, 255));
		lblSchaden14Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden14Name.setBounds(20, 139, 234, 34);
		schaden1Statistik.add(lblSchaden14Name);
		
		JLabel lblSchaden14Value_1 = new JLabel("200000");
		lblSchaden14Value_1.setForeground(new Color(34, 139, 34));
		lblSchaden14Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden14Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden14Value_1.setBounds(240, 139, 166, 34);
		this.lblSchaden14Value = lblSchaden14Value_1;
		schaden1Statistik.add(lblSchaden14Value_1);
		
		JLabel lblSchaden13Value_1 = new JLabel("200000");
		lblSchaden13Value_1.setForeground(new Color(220, 20, 60));
		lblSchaden13Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden13Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden13Value_1.setBounds(240, 98, 166, 34);
		this.lblSchaden13Value = lblSchaden13Value_1;
		schaden1Statistik.add(lblSchaden13Value_1);
		
		JLabel lblSchaden12Value_1 = new JLabel("200000");
		lblSchaden12Value_1.setForeground(new Color(255, 255, 255));
		lblSchaden12Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden12Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden12Value_1.setBounds(240, 57, 166, 34);
		this.lblSchaden12Value = lblSchaden12Value_1;
		schaden1Statistik.add(lblSchaden12Value_1);
		
		JLabel lblSchaden11Value_1 = new JLabel("200000");
		lblSchaden11Value_1.setForeground(new Color(255, 255, 255));
		lblSchaden11Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden11Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden11Value_1.setBounds(240, 15, 166, 34);
		this.lblSchaden11Value = lblSchaden11Value_1;
		schaden1Statistik.add(lblSchaden11Value_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/schadenStatistikBackground.png")));
		lblNewLabel_2.setBounds(0, 0, 430, 211);
		schaden1Statistik.add(lblNewLabel_2);
		
		schaden2Statistik = new JPanel();
		schaden2Statistik.setLayout(null);
		schaden2Statistik.setBounds(704, 500, 430, 211);
		schaden2Statistik.hide();
		panelStatistik.add(schaden2Statistik);
		
		JLabel lblSchaden21Name = new JLabel("Kommandantenschaden");
		lblSchaden21Name.setForeground(Color.WHITE);
		lblSchaden21Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden21Name.setBounds(20, 15, 234, 34);
		schaden2Statistik.add(lblSchaden21Name);
		
		JLabel lblSchaden22Name = new JLabel("Soldatenschaden");
		lblSchaden22Name.setForeground(Color.WHITE);
		lblSchaden22Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden22Name.setBounds(20, 57, 234, 34);
		schaden2Statistik.add(lblSchaden22Name);
		
		JLabel lblSchaden23Name = new JLabel("Erlittener Schaden");
		lblSchaden23Name.setForeground(Color.WHITE);
		lblSchaden23Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden23Name.setBounds(20, 98, 234, 34);
		schaden2Statistik.add(lblSchaden23Name);
		
		JLabel lblSchaden24Name = new JLabel("Insgesamte Heilung");
		lblSchaden24Name.setForeground(Color.WHITE);
		lblSchaden24Name.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		lblSchaden24Name.setBounds(20, 139, 234, 34);
		schaden2Statistik.add(lblSchaden24Name);
		
		JLabel lblSchaden24Value_1 = new JLabel("200000");
		lblSchaden24Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden24Value_1.setForeground(new Color(34, 139, 34));
		lblSchaden24Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden24Value_1.setBounds(240, 139, 166, 34);
		this.lblSchaden24Value = lblSchaden24Value_1;
		schaden2Statistik.add(lblSchaden24Value_1);
		
		JLabel lblSchaden23Value_1 = new JLabel("200000");
		lblSchaden23Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden23Value_1.setForeground(new Color(220, 20, 60));
		lblSchaden23Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden23Value_1.setBounds(240, 98, 166, 34);
		this.lblSchaden23Value = lblSchaden23Value_1;
		schaden2Statistik.add(lblSchaden23Value_1);
		
		JLabel lblSchaden22Value_1 = new JLabel("200000");
		lblSchaden22Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden22Value_1.setForeground(Color.WHITE);
		lblSchaden22Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden22Value_1.setBounds(240, 57, 166, 34);
		this.lblSchaden22Value = lblSchaden22Value_1;
		schaden2Statistik.add(lblSchaden22Value_1);
		
		JLabel lblSchaden21Value_1 = new JLabel("200000");
		lblSchaden21Value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSchaden21Value_1.setForeground(Color.WHITE);
		lblSchaden21Value_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSchaden21Value_1.setBounds(240, 15, 166, 34);
		this.lblSchaden21Value = lblSchaden21Value_1;
		schaden2Statistik.add(lblSchaden21Value_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/schadenStatistikBackground.png")));
		lblNewLabel_2_1.setBounds(0, 0, 430, 211);
		schaden2Statistik.add(lblNewLabel_2_1);
		
		panelLog = new JPanel();
		panelLog.setBackground(new Color(105, 105, 105));
		panelLog.setBounds(10, 73, 1164, 401);
		panelLog.hide();
		panelStatistik.add(panelLog);
		panelLog.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1144, 379);
		panelLog.add(scrollPane);
		
		JTextArea logTextBox = new JTextArea();
		logTextBox.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 18));
		scrollPane.setViewportView(logTextBox);
		
		panelKampfErstellen = new JPanel();
		panelKampfErstellen.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panelKampfErstellen);
		panelKampfErstellen.setLayout(null);
		panelKampfErstellen.hide();
		
		JComboBox comboBoxSkills = new JComboBox();
		comboBoxSkills.setBounds(510, 383, 164, 40);
		panelKampfErstellen.add(comboBoxSkills);
		
		JButton btnAddSkillsRight = new JButton("+");
		btnAddSkillsRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Skill skill = null;
				skill = declareSkill(comboBoxSkills, skill);
				
				if(heldSpieler2 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(!(heldSpieler2.getUltimate() == null)) {
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat bereits eine volle Skillliste (Maximal 5 Skills für einen Kommandanten!");
						return;
					}
					setSkill(heldSpieler2, skill, "r");
					skillsRight.addElement(skill.getName());
				}
				
			}
		});
		btnAddSkillsRight.setToolTipText("Skill hinzuf\u00FCgen");
		btnAddSkillsRight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnAddSkillsRight.setBackground(new Color(230, 230, 250));
		btnAddSkillsRight.setBounds(684, 383, 70, 40);
		panelKampfErstellen.add(btnAddSkillsRight);
		
		JButton btnRemoveSkillsLeft = new JButton("-");
		btnRemoveSkillsLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(heldSpieler1 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(heldSpieler1.getSkill1() == null)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Skills zum entfernen!");
					else {
						
					}
						removeSkill(heldSpieler1, skillsLeft, "l");
						

					}
				
			}
		});
		btnRemoveSkillsLeft.setToolTipText("Skill entfernen");
		btnRemoveSkillsLeft.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnRemoveSkillsLeft.setBackground(new Color(230, 230, 250));
		btnRemoveSkillsLeft.setBounds(430, 383, 70, 40);
		panelKampfErstellen.add(btnRemoveSkillsLeft);
		
		JButton btnRemoveSkillsRight = new JButton("-");
		btnRemoveSkillsRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(heldSpieler2 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(heldSpieler2.getSkill1() == null)
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat keine Skills zum entfernen!");
					else {
						
					}
						removeSkill(heldSpieler2, skillsRight, "r");
						

					}
				
			}
		});
		btnRemoveSkillsRight.setToolTipText("Skill entfernen");
		btnRemoveSkillsRight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnRemoveSkillsRight.setBackground(new Color(230, 230, 250));
		btnRemoveSkillsRight.setBounds(779, 383, 70, 40);
		panelKampfErstellen.add(btnRemoveSkillsRight);
		

		JButton btnBerechne = new JButton("Berechne");
		btnBerechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resetStatistik();
				
				Spieler spieler1 = Main.getSpieler1();
				Spieler spieler2 = Main.getSpieler2();
				
				ArrayList<Teilnehmer> spieler1Einheiten = new ArrayList<Teilnehmer>();
				ArrayList<Teilnehmer> spieler2Einheiten = new ArrayList<Teilnehmer>();
				
				
				Artefakt[] artefakte1 = artefakteSpieler1;
				Artefakt[] artefakte2 = artefakteSpieler2;
				
				
				if(heldSpieler1 == null || heldSpieler2 == null || heldSpieler1.getEinheitenListe() == null || heldSpieler2.getEinheitenListe() == null) {
					JOptionPane.showMessageDialog(null, "Bitte Konfiguriere eine Schlacht!");
					return;
				}
				
				for(int i=0; i<spieler1kampfEinheiten.size();i++) {
					spieler1Einheiten.add(teilnehmerFabrik.erstelle(spieler1kampfEinheiten.get(i).getName(), spieler1));
				}
				for(int i=0; i<spieler2kampfEinheiten.size();i++) {
					spieler2Einheiten.add(teilnehmerFabrik.erstelle(spieler2kampfEinheiten.get(i).getName(), spieler2));
				}
				for(int i=0; i<artefakte1.length;i++) {
					if(!(artefakte1[i] == null))
						artefakte1[i] = artefaktFabrik.erstelle(heldSpieler1.getArtefakte()[i].getName());
				}
				for(int i=0; i<artefakte2.length;i++) {
					if(!(artefakte2[i] == null))
						artefakte2[i] = artefaktFabrik.erstelle(heldSpieler2.getArtefakte()[i].getName());
				}
				
				
				heldSpieler1 = teilnehmerFabrik.erstelle(heldSpieler1.getName(), spieler1);
				heldSpieler2 = teilnehmerFabrik.erstelle(heldSpieler2.getName(), spieler2);
				heldSpieler1.setEinheitenListe(spieler1Einheiten);
				heldSpieler2.setEinheitenListe(spieler2Einheiten);
				heldSpieler1.setArtefakte(artefakte1);
				heldSpieler2.setArtefakte(artefakte2);
				
				
				if(!(s1skill1 == null))
					heldSpieler1.setSkill1(skillFabrik.erstelle(s1skill1.getName()));
				if(!(s1skill2 == null))
					heldSpieler1.setSkill2(skillFabrik.erstelle(s1skill2.getName()));
				if(!(s1skill3 == null))
					heldSpieler1.setSkill3(skillFabrik.erstelle(s1skill3.getName()));
				if(!(s1skill4 == null))
					heldSpieler1.setSkill4(skillFabrik.erstelle(s1skill4.getName()));
				if(!(s1Ulti == null))
					heldSpieler1.setUltimate(skillFabrik.erstelle(s1Ulti.getName()));
				
				if(!(s2skill1 == null))
					heldSpieler2.setSkill1(skillFabrik.erstelle(s2skill1.getName()));
				if(!(s2skill2 == null))
					heldSpieler2.setSkill2(skillFabrik.erstelle(s2skill2.getName()));
				if(!(s2skill3 == null))
					heldSpieler2.setSkill3(skillFabrik.erstelle(s2skill3.getName()));
				if(!(s2skill4 == null))
					heldSpieler2.setSkill4(skillFabrik.erstelle(s2skill4.getName()));
				if(!(s2Ulti == null))
					heldSpieler2.setUltimate(skillFabrik.erstelle(s2Ulti.getName()));
				
				
				ArrayList<Teilnehmer> teilnehmer = new ArrayList<Teilnehmer>();
				for(int i=0; i<spieler1Einheiten.size();i++) {
					teilnehmer.add(spieler1Einheiten.get(i));
				}
				for(int i=0; i<spieler2Einheiten.size();i++) {
					teilnehmer.add(spieler2Einheiten.get(i));
				}
				teilnehmer.add((Teilnehmer) heldSpieler1);
				teilnehmer.add((Teilnehmer) heldSpieler2);
				
				
				Kampf kampf = new Kampf(spieler1Einheiten, spieler2Einheiten, heldSpieler1, heldSpieler2);
				
					
				
				Main.battlelog.add("---------------------------------------------------");
				Main.battlelog.add("                                                   ");
				Main.battlelog.add("                                                   ");
				Main.battlelog.add("---------------------------------------------------");
				
				Main.battlelog.add("Kampf erstellen...");
				
				teilnehmer = kampf.vorKriegsPhase(teilnehmer);
		
				teilnehmer = kampf.kriegsPhase(teilnehmer, spieler1, spieler2);
				
				String t = "";
				
				for(int i = 0; i<Main.battlelog.size(); i++) {
					
					if(i==0)
						t = Main.battlelog.get(i);
					else
						t = t + System.getProperty("line.separator") + Main.battlelog.get(i);
				}
				
				logTextBox.setText(t);
				Main.battlelog.clear();
				
				setDataForStatistik(teilnehmer);
				
				panelKampfErstellen.hide();
				panelStatistik.show();
				
			}
		});
		btnBerechne.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		btnBerechne.setBackground(new Color(230, 230, 250));
		btnBerechne.setBounds(984, 13, 190, 56);
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
		btnNewButton.setBounds(10, 13, 189, 56);
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
		


		
		JButton btnAddSkillsLeft = new JButton("+");
		btnAddSkillsLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Skill skill = null;
				skill = declareSkill(comboBoxSkills, skill);
				
				if(heldSpieler1 == null)
					JOptionPane.showMessageDialog(null, "Bitte einen Kommandanten auswählen!");
				else {
				
					if(!(heldSpieler1.getUltimate() == null)) {
						JOptionPane.showMessageDialog(null, "Dieser Kommandant hat bereits eine volle Skillliste (Maximal 5 Skills für einen Kommandanten!");
						return;
					}
					setSkill(heldSpieler1, skill, "l");
					skillsLeft.addElement(skill.getName());
				}
			}
		});
		btnAddSkillsLeft.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		btnAddSkillsLeft.setToolTipText("Skill hinzuf\u00FCgen");
		btnAddSkillsLeft.setBackground(new Color(230, 230, 250));
		btnAddSkillsLeft.setBounds(335, 383, 70, 40);
		panelKampfErstellen.add(btnAddSkillsLeft);
		
		
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
					if(artefakte[2] != null) {
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Artefakte tragen!");
						return;
					}

					if(artefakte[0] == null) {
						
						artefakte[0] = artefakt;
						setIconArtefakt("2-1", artefakt);
					}
					else if(artefakte[1] == null) {
						
						artefakte[1] = artefakt;
						setIconArtefakt("2-2", artefakt);
					}
					else if(artefakte[2] == null) {
						
						artefakte[2] = artefakt;
						setIconArtefakt("2-3", artefakt);
					}
					heldSpieler2.setArtefakte(artefakte);
					artefakteSpieler2 = artefakte;
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
					
					if(artefakte[1] == null)
						artefakte[0] = null;
					if(artefakte[2] == null)
						artefakte[1] = null;
					if(artefakte[2] != null)
						artefakte[2] = null;
						
					heldSpieler2.setArtefakte(artefakte);
					artefakteSpieler2 = artefakte;
						
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
					if(artefakte[2] != null) {
						JOptionPane.showMessageDialog(null, "Dieser Kommandant kann nicht mehr Artefakte tragen!");
						return;
					}

					if(artefakte[0] == null) {
						
						artefakte[0] = artefakt;
						setIconArtefakt("1-1", artefakt);
					}
					else if(artefakte[1] == null) {
						
						artefakte[1] = artefakt;
						setIconArtefakt("1-2", artefakt);
					}
					else if(artefakte[2] == null) {
						
						artefakte[2] = artefakt;
						setIconArtefakt("1-3", artefakt);
					}
					heldSpieler1.setArtefakte(artefakte);
					artefakteSpieler1 = artefakte;
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
					
					if(artefakte[1] == null)
						artefakte[0] = null;
					if(artefakte[2] == null)
						artefakte[1] = null;
					if(artefakte[2] != null)
						artefakte[2] = null;
					
					heldSpieler1.setArtefakte(artefakte);
					artefakteSpieler1 = artefakte;
						
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
				
				heldSpieler1 = teilnehmerFabrik.erstelle(main.getPreviewCommanders().get(arrayCommander1Stelle).getName(), main.getSpieler1());
				lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler1.getPictureURI())));
				lblCommander1.setToolTipText(heldSpieler1.getBeschreibung());
				lblCommander1Name.setText(heldSpieler1.getName());
				lblCommander1Specialty.setText(heldSpieler1.getKlasse());
				
				clearArtefakteSkills(lblCommander1Artefakt2, lblCommander1Artefakt3, lblCommander1Artefakt1, artefakteSpieler1, skillsLeft);
				
				if(spieler1kampfEinheiten.size()>heldSpieler1.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Bitte entferne überschüssige Einheiten!");
				
				
				
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
				
				heldSpieler1 = teilnehmerFabrik.erstelle(main.getPreviewCommanders().get(arrayCommander1Stelle).getName(), main.getSpieler1());
				lblCommander1.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler1.getPictureURI())));
				lblCommander1.setToolTipText(heldSpieler1.getBeschreibung());
				lblCommander1Name.setText(heldSpieler1.getName());
				lblCommander1Specialty.setText(heldSpieler1.getKlasse());
				
				clearArtefakteSkills(lblCommander1Artefakt2, lblCommander1Artefakt3, lblCommander1Artefakt1, artefakteSpieler1, skillsLeft);
				
				if(spieler1kampfEinheiten.size()>heldSpieler1.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Bitte entferne überschüssige Einheiten!");
				
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
				
				heldSpieler2 = teilnehmerFabrik.erstelle(main.getPreviewCommanders().get(arrayCommander2Stelle).getName(), main.getSpieler2());
				lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler2.getPictureURI())));
				lblCommander2.setToolTipText(heldSpieler2.getBeschreibung());
				lblCommander2Name.setText(heldSpieler2.getName());
				lblCommander2Specialty.setText(heldSpieler2.getKlasse());
				
				clearArtefakteSkills(lblCommander2Artefakt2, lblCommander2Artefakt3, lblCommander2Artefakt1, artefakteSpieler2, skillsRight);

				
				if(spieler2kampfEinheiten.size()>heldSpieler2.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Bitte entferne überschüssige Einheiten!");
				
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
				
				heldSpieler2 = teilnehmerFabrik.erstelle(main.getPreviewCommanders().get(arrayCommander2Stelle).getName(), main.getSpieler2());
				lblCommander2.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler2.getPictureURI())));
				lblCommander2.setToolTipText(heldSpieler2.getBeschreibung());
				lblCommander2Name.setText(heldSpieler2.getName());
				lblCommander2Specialty.setText(heldSpieler2.getKlasse());
				
				clearArtefakteSkills(lblCommander2Artefakt2, lblCommander2Artefakt3, lblCommander2Artefakt1, artefakteSpieler2, skillsRight);
				
				if(spieler2kampfEinheiten.size()>heldSpieler2.getKommandoWert())
					JOptionPane.showMessageDialog(null, "Der Kommandant hat mehr Einheiten ausgewählt, als dieser befehligen kann. Bitte entferne überschüssige Einheiten!");
				
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
		
		JLabel lblVersion = new JLabel("V0.9.1_ALPHA");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setHorizontalAlignment(SwingConstants.LEFT);
		lblVersion.setBounds(10, 718, 290, 43);
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
				
				//Fülle Combobox für Skills
				String[] skillNamen = new String[main.getPreviewSkills().size()];
				
				for(int i=0;i<main.getPreviewSkills().size();i++) {
					
					skillNamen[i] = main.getPreviewSkills().get(i).getName();
					
				}
				DefaultComboBoxModel dmSkills = new DefaultComboBoxModel(skillNamen);
				comboBoxSkills.setModel(dmSkills);
				
				listCommander1Skills.setModel(skillsLeft);
				listCommander2Skills.setModel(skillsRight);
				
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

	protected void removeSkill(Teilnehmer held, DefaultListModel model, String seite) {
		if(!(held.getUltimate() == null)) {
			held.setUltimate(null);
			model.remove(4);
			if(seite.equals("l"))
				s1Ulti = null;
			else
				s2Ulti = null;
			return;
		}
		if(!(held.getSkill4() == null)) {
			held.setSkill4(null);
			model.remove(3);
			if(seite.equals("l"))
				s1skill4 = null;
			else
				s2skill4 = null;
			return;
		}
		if(!(held.getSkill3() == null)) {
			held.setSkill3(null);
			model.remove(2);
			if(seite.equals("l"))
				s1skill3 = null;
			else
				s2skill3 = null;
			return;
		}
		if(!(held.getSkill2() == null)) {
			held.setSkill2(null);
			model.remove(1);
			if(seite.equals("l"))
				s1skill2 = null;
			else
				s2skill2 = null;
			return;
		}
		if(!(held.getSkill1() == null)) {
			held.setSkill1(null);
			model.remove(0);
			if(seite.equals("l"))
				s1skill1 = null;
			else
				s2skill1 = null;
			return;
		}
		
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
	
	private Skill declareSkill(JComboBox comboBoxSkills, Skill skill) {
		for(int i=0;i<main.getPreviewSkills().size();i++) {
			if(main.getPreviewSkills().get(i).getName().equals(comboBoxSkills.getSelectedItem()))
				skill = main.getPreviewSkills().get(i);
		}
		return skill;
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
	
	private void setSkill(Teilnehmer held, Skill skill, String seite) {
		
		if(held.getSkill1() == null) {
			held.setSkill1(skill);
			if(seite.equals("l"))
				s1skill1 = skill;
			else
				s2skill1 = skill;
			return;
		}
		if(held.getSkill2() == null) {
			held.setSkill2(skill);
			if(seite.equals("l"))
				s1skill2 = skill;
			else
				s2skill2 = skill;
			return;
		}	
		if(held.getSkill3() == null) {
			held.setSkill3(skill);
			if(seite.equals("l"))
				s1skill3 = skill;
			else
				s2skill3 = skill;
			return;
		}	
		if(held.getSkill4() == null) {
			held.setSkill4(skill);
			if(seite.equals("l"))
				s1skill4 = skill;
			else
				s2skill4 = skill;
			return;
		}
		if(held.getUltimate() == null) {
			held.setUltimate(skill);
			if(seite.equals("l"))
				s1Ulti = skill;
			else
				s2Ulti = skill;
			return;
		}
		
	}
	
	private void clearArtefakteSkills(JLabel lblCommanderArtefakt2, JLabel lblCommanderArtefakt3,
			JLabel lblCommanderArtefakt1, Artefakt[] artefakte, DefaultListModel skills) {
		skills.clear();
		int i = 0;
		while(i<3) {
			artefakte[i]=null;
			i++;
		}

        lblCommanderArtefakt1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
        lblCommanderArtefakt2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
        lblCommanderArtefakt3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
	}
	
	private void setDataForStatistik(ArrayList<Teilnehmer> teilnehmer){
		
		ArrayList<Teilnehmer> spieler1Truppen = new ArrayList<Teilnehmer>();
		ArrayList<Teilnehmer> spieler2Truppen = new ArrayList<Teilnehmer>();
		
		for(int i=0; i<teilnehmer.size();i++) {
			if(teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && !teilnehmer.get(i).isIstKommandant())
			spieler1Truppen.add(teilnehmer.get(i));
			if(teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && !teilnehmer.get(i).isIstKommandant())
				spieler2Truppen.add(teilnehmer.get(i));
		}
		
		lblCommander1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler1.getPictureURI())));
		lblCommander2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(heldSpieler2.getPictureURI())));
		lblCommander1Statistik.setToolTipText(heldSpieler1.getBeschreibung());
		lblCommander2Statistik.setToolTipText(heldSpieler2.getBeschreibung());
		
		for(int i=0;i<teilnehmer.size();i++) {
			if(teilnehmer.get(i).getLebenActual()<0)
				teilnehmer.get(i).setLebenActual(0);
		}
		
		int max1 = 0;
		int actual1 = 0;
		int max2 = 0;
		int actual2 = 0;
		
		for(int i=0; i<teilnehmer.size();i++) {
			
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler1()) && !teilnehmer.get(i).isIstKommandant()) {
				max1 += teilnehmer.get(i).getLeben();
				actual1 += teilnehmer.get(i).getLebenActual();
			}
			
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler2()) && !teilnehmer.get(i).isIstKommandant()) {
				max2 += teilnehmer.get(i).getLeben();
				actual2 += teilnehmer.get(i).getLebenActual();
			}
			
		}

		lblAfterCommander1Name.setText(heldSpieler1.getName());
		lblAfterCommander2Name.setText(heldSpieler2.getName());
		
		healthAllLeft.setMaximum(max1);
		healthAllLeft.setValue(actual1);
		healthAllLeft.setToolTipText(actual1 + "/" + max1);
		
		healthAllRight.setMaximum(max2);
		healthAllRight.setValue(actual2);
		healthAllRight.setToolTipText(actual2 + "/" + max2);
		
		if(spieler1Truppen.size()>0) {
			lblCommander1Einheit1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(0).getPictureURI())));
			lblCommander1Einheit1Statistik.setToolTipText(spieler1Truppen.get(0).getBeschreibung());
			hpC1E1.setMaximum(spieler1Truppen.get(0).getLeben());
			hpC1E1.setValue(spieler1Truppen.get(0).getLebenActual());
			hpC1E1.setToolTipText(spieler1Truppen.get(0).getLebenActual() + "/" + spieler1Truppen.get(0).getLeben());
		}
		if(spieler1Truppen.size()>1) {
			lblCommander1Einheit2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(1).getPictureURI())));
			lblCommander1Einheit2Statistik.setToolTipText(spieler1Truppen.get(1).getBeschreibung());
			hpC1E2.setMaximum(spieler1Truppen.get(1).getLeben());
			hpC1E2.setValue(spieler1Truppen.get(1).getLebenActual());
			hpC1E2.setToolTipText(spieler1Truppen.get(1).getLebenActual() + "/" + spieler1Truppen.get(1).getLeben());
		}
		if(spieler1Truppen.size()>2) {
			lblCommander1Einheit3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(2).getPictureURI())));
			lblCommander1Einheit3Statistik.setToolTipText(spieler1Truppen.get(2).getBeschreibung());
			hpC1E3.setMaximum(spieler1Truppen.get(2).getLeben());
			hpC1E3.setValue(spieler1Truppen.get(2).getLebenActual());
			hpC1E3.setToolTipText(spieler1Truppen.get(2).getLebenActual() + "/" + spieler1Truppen.get(2).getLeben());
		}
		if(spieler1Truppen.size()>3) {
			lblCommander1Einheit4Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(3).getPictureURI())));
			lblCommander1Einheit4Statistik.setToolTipText(spieler1Truppen.get(3).getBeschreibung());
			hpC1E4.setMaximum(spieler1Truppen.get(3).getLeben());
			hpC1E4.setValue(spieler1Truppen.get(3).getLebenActual());
			hpC1E4.setToolTipText(spieler1Truppen.get(3).getLebenActual() + "/" + spieler1Truppen.get(3).getLeben());
		}
		if(spieler1Truppen.size()>4) {
			lblCommander1Einheit5Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(4).getPictureURI())));
			lblCommander1Einheit5Statistik.setToolTipText(spieler1Truppen.get(4).getBeschreibung());
			hpC1E5.setMaximum(spieler1Truppen.get(4).getLeben());
			hpC1E5.setValue(spieler1Truppen.get(4).getLebenActual());
			hpC1E5.setToolTipText(spieler1Truppen.get(4).getLebenActual() + "/" + spieler1Truppen.get(4).getLeben());
		}
		if(spieler1Truppen.size()>5) {
			lblCommander1Einheit6Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(5).getPictureURI())));
			lblCommander1Einheit6Statistik.setToolTipText(spieler1Truppen.get(5).getBeschreibung());
			hpC1E6.setMaximum(spieler1Truppen.get(5).getLeben());
			hpC1E6.setValue(spieler1Truppen.get(5).getLebenActual());
			hpC1E6.setToolTipText(spieler1Truppen.get(5).getLebenActual() + "/" + spieler1Truppen.get(5).getLeben());
		}
		if(spieler1Truppen.size()>6) {
			lblCommander1Einheit7Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(6).getPictureURI())));
			lblCommander1Einheit7Statistik.setToolTipText(spieler1Truppen.get(6).getBeschreibung());
			hpC1E7.setMaximum(spieler1Truppen.get(6).getLeben());
			hpC1E7.setValue(spieler1Truppen.get(6).getLebenActual());
			hpC1E7.setToolTipText(spieler1Truppen.get(6).getLebenActual() + "/" + spieler1Truppen.get(6).getLeben());
		}
		if(spieler1Truppen.size()>7) {
			lblCommander1Einheit8Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler1Truppen.get(7).getPictureURI())));
			lblCommander1Einheit8Statistik.setToolTipText(spieler1Truppen.get(7).getBeschreibung());
			hpC1E8.setMaximum(spieler1Truppen.get(7).getLeben());
			hpC1E8.setValue(spieler1Truppen.get(7).getLebenActual());
			hpC1E8.setToolTipText(spieler1Truppen.get(7).getLebenActual() + "/" + spieler1Truppen.get(7).getLeben());
		}
		
		
		if(spieler2Truppen.size()>0) {
			lblCommander2Einheit1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(0).getPictureURI())));
			lblCommander2Einheit1Statistik.setToolTipText(spieler2Truppen.get(0).getBeschreibung());
			hpC2E1.setMaximum(spieler2Truppen.get(0).getLeben());
			hpC2E1.setValue(spieler2Truppen.get(0).getLebenActual());
			hpC2E1.setToolTipText(spieler2Truppen.get(0).getLebenActual() + "/" + spieler2Truppen.get(0).getLeben());
		}
		if(spieler2Truppen.size()>1) {
			lblCommander2Einheit2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(1).getPictureURI())));
			lblCommander2Einheit2Statistik.setToolTipText(spieler2Truppen.get(1).getBeschreibung());
			hpC2E2.setMaximum(spieler2Truppen.get(1).getLeben());
			hpC2E2.setValue(spieler2Truppen.get(1).getLebenActual());
			hpC2E2.setToolTipText(spieler2Truppen.get(1).getLebenActual() + "/" + spieler2Truppen.get(1).getLeben());
		}
		if(spieler2Truppen.size()>2) {
			lblCommander2Einheit3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(2).getPictureURI())));
			lblCommander2Einheit3Statistik.setToolTipText(spieler2Truppen.get(2).getBeschreibung());
			hpC2E3.setMaximum(spieler2Truppen.get(2).getLeben());
			hpC2E3.setValue(spieler2Truppen.get(2).getLebenActual());
			hpC2E3.setToolTipText(spieler2Truppen.get(2).getLebenActual() + "/" + spieler2Truppen.get(2).getLeben());
		}
		if(spieler2Truppen.size()>3) {
			lblCommander2Einheit4Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(3).getPictureURI())));
			lblCommander2Einheit4Statistik.setToolTipText(spieler2Truppen.get(3).getBeschreibung());
			hpC2E4.setMaximum(spieler2Truppen.get(3).getLeben());
			hpC2E4.setValue(spieler2Truppen.get(3).getLebenActual());
			hpC2E4.setToolTipText(spieler2Truppen.get(3).getLebenActual() + "/" + spieler2Truppen.get(3).getLeben());
		}
		if(spieler2Truppen.size()>4) {
			lblCommander2Einheit5Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(4).getPictureURI())));
			lblCommander2Einheit5Statistik.setToolTipText(spieler2Truppen.get(4).getBeschreibung());
			hpC2E5.setMaximum(spieler2Truppen.get(4).getLeben());
			hpC2E5.setValue(spieler2Truppen.get(4).getLebenActual());
			hpC2E5.setToolTipText(spieler2Truppen.get(4).getLebenActual() + "/" + spieler2Truppen.get(4).getLeben());
		}
		if(spieler2Truppen.size()>5) {
			lblCommander2Einheit6Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(5).getPictureURI())));
			lblCommander2Einheit6Statistik.setToolTipText(spieler2Truppen.get(5).getBeschreibung());
			hpC2E6.setMaximum(spieler2Truppen.get(5).getLeben());
			hpC2E6.setValue(spieler2Truppen.get(5).getLebenActual());
			hpC2E6.setToolTipText(spieler2Truppen.get(5).getLebenActual() + "/" + spieler2Truppen.get(5).getLeben());
		}
		if(spieler2Truppen.size()>6) {
			lblCommander2Einheit7Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(6).getPictureURI())));
			lblCommander2Einheit7Statistik.setToolTipText(spieler2Truppen.get(6).getBeschreibung());
			hpC2E7.setMaximum(spieler2Truppen.get(6).getLeben());
			hpC2E7.setValue(spieler2Truppen.get(6).getLebenActual());
			hpC2E7.setToolTipText(spieler2Truppen.get(6).getLebenActual() + "/" + spieler2Truppen.get(6).getLeben());
		}
		if(spieler2Truppen.size()>7) {
			lblCommander2Einheit8Statistik.setIcon(new ImageIcon(MainWindow.class.getResource(spieler2Truppen.get(7).getPictureURI())));
			lblCommander2Einheit8Statistik.setToolTipText(spieler2Truppen.get(7).getBeschreibung());
			hpC2E8.setMaximum(spieler2Truppen.get(7).getLeben());
			hpC2E8.setValue(spieler2Truppen.get(7).getLebenActual());
			hpC2E8.setToolTipText(spieler2Truppen.get(7).getLebenActual() + "/" + spieler2Truppen.get(7).getLeben());
		}
		int kommandant1Schaden = 0;
		int kommandant2Schaden = 0;
		int geheilt1 = 0;
		int geheilt2 = 0;
		for(int i = 0;i<teilnehmer.size();i++) {
			
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler1()) && teilnehmer.get(i).isIstKommandant()) {
				kommandant1Schaden = teilnehmer.get(i).getAngerichteterSchaden();
				geheilt1 = teilnehmer.get(i).getGeheilterSchaden();
			}
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler2()) && teilnehmer.get(i).isIstKommandant()) {
				kommandant2Schaden = teilnehmer.get(i).getAngerichteterSchaden();
				geheilt2 = teilnehmer.get(i).getGeheilterSchaden();
			}
			
		}
		int truppenAngerichtet1 = 0;
		int truppenAngerichtet2 = 0;
		int erlitten1 = 0;
		int erlitten2 = 0;

		for(int i=0;i<teilnehmer.size();i++) {
			
			if(!teilnehmer.get(i).isIstKommandant() && teilnehmer.get(i).getBesitzer().equals(Main.getSpieler1())) {
				truppenAngerichtet1 = truppenAngerichtet1 + teilnehmer.get(i).getAngerichteterSchaden();
				erlitten1 = erlitten1 + teilnehmer.get(i).getErlittenerSchaden();
				geheilt1 = geheilt1 + teilnehmer.get(i).getGeheilterSchaden();
			}
				
			if(!teilnehmer.get(i).isIstKommandant() && teilnehmer.get(i).getBesitzer().equals(Main.getSpieler2())) {
				truppenAngerichtet2 = truppenAngerichtet2 + teilnehmer.get(i).getAngerichteterSchaden();
				erlitten2 = erlitten2 + teilnehmer.get(i).getErlittenerSchaden();
				geheilt2 = geheilt2 + teilnehmer.get(i).getGeheilterSchaden();	
			}
			
		}
		
		setSkillIconsRaiseLevel(teilnehmer);
		
		setSchadenValues(truppenAngerichtet1, erlitten1, geheilt1, kommandant1Schaden, lblSchaden11Value, lblSchaden12Value, lblSchaden13Value, lblSchaden14Value);
		setSchadenValues(truppenAngerichtet2, erlitten2, geheilt2, kommandant2Schaden, lblSchaden21Value, lblSchaden22Value, lblSchaden23Value, lblSchaden24Value);
		
		for(int i = 0; i<teilnehmer.size();i++) {
			
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler1()) && teilnehmer.get(i).isIstKommandant()) {
				setArtefakte(teilnehmer.get(i), lblCommander1Artefakt1Statistik, lblCommander1Artefakt2Statistik, lblCommander1Artefakt3Statistik);
			}
			
			if(teilnehmer.get(i).getBesitzer().equals(Main.getSpieler2()) && teilnehmer.get(i).isIstKommandant()) {
				setArtefakte(teilnehmer.get(i), lblCommander2Artefakt1Statistik, lblCommander2Artefakt2Statistik, lblCommander2Artefakt3Statistik);
			}
			
		}
		
	}
	
	private void setSkillIconsRaiseLevel(ArrayList<Teilnehmer> teilnehmer) {
		
		for(int i = 0; i<teilnehmer.size(); i++) {
			
			if(teilnehmer.get(i).getSkill1() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander1Skill1.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill1().getPictureURI())));
				lblCommander1Skill1.setToolTipText(teilnehmer.get(i).getSkill1().getBeschreibung());
				lblCommander1Level.setText(""+1);
			}
			if(teilnehmer.get(i).getSkill2() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander1Skill2.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill2().getPictureURI())));
				lblCommander1Skill2.setToolTipText(teilnehmer.get(i).getSkill2().getBeschreibung());
				lblCommander1Level.setText(""+2);
			}
			if(teilnehmer.get(i).getSkill3() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander1Skill3.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill3().getPictureURI())));
				lblCommander1Skill3.setToolTipText(teilnehmer.get(i).getSkill3().getBeschreibung());
				lblCommander1Level.setText(""+3);
			}
			if(teilnehmer.get(i).getSkill4() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander1Skill4.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill4().getPictureURI())));
				lblCommander1Skill4.setToolTipText(teilnehmer.get(i).getSkill4().getBeschreibung());
				lblCommander1Level.setText(""+4);
			}
			if(teilnehmer.get(i).getUltimate() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander1Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getUltimate().getPictureURI())));
				lblCommander1Ultimate.setToolTipText(teilnehmer.get(i).getUltimate().getBeschreibung());
				lblCommander1Level.setText(""+5);
			}
			
			
			if(teilnehmer.get(i).getSkill1() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander2Skill1.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill1().getPictureURI())));
				lblCommander2Skill1.setToolTipText(teilnehmer.get(i).getSkill1().getBeschreibung());
				lblCommander2Level.setText(""+1);
			}
			if(teilnehmer.get(i).getSkill2() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander2Skill2.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill2().getPictureURI())));
				lblCommander2Skill2.setToolTipText(teilnehmer.get(i).getSkill2().getBeschreibung());
				lblCommander2Level.setText(""+2);
			}
			if(teilnehmer.get(i).getSkill3() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander2Skill3.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill3().getPictureURI())));
				lblCommander2Skill3.setToolTipText(teilnehmer.get(i).getSkill3().getBeschreibung());
				lblCommander2Level.setText(""+3);
			}
			if(teilnehmer.get(i).getSkill4() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander2Skill4.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getSkill4().getPictureURI())));
				lblCommander2Skill4.setToolTipText(teilnehmer.get(i).getSkill4().getBeschreibung());
				lblCommander2Level.setText(""+4);
			}
			if(teilnehmer.get(i).getUltimate() != null && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).isIstKommandant()) {
				lblCommander2Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.get(i).getUltimate().getPictureURI())));
				lblCommander2Ultimate.setToolTipText(teilnehmer.get(i).getUltimate().getBeschreibung());
				lblCommander2Level.setText(""+5);
			}
			
		}
		
	}

	private void setSchadenValues(int angerichtet, int erlitten, int geheilt, int kommandantAngerichtet, JLabel label1, JLabel label2, JLabel label3, JLabel label4) {
		
		label1.setText("" + kommandantAngerichtet);
		label2.setText("" + angerichtet);
		label3.setText("" + erlitten);
		label4.setText("" + geheilt);
		
	}
	
	private void resetStatistik() {
		
		lblCommander1Einheit1Statistik.setIcon(null);
		lblCommander1Einheit2Statistik.setIcon(null);
		lblCommander1Einheit3Statistik.setIcon(null);
		lblCommander1Einheit4Statistik.setIcon(null);
		lblCommander1Einheit5Statistik.setIcon(null);
		lblCommander1Einheit6Statistik.setIcon(null);
		lblCommander1Einheit7Statistik.setIcon(null);
		lblCommander1Einheit8Statistik.setIcon(null);
		
		lblCommander1Einheit1Statistik.setToolTipText(null);
		lblCommander1Einheit2Statistik.setToolTipText(null);
		lblCommander1Einheit3Statistik.setToolTipText(null);
		lblCommander1Einheit4Statistik.setToolTipText(null);
		lblCommander1Einheit5Statistik.setToolTipText(null);
		lblCommander1Einheit6Statistik.setToolTipText(null);
		lblCommander1Einheit7Statistik.setToolTipText(null);
		lblCommander1Einheit8Statistik.setToolTipText(null);
		
		hpC1E1.setMaximum(0);
		hpC1E2.setMaximum(0);
		hpC1E3.setMaximum(0);
		hpC1E4.setMaximum(0);
		hpC1E5.setMaximum(0);
		hpC1E6.setMaximum(0);
		hpC1E7.setMaximum(0);
		hpC1E8.setMaximum(0);
		
		lblCommander2Einheit1Statistik.setIcon(null);
		lblCommander2Einheit2Statistik.setIcon(null);
		lblCommander2Einheit3Statistik.setIcon(null);
		lblCommander2Einheit4Statistik.setIcon(null);
		lblCommander2Einheit5Statistik.setIcon(null);
		lblCommander2Einheit6Statistik.setIcon(null);
		lblCommander2Einheit7Statistik.setIcon(null);
		lblCommander2Einheit8Statistik.setIcon(null);
		
		lblCommander2Einheit1Statistik.setToolTipText(null);
		lblCommander2Einheit2Statistik.setToolTipText(null);
		lblCommander2Einheit3Statistik.setToolTipText(null);
		lblCommander2Einheit4Statistik.setToolTipText(null);
		lblCommander2Einheit5Statistik.setToolTipText(null);
		lblCommander2Einheit6Statistik.setToolTipText(null);
		lblCommander2Einheit7Statistik.setToolTipText(null);
		lblCommander2Einheit8Statistik.setToolTipText(null);
		
		hpC2E1.setMaximum(0);
		hpC2E2.setMaximum(0);
		hpC2E3.setMaximum(0);
		hpC2E4.setMaximum(0);
		hpC2E5.setMaximum(0);
		hpC2E6.setMaximum(0);
		hpC2E7.setMaximum(0);
		hpC2E8.setMaximum(0);
		
		lblCommander1Skill1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Skill4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander1Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		
		lblCommander1Skill1.setToolTipText(null);
		lblCommander1Skill2.setToolTipText(null);
		lblCommander1Skill3.setToolTipText(null);
		lblCommander1Skill4.setToolTipText(null);
		lblCommander1Ultimate.setToolTipText(null);
		
		lblCommander2Skill1.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill2.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill3.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Skill4.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		lblCommander2Ultimate.setIcon(new ImageIcon(MainWindow.class.getResource("/source/lockedSkill.png")));
		
		lblCommander2Skill1.setToolTipText(null);
		lblCommander2Skill2.setToolTipText(null);
		lblCommander2Skill3.setToolTipText(null);
		lblCommander2Skill4.setToolTipText(null);
		lblCommander2Ultimate.setToolTipText(null);
		
		lblCommander1Artefakt1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander1Artefakt3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		
		lblCommander2Artefakt1Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt2Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		lblCommander2Artefakt3Statistik.setIcon(new ImageIcon(MainWindow.class.getResource("/source/noitem.png")));
		
		lblCommander1Artefakt1Statistik.setToolTipText(null);
		lblCommander1Artefakt2Statistik.setToolTipText(null);
		lblCommander1Artefakt3Statistik.setToolTipText(null);
		lblCommander2Artefakt1Statistik.setToolTipText(null);
		lblCommander2Artefakt2Statistik.setToolTipText(null);
		lblCommander2Artefakt3Statistik.setToolTipText(null);
		
	}
	
	private void setArtefakte(Teilnehmer teilnehmer, JLabel label1, JLabel label2, JLabel label3) {
		
		if(teilnehmer.getArtefakte()[0] != null) {
			label1.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.getArtefakte()[0].getPictureURI())));
			label1.setToolTipText(teilnehmer.getArtefakte()[0].getBeschreibung());
		}
		if(teilnehmer.getArtefakte()[1] != null) {
			label2.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.getArtefakte()[1].getPictureURI())));
			label2.setToolTipText(teilnehmer.getArtefakte()[1].getBeschreibung());
		}
		if(teilnehmer.getArtefakte()[2] != null) {
			label3.setIcon(new ImageIcon(MainWindow.class.getResource(teilnehmer.getArtefakte()[2].getPictureURI())));
			label3.setToolTipText(teilnehmer.getArtefakte()[2].getBeschreibung());
		}
		
		
	}
}
