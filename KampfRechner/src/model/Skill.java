package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Skill implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3274697180679172860L;
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
		this.schadensmulitplikator = 0;
		this.healPercent = 8;
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
		this.beschreibung = name + ": Ein motivierender Schrei. Verb�ndete Truppen f�hlen sich danach regeneriert (Heilt alle 3 Runden 8% der fehlenden Leben).";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill abschiedsgeschenk() {
		
		this.name = "Abschiedsgeschenk";
		this.effectKey = "healAll";
		this.schadensmulitplikator = 0;
		this.healPercent = 25;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 8;
		this.numberOfTargets = 99;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/lazarett.png";
		this.beschreibung = name + ": In runde 8 werden alle Einheiten um 25% geheilt.";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill formationhalten() {
		
		this.name = "Formation Halten";
		this.effectKey = "heal2Units";
		this.schadensmulitplikator = 0;
		this.healPercent = 4;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/formationstaktiken.png";
		this.beschreibung = name + ": Pikeniere halten die Formation. Pikeniere und Heckensch�tzen erhalten " + healPercent + "% Leben alle " + cooldown + " Runden ";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill verstaerkung() {
		
		this.name = "Verst�rkung";
		this.effectKey = "healAll";
		this.schadensmulitplikator = 0;
		this.healPercent = 14;
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
		this.beschreibung = name + ": Bei einem Ruf nach Verst�rkungen werden die Truppen aufgestockt. Heilt alle 4 Runden 14% Leben.";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill dezimieren() {
		
		this.name = "Dezimieren";
		this.effectKey = "damage";
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
		this.beschreibung = name + ": Ein schwerer Schwung mit der Waffe. Alle 3 Runden werden an 2 Gegnern 200% Schaden angerichtet.";


		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill wirbelwind() {
		
		this.name = "Wirbelwind";
		this.effectKey = "damage";
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
		this.beschreibung = name + ": Ein wahrer Klingentanz. Alle 5 Runden werden an bis zu 4 Gegnern 600% Schaden angerichtet.";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill spalten() {
		
		this.name = "Spalten";
		this.effectKey = "damageInit";
		this.schadensmulitplikator = 3;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 4;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/hammer.png";
		this.beschreibung = name + ": Ein schneller Klingentanz. Alle 3 Runden werden an bis zu 4 Gegnern 300% Schaden (ausgehend der Initiative) angerichtet.";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill verhaften() {
		
		this.name = "Verhaften";
		this.effectKey = "stunOnce";
		this.schadensmulitplikator = 3;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 4;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/verhaften.png";

		this.beschreibung = name + ": Bet�ubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill yrden() {
		
		this.name = "Yrden";
		this.effectKey = "stunOnce";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/yrden.png";

		this.beschreibung = name + ": Bet�ubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill hoffnung() {
		
		this.name = "Hoffnung nehmen";
		this.effectKey = "stunOnce";
		this.schadensmulitplikator = 3;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 8;
		this.numberOfTargets = 4;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/hoffnung.png";

		this.beschreibung = name + ": Bet�ubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill ungeduldige() {
		
		this.name = "Der Ungeduldige";
		this.effectKey = "speedBuffCommander";
		this.schadensmulitplikator = 50;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/ungeduldige.png";
		
		this.beschreibung = name + ": Die Initative des Kommandanten wird um " + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill wikinger() {
		
		this.name = "Wikinger";
		this.effectKey = "damageInitBuffCommander";
		this.schadensmulitplikator = 35;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 35;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/wikinger.png";
		
		this.beschreibung = name + ": Der Schaden/Initiative des Kommandanten wird um " + damageBonus + "/" + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill loyal() {
		
		this.name = "Loyal";
		this.effectKey = "damageBuffCommander";
		this.schadensmulitplikator = 40;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/loyal.png";
		
		this.beschreibung = name + ": Der Schaden des Kommandanten wird um " + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill hexerausruestung() {
		
		this.name = "Hexerausr�stung";
		this.effectKey = "damageBuffCommander";
		this.schadensmulitplikator = 75;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/hexerausruestung.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden des Kommandanten wird um " + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill berserker() {
		
		this.name = "Berserker";
		this.effectKey = "damageBuffCommander";
		this.schadensmulitplikator = 85;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/berserker.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden des Kommandanten wird um " + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill quen() {
		
		this.name = "Quen";
		this.effectKey = "stunImmune";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/quen.png";
		
		this.beschreibung = name + ": Der Kommandant wird Immun gegen Bet�uben.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill hexerausbildung() {
		
		this.name = "Hexerausbildung";
		this.effectKey = "damageInitBuffCommander";
		this.schadensmulitplikator = 30;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 30;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/moral.png";
		
		this.beschreibung = name + ": Der Schaden/Initiative des Kommandanten wird um " + damageBonus + "/" + schadensmulitplikator + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill kaisergarde() {
		
		this.name = "Kaiserliche Leibgarde";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 3; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 50; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/kaisergarde.png";
		
		this.beschreibung = name + ": Der Schaden von Rittern wird um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill elite() {
		
		this.name = "Elitetruppe";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 35; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/elite.png";
		
		this.beschreibung = name + ": Der Schaden von Blauen Streifen und Ves wird um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill stratege() {
		
		this.name = "Stratege";
		this.effectKey = "buffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 15; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/stratege.png";
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird um " + damageBonus + "% erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill risiko() {
		
		this.name = "Riskante Strategie";
		this.effectKey = "risk";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 5;
		this.damageBonus = 30; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/stratege.png";
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird um " + damageBonus + "% erh�ht und die R�stung um " + armorBoost + "% verringert";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill intrige() {
		
		this.name = "Intrige";
		this.effectKey = "stunHero";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/intrige.png";

		this.beschreibung = name + ": Bet�ubt den generischen Helden in jeder " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill betauben() {
		
		this.name = "Bet�uben";
		this.effectKey = "stunHeroOnce";
		this.schadensmulitplikator = 2;
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
		this.pictureURI = "/source/kopfschlag.png";

		this.beschreibung = name + ": Bet�ubt den generischen Helden in jeder " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill belagerung() {
		
		this.name = "Belagerung";
		this.effectKey = "stunHero";
		this.schadensmulitplikator = 2;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 4;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/belagerung.png";

		this.beschreibung = name + ": Bet�ubt den generischen Helden in jeder " + cooldown + ". Runde f�r " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill grossoffensive() {
		
		this.name = "Gro�offensive";
		this.effectKey = "buffDamageAllLater";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 200; //Bei Schadensbonus
		this.cooldown = 8;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/grossoffensive.png";
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird ab Runde " + cooldown +" um " + damageBonus + "% erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill formationstaktiken() {
		
		this.name = "Formationstaktiken";
		this.effectKey = "buffArmorSpecificUnit";
		this.schadensmulitplikator = 2; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 15;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/formationstaktiken.png";
		
		this.beschreibung = name + ": Die Verteidigung von Schwerer Infanterie wird um " + armorBoost + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill ehrenvollerkampf() {
		
		this.name = "Ehrenvoller Kampf";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 2; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 30; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/ungeduldige.png";
		
		this.beschreibung = name + ": Der Schadenswert von Schildmaiden und Svulblod Fanatikern wird um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill pilze() {
		
		this.name = "Berauschende Pilze";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 2; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 50; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/pilze.png";
		
		this.beschreibung = name + ": Der Schadenswert von Svulblod Fanatikern wird um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill flotte() {
		
		this.name = "Flottenf�hrer";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 3; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 5;
		this.damageBonus = 15; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/flotte.png";
		
		this.beschreibung = name + ": Der Schaden/R�stung der An Craite Langschiffe wird um " + damageBonus + "/" + armorBoost + " erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill ultiemhyr1() {
		
		this.name = "Der auf den Gr�bern seiner Feinde tanzt";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 15;
		this.damageBonus = 50; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/graber.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden/R�stung der Impera Brigade wird um " + damageBonus + "/" + armorBoost + " erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill ultiemhyr2() {
		
		this.name = "Spionage";
		this.effectKey = "spy";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 1; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/spionage.png";
		
		this.beschreibung = "Ultimate: " + name + ": Ersetzt eine zuf�llige Einheit des gegnerischen Kommandanten durch einen Spion.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill illusionsmagie() {
		
		this.name = "M�chtige Illusionsmagie";
		this.effectKey = "setAll50percent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 2;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/graber.png";
		
		this.beschreibung = "Ultimate: " + name + ": Setzt die Leben aller Einheiten auf 50% (auch Verb�ndete) ihres Standardwertes, wenn die Einheit nicht bereits Tod ist. Betrifft allerdings maximal nur so viele Einheiten, die auch unter M�ussacks Kommando sind.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill spezialkommando() {
		
		this.name = "Spezialkommando";
		this.effectKey = "spezialkommando";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 1; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/spezialkommando.png";
		
		this.beschreibung = "Ultimate: " + name + ": F�llt einen leeren Platz mit Ves auf. (Eine Blaue Streifen Variante).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill zwergensoeldner() {
		
		this.name = "Zwergens�ldner";
		this.effectKey = "zwerge";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 1; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/hammer.png";
		
		this.beschreibung = "Ultimate: " + name + ": F�llt bis zu 2 leere Pl�tze mit Zwergens�ldnern auf. (Schwere Infanterie).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill foltestsstolz() {
		
		this.name = "Foltests Stolz";
		this.effectKey = "buffDamageSkillSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 30; //Bei Schadensbonus
		this.cooldown = 6;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/folteststolz.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden von Foltest Stolz wird um " + damageBonus + " erh�ht und Steinhagel wird bereits in Folge 6 ausgel�st.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill magischebombe() {
		
		this.name = "Magische Bombe";
		this.effectKey = "magischeBombe";
		this.schadensmulitplikator = 100; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 4;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/magischebombe.png";
		
		this.beschreibung = "Ultimate: " + name + ": Magieexplosion wird nun in Runde 4 und 8 ausgel�st.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill mutagene() {
		
		this.name = "Mutagene";
		this.effectKey = "mutagene";
		this.schadensmulitplikator = 100; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 1;
		this.armorBoost = 1;
		this.damageBonus = 1; //Bei Schadensbonus
		this.cooldown = 1;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/mutagene.png";
		
		this.beschreibung = "Ultimate: " + name + ": Alle Hexerzeichen verbessen sich in ihrer Wirkung(Igni +25 Magieschaden, Aard +50 Magieschaden, Yrden bet�ubt f�r 3 Runden und Axii l�st nun jede 2. Runde aus).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill drakkar() {
		
		this.name = "Drakkar";
		this.effectKey = "buffSkillSpecificUnitTargets";
		this.schadensmulitplikator = 3; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 2;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/drakkar.png";
		
		this.beschreibung = "Ultimate: " + name + ": Pfeilhagel von An Craite Langschiffen trifft nun 2 Gegner.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill highground() {
		
		this.name = "Taktische H�henlage";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 5;
		this.damageBonus = 50; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/highground.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden/R�stung der Heckensch�tzen wird um " + damageBonus + "/" + armorBoost + " erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill speerfront() {
		
		this.name = "Speerfront";
		this.effectKey = "buffDamageArmor2UnitsPercent";
		this.schadensmulitplikator = 1; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 15;
		this.damageBonus = 15; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/speerfront.png";
		
		this.beschreibung = name + ": Der Schaden von Heckensch�tzen und die R�stung der Pikeniere werden um " + damageBonus + "%/" + armorBoost + "% erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill artilleriebeschuss() {
		
		this.name = "Artilleriebeschuss";
		this.effectKey = "damage";
		this.schadensmulitplikator = 5;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 8;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/artillery.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill zeitsprung() {
		
		this.name = "Zeitsprung";
		this.effectKey = "damage";
		this.schadensmulitplikator = 3;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 5;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/zeitsprung.png";

		this.beschreibung = "Ultimate: " + name + " - Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill wilderhieb() {
		
		this.name = "Wilder Hieb";
		this.effectKey = "damage";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 5;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/dezimieren.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill greifentechnik() {
		
		this.name = "Greifentechnik";
		this.effectKey = "damage";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 4;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/greifentechnik.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill blitzschlag() {
		
		this.name = "Blitzschlag";
		this.effectKey = "magicDamageDoubleWeak";
		this.schadensmulitplikator = 200;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 3;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/blitzschlag.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen. Der Schaden wird gegen Ritter verdoppelt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill magischerknall() {
		
		this.name = "Magischer Knall";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 75;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 2;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/explosion.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill vellaglan() {
		
		this.name = "Vella Glan";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 290;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 2;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/explosion.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Ziel.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill feuerball() {
		
		this.name = "Feuerball";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 345;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 3;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/feuerball.png";

		this.beschreibung = name + ": Verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill feuerhagel() {
		
		this.name = "Merigold Feuerhagel";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 245;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 3;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/feuerhagel.png";

		this.beschreibung = "Ultimate: " + name + " - Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill igni() {
		
		this.name = "Igni";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 75;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 1;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/igni.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill erdrutsch() {
		
		this.name = "Erdrutsch";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 375;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 2;
		this.cooldown = 5;
		this.numberOfTargets = 6;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/erdrutsch.png";

		this.beschreibung = "Ultimate: " + name + " - Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill magieexplosion() {
		
		this.name = "Magieexplosion";
		this.effectKey = "magicDamage";
		this.schadensmulitplikator = 400;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 7;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/magieexplosion.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill vampirrauch() {
		
		this.name = "Vampirrauch";
		this.effectKey = "magicDamageLifeSteal";
		this.schadensmulitplikator = 250;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/vampirrauch.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen. Die gleiche Anzahl Verb�ndeter Truppenverb�nde wird geheilt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill tiefewunden() {
		
		this.name = "Tiefe Wunden";
		this.effectKey = "damageHealReduction";
		this.schadensmulitplikator = 1;
		this.healPercent = 2;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/wunden.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen. Heilung der Ziele wird f�r " + healPercent + " Runden verhindert.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill kopfschlag() {
		
		this.name = "Kopfschlag";
		this.effectKey = "damageStun";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 1;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/kopfschlag.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen. Sie werden f�r " + damageReduction + " Runde bet�ubt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill aard() {
		
		this.name = "Aard";
		this.effectKey = "magicDamageStun";
		this.schadensmulitplikator = 100;
		this.healPercent = 0;
		this.damageReduction = 1;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/aard.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen. Sie werden f�r " + damageReduction + " Runde bet�ubt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill feuerbombe() {
		
		this.name = "Feuerbombe";
		this.effectKey = "magicDamageStun";
		this.schadensmulitplikator = 225;
		this.healPercent = 0;
		this.damageReduction = 1;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 4;
		this.numberOfTargets = 4;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/feuerbombe.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator + " Magieschaden an " + numberOfTargets + " Zielen. Sie werden f�r " + damageReduction + " Runde bet�ubt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill weisserwolf() {
		
		this.name = "Wei�er Wolf";
		this.effectKey = "damageStun";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 2;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 5;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/weisserwolf.png";

		this.beschreibung = "Ultimate: " + name + " - Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen. Sie werden f�r " + damageReduction + " Runden bet�ubt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill barentechnik() {
		
		this.name = "B�rentechnik";
		this.effectKey = "damageStun";
		this.schadensmulitplikator = 5;
		this.healPercent = 0;
		this.damageReduction = 2;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 4;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/barentechnik.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Truppe. Sie werden f�r " + damageReduction + " Runden bet�ubt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill finalerschlag() {
		
		this.name = "Finaler Schlag";
		this.effectKey = "damage";
		this.schadensmulitplikator = 5;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 9;
		this.numberOfTargets = 3;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/finalerschlag.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill wolfstechnik() {
		
		this.name = "Wolfstechnik";
		this.effectKey = "damage";
		this.schadensmulitplikator = 2;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 2;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/wolfstechnik.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill attentat() {
		
		this.name = "Attentat";
		this.effectKey = "damage";
		this.schadensmulitplikator = 10;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 3;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/finalerschlag.png";

		this.beschreibung = "Ultimate: " + name + " - Dieser Kommandant verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill viper() {
		
		this.name = "Viperntechnik";
		this.effectKey = "damage";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/viper.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in jeder Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Ziel.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill mordanschlag() {
		
		this.name = "Mordanschlag";
		this.effectKey = "damageSpecificRound";
		this.schadensmulitplikator = 6;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 1;
		this.hatEile = true;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/mordanschlag.png";

		this.beschreibung = name + ": Dieser Kommandant verursacht in der " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Ziel.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill formation() {
		
		this.name = "Schildkr�tenformation";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 1; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 10;
		this.damageBonus = 25; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/formationstaktiken.png";
		
		this.beschreibung = name + ": Der Schaden/R�stung der Pikeniere wird um " + damageBonus + "/" + armorBoost + " erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill moral() {
		
		this.name = "Moral Steigern";
		this.effectKey = "buffDamageArmorAll";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 10;
		this.damageBonus = 20; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/moral.png";
		
		this.beschreibung = name + ": Der Schaden/R�stung aller Einheiten wird um " + damageBonus + "/" + armorBoost + " erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill adel() {
		
		this.name = "Adel";
		this.effectKey = "buffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 15; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/loyal.png";
		
		this.beschreibung = name + ": Der Schaden aller Einheiten wird um " + damageBonus + "% erh�ht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill lazarett() {
		
		this.name = "Feldlazarett";
		this.effectKey = "healTargetsUnder50";
		this.schadensmulitplikator = 0;
		this.healPercent = 6;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.pictureURI = "/source/lazarett.png";

		this.beschreibung = name + ": Ein Feldlazarett heilt deine Einheiten um " + " +" + healPercent + "%, wenn ihre Leben unter 50% fallen. Trifft " + numberOfTargets + " Ziel (Kann nicht verhindert werden).";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill doppelAktion() {
		
		this.name = "Doppelaktion";
		this.effectKey = "doubleAttack";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/doubleattack.png";

		this.beschreibung = "Ultimate: " + name + ": Dieser Kommandant hat eine " + 100 + "% Chance 2 Mal anzugreifen.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill general() {
		
		this.name = "Ber�chtigter General";
		this.effectKey = "debuffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 20; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/general.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden von allen gegnerischen Einheiten wird um " + damageBonus + "% verringert,";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill beraterin() {
		
		this.name = "Beraterin des K�nigs";
		this.effectKey = "debuffArmorAllPercentOnce";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 20;
		this.damageBonus = 20; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/general.png";
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden von allen gegnerischen Einheiten wird um " + damageBonus + "% verringert,";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill waffenexpertise() {
		
		this.name = "Waffenexpertise";
		this.effectKey = "debuffArmorAllDependent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 3;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/waffenexpertise.png";
		
		this.beschreibung = name + ": Die R�stung von allen gegnerischen Einheiten wird um " + armorBoost + "% f�r jede Unterschiedliche Einheit in deinem Kommando verringert.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill zerkrachen() {
		
		this.name = "R�stung zerkrachen";
		this.effectKey = "debuffArmorAll";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 10;
		this.damageBonus = 0; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/waffenexpertise.png";
		
		this.beschreibung = name + ": Die R�stung von allen gegnerischen Einheiten wird um " + armorBoost + "% verringert.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill schwerttraining() {
		
		this.name = "Schwerttraining";
		this.effectKey = "doubleAttack";
		this.schadensmulitplikator = 40;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/doubleattack.png";

		this.beschreibung = name + ": Dieser Kommandant hat eine " + (100-cooldown) + "% Chance 2 Mal anzugreifen.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill gesicht() {
		
		this.name = "H�bsches Gesicht";
		this.effectKey = "debuffDamageHero";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 10; //Bei Schadensbonus
		this.cooldown = 99;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/hubschesgesicht.png";
		
		this.beschreibung = name + ": Der Schaden des gegnerischen Kommandanten wird um " + damageBonus + "% verringert.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill nordwind() {
		
		this.name = "Nordwind";
		this.effectKey = "debuffArmorAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 100; //Bei Schadensbonus
		this.cooldown = 8;
		this.numberOfTargets = 0; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/nordwind.png";
		
		this.beschreibung = "Ultimate: " + name + ": Die R�stung von allen gegnerischen Einheiten wird in Runde " + cooldown + " um " + damageBonus + "% verringert";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill axii() {
		
		this.name = "Axii";
		this.effectKey = "debuffArmorPercent";
		this.schadensmulitplikator = 0; //Kann auch id f�r Einheit sein, die gebufft wird
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 100; //Bei Schadensbonus
		this.cooldown = 4;
		this.numberOfTargets = 1; 
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.pictureURI = "/source/axii.png";
		
		this.beschreibung = name + ": Die R�stung von einer gegnerischen Einheit wird in Runde " + cooldown + " um " + damageBonus + "% verringert";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill bluestripes() {
		
		this.name = "Anf�hrer der Blauen Streifen";
		this.effectKey = "united";
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
		this.pictureURI = "/source/general.png";

		this.beschreibung = name + ": F�r jeden Blauen Streifen oder Ves, wird der Schaden um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill drummoldformation() {
		
		this.name = "Drummold Formation";
		this.effectKey = "united";
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
		this.pictureURI = "/source/drakkar.png";

		this.beschreibung = name + ": F�r jede Drummold Schildmaild wird der Schaden von Brokvar Bogensch�tzen um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill diversitaet() {
		
		this.name = "Diversit�t";
		this.effectKey = "diversity";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 20;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.pictureURI = "/source/diversity.png";

		this.beschreibung = name + ": F�r jede unterschiedliche Einheit wird der Schaden um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill svulblod() {
		
		this.name = "Svulblod";
		this.effectKey = "pinchBoostFactorHeal";
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
		this.beschreibung = name + ": Sollte diese Einheit auf 50% Leben oder darunter fallen, verwandelt sie sich in einen B�ren. Ihr Angriffswert erh�ht sich um 100% (Kann nicht verhindert werden).";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill bluttrinken() {
		
		this.name = "Blut trinken";
		this.effectKey = "pinchBoostFactorHeal";
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
		this.beschreibung = name + ": Sollte diese Einheit auf 50% Leben oder darunter fallen, verwandelt sie sich in einen B�ren. Ihr Angriffswert erh�ht sich um 100% (Kann nicht verhindert werden).";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill blutsbruder() {
		
		this.name = "Blutsbruder";
		this.effectKey = "united";
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
		this.beschreibung = name + ": F�r jede weitere Einheit dieser Art, wird der Schaden um " + damageBonus + " erh�ht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill stampede() {
		
		this.name = "Stampede";
		this.effectKey = "damageSpecificRound";
		this.schadensmulitplikator = 5;
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
		this.beschreibung = name + ": Diese Einheit verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Ziel.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill heilkraut() {
		
		this.name = "Heilkraut";
		this.effectKey = "healTargetsUnder50";
		this.schadensmulitplikator = 0;
		this.healPercent = 4;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.beschreibung = name + ": M�chtige Heilkr�uter heilen deine Einheiten um " + " +" + healPercent + "%, wenn ihre Leben unter 50% fallen. Trifft " + numberOfTargets + " Ziel (Kann nicht verhindert werden).";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill schildwall() {
		
		this.name = "Schildwall";
		this.effectKey = "united";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 5;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.beschreibung = name + ": F�r jede weitere Einheit dieser Art, wird die R�stung um " + armorBoost + "% erh�ht.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill ueberfall() {
		
		this.name = "�berfall";
		this.effectKey = "damage";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 5;
		this.numberOfTargets = 1;
		this.hatEile = true;
		this.ignoresArmor = true;
		this.isActive = true;
		this.isPassive = false;
		this.beschreibung = name + ": Diese Einheit verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an gegnerischer Schwerer Infanterie.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill stahlpanzer() {
		
		this.name = "Stahlpanzer";
		this.effectKey = "reduceDamagePercent";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 10;
		this.armorBoost = 0;
		this.damageBonus = 10;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.beschreibung = name + ": Jeglicher Schaden wird um " + damageReduction + "% reduziert.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill stachelschwein() {
		
		this.name = "Stachelschwein";
		this.effectKey = "eileDamage";
		this.schadensmulitplikator = 1;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 1;
		this.numberOfTargets = 1;
		this.hatEile = true;
		this.ignoresArmor = true;
		this.isActive = false;
		this.isPassive = false;
		this.beschreibung = name + ": Diese Einheit verursacht vor dem Kampf  " + schadensmulitplikator*100 + "% Schaden an gegnerischer Kavallerie. R�stung wird ignoriert";
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill konterstellung() {
		
		this.name = "Konterstellung";
		this.effectKey = "konter";
		this.schadensmulitplikator = 30;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.beschreibung = name + ": Diese Einheit verursacht nachdem sie angegriffen wird, an dem Angreifer " + schadensmulitplikator + "% Schaden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill doubleAttack() {
		
		this.name = "Doppelschlag";
		this.effectKey = "doubleAttack";
		this.schadensmulitplikator = 40;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.beschreibung = name + ": Diese Einheit hat eine " + (100-schadensmulitplikator) + "% Chance 2 Mal anzugreifen.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill vorbereitung() {
		
		this.name = "Vorbereitung";
		this.effectKey = "noDamageFirstRound";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 100;
		this.armorBoost = 0;
		this.damageBonus = 10;
		this.cooldown = 1;
		this.numberOfTargets = 0;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = true;
		this.beschreibung = name + ": Der Schaden der 1. Runde wird in der 2. Runde wiederhergestellt.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill steinhagel() {
		
		this.name = "Steinhagel";
		this.effectKey = "damage";
		this.schadensmulitplikator = 5;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 8;
		this.numberOfTargets = 8;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.beschreibung = name + ": Diese Einheit verursacht in jeder " + cooldown + ". Runde " + schadensmulitplikator*100 + "% Schaden an " + numberOfTargets + " Zielen.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill festnageln() {
		
		this.name = "Festnageln";
		this.effectKey = "stunOnce";
		this.schadensmulitplikator = 1;
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
		this.beschreibung = name + ": Bet�ubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde .";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill noability() {
		
		this.name = "No Ability";
		this.effectKey = "nichts";
		this.schadensmulitplikator = 0;
		this.healPercent = 0;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 99;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = false;
		this.isPassive = false;
		this.beschreibung = "Diese Einheit besitzt keine F�higkeit.";
		
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
		if(name.equals("Verst�rkung"))
			return this.verstaerkung();
		if(name.equals("Schlachtruf"))
			return this.schlachtruf();
		if(name.equals("Verhaften"))
			return this.verhaften();
		if(name.equals("Der Ungeduldige"))
			return this.ungeduldige();
		if(name.equals("Kaiserliche Leibgarde"))
			return this.kaisergarde();
		if(name.equals("Stratege"))
			return this.stratege();
		if(name.equals("Intrige"))
			return this.intrige();
		if(name.equals("Belagerung"))
			return this.belagerung();
		if(name.equals("Gro�offensive"))
			return this.grossoffensive();
		if(name.equals("Formationstaktiken"))
			return this.formationstaktiken();
		if(name.equals("Der auf den Gr�bern seiner Feinde tanzt"))
			return this.ultiemhyr1();
		if(name.equals("Spionage"))
			return this.ultiemhyr2();
		if(name.equals("Artilleriebeschuss"))
			return this.artilleriebeschuss();
		if(name.equals("Schildkr�tenformation"))
			return this.formation();
		if(name.equals("Loyal"))
			return this.loyal();
		if(name.equals("Hoffnung nehmen"))
			return this.hoffnung();
		if(name.equals("Doppelaktion"))
			return this.doppelAktion();
		if(name.equals("Ber�chtigter General"))
			return this.general();
		if(name.equals("Moral Steigern"))
			return this.moral();
		if(name.equals("Viperntechnik"))
			return this.viper();
		if(name.equals("Mordanschlag"))
			return this.mordanschlag();
		if(name.equals("Hexerausbildung"))
			return this.hexerausbildung();
		if(name.equals("Wilder Hieb"))
			return this.wilderhieb();
		if(name.equals("Finaler Schlag"))
			return this.finalerschlag();
		if(name.equals("Quen"))
			return this.quen();
		if(name.equals("Hexerausr�stung"))
			return this.hexerausruestung();
		if(name.equals("Nordwind"))
			return this.nordwind();
		if(name.equals("Adel"))
			return this.adel();
		if(name.equals("H�bsches Gesicht"))
			return this.gesicht();
		if(name.equals("Feldlazarett"))
			return this.lazarett();
		if(name.equals("Speerfront"))
			return this.speerfront();
		if(name.equals("Formation Halten"))
			return this.formationhalten();
		if(name.equals("Foltests Stolz"))
			return this.foltestsstolz();
		if(name.equals("Taktische H�henlage"))
			return this.highground();
		if(name.equals("Anf�hrer der Blauen Streifen"))
			return this.bluestripes();
		if(name.equals("Schwerttraining"))
			return this.schwerttraining();
		if(name.equals("Elitetruppe"))
			return this.elite();
		if(name.equals("Spezialkommando"))
			return this.spezialkommando();
		if(name.equals("Attentat"))
			return this.attentat();
		if(name.equals("Diversit�t"))
			return this.diversitaet();
		if(name.equals("Waffenexpertise"))
			return this.waffenexpertise();
		if(name.equals("Riskante Strategie"))
			return this.risiko();
		if(name.equals("Zwergens�ldner"))
			return this.zwergensoeldner();
		if(name.equals("R�stung zerkrachen"))
			return this.zerkrachen();
		if(name.equals("Flottenf�hrer"))
			return this.flotte();
		if(name.equals("Tiefe Wunden"))
			return this.tiefewunden();
		if(name.equals("Kopfschlag"))
			return this.kopfschlag();
		if(name.equals("Wikinger"))
			return this.wikinger();
		if(name.equals("Drakkar"))
			return this.drakkar();
		if(name.equals("Berserker"))
			return this.berserker();
		if(name.equals("Drummold Formation"))
			return this.drummoldformation();
		if(name.equals("Ehrenvoller Kampf"))
			return this.ehrenvollerkampf();
		if(name.equals("Abschiedsgeschenk"))
			return this.abschiedsgeschenk();
		if(name.equals("Blitzschlag"))
			return this.blitzschlag();
		if(name.equals("Magischer Knall"))
			return this.magischerknall();
		if(name.equals("Magieexplosion"))
			return this.magieexplosion();
		if(name.equals("Berauschende Pilze"))
			return this.pilze();
		if(name.equals("M�chtige Illusionsmagie"))
			return this.illusionsmagie();
		if(name.equals("Magische Bombe"))
			return this.magischebombe();
		if(name.equals("Vampirrauch"))
			return this.vampirrauch();
		if(name.equals("B�rentechnik"))
			return this.barentechnik();
		if(name.equals("Greifentechnik"))
			return this.greifentechnik();
		if(name.equals("Wolfstechnik"))
			return this.wolfstechnik();
		if(name.equals("Axii"))
			return this.axii();
		if(name.equals("Igni"))
			return this.igni();
		if(name.equals("Aard"))
			return this.aard();
		if(name.equals("Yrden"))
			return this.yrden();
		if(name.equals("Wei�er Wolf"))
			return this.weisserwolf();
		if(name.equals("Mutagene"))
			return this.mutagene();
		if(name.equals("Zeitsprung"))
			return this.zeitsprung();
		if(name.equals("Vella Glan"))
			return this.vellaglan();
		if(name.equals("Bet�uben"))
			return this.betauben();
		if(name.equals("Erdrutsch"))
			return this.erdrutsch();
		if(name.equals("Feuerball"))
			return this.feuerball();
		if(name.equals("Feuerbombe"))
			return this.feuerbombe();
		if(name.equals("Merigold Feuerhagel"))
			return this.feuerhagel();
		if(name.equals("Beraterin des K�nigs"))
			return this.beraterin();
		if(name.equals("Spalten"))
			return this.spalten();
		
		
		if(name.equals("Svulblod"))
			return this.svulblod();
		if(name.equals("Blutsbruder"))
			return this.blutsbruder();
		if(name.equals("Stampede"))
			return this.stampede();
		if(name.equals("Pfeilsalve"))
			return this.pfeilsalve();
		if(name.equals("Heilkraut"))
			return this.heilkraut();
		if(name.equals("Schildwall"))
			return this.schildwall();
		if(name.equals("�berfall"))
			return this.ueberfall();
		if(name.equals("Stahlpanzer"))
			return this.stahlpanzer();
		if(name.equals("Stachelschwein"))
			return this.stachelschwein();
		if(name.equals("Konterstellung"))
			return this.konterstellung();
		if(name.equals("Doppelschlag"))
			return this.doubleAttack();
		if(name.equals("Vorbereitung"))
			return this.vorbereitung();
		if(name.equals("Steinhagel"))
			return this.steinhagel();
		if(name.equals("Festnageln"))
			return this.festnageln();
		if(name.equals("No Ability"))
			return this.noability();
		if(name.equals("Blut trinken"))
			return this.bluttrinken();
		
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
