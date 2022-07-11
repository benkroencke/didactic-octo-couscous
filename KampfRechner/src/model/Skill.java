package model;

import java.util.ArrayList;

public class Skill {
	
	private String name;
	private String effectKey;
	private String beschreibung;
	private int schadensmulitplikator;
	private int healPercent;
	private int damageReduction;
	private int armorBoost;
	private int damageBonus;
	private int cooldown;
	private int numberOfTargets;
	private boolean hatEile;
	private boolean ignoresArmor;
	private boolean isActive;
	private boolean isPassive;
	
	public Skill() {
		
	}
	
	public Skill(String name, String effectKey, String beschreibung, int schadensmultiplikator, int healPercent, int damageReduction, int armorBoost, int damageBonus,
			int cooldown, int numberOfTargets, boolean hatEile, boolean ignoresArmor, boolean isActive,
			boolean isPassive) {
		super();
		this.name = name;
		this.effectKey = effectKey;
		this.beschreibung = beschreibung;
		this.schadensmulitplikator = schadensmultiplikator;
		this.healPercent = healPercent;
		this.damageReduction = damageReduction;
		this.armorBoost = armorBoost;
		this.damageBonus = damageBonus;
		this.cooldown = cooldown;
		this.numberOfTargets = numberOfTargets;
		this.hatEile = hatEile;
		this.ignoresArmor = ignoresArmor;
		this.isActive = isActive;
		this.isPassive = isPassive;
	}
	
	
	public Skill schlachtruf() {
		
		this.name = "Schlachtruf";
		this.effectKey = "healAll";
		this.beschreibung = "Ein motivierender Schrei. Verbündete Truppen fühlen sich danach regeneriert (Heilt alle 3 Runden 20% der fehlenden Leben).";
		this.schadensmulitplikator = 0;
		this.healPercent = 20;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 99;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive);
	}
	
	
	public Skill dezimieren() {
		
		this.name = "Dezimieren";
		this.effectKey = "damage";
		this.beschreibung = "Ein schwerer Schwung mit der Waffe. Alle 3 Runden werden an 2 Gegnern 200% Schaden angerichtet.";
		this.schadensmulitplikator = 2;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 3;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive);
	}
	
	
	public void triggerEffekt(ArrayList<Teilnehmer> einheiten, Spieler spieler, String effectKey, Teilnehmer teilnehmer) {

		Effekt.skillAufloesen(einheiten, spieler, this, effectKey, teilnehmer);
		
	}

	
	
	
	public int getSchadensMulitplikator() {
		return schadensmulitplikator;
	}
	public void setSchadensMulitplikator(int schadensmultiplikator) {
		this.schadensmulitplikator = schadensmultiplikator;
	}
	public int getHealPercent() {
		return healPercent;
	}
	public void setHealPercent(int healPercent) {
		this.healPercent = healPercent;
	}
	public int getDamageReduction() {
		return damageReduction;
	}
	public void setDamageReduction(int damageReduction) {
		this.damageReduction = damageReduction;
	}
	public int getArmorBoost() {
		return armorBoost;
	}
	public void setArmorBoost(int armorBoost) {
		this.armorBoost = armorBoost;
	}
	public int getDamageBonus() {
		return damageBonus;
	}
	public void setDamageBonus(int damageBonus) {
		this.damageBonus = damageBonus;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	public int getNumberOfTargets() {
		return numberOfTargets;
	}
	public void setNumberOfTargets(int numberOfTargets) {
		this.numberOfTargets = numberOfTargets;
	}
	public boolean isHatEile() {
		return hatEile;
	}
	public void setHatEile(boolean hatEile) {
		this.hatEile = hatEile;
	}
	public boolean isIgnoresArmor() {
		return ignoresArmor;
	}
	public void setIgnoresArmor(boolean ignoresArmor) {
		this.ignoresArmor = ignoresArmor;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isPassive() {
		return isPassive;
	}
	public void setPassive(boolean isPassive) {
		this.isPassive = isPassive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffectKey() {
		return effectKey;
	}

	public void setEffectKey(String effectKey) {
		this.effectKey = effectKey;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	

}
