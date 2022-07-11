package model;

import java.util.ArrayList;

public class Artefakt {

	
	private String name;
	private String beschreibung;
	private String effectKey;
	private int bonus;
	private boolean istKampfEffekt;

	
	
	public Artefakt(String name, String beschreibung, String effectKey, int bonus, boolean istKampfEffekt) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		this.effectKey = effectKey;
		this.bonus = bonus;
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





}
