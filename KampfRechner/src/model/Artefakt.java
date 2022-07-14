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

	public Artefakt krummsaebel() {
		
		this.name = "Krummsäbel";
		this.beschreibung = "Ein solider Säbel. +30 Schaden für den Kommandanten";
		this.pictureURI = "/source/Krummsaebel.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 30;
		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt koenigsamulett() {
		
		this.name = "Königsamulett";
		this.beschreibung = "Ein Amulett für Könige. Es erkennt magische gefahren. +20 Schaden für den Kommandanten und alle Einheiten.";
		this.pictureURI = "/source/Koenigsamulett.png";
		this.effectKey = "damageBuffall";
		this.bonus = 20;
		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}
	
	public Artefakt donner() {
		
		this.name = "Donner";
		this.beschreibung = "Hexer nehmen diesen Trank ein, bevor sie gegen starke, schwer gepanzerte Gegner kämpfen. Durch Genuss von Donner geraten Hexer in eine Kampftrance. In diesem Zustand teilen sie mehr Schaden aus. +50 Schaden für den Kommandanten";
		this.pictureURI = "/source/Donner.png";
		this.effectKey = "damageBuffCommander";
		this.bonus = 50;
		this.istKampfEffekt = false;
		
		return new Artefakt(name, beschreibung, pictureURI, effectKey, bonus, istKampfEffekt);
	}


	public void triggerEffekt(ArrayList<Teilnehmer> einheiten, int damageBonus, Spieler spieler, String effectKey) {

		Effekt.aufloesen(einheiten, damageBonus, spieler, effectKey);
		
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
