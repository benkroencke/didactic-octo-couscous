package model;

import java.util.ArrayList;

public class Artefakt {

	
	private String name;
	private String beschreibung;
	private String pictureURI;
	private String effectKey;
	private int bonus;
	private boolean istKampfEffekt;
	private int cooldown = 99;

	
	
	public Artefakt(String name, String beschreibung, String pictureURI, String effectKey, int bonus, boolean istKampfEffekt, int cooldown) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		this.effectKey = effectKey;
		this.bonus = bonus;
		this.pictureURI = pictureURI;
		this.cooldown = cooldown;
	}
	
	public Artefakt() {
	}
	
	public Artefakt krummsaebel1() {
		
		this.name = "Krummsäbel";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 14;
		this.beschreibung = name + ": " + "Ein solider Säbel. " + bonus + " Schaden für den Kommandanten.";

		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt krummsaebel2() {
		
		this.name = "Krummsäbel+1";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 21;
		this.beschreibung = name + ": " + "Ein solider Säbel. " + bonus + " Schaden für den Kommandanten.";

		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}

	public Artefakt krummsaebel3() {
		
		this.name = "Krummsäbel+2";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 28;
		this.beschreibung = name + ": " + "Ein solider Säbel. " + bonus + " Schaden für den Kommandanten.";

		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt koenigsamulett1() {
		
		this.name = "Königsamulett";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt koenigsamulett2() {
		
		this.name = "Königsamulett+1";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 9;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt koenigsamulett3() {
		
		this.name = "Königsamulett+2";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt donner1() {
		
		this.name = "Donner";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt donner2() {
		
		this.name = "Donner+1";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 30;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt donner3() {
		
		this.name = "Donner+2";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 40;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt ploetze1() {
		
		this.name = "Plötze";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 18;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt ploetze2() {
		
		this.name = "Plötze+1";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 27;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt ploetze3() {
		
		this.name = "Plötze+2";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 36;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt emmentaler1() {
		
		this.name = "Emmentaler";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es riecht immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt emmentaler2() {
		
		this.name = "Emmentaler+1";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es riecht immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt emmentaler3() {
		
		this.name = "Emmentaler+2";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 16;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es riecht immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt standarte1() {
		
		this.name = "Banner vom grauen Fähnlein";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 10;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt standarte2() {
		
		this.name = "Banner vom grauen Fähnlein+1";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 15;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt standarte3() {
		
		this.name = "Banner vom grauen Fähnlein+2";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt aerondight1() {
		
		this.name = "Aerondight";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 10;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt aerondight2() {
		
		this.name = "Aerondight+1";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 15;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt aerondight3() {
		
		this.name = "Aerondight+2";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt aerondight4() {
		
		this.name = "Aerondight+3";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 75;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt kriegstrommeln1() {
		
		this.name = "Kriegstrommel";
		this.pictureURI = "/source/kriegstrommeln.png";
		this.effectKey = "buffDamageArmorAll";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Moral steigernde Trommel. +" + bonus + " Schaden und Rüstung für alle Verbündeten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt kriegstrommeln2() {
		
		this.name = "Kriegstrommel+1";
		this.pictureURI = "/source/kriegstrommeln.png";
		this.effectKey = "buffDamageArmorAll";
		this.bonus = 9;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Moral steigernde Trommel. +" + bonus + " Schaden und Rüstung für alle Verbündeten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt kriegstrommeln3() {
		
		this.name = "Kriegstrommel+2";
		this.pictureURI = "/source/kriegstrommeln.png";
		this.effectKey = "buffDamageArmorAll";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Moral steigernde Trommel. +" + bonus + " Schaden und Rüstung für alle Verbündeten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt schaufeln1() {
		
		this.name = "Schaufeln";
		this.pictureURI = "/source/schaufeln.png";
		this.effectKey = "debuffDamageAllPercent";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Diese Schaufeln können benutzt werden um Fallen zu graben. -" + bonus + "% Schaden für die gegnerischen Einheiten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt schaufeln2() {
		
		this.name = "Schaufeln+1";
		this.pictureURI = "/source/schaufeln.png";
		this.effectKey = "debuffDamageAllPercent";
		this.bonus = 9;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Diese Schaufeln können benutzt werden um Fallen zu graben. -" + bonus + "% Schaden für die gegnerischen Einheiten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt schaufeln3() {
		
		this.name = "Schaufeln+2";
		this.pictureURI = "/source/schaufeln.png";
		this.effectKey = "debuffDamageAllPercent";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Diese Schaufeln können benutzt werden um Fallen zu graben. -" + bonus + "% Schaden für die gegnerischen Einheiten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt drachentraum1() {
		
		this.name = "Drachentraum";
		this.pictureURI = "/source/drachentraum.png";
		this.effectKey = "debuffDamageHero";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Bombe, die dem gegnerischen Kommandanten schaden soll. -" + bonus + "% Schaden für den gegnerischen Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt drachentraum2() {
		
		this.name = "Drachentraum+1";
		this.pictureURI = "/source/drachentraum.png";
		this.effectKey = "debuffDamageHero";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Bombe, die dem gegnerischen Kommandanten schaden soll. -" + bonus + "% Schaden für den gegnerischen Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}
	
	public Artefakt drachentraum3() {
		
		this.name = "Drachentraum+2";
		this.pictureURI = "/source/drachentraum.png";
		this.effectKey = "debuffDamageHero";
		this.bonus = 16;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Eine Bombe, die dem gegnerischen Kommandanten schaden soll. -" + bonus + "% Schaden für den gegnerischen Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, 99);
	}

	public Artefakt schwalbe1() {
		
		this.name = "Schwalbe";
		this.pictureURI = "/source/schwalbe.png";
		this.effectKey = "healAll";
		this.bonus = 4;
		this.istKampfEffekt = true;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Ein Heiltrank der Hexeralchemie. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt schwalbe2() {
		
		this.name = "Schwalbe+1";
		this.pictureURI = "/source/schwalbe.png";
		this.effectKey = "healAll";
		this.bonus = 6;
		this.istKampfEffekt = true;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Ein Heiltrank der Hexeralchemie. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt schwalbe3() {
		
		this.name = "Schwalbe+2";
		this.pictureURI = "/source/schwalbe.png";
		this.effectKey = "healAll";
		this.bonus = 8;
		this.istKampfEffekt = true;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Ein Heiltrank der Hexeralchemie. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt ringderheilung1() {
		
		this.name = "Ring der Heilung";
		this.pictureURI = "/source/ringerderheilung.png";
		this.effectKey = "healAll";
		this.bonus = 6;
		this.istKampfEffekt = true;
		this.cooldown = 4;
		this.beschreibung = name + ": " + "Ein Ring sie zu heilen. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt ringderheilung2() {
		
		this.name = "Ring der Heilung+1";
		this.pictureURI = "/source/ringerderheilung.png";
		this.effectKey = "healAll";
		this.bonus = 9;
		this.istKampfEffekt = true;
		this.cooldown = 4;
		this.beschreibung = name + ": " + "Ein Ring sie zu heilen. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt ringderheilung3() {
		
		this.name = "Ring der Heilung+2";
		this.pictureURI = "/source/ringerderheilung.png";
		this.effectKey = "healAll";
		this.bonus = 12;
		this.istKampfEffekt = true;
		this.cooldown = 4;
		this.beschreibung = name + ": " + "Ein Ring sie zu heilen. Heilt " + bonus + "% der Leben aller Einheiten jede " + cooldown + ". Runde.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt stabdesadepten1() {
		
		this.name = "Stab des Adepten";
		this.pictureURI = "/source/stabdesadepten.png";
		this.effectKey = "magicDamageArtefakt";
		this.bonus = 240;
		this.istKampfEffekt = true;
		this.cooldown = 3;
		this.beschreibung = name + ": " + "Stab eines Zauberadepten. Fügt " + bonus + " Magieschaden vor beginn der Schlacht an 3 Zielen hinzu.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt stabdesadepten2() {
		
		this.name = "Stab des Adepten+1";
		this.pictureURI = "/source/stabdesadepten.png";
		this.effectKey = "magicDamageArtefakt";
		this.bonus = 360;
		this.istKampfEffekt = true;
		this.cooldown = 3;
		this.beschreibung = name + ": " + "Stab eines Zauberadepten. Fügt " + bonus + " Magieschaden vor beginn der Schlacht an 3 Zielen hinzu.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt stabdesadepten3() {
		
		this.name = "Stab des Adepten+2";
		this.pictureURI = "/source/stabdesadepten.png";
		this.effectKey = "magicDamageArtefakt";
		this.bonus = 480;
		this.istKampfEffekt = true;
		this.cooldown = 3;
		this.beschreibung = name + ": " + "Stab eines Zauberadepten. Fügt " + bonus + " Magieschaden vor beginn der Schlacht an 3 Zielen hinzu.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt rabesrustung1() {
		
		this.name = "Rabes Rüstung";
		this.pictureURI = "/source/rabesrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 4;
		this.istKampfEffekt = true;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Eine solide Rüstung. Rüstung +" + bonus + " Für schwere Infanterie.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt rabesrustung2() {
		
		this.name = "Rabes Rüstung+1";
		this.pictureURI = "/source/rabesrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Eine solide Rüstung. Rüstung +" + bonus + " Für schwere Infanterie.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt rabesrustung3() {
		
		this.name = "Rabes Rüstung+2";
		this.pictureURI = "/source/rabesrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.cooldown = 2;
		this.beschreibung = name + ": " + "Eine solide Rüstung. Rüstung +" + bonus + " Für schwere Infanterie.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt lederrustung1() {
		
		this.name = "Lederrüstung";
		this.pictureURI = "/source/lederrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 4;
		this.istKampfEffekt = false;
		this.cooldown = 98;
		this.beschreibung = name + ": " + "Eine solide Lederrüstung. Rüstung +" + bonus + " Für Fernkämpfer.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt lederrustung2() {
		
		this.name = "Lederrüstung+1";
		this.pictureURI = "/source/lederrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.cooldown = 98;
		this.beschreibung = name + ": " + "Eine solide Lederrüstung. Rüstung +" + bonus + " Für Fernkämpfer.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt lederrustung3() {
		
		this.name = "Lederrüstung+2";
		this.pictureURI = "/source/lederrustung.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.cooldown = 98;
		this.beschreibung = name + ": " + "Eine solide Lederrüstung. Rüstung +" + bonus + " Für Fernkämpfer.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt brustharnisch1() {
		
		this.name = "Redanischer Brustharnisch";
		this.pictureURI = "/source/brustharnisch.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 4;
		this.istKampfEffekt = false;
		this.cooldown = 1;
		this.beschreibung = name + ": " + "Redanischer Brustharnisch. Perfekt für Pikeniere. Rüstung +" + bonus + " Für Pikeniere und Druiden.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt brustharnisch2() {
		
		this.name = "Redanischer Brustharnisch+1";
		this.pictureURI = "/source/brustharnisch.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.cooldown = 1;
		this.beschreibung = name + ": " + "Redanischer Brustharnisch. Perfekt für Pikeniere. Rüstung +" + bonus + " Für Pikeniere und Druiden.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	public Artefakt brustharnisch3() {
		
		this.name = "Redanischer Brustharnisch+2";
		this.pictureURI = "/source/brustharnisch.png";
		this.effectKey = "buffArmorSpecificUnit";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.cooldown = 1;
		this.beschreibung = name + ": " + "Redanischer Brustharnisch. Perfekt für Pikeniere. Rüstung +" + bonus + " Für Pikeniere und Druiden.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt, cooldown);
	}
	
	
	
	
	

	public void triggerEffekt(ArrayList<Teilnehmer> einheiten, int damageBonus, Spieler spieler, String effectKey, Teilnehmer caster) {

		Effekt.aufloesen(einheiten, damageBonus, spieler, effectKey, caster, cooldown);
		
	}
	
	


	public Artefakt erstelle(String name) {
		
		if(name.equals("Donner"))
			return this.donner1();
		if(name.equals("Donner+1"))
			return this.donner2();
		if(name.equals("Donner+2"))
			return this.donner3();
		if(name.equals("Königsamulett"))
			return this.koenigsamulett1();
		if(name.equals("Königsamulett+1"))
			return this.koenigsamulett2();
		if(name.equals("Königsamulett+2"))
			return this.koenigsamulett3();
		if(name.equals("Krummsäbel"))
			return this.krummsaebel1();
		if(name.equals("Krummsäbel+1"))
			return this.krummsaebel2();
		if(name.equals("Krummsäbel+2"))
			return this.krummsaebel3();
		if(name.equals("Plötze"))
			return this.ploetze1();
		if(name.equals("Plötze+1"))
			return this.ploetze2();
		if(name.equals("Plötze+2"))
			return this.ploetze3();
		if(name.equals("Emmentaler"))
			return this.emmentaler1();
		if(name.equals("Emmentaler+1"))
			return this.emmentaler2();
		if(name.equals("Emmentaler+2"))
			return this.emmentaler3();
		if(name.equals("Banner vom grauen Fähnlein"))
			return this.standarte1();
		if(name.equals("Banner vom grauen Fähnlein+1"))
			return this.standarte2();
		if(name.equals("Banner vom grauen Fähnlein+2"))
			return this.standarte3();
		if(name.equals("Aerondight"))
			return this.aerondight1();
		if(name.equals("Aerondight+1"))
			return this.aerondight2();
		if(name.equals("Aerondight+2"))
			return this.aerondight3();
		if(name.equals("Aerondight+3"))
			return this.aerondight4();
		if(name.equals("Kriegstrommel"))
			return this.kriegstrommeln1();
		if(name.equals("Kriegstrommel+1"))
			return this.kriegstrommeln2();
		if(name.equals("Kriegstrommel+2"))
			return this.kriegstrommeln3();
		if(name.equals("Schaufeln"))
			return this.schaufeln1();
		if(name.equals("Schaufeln+1"))
			return this.schaufeln2();
		if(name.equals("Schaufeln+2"))
			return this.schaufeln3();
		if(name.equals("Drachentraum"))
			return this.drachentraum1();
		if(name.equals("Drachentraum+1"))
			return this.drachentraum2();
		if(name.equals("Drachentraum+2"))
			return this.drachentraum3();
		if(name.equals("Schwalbe"))
			return this.schwalbe1();
		if(name.equals("Schwalbe+1"))
			return this.schwalbe2();
		if(name.equals("Schwalbe+2"))
			return this.schwalbe3();
		if(name.equals("Ring der Heilung"))
			return this.ringderheilung1();
		if(name.equals("Ring der Heilung+1"))
			return this.ringderheilung2();
		if(name.equals("Ring der Heilung+2"))
			return this.ringderheilung3();
		if(name.equals("Stab des Adepten"))
			return this.stabdesadepten1();
		if(name.equals("Stab des Adepten+1"))
			return this.stabdesadepten2();
		if(name.equals("Stab des Adepten+2"))
			return this.stabdesadepten3();
		if(name.equals("Rabes Rüstung"))
			return this.rabesrustung1();
		if(name.equals("Rabes Rüstung+1"))
			return this.rabesrustung2();
		if(name.equals("Rabes Rüstung+2"))
			return this.rabesrustung3();
		if(name.equals("Lederrüstung"))
			return this.lederrustung1();
		if(name.equals("Lederrüstung+1"))
			return this.lederrustung2();
		if(name.equals("Lederrüstung+2"))
			return this.lederrustung3();
		if(name.equals("Redanischer Brustharnisch"))
			return this.brustharnisch1();
		if(name.equals("Redanischer Brustharnisch+1"))
			return this.brustharnisch2();
		if(name.equals("Redanischer Brustharnisch+2"))
			return this.brustharnisch3();
		
		
		
		return null;
	}



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getBeschreibung() {
		return beschreibung;
	}





	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}





	public String getEffectKey() {
		return effectKey;
	}





	public void setEffectKey(String effectKey) {
		this.effectKey = effectKey;
	}





	public int getBonus() {
		return bonus;
	}





	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	public boolean isIstKampfEffekt() {
		return istKampfEffekt;
	}


	public void setIstKampfEffekt(boolean istKampfEffekt) {
		this.istKampfEffekt = istKampfEffekt;
	}

	public String getPictureURI() {
		return pictureURI;
	}

	public void setPictureURI(String pictureURI) {
		this.pictureURI = pictureURI;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}





}
