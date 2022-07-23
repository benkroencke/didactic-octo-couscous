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
		this.beschreibung = name + ": Ein motivierender Schrei. Verbündete Truppen fühlen sich danach regeneriert (Heilt alle 3 Runden 10% der fehlenden Leben).";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill formationhalten() {
		
		this.name = "Formation Halten";
		this.effectKey = "heal2Units";
		this.schadensmulitplikator = 0;
		this.healPercent = 5;
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
		this.beschreibung = name + ": Pikeniere halten die Formation. Pikeniere und Heckenschützen erhalten " + healPercent + "% Leben alle " + cooldown + " Runden ";

		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill verstaerkung() {
		
		this.name = "Verstärkung";
		this.effectKey = "healAll";
		this.schadensmulitplikator = 0;
		this.healPercent = 20;
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
		this.beschreibung = name + ": Bei einem Ruf nach Verstärkungen werden die Truppen aufgestockt. Heilt alle 4 Runden 20% Leben.";

		
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

		this.beschreibung = name + ": Betäubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde für " + schadensmulitplikator + " Runden.";
		
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

		this.beschreibung = name + ": Betäubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde für " + schadensmulitplikator + " Runden.";
		
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
		
		this.beschreibung = name + ": Die Initative des Kommandanten wird um " + schadensmulitplikator + " erhöht";
		
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
		
		this.beschreibung = name + ": Der Schaden des Kommandanten wird um " + schadensmulitplikator + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill hexerausruestung() {
		
		this.name = "Hexerausrüstung";
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
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden des Kommandanten wird um " + schadensmulitplikator + " erhöht";
		
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
		
		this.beschreibung = name + ": Der Kommandant wird Immun gegen Betäuben.";
		
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
		
		this.beschreibung = name + ": Der Schaden/Initiative des Kommandanten wird um " + damageBonus + "/" + schadensmulitplikator + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill kaisergarde() {
		
		this.name = "Kaiserliche Leibgarde";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 3; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von Rittern wird um " + damageBonus + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill elite() {
		
		this.name = "Elitetruppe";
		this.effectKey = "buffDamageSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von Blauen Streifen und Ves wird um " + damageBonus + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill stratege() {
		
		this.name = "Stratege";
		this.effectKey = "buffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird um " + damageBonus + "% erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill risiko() {
		
		this.name = "Riskante Strategie";
		this.effectKey = "risk";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird um " + damageBonus + "% erhöht und die Rüstung um " + armorBoost + "% verringert";
		
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

		this.beschreibung = name + ": Betäubt den generischen Helden in jeder " + cooldown + ". Runde für " + schadensmulitplikator + " Runden.";
		
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

		this.beschreibung = name + ": Betäubt den generischen Helden in jeder " + cooldown + ". Runde für " + schadensmulitplikator + " Runden.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill grossoffensive() {
		
		this.name = "Großoffensive";
		this.effectKey = "buffDamageAllLater";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von allen Einheiten wird ab Runde " + cooldown +" um " + damageBonus + "% erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill formationstaktiken() {
		
		this.name = "Formationstaktiken";
		this.effectKey = "buffArmorSpecificUnit";
		this.schadensmulitplikator = 2; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Die Verteidigung von Schwerer Infanterie wird um " + armorBoost + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	
	public Skill ultiemhyr1() {
		
		this.name = "Der auf den Gräbern seiner Feinde tanzt";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden/Rüstung der Impera Brigade wird um " + damageBonus + "/" + armorBoost + " erhöht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill ultiemhyr2() {
		
		this.name = "Spionage";
		this.effectKey = "spy";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Ersetzt eine zufällige Einheit des gegnerischen Kommandanten durch einen Spion.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill spezialkommando() {
		
		this.name = "Spezialkommando";
		this.effectKey = "spezialkommando";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Füllt einen leeren Platz mit Ves auf. (Eine Blaue Streifen Variante).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill zwergensoeldner() {
		
		this.name = "Zwergensöldner";
		this.effectKey = "zwerge";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		this.pictureURI = "/source/diversity.png";
		
		this.beschreibung = "Ultimate: " + name + ": Füllt bis zu 2 leere Plätze mit Zwergensöldnern auf. (Schwere Infanterie).";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill foltestsstolz() {
		
		this.name = "Foltests Stolz";
		this.effectKey = "buffDamageSkillSpecificUnit";
		this.schadensmulitplikator = 4; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden von Foltest Stolz wird um " + damageBonus + " erhöht und Steinhagel wird bereits in Folge 6 ausgelöst.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill highground() {
		
		this.name = "Taktische Höhenlage";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Der Schaden/Rüstung der Heckenschützen wird um " + damageBonus + "/" + armorBoost + " erhöht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill speerfront() {
		
		this.name = "Speerfront";
		this.effectKey = "buffDamageArmor2UnitsPercent";
		this.schadensmulitplikator = 1; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden von Heckenschützen und die Rüstung der Pikeniere werden um " + damageBonus + "%/" + armorBoost + "% erhöht.";
		
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
		
		this.name = "Schildkrötenformation";
		this.effectKey = "buffDamageArmorSpecificUnit";
		this.schadensmulitplikator = 1; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden/Rüstung der Pikeniere wird um " + damageBonus + "/" + armorBoost + " erhöht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill moral() {
		
		this.name = "Moral Steigern";
		this.effectKey = "buffDamageArmorAll";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden/Rüstung aller Einheiten wird um " + damageBonus + "/" + armorBoost + " erhöht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill adel() {
		
		this.name = "Adel";
		this.effectKey = "buffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Der Schaden aller Einheiten wird um " + damageBonus + "% erhöht.";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill lazarett() {
		
		this.name = "Feldlazarett";
		this.effectKey = "healTargetsUnder50";
		this.schadensmulitplikator = 0;
		this.healPercent = 10;
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

		this.beschreibung = name + ": Ein Feldlazarett heilt deine Einheiten um " + " +" + healPercent + "%, wenn ihre Leben unter 50% fallen. Trifft " + numberOfTargets + " Ziel.";
		
		
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
		
		this.name = "Berüchtigter General";
		this.effectKey = "debuffDamageAllPercent";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
	
	public Skill waffenexpertise() {
		
		this.name = "Waffenexpertise";
		this.effectKey = "debuffArmorAllDependent";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = name + ": Die Rüstung von allen gegnerischen Einheiten wird um " + damageBonus + "% für jede Unterschiedliche Einheit in deinem Kommando verringert.";
		
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
		
		this.name = "Hübsches Gesicht";
		this.effectKey = "debuffDamageHero";
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		this.schadensmulitplikator = 0; //Kann auch id für Einheit sein, die gebufft wird
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
		
		this.beschreibung = "Ultimate: " + name + ": Die Rüstung von allen gegnerischen Einheiten wird in Runde " + cooldown + " um " + damageBonus + "% verringert";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill bluestripes() {
		
		this.name = "Anführer der Blauen Streifen";
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

		this.beschreibung = name + ": Für jeden Blauen Streifen oder Ves, wird der Schaden um " + damageBonus + " erhöht";
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, pictureURI);
	}
	
	public Skill diversitaet() {
		
		this.name = "Diversität";
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

		this.beschreibung = name + ": Für jede unterschiedliche Einheit wird der Schaden um " + damageBonus + " erhöht";
		
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
		this.beschreibung = name + ": Sollte diese Einheit auf 50% Leben oder darunter fallen, verwandelt sie sich in einen Bären. Ihr Angriffswert erhöht sich um 100%.";

		
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
		this.healPercent = 7;
		this.damageReduction = 0;
		this.armorBoost = 0;
		this.damageBonus = 0;
		this.cooldown = 2;
		this.numberOfTargets = 1;
		this.hatEile = false;
		this.ignoresArmor = false;
		this.isActive = true;
		this.isPassive = false;
		this.beschreibung = name + ": Mächtige Heilkräuter heilen deine Einheiten um " + " +" + healPercent + "%, wenn ihre Leben unter 50% fallen. Trifft " + numberOfTargets + " Ziel.";
		
		
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
		this.beschreibung = name + ": Für jede weitere Einheit dieser Art, wird die Rüstung um " + armorBoost + "% erhöht.";
		
		
		return new Skill(name, effectKey, beschreibung, schadensmulitplikator, healPercent, damageReduction, armorBoost, damageBonus,
			cooldown, numberOfTargets, hatEile, ignoresArmor, isActive,
			isPassive, "");
	}
	
	public Skill ueberfall() {
		
		this.name = "Überfall";
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
		this.beschreibung = name + ": Diese Einheit verursacht vor dem Kampf  " + schadensmulitplikator*100 + "% Schaden an gegnerischer Kavallerie. Rüstung wird ignoriert";
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
		this.beschreibung = name + ": Betäubt " + numberOfTargets + " Gegner in der " + cooldown + ". Runde .";
		
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
		if(name.equals("Großoffensive"))
			return this.grossoffensive();
		if(name.equals("Formationstaktiken"))
			return this.formationstaktiken();
		if(name.equals("Der auf den Gräbern seiner Feinde tanzt"))
			return this.ultiemhyr1();
		if(name.equals("Spionage"))
			return this.ultiemhyr2();
		if(name.equals("Artilleriebeschuss"))
			return this.artilleriebeschuss();
		if(name.equals("Schildkrötenformation"))
			return this.formation();
		if(name.equals("Loyal"))
			return this.loyal();
		if(name.equals("Hoffnung nehmen"))
			return this.hoffnung();
		if(name.equals("Doppelaktion"))
			return this.doppelAktion();
		if(name.equals("Berüchtigter General"))
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
		if(name.equals("Hexerausrüstung"))
			return this.hexerausruestung();
		if(name.equals("Nordwind"))
			return this.nordwind();
		if(name.equals("Adel"))
			return this.adel();
		if(name.equals("Hübsches Gesicht"))
			return this.gesicht();
		if(name.equals("Feldlazarett"))
			return this.lazarett();
		if(name.equals("Speerfront"))
			return this.speerfront();
		if(name.equals("Formation Halten"))
			return this.formationhalten();
		if(name.equals("Foltests Stolz"))
			return this.foltestsstolz();
		if(name.equals("Taktische Höhenlage"))
			return this.highground();
		if(name.equals("Anführer der Blauen Streifen"))
			return this.bluestripes();
		if(name.equals("Schwerttraining"))
			return this.schwerttraining();
		if(name.equals("Elitetruppe"))
			return this.elite();
		if(name.equals("Spezialkommando"))
			return this.spezialkommando();
		if(name.equals("Attentat"))
			return this.attentat();
		if(name.equals("Diversität"))
			return this.diversitaet();
		if(name.equals("Waffenexpertise"))
			return this.waffenexpertise();
		if(name.equals("Riskante Strategie"))
			return this.risiko();
		if(name.equals("Zwergensöldner"))
			return this.zwergensoeldner();
		
		
		
		
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
		if(name.equals("Überfall"))
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
