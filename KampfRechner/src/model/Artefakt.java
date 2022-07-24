package model;

import java.util.ArrayList;

public class Artefakt {

	
	private String name;
	private String beschreibung;
	private String pictureURI;
	private String effectKey;
	private int bonus;
	private boolean istKampfEffekt;

	
	
	public Artefakt(String name, String beschreibung, String pictureURI, String effectKey, int bonus, boolean istKampfEffekt) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		this.effectKey = effectKey;
		this.bonus = bonus;
		this.pictureURI = pictureURI;
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
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt krummsaebel2() {
		
		this.name = "Krummsäbel+1";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 21;
		this.beschreibung = name + ": " + "Ein solider Säbel. " + bonus + " Schaden für den Kommandanten.";

		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}

	public Artefakt krummsaebel3() {
		
		this.name = "Krummsäbel+2";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 28;
		this.beschreibung = name + ": " + "Ein solider Säbel. " + bonus + " Schaden für den Kommandanten.";

		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt koenigsamulett1() {
		
		this.name = "Königsamulett";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 6;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt koenigsamulett2() {
		
		this.name = "Königsamulett+1";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 9;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt koenigsamulett3() {
		
		this.name = "Königsamulett+2";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Ein Amulett für Könige. Es erkennt magische gefahren. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt donner1() {
		
		this.name = "Donner";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt donner2() {
		
		this.name = "Donner+1";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 30;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt donner3() {
		
		this.name = "Donner+2";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 40;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt ploetze1() {
		
		this.name = "Plötze";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 18;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt ploetze2() {
		
		this.name = "Plötze+1";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 27;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt ploetze3() {
		
		this.name = "Plötze+2";
		this.pictureURI = "/source/ploetze.png";
		this.effectKey = "speedBuffCommander";
		this.bonus = 36;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das treueste Pferd. Es redet nicht und bringt dich ans Ziel. Aber wo ist es denn hin? +" + bonus + " Initative für den Kommandanten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt emmentaler1() {
		
		this.name = "Emmentaler";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 8;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es richtig immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt emmentaler2() {
		
		this.name = "Emmentaler+1";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 12;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es richtig immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt emmentaler3() {
		
		this.name = "Emmentaler+2";
		this.pictureURI = "/source/emmentaler.png";
		this.effectKey = "damageBuffall";
		this.bonus = 16;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Das Schwert aus der Käsehöhle. Es richtig immernoch ein wenig. +" + bonus + " Schaden für den Kommandanten und alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt standarte1() {
		
		this.name = "Banner vom grauen Fähnlein";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 10;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt standarte2() {
		
		this.name = "Banner vom grauen Fähnlein+1";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 15;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt standarte3() {
		
		this.name = "Banner vom grauen Fähnlein+2";
		this.pictureURI = "/source/standarte.png";
		this.effectKey = "speedBuffUnits";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Die Fahne des grauen Fähnlein. +" + bonus + " Initiative für alle Einheiten.";
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt aerondight1() {
		
		this.name = "Aerondight";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 10;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt aerondight2() {
		
		this.name = "Aerondight+1";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 15;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt aerondight3() {
		
		this.name = "Aerondight+2";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 20;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt aerondight4() {
		
		this.name = "Aerondight+3";
		this.pictureURI = "/source/mittagserscheinung.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 75;
		this.istKampfEffekt = false;
		this.beschreibung = name + ": " + "Legenden besagen dieses mächtige Schwert kann seine volle Kraft erst entfalten, wenn alle fehlenden Teile zusammengefügt werden. +" + bonus + " Schaden für den Kommandanten.";

		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}


	public void triggerEffekt(ArrayList<Teilnehmer> einheiten, int damageBonus, Spieler spieler, String effectKey) {

		Effekt.aufloesen(einheiten, damageBonus, spieler, effectKey);
		
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





}
