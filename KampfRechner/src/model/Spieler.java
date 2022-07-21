package model;

import java.awt.Color;

public class Spieler {
	
	private String name;
	private int holz;
	private int muenzen;
	private int eisen;
	private int lehm;
	private int weizen;
	private int wolle;
	private int stoff;
	private int papier;
	private Color farbe;
	
	
	public Spieler(String name) {
		
		this.name = name;
		this.holz = 0;
		this.muenzen = 0;
		this.eisen = 0;
		this.lehm = 0;
		this.weizen = 0;
		this.wolle = 0;
		this.stoff = 0;
		this.papier = 0;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHolz() {
		return holz;
	}
	public void setHolz(int holz) {
		this.holz = holz;
	}
	public int getMuenzen() {
		return muenzen;
	}
	public void setMuenzen(int muenzen) {
		this.muenzen = muenzen;
	}
	public int getEisen() {
		return eisen;
	}
	public void setEisen(int eisen) {
		this.eisen = eisen;
	}
	public int getLehm() {
		return lehm;
	}
	public void setLehm(int lehm) {
		this.lehm = lehm;
	}
	public int getWeizen() {
		return weizen;
	}
	public void setWeizen(int weizen) {
		this.weizen = weizen;
	}
	public int getWolle() {
		return wolle;
	}
	public void setWolle(int wolle) {
		this.wolle = wolle;
	}
	public int getStoff() {
		return stoff;
	}
	public void setStoff(int stoff) {
		this.stoff = stoff;
	}
	public int getPapier() {
		return papier;
	}
	public void setPapier(int papier) {
		this.papier = papier;
	}


	public Color getFarbe() {
		return farbe;
	}


	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

}
