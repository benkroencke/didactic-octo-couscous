package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import main.Main;

public class Effekt {
	
	private String name;
	private String effektID;
	
	public Effekt(String name, String effektID) {
		super();
		this.name = name;
		this.effektID = effektID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffektID() {
		return effektID;
	}

	public void setEffektID(String effektID) {
		this.effektID = effektID;
	}
	
	public void mehrRuestung(ArrayList<Teilnehmer> einheiten, int armorBonus) {
		int groesse = einheiten.size();
		for(int i = 0; i < groesse; i++) {
			int neuerWert = einheiten.get(i).getRuestungProzentActual()+armorBonus;
			einheiten.get(i).setRuestungProzentActual(neuerWert);
			Main.battlelog.add("Mehr Rüstung wurde verteilt durch einen Effekt.");
		}
	}
	
	public static void damageBuffAll(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler)) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
		}
	}
	
	public static void buffDamageAllPercent(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getSchaden()*bonus/100;
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+schadensBonus);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-schadensBonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
		}
	}
	
	public static void risk(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int malus) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getSchaden()*bonus/100;
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+schadensBonus);
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-malus);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-schadensBonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
				Main.battlelog.add("Der Rüstungswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+malus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	
	public static void debuffDamageAllPercent(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getSchaden()*bonus/100;
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()-schadensBonus);
				Main.battlelog.add("Der Angriffswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()+schadensBonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
		}
	}
	
	
	public static void debuffArmorAllPercentOnce(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = bonus;
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-schadensBonus);
				Main.battlelog.add("Der Rüstungswert von " + einheiten.get(i).getBesitzer().getName() + "'s " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+schadensBonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	public static void debuffArmorAllDependent(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, Teilnehmer teilnehmer) {
		
		ArrayList<String> diverseUnits = new ArrayList<String>();
		
		List<String> newList = calcDiversity(einheiten, teilnehmer, diverseUnits);
		
		diverseUnits = (ArrayList<String>) newList;
		
		int faktor = diverseUnits.size();
		
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-faktor*bonus);
				Main.battlelog.add("Der Rüstungswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+faktor*bonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	public static void debuffArmorAll(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, Teilnehmer teilnehmer) {
		
		ArrayList<String> diverseUnits = new ArrayList<String>();
		
		List<String> newList = calcDiversity(einheiten, teilnehmer, diverseUnits);
		
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-bonus);
				Main.battlelog.add("Der Rüstungswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+bonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	
	public static void debuffDamageHero(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getSchaden()*bonus/100;
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()-schadensBonus);
				Main.battlelog.add("Der Angriffswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()+schadensBonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
		}
	}
	
	public static void debuffArmorAllPercent(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getRuestungProzent()*bonus/100;
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-schadensBonus);
				Main.battlelog.add("Der Rüstungswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+schadensBonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	

	
	
	public static void debuffArmorPercent(ArrayList<Teilnehmer> einheiten, int bonus, int anzahl, Spieler spieler) {
		
		for (int i = 0; i<anzahl; i++) {
			
			if(!einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
				int schadensBonus = einheiten.get(i).getRuestungProzent()*bonus/100;
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()-schadensBonus);
				Main.battlelog.add("Der Rüstungswert von gegnerischen " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()+schadensBonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	
	public static void buffDamageSpecificUnit(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, Skill skill) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(skill.getName() == "Berauschende Pilze") {
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getName() == "Svulblod Fanatiker") {
					einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
					Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

				}
			}
			else {
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
					einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
					Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
	
				}
			}
		}
	}
	
	
	public static void buffDamageSpecificUnitArtefakt(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id) {
		
		if(id == 98)
			id = 0;
		if(id == 97)
			id = 1;
		if(id == 96)
			id = 2;
		if(id == 95)
			id = 3;
		
		for (int i = 0; i<einheiten.size(); i++) {

			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
	
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void magischeBombe(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, int cdNew) {
		
		for (int i = 0; i<einheiten.size(); i++) {

			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id && einheiten.get(i).getUltimate().getName() == "Magische Bombe" && !einheiten.get(i).getUltimate().isActive()) {
				
				Teilnehmer held = einheiten.get(i);
				if(held.getSkill1().getName() == "Magieexplosion")
					einheiten.get(i).getSkill1().setCooldown(cdNew);
				if(held.getSkill2().getName() == "Magieexplosion")
					einheiten.get(i).getSkill2().setCooldown(cdNew);
				if(held.getSkill3().getName() == "Magieexplosion")
					einheiten.get(i).getSkill3().setCooldown(cdNew);
				if(held.getSkill4().getName() == "Magieexplosion")
					einheiten.get(i).getSkill4().setCooldown(cdNew);
	
				Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " löst nun jede " + einheiten.get(i).getSkill1().getCooldown() + " aus.");
				einheiten.get(i).getUltimate().setActive(true);

	
			}
			
			
		}
		
	}
	
	
	public static void mutagene(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, int cdNew) {
		
		for (int i = 0; i<einheiten.size(); i++) {

			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id && !einheiten.get(i).getUltimate().isActive()) {
				
				Teilnehmer held = einheiten.get(i);
				if(held.getSkill1().getName() == "Igni") {
					einheiten.get(i).getSkill1().setSchadensMulitplikator(100);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " verursacht nun 25 Schaden mehr.");
				}
				if(held.getSkill2().getName() == "Igni") {
					einheiten.get(i).getSkill2().setSchadensMulitplikator(100);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill2().getName() + " verursacht nun 25 Schaden mehr.");
				}
				if(held.getSkill3().getName() == "Igni") {
					einheiten.get(i).getSkill3().setSchadensMulitplikator(100);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill3().getName() + " verursacht nun 25 Schaden mehr.");
				}
				if(held.getSkill4().getName() == "Igni") {
					einheiten.get(i).getSkill4().setSchadensMulitplikator(100);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill4().getName() + " verursacht nun 25 Schaden mehr.");
				}
	
				
				if(held.getSkill1().getName() == "Aard") {
					einheiten.get(i).getSkill1().setSchadensMulitplikator(200);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " verursacht nun 100 Schaden mehr.");
				}
				if(held.getSkill2().getName() == "Aard") {
					einheiten.get(i).getSkill2().setSchadensMulitplikator(200);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill2().getName() + " verursacht nun 100 Schaden mehr.");
				}
				if(held.getSkill3().getName() == "Aard") {
					einheiten.get(i).getSkill3().setSchadensMulitplikator(200);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill3().getName() + " verursacht nun 100 Schaden mehr.");
				}
				if(held.getSkill4().getName() == "Aard") {
					einheiten.get(i).getSkill4().setSchadensMulitplikator(200);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill4().getName() + " verursacht nun 100 Schaden mehr.");
				}
				
				
				if(held.getSkill1().getName() == "Yrden") {
					einheiten.get(i).getSkill1().setSchadensMulitplikator(3);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " Betäubt nun 2 Runden.");
				}
				if(held.getSkill2().getName() == "Yrden") {
					einheiten.get(i).getSkill2().setSchadensMulitplikator(3);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill2().getName() + " Betäubt nun 2 Runden.");
				}
				if(held.getSkill3().getName() == "Yrden") {
					einheiten.get(i).getSkill3().setSchadensMulitplikator(3);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill3().getName() + " Betäubt nun 2 Runden.");
				}
				if(held.getSkill4().getName() == "Yrden") {
					einheiten.get(i).getSkill4().setSchadensMulitplikator(3);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill4().getName() + " Betäubt nun 2 Runden.");
				}
				
				
				if(held.getSkill1().getName() == "Axii") {
					einheiten.get(i).getSkill1().setCooldown(2);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " löst nun jede 2. Runde aus.");
				}
				if(held.getSkill2().getName() == "Axii") {
					einheiten.get(i).getSkill2().setCooldown(2);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill2().getName() + " löst nun jede 2. Runde aus.");
				}
				if(held.getSkill3().getName() == "Axii") {
					einheiten.get(i).getSkill3().setCooldown(2);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill3().getName() + " löst nun jede 2. Runde aus.");
				}
				if(held.getSkill4().getName() == "Axii") {
					einheiten.get(i).getSkill4().setCooldown(2);
					Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill4().getName() + " löst nun jede 2. Runde aus.");
				}
				
				einheiten.get(i).getUltimate().setActive(true);
	
			}
			

			
		}
		
	}
	
	
	
	
	
	public static void buffDamageSkillSpecificUnit(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, int cdNew) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
				einheiten.get(i).getSkill1().setCooldown(cdNew);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
				Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " löst nun jede " + einheiten.get(i).getSkill1().getCooldown() + " aus.");

			}
			
			
			
		}
	}
	
	public static void buffSkillSpecificUnitTargets(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, int cdNew) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).getSkill1().setNumberOfTargets(cdNew);
				Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " trifft nun " + einheiten.get(i).getSkill1().getCooldown() + "!");

			}
		}
	}
	
	public static void changeSkill(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id, int newValue) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).getSkill1().setDamageBonus(newValue);
				Main.battlelog.add(spieler.getName() + " " + einheiten.get(i).getName() + " " + einheiten.get(i).getSkill1().getName() + " verteilt nun " + einheiten.get(i).getSkill1().getDamageBonus() + ".");

			}
		}
	}
	
	public static void buffArmorSpecificUnit(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id) {
		
		if(id == 98)
			id = 0;
		if(id == 97)
			id = 1;
		if(id == 96)
			id = 2;
		if(id == 95)
			id = 3;
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+bonus);
				Main.battlelog.add("Der Rüstungswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()-bonus) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	public static void buffDamageArmorSpecificUnit(ArrayList<Teilnehmer> einheiten, int bonusArmor, int bonusDamage, Spieler spieler, int id) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+bonusArmor);
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonusDamage);
				Main.battlelog.add("Der Schadenswert/Rüstungswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonusDamage) + "/" +(einheiten.get(i).getRuestungProzentActual()-bonusArmor) + " auf " + einheiten.get(i).getSchadenActual() + "/" + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	public static void buffDamageArmor2UnitsPercent(ArrayList<Teilnehmer> einheiten, int bonusArmor, int bonusDamage, Spieler spieler, int id, int id2) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+bonusArmor);
				Main.battlelog.add("Der Rüstungswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()-bonusArmor) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id2) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+einheiten.get(i).getSchadenActual()*15/100);
				Main.battlelog.add("Der Schadenswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()/(100+bonusDamage)*100) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
			
		}
	}
	
	
	
	public static void buffDamageArmorAll(ArrayList<Teilnehmer> einheiten, int bonusArmor, int bonusDamage, Spieler spieler, int id) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler)) {
				einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+bonusArmor);
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonusDamage);
				Main.battlelog.add("Der Schadenswert/Rüstungswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonusDamage) + "/" +(einheiten.get(i).getRuestungProzentActual()-bonusArmor) + " auf " + einheiten.get(i).getSchadenActual() + "/" + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");

			}
		}
	}
	
	public static void speedBuffAll(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
		for (int i = 0; i<einheiten.size(); i++) {
				
			if(einheiten.get(i).getBesitzer().equals(spieler)) {
					
				einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()+bonus);
				Main.battlelog.add("Der Initwert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getInitActual()-bonus) + " auf " + einheiten.get(i).getInitActual() + " gesetzt!");
					
			}
					
		}
		
	}
		
		public static void speedBuffCommander(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()+bonus);
					Main.battlelog.add("Der Initwert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getInitActual()-bonus) + " auf " + einheiten.get(i).getInitActual() + " gesetzt!");
					
				}
					
			}
		
		}
		
		public static void debuffHeroInit(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(!einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()-bonus);
					Main.battlelog.add("Der Initwert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getInitActual()+bonus) + " auf " + einheiten.get(i).getInitActual() + " gesetzt!");
					
				}
					
			}
		
		}
		
		
		public static void speedBuffUnits(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()+bonus);
					Main.battlelog.add("Der Initwert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getInitActual()-bonus) + " auf " + einheiten.get(i).getInitActual() + " gesetzt!");
					
				}
					
			}
		
		}
		
		public static void damageBuffCommander(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
					Main.battlelog.add("Der Schadenswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
					
				}
					
			}
		
		}
		
		public static void stunImmune(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setTurnsStunned(-9999);
					Main.battlelog.add("Dem Kommandanten wurde Immunität gegenüber betäuben gewährt.");
					
				}
					
			}
		
		}
		
		public static void damageInitBuffCommander(ArrayList<Teilnehmer> einheiten, int bonus, int schaden, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).isIstKommandant()) {
					
					einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+schaden);
					einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()+bonus);

					Main.battlelog.add("Der Schadenswert/Initiativewert " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-schaden) + "/" + (einheiten.get(i).getInitActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + "/" + einheiten.get(i).getInitActual() + " gesetzt!");

				}
					
			}
		
		}
		
		
		
		public static void heallAll(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer caster) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				
				if(einheiten.get(i).getHealable() == 0) {
					if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
						int heal = (einheiten.get(i).getLeben()*skill.getHealPercent())/100;
						einheiten.get(i).setLebenActual(einheiten.get(i).getLebenActual()+heal);
						int actualHeal = 0;
						if(einheiten.get(i).getLebenActual()>einheiten.get(i).getLeben()) {
							actualHeal = heal-(einheiten.get(i).getLebenActual()-einheiten.get(i).getLeben());
							einheiten.get(i).setLebenActual(einheiten.get(i).getLeben());
						} else {
							actualHeal = heal;
						}
						
						Main.battlelog.add("Effekt von: " + skill.getName() + " - Die Leben von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getLebenActual()-actualHeal) + " auf " + einheiten.get(i).getLebenActual() + " gesetzt!");
						caster.setGeheilterSchaden(caster.getGeheilterSchaden()+actualHeal);
					}
				}
				else {
					Main.battlelog.add("Effekt von: " + skill.getName() + " kann nicht ausgelöst werden, da " + einheiten.get(i).getName() + " nicht geheilt werden können!");
				}
				
			}
		}
		
		
		public static void heallAllArtefakt(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, Teilnehmer caster) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				
				if(einheiten.get(i).getHealable() == 0) {
					if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
						int heal = (einheiten.get(i).getLeben()*bonus)/100;
						einheiten.get(i).setLebenActual(einheiten.get(i).getLebenActual()+heal);
						int actualHeal = 0;
						if(einheiten.get(i).getLebenActual()>einheiten.get(i).getLeben()) {
							actualHeal = heal-(einheiten.get(i).getLebenActual()-einheiten.get(i).getLeben());
							einheiten.get(i).setLebenActual(einheiten.get(i).getLeben());
						} else {
							actualHeal = heal;
						}
						
						Main.battlelog.add("Artefakteffekt - Die Leben von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getLebenActual()-actualHeal) + " auf " + einheiten.get(i).getLebenActual() + " gesetzt!");
						caster.setGeheilterSchaden(caster.getGeheilterSchaden()+actualHeal);
					}
				}
				else {
					Main.battlelog.add("Artefakteffekt kann nicht ausgelöst werden, da " + einheiten.get(i).getName() + " nicht geheilt werden können!");
				}
				
			}
		}
		
		
		public static void heal2Units(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer caster, int id1, int id2) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				
				if(einheiten.get(i).getHealable() == 0) {

					if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant() && einheiten.get(i).getId() == id1 || einheiten.get(i).getId() == id2) {
						int heal = (einheiten.get(i).getLeben()*skill.getHealPercent())/100;
						einheiten.get(i).setLebenActual(einheiten.get(i).getLebenActual()+heal);
						int actualHeal = 0;
						if(einheiten.get(i).getLebenActual()>einheiten.get(i).getLeben()) {
							actualHeal = heal-(einheiten.get(i).getLebenActual()-einheiten.get(i).getLeben());
							einheiten.get(i).setLebenActual(einheiten.get(i).getLeben());
						} else {
							actualHeal = heal;
						}
						
						Main.battlelog.add("Effekt von: " + skill.getName() + " - Die Leben von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getLebenActual()-actualHeal) + " auf " + einheiten.get(i).getLebenActual() + " gesetzt!");
						caster.setGeheilterSchaden(caster.getGeheilterSchaden()+actualHeal);
					}
				}
				else {
					Main.battlelog.add("Effekt von: " + skill.getName() + " kann nicht ausgelöst werden, da " + einheiten.get(i).getName() + " nicht geheilt werden können!");
				}
			}
		}

		
		public static void healTargetsUnder50(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer caster) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			ArrayList<Teilnehmer> targets2 = new ArrayList<Teilnehmer>();
				
			for(int i = 0; i<einheiten.size(); i++) {
				Random rand = new Random();
				Teilnehmer random = einheiten.get(rand.nextInt(einheiten.size()));
				
				if((einheiten.get(i).getLebenActual())<(einheiten.get(i).getLeben()/2))
						targets.add(einheiten.get(i));
				
			}
			for(int i = 0; i<targets.size();i++) {
				if(targets.get(i).getBesitzer() == caster.getBesitzer() && !targets.get(i).isIstKommandant()) {
					targets2.add(targets.get(i));
				}
			}
			targets = targets2;
			if(targets.size()>0) {
				for (int i = 0; i<targets.size(); i++) {
					int heal = (targets.get(i).getLeben()*skill.getHealPercent())/100;
					targets.get(i).setLebenActual(targets.get(i).getLebenActual()+heal);
					int actualHeal = 0;
					if(targets.get(i).getLebenActual()>targets.get(i).getLeben()) {
						actualHeal = heal-(targets.get(i).getLebenActual()-targets.get(i).getLeben());
						targets.get(i).setLebenActual(targets.get(i).getLeben());
					} else {
						actualHeal = heal;
					}
					Main.battlelog.add("Effekt von: " + skill.getName() + " - Die Leben von " + spieler.getName() + " " + targets.get(i).getName() + " wurde von " + (targets.get(i).getLebenActual()-actualHeal) + " auf " + targets.get(i).getLebenActual() + " gesetzt!");
					caster.setGeheilterSchaden(caster.getGeheilterSchaden()+actualHeal);
				}
			}
			
				
			
			
		}
		
		
		public static void damage(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
					
					ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
					
					
						
					
					for(int a=0; a<einheiten.size();a++) {
						
						if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
							targets.add(einheiten.get(a));
					}
					while(targets.size()>skill.getNumberOfTargets())
						targets.remove(targets.size()-1);
			
					//Falls Skill == Überfall
					if(skill.getName() == "Überfall") {
						ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
						for(int i=0;i<einheiten.size();i++) {
							if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
								uberfallTargets.add(einheiten.get(i));
						}
						targets = uberfallTargets;
						
					}
					
					for (int i = 0; i<targets.size(); i++) {
						
						int damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
						
						if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
							damage = reduceDamagePercent(targets.get(i), damage);
						}
						
						targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
						
						Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
						teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
						targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);
		
					}
					
		}
		
		
		public static void damageInit(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = ((teilnehmer.getInitActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
				
				if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
					damage = reduceDamagePercent(targets.get(i), damage);
				}
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
}
		
		
		
		
		public static void magicDamageDoubleWeak(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = skill.getSchadensMulitplikator();
				if(targets.get(i).getId() == 3)
					damage = damage*skill.getDamageBonus();
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}
		
		public static void setAll50percent(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			int counter = 0;
			
			for(int i = 0;i<einheiten.size();i++) {
				
				if(einheiten.get(i).getBesitzer() == teilnehmer.getBesitzer() && !einheiten.get(i).isIstKommandant())
					counter++;
				
			}
			
			int changed = 0;
				
			for(int a=0; a<einheiten.size();a++) {
					
				if(!skill.isActive()) {
					for(int i = 0;i<einheiten.size();i++) {
						if(changed < counter) {
							if(!einheiten.get(i).isIstKommandant()) {
								einheiten.get(i).setLebenActual(einheiten.get(i).getLeben()/2);
								Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + einheiten.get(i).getBesitzer().getName() + " " + einheiten.get(i).getName() + " wurden auf " + einheiten.get(i).getLebenActual()  + " gesetzt!");
							}
							changed++;
						}
					}
					skill.setActive(true);
				}
			}

		}
		
		public static void magicDamage(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = skill.getSchadensMulitplikator();
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}
		
		
		public static void magicDamageArtefakt(ArrayList<Teilnehmer> einheiten, Spieler spieler, int bonus, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>3)
				targets.remove(targets.size()-1);
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = bonus;
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s Artefakteffekt - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}
		
		
		
		
		
		public static void magicDamageLifeSteal(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			ArrayList<Teilnehmer> friendly = new ArrayList<Teilnehmer>();

			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() == teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					friendly.add(einheiten.get(a));
			}
			
			
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
			
			while(friendly.size()>skill.getNumberOfTargets())
				friendly.remove(friendly.size()-1);
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = skill.getSchadensMulitplikator();
				if(targets.get(i).getId() == 3)
					damage = damage*skill.getDamageBonus();
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
			for (int i = 0; i<friendly.size(); i++) {
				
				int damage = skill.getSchadensMulitplikator();
				
				friendly.get(i).setLebenActual(friendly.get(i).getLebenActual()+damage);
				
				int healed = damage;
				
				if(friendly.get(i).getLebenActual()>friendly.get(i).getLeben() && friendly.get(i).getHealable() == 0) {
					healed = damage-(friendly.get(i).getLebenActual()-friendly.get(i).getLeben());
					friendly.get(i).setLebenActual(friendly.get(i).getLeben());
				}
				
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + friendly.get(i).getBesitzer().getName() + " " + friendly.get(i).getName() + " wurden von " + (friendly.get(i).getLebenActual()-healed) + " auf " + friendly.get(i).getLebenActual() + " gesetzt!" + healed + " geheilt!");
				teilnehmer.setGeheilterSchaden(teilnehmer.getGeheilterSchaden()+healed);

			}
			
		}
		
		
		public static void damageHealReduction(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
				
				if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
					damage = reduceDamagePercent(targets.get(i), damage);
				}
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				targets.get(i).setHealable(skill.getHealPercent());
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden " + ". Die Heilung wird " + skill.getHealPercent() + " Runden verhindert!");
				
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}
		
		public static void damageStun(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
				
				if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
					damage = reduceDamagePercent(targets.get(i), damage);
				}
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				if(targets.get(i).getTurnsStunned() < skill.getDamageReduction())
					targets.get(i).setTurnsStunned(skill.getDamageReduction());
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden " + ". Sie wurden " + skill.getDamageReduction() + " Runden betäubt!");
				
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}
		
		
		public static void magicDamageStun(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			
				
			
			for(int a=0; a<einheiten.size();a++) {
				
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
					targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
	
			//Falls Skill == Überfall
			if(skill.getName() == "Überfall") {
				ArrayList<Teilnehmer >uberfallTargets = new ArrayList<Teilnehmer>();
				for(int i=0;i<einheiten.size();i++) {
					if(einheiten.get(i).getId() == 2 && einheiten.get(i).getBesitzer() != teilnehmer.getBesitzer())
						uberfallTargets.add(einheiten.get(i));
				}
				targets = uberfallTargets;
				
			}
			
			for (int i = 0; i<targets.size(); i++) {
				
				int damage = skill.getSchadensMulitplikator();
				
				targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
				
				if(targets.get(i).getTurnsStunned() < skill.getDamageReduction())
					targets.get(i).setTurnsStunned(skill.getDamageReduction());
				
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden " + ". Sie wurden " + skill.getDamageReduction() + " Runden betäubt!");
				
				teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
				targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);

			}
			
		}	
		
		
		
		public static int reduceDamagePercent(Teilnehmer teilnehmer, int damage) {
			
			int vorher = damage;
			int reduction = teilnehmer.getSkill1().getDamageReduction();
			damage = damage*(100-reduction)/100;
			
			Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + teilnehmer.getSkill1().getName() + " - Der Schaden wurde von " + vorher + " auf " + damage + " reduziert.");
			
			return damage;
			
		}
		
		public static void damageSpecificRound(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			if(!skill.isActive()) {
			
				for(int a=0; a<einheiten.size();a++) {
					
					if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant())
						targets.add(einheiten.get(a));
				}
				while(targets.size()>skill.getNumberOfTargets())
					targets.remove(targets.size()-1);
		
				for (int i = 0; i<targets.size(); i++) {
					
					int damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
					
					if(targets.get(i).getSkill1() != null) {
						if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
							damage = reduceDamagePercent(targets.get(i), damage);
						}
					}
					
					targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
					
					Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
					teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
					targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);
	
				}
				skill.setActive(true);
			}
		}
		
		public static void eileDamage(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			if(!skill.isActive()) {
			
				for(int a=0; a<einheiten.size();a++) {
					
					if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant() && einheiten.get(a).getId() == 3)
						targets.add(einheiten.get(a));
				}
				while(targets.size()>skill.getNumberOfTargets())
					targets.remove(targets.size()-1);
		
				for (int i = 0; i<targets.size(); i++) {
					int damage = 0;
					if(skill.isIgnoresArmor())
						damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()));
					else
						damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
					
					if(targets.get(i).getSkill1() != null){
						if(targets.get(i).getSkill1().getEffectKey() == "reduceDamagePercent") {
							damage = reduceDamagePercent(targets.get(i), damage);
						}
					}
					
					targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
					
					Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
					teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
					targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);
	
				}
				skill.setActive(true);
			}
		}
		
		public static void pinchBoostFactorHeal(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {

			if((teilnehmer.getLeben()/2)>=teilnehmer.getLebenActual() && teilnehmer.getLebenActual()>0 && !skill.isActive()) {
					
				int heal = ((teilnehmer.getLeben()*skill.getHealPercent()/100));
				int erhoehungSchaden = teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator();
					
				teilnehmer.setLebenActual(teilnehmer.getLebenActual()+heal);
					
				if(teilnehmer.getLebenActual()>teilnehmer.getLeben()) {
						heal = heal - teilnehmer.getLebenActual()-teilnehmer.getLeben();
						teilnehmer.setLebenActual(teilnehmer.getLeben());
						
				}
						
				teilnehmer.setSchadenActual(teilnehmer.getSchadenActual()+erhoehungSchaden);
					
					
				Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + 
							" wurden um " + skill.getHealPercent() + "% erhöht: " + heal + " Leben geheilt! " + "Ihr Angriffswert  wurde um " + skill.getSchadensMulitplikator()*100 + "% auf " + teilnehmer.getSchadenActual() + " erhöht!");
				teilnehmer.setGeheilterSchaden(teilnehmer.getGeheilterSchaden()+heal);
					
				if(teilnehmer.getSkill1() != null && teilnehmer.getSkill1().equals(skill))
					teilnehmer.getSkill1().setActive(true);
				if(teilnehmer.getSkill2() != null && teilnehmer.getSkill2().equals(skill))
					teilnehmer.getSkill2().setActive(true);
				if(teilnehmer.getSkill3() != null && teilnehmer.getSkill3().equals(skill))
					teilnehmer.getSkill3().setActive(true);
				if(teilnehmer.getSkill4() != null && teilnehmer.getSkill4().equals(skill))
					teilnehmer.getSkill4().setActive(true);
				if(teilnehmer.getUltimate() != null && teilnehmer.getUltimate().equals(skill))
					teilnehmer.getUltimate().setActive(true);

			}
			
		}
		
		public static void united(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer, int id, int newValue) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getName().equals(teilnehmer.getName()) && !einheiten.get(i).equals(teilnehmer)) {
					
					if(skill.getName() == "Blutsbruder") {
						einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+skill.getDamageBonus());
						Main.battlelog.add("Effekt von: " + spieler.getName() + " " + einheiten.get(i).getName() + " Schadenswert wurde von " + (einheiten.get(i).getSchadenActual()-skill.getDamageBonus()) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
					}
					
					if(skill.getName() == "Schildwall") {
						einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+skill.getArmorBoost());
						Main.battlelog.add("Effekt von: " + spieler.getName() + " " + einheiten.get(i).getName() + " Rüstungswert wurde von " + (einheiten.get(i).getRuestungProzentActual()-skill.getArmorBoost()) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");
					}

				}
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == 4 && !einheiten.get(i).equals(teilnehmer)) {

					if(skill.getName() == "Anführer der Blauen Streifen") {
						teilnehmer.setSchadenActual(teilnehmer.getSchadenActual()+skill.getDamageBonus());
						Main.battlelog.add("Effekt von: " + spieler.getName() + " " + teilnehmer.getName() + " Schadenswert wurde von " + (teilnehmer.getSchadenActual()-skill.getDamageBonus()) + " auf " + teilnehmer.getSchadenActual() + " gesetzt!");
					}
				}
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == 2 && !einheiten.get(i).equals(teilnehmer)) {

					for(int j = 0; j<einheiten.size();j++) {
						if(skill.getName() == "Drummold Formation" && einheiten.get(j).getId() == 0)
						{
							einheiten.get(j).setSchadenActual(einheiten.get(j).getSchadenActual()+skill.getDamageBonus());
							Main.battlelog.add("Effekt von: " + spieler.getName() + " " + einheiten.get(j).getName() + " Schadenswert wurde von " + (einheiten.get(j).getSchadenActual()-skill.getDamageBonus()) + " auf " + einheiten.get(j).getSchadenActual() + " gesetzt!");
						}
					}
					
				}
				
			}
		}
		
		
		public static void diversity(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer, int id, int newValue) {
			
			ArrayList<String> diverseUnits = new ArrayList<String>();
			
			List<String> newList = calcDiversity(einheiten, teilnehmer, diverseUnits);
			
			diverseUnits = (ArrayList<String>) newList;
			
			System.out.println(diverseUnits.size());
			
			if(diverseUnits.size()>0) {
				teilnehmer.setSchadenActual(teilnehmer.getSchadenActual()+skill.getDamageBonus()*diverseUnits.size());
				Main.battlelog.add("Effekt von: " + spieler.getName() + " " + teilnehmer.getName() + " Schadenswert wurde von " + (teilnehmer.getSchadenActual()-skill.getDamageBonus()*diverseUnits.size()) + " auf " + teilnehmer.getSchadenActual() + " gesetzt!");
			}
			
		}

		private static List<String> calcDiversity(ArrayList<Teilnehmer> einheiten, Teilnehmer teilnehmer,
				ArrayList<String> diverseUnits) {
			for(int i=0;i<einheiten.size();i++) {

				if(einheiten.get(i).getBesitzer() == teilnehmer.getBesitzer() && !einheiten.get(i).isIstKommandant())
					diverseUnits.add(einheiten.get(i).getName());
				
			}
			
			List<String> newList = diverseUnits.stream()
                    .distinct()
                    .collect(Collectors.toList());
			return newList;
		}
		
		
		
		public static void stunOnce(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();
			
			if(!skill.isActive()) {
				
				
			
				for(int a=0; a<einheiten.size();a++) {
					
					if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && !targets.contains(einheiten.get(a)) && einheiten.get(a).getLebenActual()>0 && !einheiten.get(a).isIstKommandant() && einheiten.get(a).getTurnsStunned()<skill.getSchadensMulitplikator())
						targets.add(einheiten.get(a));
				}
				while(targets.size()>skill.getNumberOfTargets())
					targets.remove(targets.size()-1);
		
				
				
				for (int i = 0; i<targets.size(); i++) {
					
					if(targets.get(i).getTurnsStunned()<skill.getSchadensMulitplikator()) {
						
						targets.get(i).setTurnsStunned(skill.getSchadensMulitplikator());
						Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " sind für " + skill.getSchadensMulitplikator() + " Runden betäubt!");
					
					}
				}
				skill.setActive(true);
			}
		}
		
		public static void stunHero(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();

			for(int a=0; a<einheiten.size();a++) {
					
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && einheiten.get(a).isIstKommandant() && einheiten.get(a).getTurnsStunned()<skill.getSchadensMulitplikator())
						targets.add(einheiten.get(a));
			}
			while(targets.size()>skill.getNumberOfTargets())
				targets.remove(targets.size()-1);
		
				
				
			for (int i = 0; i<targets.size(); i++) {
					
				if(targets.get(i).getTurnsStunned()<skill.getSchadensMulitplikator()) {
					String mehrere = "Runde";
					if(skill.getSchadensMulitplikator()>1)
						mehrere = "Runden";
					targets.get(i).setTurnsStunned(targets.get(i).getTurnsStunned()+skill.getSchadensMulitplikator());
					Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " ist für " + skill.getSchadensMulitplikator() + " " + mehrere + " betäubt!");
					
				}
			}
			
		}
		
		public static void stunHeroArtefact(ArrayList<Teilnehmer> einheiten, Spieler spieler, int bonus, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();

			for(int a=0; a<einheiten.size();a++) {
					
				if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && einheiten.get(a).isIstKommandant() && einheiten.get(a).getTurnsStunned()<bonus)
						targets.add(einheiten.get(a));
			}
			while(targets.size()>1)
				targets.remove(targets.size()-1);
		
				
				
			for (int i = 0; i<targets.size(); i++) {
					
				if(targets.get(i).getTurnsStunned()<bonus) {
					String mehrere = "Runde";
					if(bonus>1)
						mehrere = "Runden";
					targets.get(i).setTurnsStunned(targets.get(i).getTurnsStunned()+bonus);
					Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s Artefakt - " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " ist für " + bonus + " " + mehrere + " betäubt!");
					
				}
			}
			
		}
		
		public static void stunHeroOnce(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			ArrayList<Teilnehmer> targets = new ArrayList<Teilnehmer>();

			if(!skill.isActive()) {
			
				for(int a=0; a<einheiten.size();a++) {
						
					if(einheiten.get(a).getBesitzer() != teilnehmer.getBesitzer() && einheiten.get(a).isIstKommandant() && einheiten.get(a).getTurnsStunned()<skill.getSchadensMulitplikator())
							targets.add(einheiten.get(a));
				}
				while(targets.size()>skill.getNumberOfTargets())
					targets.remove(targets.size()-1);
			
					
					
				for (int i = 0; i<targets.size(); i++) {
						
					if(targets.get(i).getTurnsStunned()<skill.getSchadensMulitplikator()) {
						String mehrere = "Runde";
						if(skill.getSchadensMulitplikator()>1)
							mehrere = "Runden";
						targets.get(i).setTurnsStunned(targets.get(i).getTurnsStunned()+skill.getSchadensMulitplikator());
						Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " ist für " + skill.getSchadensMulitplikator() + " " + mehrere + " betäubt!");
						
					}
				}
				skill.setActive(true);
			}
			
		}
		
		public static ArrayList<Teilnehmer> spy(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			boolean targetFound = false;
			Teilnehmer target = null;
			
			while(targetFound == false) {
				
				
	
				int size = einheiten.size();
				double chosen = Math.random()*size;
				int check = (int) chosen;
				
				if(!einheiten.get(check).isIstKommandant() && einheiten.get(check).getBesitzer() != spieler) {
					targetFound = true;
					target = einheiten.get(check);
				}
			}
			
			Spieler ownerOfSpy = null;
			if(spieler.equals(Main.getSpieler1()))
				ownerOfSpy = Main.getSpieler2();
			else
				ownerOfSpy = Main.getSpieler1();
			
			
			Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + "'s " + teilnehmer.getName() + " - " + skill.getName() + ": " + target.getBesitzer().getName() + "'s " + target.getName() + " hat sich als Spion herausgestellt!");
			
			Teilnehmer spy = target.erstelle("Spion", ownerOfSpy);
			
			einheiten.remove(target);
			einheiten.add(spy);
			
			
			
			return einheiten;
		}
		
		public static void aufloesen(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, String effectKey, Teilnehmer caster, int cooldown) {
		
			if(effectKey == "damageBuffall")
				damageBuffAll(einheiten, bonus, spieler);
			if(effectKey == "damageBuffCommander")
				damageBuffCommander(einheiten, bonus, spieler);
			if(effectKey == "speedBuffall")
				speedBuffAll(einheiten, bonus, spieler);
			if(effectKey == "speedBuffCommander")
				speedBuffCommander(einheiten, bonus, spieler);
			if(effectKey == "speedBuffUnits")
				speedBuffUnits(einheiten, bonus, spieler);
			if(effectKey == "buffDamageArmorAll")
				buffDamageArmorAll(einheiten, bonus, bonus, spieler, bonus);
			if(effectKey == "debuffDamageAllPercent")
				debuffDamageAllPercent(einheiten, bonus, spieler);
			if(effectKey == "debuffDamageHero")
				debuffDamageHero(einheiten, bonus, spieler);
			if(effectKey == "healAll")
				heallAllArtefakt(einheiten, bonus, spieler, caster);
			if(effectKey == "magicDamageArtefakt")
				magicDamageArtefakt(einheiten, spieler, bonus, caster);
			if(effectKey == "buffArmorSpecificUnit")
				buffArmorSpecificUnit(einheiten, bonus, spieler, cooldown);
			if(effectKey == "buffDamageSpecificUnitArtefakt")
				buffDamageSpecificUnitArtefakt(einheiten, bonus, spieler, cooldown);
			if(effectKey == "stunArtefact")
				stunHeroArtefact(einheiten, spieler, bonus, caster);
			if(effectKey == "debuffArmorAll")
				debuffArmorAll(einheiten, bonus, spieler, caster);
			if(effectKey == "debuffHeroInit")
				debuffHeroInit(einheiten, bonus, spieler);
			
	}

		public static void skillAufloesen(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, String effectKey, Teilnehmer teilnehmer) {

			Main.battlelog.add(skill.getName() + " prüft auf Bedingungen...");
			
			if(effectKey == "healAll")
				heallAll(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "damage")
				damage(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "pinchBoostFactorHeal")
				pinchBoostFactorHeal(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "united")
				united(einheiten, spieler, skill, teilnehmer, skill.getSchadensMulitplikator(), skill.getDamageBonus());
			if(effectKey == "damageSpecificRound")
				damageSpecificRound(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "healTargetsUnder50")
				healTargetsUnder50(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "eileDamage")
				eileDamage(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "stunOnce")
				stunOnce(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "speedBuffCommander")
				speedBuffCommander(einheiten, skill.getSchadensMulitplikator(), spieler);
			if(effectKey == "damageBuffCommander")
				damageBuffCommander(einheiten, skill.getSchadensMulitplikator(), spieler);
			if(effectKey == "buffDamageSpecificUnit")
				buffDamageSpecificUnit(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill);
			if(effectKey == "buffDamageAllPercent")
				buffDamageAllPercent(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "stunHero")
				stunHero(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "buffDamageAllLater")
				buffDamageAllPercent(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "buffArmorSpecificUnit")
				buffArmorSpecificUnit(einheiten, skill.getArmorBoost(), spieler, skill.getSchadensMulitplikator());
			if(effectKey == "buffDamageArmorSpecificUnit")
				buffDamageArmorSpecificUnit(einheiten, skill.getArmorBoost(), skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator());
			if(effectKey == "spy")
				spy(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "debuffDamageAllPercent")
				debuffDamageAllPercent(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "buffDamageArmorAll")
				buffDamageArmorAll(einheiten, skill.getArmorBoost(), skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator());
			if(effectKey == "damageInitBuffCommander")
				damageInitBuffCommander(einheiten, skill.getSchadensMulitplikator(), skill.getDamageBonus(), spieler);
			if(effectKey == "stunImmune")
				stunImmune(einheiten, skill.getSchadensMulitplikator(), spieler);
			if(effectKey == "debuffArmorAllPercent")
				debuffArmorAllPercent(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "debuffDamageHero")
				debuffDamageHero(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "buffDamageArmor2UnitsPercent")
				buffDamageArmor2UnitsPercent(einheiten, skill.getArmorBoost(), skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill.getNumberOfTargets());
			if(effectKey == "heal2Units")
				heal2Units(einheiten, spieler, skill, teilnehmer, skill.getSchadensMulitplikator(), skill.getNumberOfTargets());
			if(effectKey == "buffDamageSkillSpecificUnit")
				buffDamageSkillSpecificUnit(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill.getCooldown());
			if(effectKey == "diversity")
				diversity(einheiten, spieler, skill, teilnehmer, skill.getSchadensMulitplikator(), skill.getDamageBonus());
			if(effectKey == "debuffArmorAllDependent")
				debuffArmorAllDependent(einheiten, skill.getArmorBoost(), spieler, teilnehmer);
			if(effectKey == "risk")
				risk(einheiten, skill.getDamageBonus(), spieler, skill.getArmorBoost());
			if(effectKey == "debuffArmorAll")
				debuffArmorAll(einheiten, skill.getArmorBoost(), spieler, teilnehmer);
			if(effectKey == "damageHealReduction")
				damageHealReduction(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "damageStun")
				damageStun(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "buffSkillSpecificUnitTargets")
				buffSkillSpecificUnitTargets(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill.getCooldown());
			if(effectKey == "magicDamageDoubleWeak")
				magicDamageDoubleWeak(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "magicDamage")
				magicDamage(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "setAll50percent")
				setAll50percent(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "magischeBombe")
				magischeBombe(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill.getCooldown());
			if(effectKey == "magicDamageLifeSteal")
				magicDamageLifeSteal(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "debuffArmorPercent")
				debuffArmorPercent(einheiten, skill.getDamageBonus(), skill.getNumberOfTargets(), spieler);
			if(effectKey == "magicDamageStun")
				magicDamageStun(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "mutagene")
				mutagene(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator(), skill.getCooldown());
			if(effectKey == "stunHeroOnce")
				stunHeroOnce(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "debuffArmorAllPercentOnce")
				debuffArmorAllPercentOnce(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "damageInit")
				damageInit(einheiten, spieler, skill, teilnehmer);
			
			
			
			
			
			
		}

}
