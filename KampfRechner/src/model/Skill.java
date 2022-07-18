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
	private String pictureURI;
	
	public Skill() {
		
	}
	
	public Skill(String name, String effectKey, String beschreibung, int schadensmultiplikator, int healPercent, int damageReduction, int armorBoost, int damageBonus,
			int cooldown, int numberOfTargets, boolean hatEile, boolean ignoresArmor, boolean isActive,
			boolean isPassive, String pictureURI) {
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
		this.pictureURI = pictureURI;
	}
	
	
	public Skill schlachtruf() {
		
		this.name = "Schlachtruf";
		this.effectKey = "healAll";
		this.beschreibung = name + ": Ein motivierender Schrei. Verbündete Truppen fühlen sich danach regeneriert (Heilt alle 3 Runden 10% der fehlenden Leben).";
		this.schadensmulitplikator = 0;
		this.healPercent = 10;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 99;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/schlachtruf.png";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill verstaerkung() {
		
		this.name = "Verstärkung";
		this.effectKey = "healAll";
		this.beschreibung = name + ": Bei einem Ruf nach Verstärkungen werden die Truppen aufgestockt. Heilt alle 4 Runden 35% der fehlenden Leben.";
		this.schadensmulitplikator = 0;
		this.healPercent = 35;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 4;
		this.numberOfTargets = 99;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/verstarkung.png";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill dezimieren() {
		
		this.name = "Dezimieren";
		this.effectKey = "damage";
		this.beschreibung = name + ": Ein schwerer Schwung mit der Waffe. Alle 3 Runden werden an 2 Gegnern 200% Schaden angerichtet.";
		this.schadensmulitplikator = 2;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/dezimieren.png";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill wirbelwind() {
		
		this.name = "Wirbelwind";
		this.effectKey = "damage";
		this.beschreibung = name + ": Ein wahrer Klingentanz. Alle 5 Runden werden an bis zu 4 Gegnern 800% Schaden angerichtet.";
		this.schadensmulitplikator = 6;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 5;
		this.numberOfTargets = 4;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/spinning-blades.png";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill svulblod() {
		
		this.name = "Svulblod";
		this.effectKey = "pinchBoostFactorHeal";
		this.beschreibung = name + ": Sollte diese Einheit auf 50% Leben oder darunter fallen, verwandelt sie sich in einen Bären. Ihr Angriffswert erhöht sich um 100%.";
		this.schadensmulitplikator = 1;
		this.healPercent = 25;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill blutsbruder() {
		
		this.name = "Blutsbruder";
		this.effectKey = "boostDamage1";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 10;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.beschreibung = name + ": Für jede weitere Einheit dieser Art, wird der Schaden um " + damageBonus + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill stampede() {
		
		this.name = "Stampede";
		this.effectKey = "damageSpecificRound";
		this.schadensmulitplikator = 6;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.beschreibung = name + ": Diese Einheit verursacht in der " + cooldown + ". Runde " + " +" + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Ziel(en).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill pfeilsalve() {
		
		this.name = "Pfeilsalve";
		this.effectKey = "damage";
		this.beschreibung = name + ": Diese Einheit verursacht jeder Runde " + " +" + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Ziel.";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	
	public void triggerEffekt(ArrayList<Teilnehmer> einheiten, Spieler spieler, String effectKey, Teilnehmer teilnehmer) {

		Effekt.skillAufloesen(einheiten, spieler, this, effectKey, teilnehmer);
		
	}

	public Skill erstelle(String name) {
		
		if(name.equals("Wirbelwind"))
			return this.wirbelwind();
		if(name.equals("Dezimieren"))
			return this.dezimieren();
		if(name.equals("Verstärkung"))
			return this.verstaerkung();
		if(name.equals("Schlachtruf"))
			return this.schlachtruf();
		
		
		
		
		if(name.equals("Svulblod"))
			return this.svulblod();
		if(name.equals("Blutsbruder"))
			return this.blutsbruder();
		if(name.equals("Stampede"))
			return this.stampede();
		if(name.equals("Pfeilsalve"))
			return this.pfeilsalve();
		
		
		return null;
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

	public String getPictureURI() {
		return pictureURI;
	}

	public void setPictureURI(String pictureURI) {
		this.pictureURI = pictureURI;
	}

}
