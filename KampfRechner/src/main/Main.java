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
		previewKommandanten.add(teilnehmerPool.falibor(main));
		previewKommandanten.add(teilnehmerPool.skellen(main));
		previewKommandanten.add(teilnehmerPool.korys(main));
		previewKommandanten.add(teilnehmerPool.draug(main));
		previewKommandanten.add(teilnehmerPool.waldschrat(main));
		previewKommandanten.add(teilnehmerPool.kikimore(main));
		previewKommandanten.add(teilnehmerPool.dettlaff(main));
		previewKommandanten.add(teilnehmerPool.auberon(main));
		previewKommandanten.add(teilnehmerPool.eredin(main));
		previewKommandanten.add(teilnehmerPool.caranthir(main));
		previewKommandanten.add(teilnehmerPool.imlerith(main));





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
		previewTruppen.add(teilnehmerPool.wildejagdhund(main));
		previewTruppen.add(teilnehmerPool.wildejagdkrieger(main));
		previewTruppen.add(teilnehmerPool.wildejagdschlager(main));
		previewTruppen.add(teilnehmerPool.sucher(main));
		previewTruppen.add(teilnehmerPool.nekker(main));
		previewTruppen.add(teilnehmerPool.ghul(main));
		previewTruppen.add(teilnehmerPool.wiederganger(main));
		previewTruppen.add(teilnehmerPool.harpy(main));
		previewTruppen.add(teilnehmerPool.geist(main));
		previewTruppen.add(teilnehmerPool.wyvern(main));
		previewTruppen.add(teilnehmerPool.katakan(main));
		previewTruppen.add(teilnehmerPool.bruxa(main));

		

		previewArtefakte.add(artefaktPool.donner1());
		previewArtefakte.add(artefaktPool.koenigsamulett1());
		previewArtefakte.add(artefaktPool.krummsaebel1());
		previewArtefakte.add(artefaktPool.donner2());
		previewArtefakte.add(artefaktPool.koenigsamulett2());
		previewArtefakte.add(artefaktPool.krummsaebel2());
		previewArtefakte.add(artefaktPool.donner3());
		previewArtefakte.add(artefaktPool.koenigsamulett3());
		previewArtefakte.add(artefaktPool.krummsaebel3());
		previewArtefakte.add(artefaktPool.ploetze1());
		previewArtefakte.add(artefaktPool.ploetze2());
		previewArtefakte.add(artefaktPool.ploetze3());
		previewArtefakte.add(artefaktPool.emmentaler1());
		previewArtefakte.add(artefaktPool.emmentaler2());
		previewArtefakte.add(artefaktPool.emmentaler3());
		previewArtefakte.add(artefaktPool.standarte1());
		previewArtefakte.add(artefaktPool.standarte2());
		previewArtefakte.add(artefaktPool.standarte3());
		previewArtefakte.add(artefaktPool.aerondight1());
		previewArtefakte.add(artefaktPool.aerondight2());
		previewArtefakte.add(artefaktPool.aerondight3());
		previewArtefakte.add(artefaktPool.aerondight4());
		previewArtefakte.add(artefaktPool.kriegstrommeln1());
		previewArtefakte.add(artefaktPool.kriegstrommeln2());
		previewArtefakte.add(artefaktPool.kriegstrommeln3());
		previewArtefakte.add(artefaktPool.schaufeln1());
		previewArtefakte.add(artefaktPool.schaufeln2());
		previewArtefakte.add(artefaktPool.schaufeln3());
		previewArtefakte.add(artefaktPool.drachentraum1());
		previewArtefakte.add(artefaktPool.drachentraum2());
		previewArtefakte.add(artefaktPool.drachentraum3());
		previewArtefakte.add(artefaktPool.schwalbe1());
		previewArtefakte.add(artefaktPool.schwalbe2());
		previewArtefakte.add(artefaktPool.schwalbe3());
		previewArtefakte.add(artefaktPool.ringderheilung1());
		previewArtefakte.add(artefaktPool.ringderheilung2());
		previewArtefakte.add(artefaktPool.ringderheilung3());
		previewArtefakte.add(artefaktPool.stabdesadepten1());
		previewArtefakte.add(artefaktPool.stabdesadepten2());
		previewArtefakte.add(artefaktPool.stabdesadepten3());
		previewArtefakte.add(artefaktPool.rabesrustung1());
		previewArtefakte.add(artefaktPool.rabesrustung2());
		previewArtefakte.add(artefaktPool.rabesrustung3());
		previewArtefakte.add(artefaktPool.lederrustung1());
		previewArtefakte.add(artefaktPool.lederrustung2());
		previewArtefakte.add(artefaktPool.lederrustung3());
		previewArtefakte.add(artefaktPool.brustharnisch1());
		previewArtefakte.add(artefaktPool.brustharnisch2());
		previewArtefakte.add(artefaktPool.brustharnisch3());
		previewArtefakte.add(artefaktPool.kovirlangschwert1());
		previewArtefakte.add(artefaktPool.kovirlangschwert2());
		previewArtefakte.add(artefaktPool.kovirlangschwert3());
		previewArtefakte.add(artefaktPool.arbalest1());
		previewArtefakte.add(artefaktPool.arbalest2());
		previewArtefakte.add(artefaktPool.arbalest3());
		previewArtefakte.add(artefaktPool.speer1());
		previewArtefakte.add(artefaktPool.speer2());
		previewArtefakte.add(artefaktPool.speer3());
		previewArtefakte.add(artefaktPool.dimeritium1());
		previewArtefakte.add(artefaktPool.dimeritium2());
		previewArtefakte.add(artefaktPool.teufelsbovist1());
		previewArtefakte.add(artefaktPool.teufelsbovist2());
		previewArtefakte.add(artefaktPool.teufelsbovist3());
		previewArtefakte.add(artefaktPool.barenfalle1());
		previewArtefakte.add(artefaktPool.barenfalle2());
		previewArtefakte.add(artefaktPool.barenfalle3());

		

		
		
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
		previewSkills.add(skillPool.vampirrauch());
		previewSkills.add(skillPool.barentechnik());
		previewSkills.add(skillPool.greifentechnik());
		previewSkills.add(skillPool.wolfstechnik());
		previewSkills.add(skillPool.axii());
		previewSkills.add(skillPool.igni());
		previewSkills.add(skillPool.aard());
		previewSkills.add(skillPool.yrden());
		previewSkills.add(skillPool.weisserwolf());
		previewSkills.add(skillPool.mutagene());
		previewSkills.add(skillPool.zeitsprung());
		previewSkills.add(skillPool.vellaglan());
		previewSkills.add(skillPool.betauben());
		previewSkills.add(skillPool.erdrutsch());
		previewSkills.add(skillPool.feuerball());
		previewSkills.add(skillPool.feuerbombe());
		previewSkills.add(skillPool.feuerhagel());
		previewSkills.add(skillPool.beraterin());
		previewSkills.add(skillPool.spalten());

		
		
		
		Collections.sort(previewSkills, new Comparator<Skill>() {

			@Override
			public int compare(Skill arg0, Skill arg1) {
				// TODO Auto-generated method stub
				return ((arg0.getName()).compareTo(arg1.getName()));
			}
			
		});
		
		Collections.sort(previewArtefakte, new Comparator<Artefakt>() {

			@Override
			public int compare(Artefakt arg0, Artefakt arg1) {
				// TODO Auto-generated method stub
				return ((arg0.getName()).compareTo(arg1.getName()));
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
//		System.out.println("Achilleus hat nun die F�higkeit Schlachtruf!");
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
//		System.out.println("Achilleus hat nun einen Truppenverband Heckensch�tzen bekommen!");
//		System.out.println("Achilleus hat nun einen Truppenverband K�rassiere bekommen!");
//
//		
//		System.out.println("Ein Feind wird erstellt!");
//		System.out.println("Erstelle Kommandanten...");
//		Teilnehmer enemyAchilleus = teilnehmerPool.achilleus(spieler2);;
//		Skill dezimieren = skillPool.dezimieren();
//		myAchilleus.setSkill2(dezimieren);
//		System.out.println("Mein Achilleus hat nun die F�higkeit Schwertschlag!");
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
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Heckensch�tzen bekommen!");
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband H�ter bekommen!");
//		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband K�rassiere bekommen!");
//		
//		Artefakt artefakt = new Artefakt("Horn des Krieges", "Erh�ht den Schaden aller Teilnehmer um 5", "damageBuffall", 5, false);
//		Artefakt artefaktStandarte = new Artefakt("Standarte des Himmels", "Erh�ht den Schaden aller Teilnehmer um 7", "damageBuffall", 7, false);
//		Artefakt artefaktChanty = new Artefakt("Ermutigungschanty", "Erh�ht die Initative aller Teilnehmer um 2", "speedBuffall", 2, false);
//		Artefakt[] myArtefakte = new Artefakt[3];
//		myArtefakte[0] = artefakt;
//		myArtefakte[1] = artefaktStandarte;
//		myArtefakte[2] = artefaktChanty;
//		
//		myAchilleus.setArtefakte(myArtefakte);
//		
//		Artefakt artefaktEnemy = new Artefakt("Trommeln der Wendigkeit", "Erh�ht die Initative aller Teilnehmer um 25", "speedBuffall", 25, false);
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
