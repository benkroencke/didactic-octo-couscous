package model;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

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
	
	public static void buffDamageSpecificUnit(ArrayList<Teilnehmer> einheiten, int bonus, Spieler spieler, int id) {
		
		for (int i = 0; i<einheiten.size(); i++) {
			
			if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getId() == id) {
				einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+bonus);
				Main.battlelog.add("Der Angriffswert von " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-bonus) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");

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
		
		public static void heallAll(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer caster) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				
				
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
		
		public static void united(ArrayList<Teilnehmer> einheiten, Spieler spieler, Skill skill, Teilnehmer teilnehmer) {
			
			for (int i = 0; i<einheiten.size(); i++) {
				
				if(einheiten.get(i).getBesitzer().equals(spieler) && einheiten.get(i).getName().equals(teilnehmer.getName()) && !einheiten.get(i).equals(teilnehmer)) {
					
					if(skill.getName() == "Blutsbruder") {
						einheiten.get(i).setSchadenActual(einheiten.get(i).getSchadenActual()+skill.getDamageBonus());
						Main.battlelog.add("Effekt von: " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getSchadenActual()-skill.getDamageBonus()) + " auf " + einheiten.get(i).getSchadenActual() + " gesetzt!");
					}
					
					if(skill.getName() == "Schildwall") {
						einheiten.get(i).setRuestungProzentActual(einheiten.get(i).getRuestungProzentActual()+skill.getArmorBoost());
						Main.battlelog.add("Effekt von: " + spieler.getName() + " " + einheiten.get(i).getName() + " wurde von " + (einheiten.get(i).getRuestungProzentActual()-skill.getArmorBoost()) + " auf " + einheiten.get(i).getRuestungProzentActual() + " gesetzt!");
					}
					
				}
			}
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
					targets.get(i).setTurnsStunned(skill.getSchadensMulitplikator());
					Main.battlelog.add("Effekt von: " + teilnehmer.getBesitzer().getName() + " " + teilnehmer.getName() + "'s " + skill.getName() + " - " + targets.get(i).getBesitzer().getName() + " " + targets.get(i).getName() + " ist für " + skill.getSchadensMulitplikator() + " " + mehrere + " betäubt!");
					
				}
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
				heallAll(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "damage")
				damage(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "pinchBoostFactorHeal")
				pinchBoostFactorHeal(einheiten, spieler, skill, teilnehmer);
			if(effectKey == "united")
				united(einheiten, spieler, skill, teilnehmer);
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
			if(effectKey == "buffDamageSpecificUnit")
				buffDamageSpecificUnit(einheiten, skill.getDamageBonus(), spieler, skill.getSchadensMulitplikator());
			if(effectKey == "buffDamageAllPercent")
				buffDamageAllPercent(einheiten, skill.getDamageBonus(), spieler);
			if(effectKey == "stunHero")
				stunHero(einheiten, spieler, skill, teilnehmer);
			
			
			
			
			
		}

}
