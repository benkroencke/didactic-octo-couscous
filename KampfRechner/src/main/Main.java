package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kampfrechner.Kampf;
import model.Artefakt;
import model.Teilnehmer;
import view.MainWindow;
import model.Skill;
import model.Spieler;

public class Main {
	
	
	private static ArrayList<Teilnehmer> previewTruppen;
	private static ArrayList<Teilnehmer> previewKommandanten;
	private static ArrayList<Artefakt> previewArtefakte;
	private static ArrayList<Skill> previewSkills;
	private static Spieler spieler1;
	private static Spieler spieler2;
	public static ArrayList<String> battlelog = new ArrayList<String>();
	
	
	public ArrayList<Teilnehmer> getPreviewTroops(){
		
		return previewTruppen;
		
	}
	
	public ArrayList<Teilnehmer> getPreviewCommanders(){
		
		return previewKommandanten;
		
	}
	
	public ArrayList<Artefakt> getPreviewArtefakte(){
		
		return previewArtefakte;
		
	}
	
	public ArrayList<Skill> getPreviewSkills(){
		
		return previewSkills;
		
	}
	public static Spieler getSpieler1() {
		return spieler1;
	}
	public static Spieler getSpieler2() {
		return spieler2;
	}
	

	public static void main(String[] args) {
		
		Spieler main = new Spieler("Main");
		spieler1 = new Spieler("Spieler 1");
		spieler2 = new Spieler("Spieler 2");
		
		spieler1.setFarbe(new Color(0, 0, 255));
		spieler2.setFarbe(new Color(255, 0, 0));
		
		Teilnehmer teilnehmerPool = new Teilnehmer();
		Skill skillPool = new Skill();
		Artefakt artefaktPool = new Artefakt();
		
		previewTruppen = new ArrayList<Teilnehmer>();
		previewKommandanten = new ArrayList<Teilnehmer>();
		previewArtefakte = new ArrayList<Artefakt>();
		previewSkills = new ArrayList<Skill>();
		
		previewKommandanten.add(teilnehmerPool.geralt(main));
		previewKommandanten.add(teilnehmerPool.ciri(main));
		previewKommandanten.add(teilnehmerPool.yennefer(main));
		previewKommandanten.add(teilnehmerPool.triss(main));
		previewKommandanten.add(teilnehmerPool.foltest(main));
		previewKommandanten.add(teilnehmerPool.vernonroche(main));
		previewKommandanten.add(teilnehmerPool.johan(main));
		previewKommandanten.add(teilnehmerPool.emhyr(main));
		previewKommandanten.add(teilnehmerPool.voorhis(main));
		previewKommandanten.add(teilnehmerPool.letho(main));
		previewKommandanten.add(teilnehmerPool.crach(main));
		previewKommandanten.add(teilnehmerPool.cerys(main));
		previewKommandanten.add(teilnehmerPool.maussack(main));
		
		previewTruppen.add(teilnehmerPool.heckenschuetzen(main));
		previewTruppen.add(teilnehmerPool.hueter(main));
		previewTruppen.add(teilnehmerPool.pikeniere(main));
		previewTruppen.add(teilnehmerPool.kuerassiere(main));
		previewTruppen.add(teilnehmerPool.blaueStreifen(main));
		previewTruppen.add(teilnehmerPool.ardfeain(main));
		previewTruppen.add(teilnehmerPool.imperaArmbrueste(main));
		previewTruppen.add(teilnehmerPool.ardfeainSchildkroete(main));
		previewTruppen.add(teilnehmerPool.nilfgaardRitter(main));
		previewTruppen.add(teilnehmerPool.imperaBrigade(main));
		previewTruppen.add(teilnehmerPool.brokvarbogenschutze(main));
		previewTruppen.add(teilnehmerPool.drummondschildmaid(main));
		previewTruppen.add(teilnehmerPool.druiden(main));
		previewTruppen.add(teilnehmerPool.ancraitlangschiff(main));
		previewTruppen.add(teilnehmerPool.svulblodfanatiker(main));
		

		previewArtefakte.add(artefaktPool.donner());
		previewArtefakte.add(artefaktPool.koenigsamulett());
		previewArtefakte.add(artefaktPool.krummsaebel());
		
		previewSkills.add(skillPool.dezimieren());
		previewSkills.add(skillPool.schlachtruf());
		previewSkills.add(skillPool.wirbelwind());
		previewSkills.add(skillPool.verstaerkung());
		previewSkills.add(skillPool.verhaften());
		previewSkills.add(skillPool.ungeduldige());
		previewSkills.add(skillPool.kaisergarde());
		previewSkills.add(skillPool.stratege());
		previewSkills.add(skillPool.intrige());
		previewSkills.add(skillPool.grossoffensive());
		previewSkills.add(skillPool.formationstaktiken());
		previewSkills.add(skillPool.ultiemhyr1());
		previewSkills.add(skillPool.ultiemhyr2());
		previewSkills.add(skillPool.artilleriebeschuss());
		previewSkills.add(skillPool.formation());
		previewSkills.add(skillPool.loyal());
		previewSkills.add(skillPool.hoffnung());
		previewSkills.add(skillPool.doppelAktion());
		previewSkills.add(skillPool.general());
		previewSkills.add(skillPool.moral());
		previewSkills.add(skillPool.viper());
		previewSkills.add(skillPool.mordanschlag());
		previewSkills.add(skillPool.hexerausbildung());
		previewSkills.add(skillPool.wilderhieb());
		previewSkills.add(skillPool.finalerschlag());
		previewSkills.add(skillPool.quen());
		previewSkills.add(skillPool.hexerausruestung());
		previewSkills.add(skillPool.nordwind());
		previewSkills.add(skillPool.belagerung());
		previewSkills.add(skillPool.adel());
		previewSkills.add(skillPool.gesicht());
		previewSkills.add(skillPool.lazarett());
		previewSkills.add(skillPool.speerfront());
		previewSkills.add(skillPool.formationhalten());
		previewSkills.add(skillPool.foltestsstolz());
		previewSkills.add(skillPool.highground());
		previewSkills.add(skillPool.bluestripes());
		previewSkills.add(skillPool.schwerttraining());
		previewSkills.add(skillPool.elite());
		previewSkills.add(skillPool.spezialkommando());
		previewSkills.add(skillPool.attentat());
		previewSkills.add(skillPool.diversitaet());
		previewSkills.add(skillPool.waffenexpertise());
		previewSkills.add(skillPool.risiko());
		previewSkills.add(skillPool.zwergensoeldner());
		previewSkills.add(skillPool.zerkrachen());
		previewSkills.add(skillPool.flotte());
		previewSkills.add(skillPool.tiefewunden());
		previewSkills.add(skillPool.kopfschlag());
		previewSkills.add(skillPool.wikinger());
		previewSkills.add(skillPool.drakkar());
		previewSkills.add(skillPool.berserker());
		previewSkills.add(skillPool.drummoldformation());
		previewSkills.add(skillPool.ehrenvollerkampf());
		previewSkills.add(skillPool.abschiedsgeschenk());
		previewSkills.add(skillPool.blitzschlag());
		previewSkills.add(skillPool.magischerknall());
		previewSkills.add(skillPool.magieexplosion());
		previewSkills.add(skillPool.pilze());
		previewSkills.add(skillPool.illusionsmagie());
		previewSkills.add(skillPool.magischebombe());

		
		
		
		Collections.sort(previewTruppen, new Comparator<Teilnehmer>() {

			@Override
			public int compare(Teilnehmer arg0, Teilnehmer arg1) {
				// TODO Auto-generated method stub
				return ((arg1.getName()).compareTo(arg0.getName()));
			}
			
		});
		
		
		
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
		
		
		
		
		
		
		
		
		
//		System.out.println("Das Spiel beginnt!");
//		System.out.println("Erstelle Kommandanten...");
//		Teilnehmer myAchilleus = teilnehmerPool.achilleus(spieler1);
//		Skill schlachtruf = skillPool.schlachtruf();
//		myAchilleus.setSkill1(schlachtruf);
//		System.out.println("Achilleus hat nun die Fähigkeit Schlachtruf!");
//		Teilnehmer heckenschuetze = teilnehmerPool.heckenschuetze(spieler1);;
//		myAchilleus.getEinheitenListe().add(heckenschuetze);
//		//Teilnehmer kuerassiere = teilnehmerPool.kuerassiere(spieler1);
//		//myAchilleus.getEinheitenListe().add(kuerassiere);
//		Teilnehmer hueter1 = teilnehmerPool.kuerassiere(spieler1);
//		myAchilleus.getEinheitenListe().add(hueter1);
//		Teilnehmer hueter2 = teilnehmerPool.kuerassiere(spieler1);
//		myAchilleus.getEinheitenListe().add(hueter2);
//		Teilnehmer hs2 = teilnehmerPool.kuerassiere(spieler1);
//		myAchilleus.getEinheitenListe().add(hs2);
//		Teilnehmer hs3 = teilnehmerPool.kuerassiere(spieler1);
//		myAchilleus.getEinheitenListe().add(hs3);
//		Teilnehmer hs4 = teilnehmerPool.kuerassiere(spieler1);
//		myAchilleus.getEinheitenListe().add(hs4);
//		System.out.println("Achilleus hat nun einen Truppenverband Heckenschützen bekommen!");
//		System.out.println("Achilleus hat nun einen Truppenverband Kürassiere bekommen!");
//
//		
//		System.out.println("Ein Feind wird erstellt!");
//		System.out.println("Erstelle Kommandanten...");
//		Teilnehmer enemyAchilleus = teilnehmerPool.achilleus(spieler2);;
//		Skill dezimieren = skillPool.dezimieren();
//		myAchilleus.setSkill2(dezimieren);
//		System.out.println("Mein Achilleus hat nun die Fähigkeit Schwertschlag!");
//		//Teilnehmer heckenschuetze2 = teilnehmerPool.heckenschuetze(spieler2);
//		//enemyAchilleus.getEinheitenListe().add(heckenschuetze2);
//		Teilnehmer hueter = teilnehmerPool.hueter(spieler2);
//		enemyAchilleus.getEinheitenListe().add(hueter);
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		enemyAchilleus.addTruppen(teilnehmerPool.hueter(spieler2));
//		//Teilnehmer phalanx = teilnehmerPool.phalanxinfanterie(spieler2);
//		//enemyAchilleus.getEinheitenListe().add(phalanx);
//		enemyAchilleus.setSkill1(dezimieren);
//		enemyAchilleus.setSkill2(schlachtruf);
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Heckenschützen bekommen!");
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Hüter bekommen!");
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Kürassiere bekommen!");
//		
//		Artefakt artefakt = new Artefakt("Horn des Krieges", "Erhöht den Schaden aller Teilnehmer um 5", "damageBuffall", 5, false);
//		Artefakt artefaktStandarte = new Artefakt("Standarte des Himmels", "Erhöht den Schaden aller Teilnehmer um 7", "damageBuffall", 7, false);
//		Artefakt artefaktChanty = new Artefakt("Ermutigungschanty", "Erhöht die Initative aller Teilnehmer um 2", "speedBuffall", 2, false);
//		Artefakt[] myArtefakte = new Artefakt[3];
//		myArtefakte[0] = artefakt;
//		myArtefakte[1] = artefaktStandarte;
//		myArtefakte[2] = artefaktChanty;
//		
//		myAchilleus.setArtefakte(myArtefakte);
//		
//		Artefakt artefaktEnemy = new Artefakt("Trommeln der Wendigkeit", "Erhöht die Initative aller Teilnehmer um 25", "speedBuffall", 25, false);
//		Artefakt[] enemyArtefakte = new Artefakt[3];
//		enemyArtefakte[0] = artefaktEnemy;
//		enemyAchilleus.setArtefakte(enemyArtefakte);
//		
//		
//		ArrayList<Teilnehmer> spieler1kampfEinheiten = new ArrayList<Teilnehmer>();
//		spieler1kampfEinheiten = myAchilleus.getEinheitenListe();		
//		
//		ArrayList<Teilnehmer> spieler2kampfEinheiten = new ArrayList<Teilnehmer>();
//		spieler2kampfEinheiten = enemyAchilleus.getEinheitenListe();
//		
//		ArrayList<Teilnehmer> teilnehmer = new ArrayList<Teilnehmer>();
//		for(int i=0; i<spieler1kampfEinheiten.size();i++) {
//			teilnehmer.add(spieler1kampfEinheiten.get(i));
//		}
//		for(int i=0; i<spieler2kampfEinheiten.size();i++) {
//			teilnehmer.add(spieler2kampfEinheiten.get(i));
//		}
//		teilnehmer.add((Teilnehmer) myAchilleus);
//		teilnehmer.add((Teilnehmer) enemyAchilleus);
//		
//		System.out.println(teilnehmer.toString());
//		
//		Kampf kampf = new Kampf(spieler1kampfEinheiten, spieler2kampfEinheiten, myAchilleus, enemyAchilleus);
//		
//			
//		
//		System.out.println("---------------------------------------------------");
//		System.out.println("*                                                 *");
//		System.out.println("*                                                 *");
//		System.out.println("---------------------------------------------------");
//		
//		System.out.println("Kampf erstellen...");
//		
//		System.out.println(teilnehmer.toString());
//		teilnehmer = kampf.vorKriegsPhase(teilnehmer);
//
//		teilnehmer = kampf.kriegsPhase(teilnehmer, spieler1, spieler2);
		
		
		
		
		
	}

}
