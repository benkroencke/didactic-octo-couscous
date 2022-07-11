package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kampfrechner.Kampf;
import model.Artefakt;
import model.Teilnehmer;
import model.Skill;
import model.Spieler;

public class Main {

	public static void main(String[] args) {
		
		Spieler spieler1 = new Spieler("Spieler 1");
		Spieler spieler2 = new Spieler("Spieler 2");
		Teilnehmer teilnehmerPool = new Teilnehmer();
		Skill skillPool = new Skill();
		
		System.out.println("Das Spiel beginnt!");
		System.out.println("Erstelle Kommandanten...");
		Teilnehmer myAchilleus = teilnehmerPool.achilleus(spieler1);
		Skill schlachtruf = skillPool.schlachtruf();
		myAchilleus.setSkill1(schlachtruf);
		System.out.println("Achilleus hat nun die Fähigkeit Schlachtruf!");
		Teilnehmer heckenschuetze = teilnehmerPool.heckenschuetze(spieler1);;
		myAchilleus.getEinheitenListe().add(heckenschuetze);
		//Teilnehmer kuerassiere = teilnehmerPool.kuerassiere(spieler1);
		//myAchilleus.getEinheitenListe().add(kuerassiere);
		Teilnehmer hueter1 = teilnehmerPool.kuerassiere(spieler1);
		myAchilleus.getEinheitenListe().add(hueter1);
		Teilnehmer hueter2 = teilnehmerPool.kuerassiere(spieler1);
		myAchilleus.getEinheitenListe().add(hueter2);
		Teilnehmer hs2 = teilnehmerPool.kuerassiere(spieler1);
		myAchilleus.getEinheitenListe().add(hs2);
		Teilnehmer hs3 = teilnehmerPool.kuerassiere(spieler1);
		myAchilleus.getEinheitenListe().add(hs3);
		Teilnehmer hs4 = teilnehmerPool.kuerassiere(spieler1);
		myAchilleus.getEinheitenListe().add(hs4);
		System.out.println("Achilleus hat nun einen Truppenverband Heckenschützen bekommen!");
		System.out.println("Achilleus hat nun einen Truppenverband Kürassiere bekommen!");

		
		System.out.println("Ein Feind wird erstellt!");
		System.out.println("Erstelle Kommandanten...");
		Teilnehmer enemyAchilleus = teilnehmerPool.achilleus(spieler2);;
		Skill dezimieren = skillPool.dezimieren();
		myAchilleus.setSkill2(dezimieren);
		System.out.println("Mein Achilleus hat nun die Fähigkeit Schwertschlag!");
		//Teilnehmer heckenschuetze2 = teilnehmerPool.heckenschuetze(spieler2);
		//enemyAchilleus.getEinheitenListe().add(heckenschuetze2);
		Teilnehmer hueter = teilnehmerPool.hueter(spieler2);
		enemyAchilleus.getEinheitenListe().add(hueter);
		enemyAchilleus.getEinheitenListe().add(teilnehmerPool.hueter(spieler2));
		enemyAchilleus.getEinheitenListe().add(teilnehmerPool.hueter(spieler2));
		enemyAchilleus.getEinheitenListe().add(teilnehmerPool.hueter(spieler2));
		enemyAchilleus.getEinheitenListe().add(teilnehmerPool.hueter(spieler2));
		enemyAchilleus.getEinheitenListe().add(teilnehmerPool.hueter(spieler2));
		//Teilnehmer phalanx = teilnehmerPool.phalanxinfanterie(spieler2);
		//enemyAchilleus.getEinheitenListe().add(phalanx);
		enemyAchilleus.setSkill1(dezimieren);
		enemyAchilleus.setSkill2(schlachtruf);
		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Heckenschützen bekommen!");
		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Hüter bekommen!");
		System.out.println("Der gegnerische Achilleus hat nun einen Truppenverband Kürassiere bekommen!");
		
		Artefakt artefakt = new Artefakt("Horn des Krieges", "Erhöht den Schaden aller Teilnehmer um 5", "damageBuffall", 5, false);
		Artefakt artefaktStandarte = new Artefakt("Standarte des Himmels", "Erhöht den Schaden aller Teilnehmer um 7", "damageBuffall", 7, false);
		Artefakt artefaktChanty = new Artefakt("Ermutigungschanty", "Erhöht die Initative aller Teilnehmer um 2", "speedBuffall", 2, false);
		Artefakt[] myArtefakte = new Artefakt[3];
		myArtefakte[0] = artefakt;
		myArtefakte[1] = artefaktStandarte;
		myArtefakte[2] = artefaktChanty;
		
		myAchilleus.setArtefakte(myArtefakte);
		
		Artefakt artefaktEnemy = new Artefakt("Trommeln der Wendigkeit", "Erhöht die Initative aller Teilnehmer um 25", "speedBuffall", 25, false);
		Artefakt[] enemyArtefakte = new Artefakt[3];
		enemyArtefakte[0] = artefaktEnemy;
		enemyAchilleus.setArtefakte(enemyArtefakte);
		
		
		ArrayList<Teilnehmer> spieler1kampfEinheiten = new ArrayList<Teilnehmer>();
		spieler1kampfEinheiten = myAchilleus.getEinheitenListe();		
		
		ArrayList<Teilnehmer> spieler2kampfEinheiten = new ArrayList<Teilnehmer>();
		spieler2kampfEinheiten = enemyAchilleus.getEinheitenListe();
		
		ArrayList<Teilnehmer> teilnehmer = new ArrayList<Teilnehmer>();
		for(int i=0; i<spieler1kampfEinheiten.size();i++) {
			teilnehmer.add(spieler1kampfEinheiten.get(i));
		}
		for(int i=0; i<spieler2kampfEinheiten.size();i++) {
			teilnehmer.add(spieler2kampfEinheiten.get(i));
		}
		teilnehmer.add((Teilnehmer) myAchilleus);
		teilnehmer.add((Teilnehmer) enemyAchilleus);
		
		System.out.println(teilnehmer.toString());
		
		Kampf kampf = new Kampf(spieler1kampfEinheiten, spieler2kampfEinheiten, myAchilleus, enemyAchilleus);
		
			
		
		System.out.println("---------------------------------------------------");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("---------------------------------------------------");
		
		System.out.println("Kampf erstellen...");
		
		System.out.println(teilnehmer.toString());
		teilnehmer = kampf.vorKriegsPhase(teilnehmer);

		teilnehmer = kampf.kriegsPhase(teilnehmer, spieler1, spieler2);
		
		
		
		
		
	}

}
