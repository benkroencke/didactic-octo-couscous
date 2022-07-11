package model;

import java.util.ArrayList;
import java.util.Random;

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
			System.out.println("Mehr Rüstung wurde verteilt durch einen Effekt.");
		}
	}
	
	public static void damageBuffAll(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler)) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
				System.out.println("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

			}
		}
	}
		
		public static void speedBuffAll(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler)) {
					
					einheiten.get(i).setInitActual(einheiten.get(i).getInitActual()+bonus);
					System.out.println("Der Initwert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getInitActual()-bonus) + " auf " + einheiten.get(i).getInitActual() + " gesetzt!");
					
				}
					
			}
		
		}
		
		public static void heallAll(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				int heal = (einheiten.get(i).getLeben()*skill.getHealPercent())/100;
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && !einheiten.get(i).isIstKommandant()) {
					einheiten.get(i).setLebenActual(einheiten.get(i).getLebenActual()+heal);
					if(einheiten.get(i).getLebenActual()>einheiten.get(i).getLeben())
						einheiten.get(i).setLebenActual(einheiten.get(i).getLeben());
					System.out.println("Effekt von: " + skill.getName() + " - Die Leben von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getLebenActual()-heal) + " auf " + einheiten.get(i).getLebenActual() + " gesetzt!");

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
			
					for (int i = 0; i<targets.size(); i++) {
						
						int damage = ((teilnehmer.getSchadenActual()*skill.getSchadensMulitplikator()) * (100-targets.get(i).getRuestungProzentActual()))/100;
						
						targets.get(i).setLebenActual(targets.get(i).getLebenActual()-damage);
						
						System.out.println("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - Die Leben von " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " wurden von " + (targets.get(i).getLebenActual()+damage) + " auf " + targets.get(i).getLebenActual() + " gesetzt!" + damage + " Schaden!");
						teilnehmer.setAngerichteterSchaden(teilnehmer.getAngerichteterSchaden()+damage);
						targets.get(i).setErlittenerSchaden(targets.get(i).getErlittenerSchaden()+damage);
		
					}
					
				}
	
		public static void aufloesen(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, String effectKey) {
		
			if(effectKey == "damageBuffall")
				damageBuffAll(einheiten, bonus, spieler);
			if(effectKey == "speedBuffall")
				speedBuffAll(einheiten, bonus, spieler);
		
	}

		public static void skillAufloesen(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, String effectKey, Teilnehmer teilnehmer) {

			if(effectKey == "healAll")
				heallAll(einheiten, spieler, skill);
			if(effectKey == "damage")
				damage(einheiten, spieler, skill, teilnehmer);
			
		}

}
