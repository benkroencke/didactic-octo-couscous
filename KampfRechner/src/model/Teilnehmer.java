package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import main.Main;

public class Teilnehmer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Spieler besitzer;
	private String name;
	private String beschreibung;
	private String pictureURI;
	private String klasse;
	private int rang;
	private List<Skill> skillListe;
	private Skill skill1;
	private Skill skill2;
	private Skill skill3;
	private Skill skill4;
	private Skill ultimate;
	private int schaden;
	private int init;
	private int kommandoWert;
	private Artefakt[] artefakte = new Artefakt[3];
	private ArrayList<Teilnehmer> einheitenListe;	
	private boolean istKommandant;
	private int id;
	private int leben;
	private int ruestungProzent;
	private int counter;
	
	private int lebenActual;
	private int schadenActual;
	private int ruestungProzentActual;
	private int initActual;
	
	private int angerichteterSchaden;
	private int erlittenerSchaden;
	private int geheilterSchaden;
	
	private int turnsStunned = 0;
	private int healable = 0;
	
	private Skill skillFabrik = new Skill();
	
	public Teilnehmer(Spieler besitzer, String name, int rang, List<Skill> skillListe,
			int schaden, int init, int kommandoWert, ArrayList<Teilnehmer> einheitenListe,
			int schadenActual, int initActual) {
		super();
		this.name = name;
		this.rang = rang;
		this.schaden = schaden;
		this.init = init;
		this.kommandoWert = kommandoWert;
		this.einheitenListe = einheitenListe;
		this.schadenActual = schadenActual;
		this.initActual = initActual;
	}
	
	public Teilnehmer(Spieler besitzer, String name, String beschreibung, String klasse, String pictureURI, int rang, List<Skill> skillListe, Skill skill1, Skill skill2,
			Skill skill3, Skill skill4, Skill ultimate, int schaden, int init, int kommandoWert,
			ArrayList<Teilnehmer> einheitenListe, boolean istKommandant, int id, int leben, int ruestungProzent,
			int counter, int lebenActual, int schadenActual, int ruestungProzentActual, int initActual) {
		super();
		this.besitzer = besitzer;
		this.name = name;
		this.beschreibung = beschreibung;
		this.klasse = klasse;
		this.pictureURI = pictureURI;
		this.rang = rang;
		this.skillListe = skillListe;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.ultimate = ultimate;
		this.schaden = schaden;
		this.init = init;
		this.kommandoWert = kommandoWert;
		this.einheitenListe = einheitenListe;
		this.istKommandant = istKommandant;
		this.id = id;
		this.leben = leben;
		this.ruestungProzent = ruestungProzent;
		this.counter = counter;
		this.lebenActual = lebenActual;
		this.schadenActual = schadenActual;
		this.ruestungProzentActual = ruestungProzentActual;
		this.initActual = initActual;
	}

	
	public Teilnehmer() {
		
	}

	public Teilnehmer geralt(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Geralt von Riva";
		this.klasse = "Kämpfer";
		this.pictureURI = "/source/geralt.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 250;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 150;
		this.kommandoWert = 6;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer foltest(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "König Foltest";
		this.klasse = "Unterstützer";
		this.pictureURI = "/source/foltest.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 180;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 115;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
				null, null, null, schaden, init, kommandoWert,
				einheitenListe, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer yennefer(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Yennefer von Vengerberg";
		this.klasse = "Zauberin";
		this.pictureURI = "/source/yennefer.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 150;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 190;
		this.kommandoWert = 6;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer triss(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Triss Merigold";
		this.klasse = "Zauberin";
		this.pictureURI = "/source/triss.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 150;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 150;
		this.kommandoWert = 7;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer vernonroche(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Vernon Roche";
		this.klasse = "Kämpfer";
		this.pictureURI = "/source/vernonroche.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 200;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 200;
		this.kommandoWert = 7;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer emhyr(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Emhyr var Emreis";
		this.klasse = "Stratege";
		this.pictureURI = "/source/emhyr.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 50;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 100;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer voorhis(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Morvran Voorhis";
		this.klasse = "Stratege";
		this.pictureURI = "/source/voorhis.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 150;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 175;
		this.kommandoWert = 7;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer letho(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Letho von Guleta";
		this.klasse = "Kämpfer";
		this.pictureURI = "/source/letho.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 290;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 115;
		this.kommandoWert = 6;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer johan(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Johan Natalis";
		this.klasse = "Stratege";
		this.pictureURI = "/source/johan.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 130;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 140;
		this.kommandoWert = 7;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer ciri(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Hexerin Ciri";
		this.klasse = "Kämpferin";
		this.pictureURI = "/source/ciri.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 240;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 175;
		this.kommandoWert = 6;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer crach(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Crach an Craite";
		this.klasse = "Kämpfer";
		this.pictureURI = "/source/crach.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 225;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 155;
		this.kommandoWert = 7;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer cerys(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Cerys an Craite";
		this.klasse = "Strategin";
		this.pictureURI = "/source/cerys.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 200;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 145;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer maussack(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Mäussack";
		this.klasse = "Unterstützer";
		this.pictureURI = "/source/maussack.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 115;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 55;
		this.kommandoWert = 6;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer falibor(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Falibor";
		this.klasse = "Deserteur";
		this.pictureURI = "/source/falibor.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 150;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 150;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer skellen(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Stefan Skellen";
		this.klasse = "Deserteur";
		this.pictureURI = "/source/skellen.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 175;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 125;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer korys(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Korys";
		this.klasse = "Deserteur";
		this.pictureURI = "/source/korys.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 125;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 175;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer imlerith(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Imlerith";
		this.klasse = "Wilde Jagd";
		this.pictureURI = "/source/imlerith.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 300;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 75;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer caranthir(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Caranthir";
		this.klasse = "Wilde Jagd";
		this.pictureURI = "/source/caranthir.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 125;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 170;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer eredin(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Eredin";
		this.klasse = "Wilde Jagd";
		this.pictureURI = "/source/eredin.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 250;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 190;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer auberon(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Auberon";
		this.klasse = "Wilde Jagd";
		this.pictureURI = "/source/auberon.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 265;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 200;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer dettlaff(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Dettlaff";
		this.klasse = "Monster";
		this.pictureURI = "/source/dettlaff.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 250;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 185;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer kikimore(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Kikimorenkönigin";
		this.klasse = "Monster";
		this.pictureURI = "/source/kikimore.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 260;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 145;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer waldschrat(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Waldschrat";
		this.klasse = "Monster";
		this.pictureURI = "/source/waldschrat.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 165;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 165;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	public Teilnehmer draug(Spieler besitzer) {
		
		this.skillListe = new ArrayList<Skill>();
		this.einheitenListe = new ArrayList<Teilnehmer>();
				
		this.name = "Draug";
		this.klasse = "Monster";
		this.pictureURI = "/source/draug.png";
		this.id = 100;
		this.leben = 1;
		this.schaden = 245;
		this.rang = 1;
		this.ruestungProzent = 0;
		this.init = 35;
		this.kommandoWert = 8;
		this.counter = 100; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3, None = 100
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = true;
		this.beschreibung = this.name + " - " + "Klasse: " + this.klasse + ", Schaden: " + this.schaden + ", Initiative: " + this.init + ", Kommandowert: " + this.kommandoWert + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, klasse, pictureURI, rang, skillListe, null, null,
			null, null, null, schaden, init, kommandoWert,
			einheitenListe, istKommandant, id, leben, ruestungProzent,
			counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
		
	}
	
	
	public Teilnehmer heckenschuetzen(Spieler besitzer) {
		
		this.name = "Temerische Heckenschützen";
		this.pictureURI = "/source/Heckenschuetzen.png";
		this.id = 0;
		this.leben = 1250;
		this.schaden = 200;
		this.ruestungProzent = 5;
		this.init = 150;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Doppelschlag");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer hueter(Spieler besitzer) {
		
		this.name = "Tridam Infanterie";
		this.pictureURI = "/source/hueter.png";
		this.id = 2;
		this.leben = 2050;
		this.schaden = 110;
		this.ruestungProzent = 20;
		this.init = 100;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Vorbereitung");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer pikeniere(Spieler besitzer) {
		
		this.name = "Temerische Pikeniere";
		this.pictureURI = "/source/pikeniere.png";
		this.id = 1;
		this.leben = 2250;
		this.schaden = 140;
		this.ruestungProzent = 12;
		this.init = 115;
		this.counter = 2; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Konterstellung");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer kuerassiere(Spieler besitzer) {
		
		this.name = "Foltests Stolz";
		this.pictureURI = "/source/foltestpride.png";
		this.id = 4;
		this.leben = 1750;
		this.schaden = 250;
		this.ruestungProzent = 8;
		this.init = 45;
		this.counter = 1; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Steinhagel");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer blaueStreifen(Spieler besitzer) {
		
		this.name = "Blaue Streifen";
		this.pictureURI = "/source/blauestreifen.png";
		this.id = 4;
		this.leben = 2250;
		this.schaden = 225;
		this.ruestungProzent = 15;
		this.init = 180;
		this.counter = 0; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Blutsbruder");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer ves(Spieler besitzer) {
		
		this.name = "Blaue Streifen";
		this.pictureURI = "/source/ves.png";
		this.id = 4;
		this.leben = 2400;
		this.schaden = 240;
		this.ruestungProzent = 15;
		this.init = 185;
		this.counter = 0; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Blutsbruder");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer ardfeain(Spieler besitzer) {
		
		this.name = "Ard Feain Infanterie";
		this.pictureURI = "/source/ardfeain.png";
		this.id = 2;
		this.leben = 2200;
		this.schaden = 85;
		this.ruestungProzent = 25;
		this.init = 90;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Festnageln");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer imperaArmbrueste(Spieler besitzer) {
		
		this.name = "Impera Armbrustschützen";
		this.pictureURI = "/source/imperaarmbrueste.png";
		this.id = 0;
		this.leben = 1500;
		this.schaden = 175;
		this.ruestungProzent = 7;
		this.init = 120;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Konterstellung");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer ardfeainSchildkroete(Spieler besitzer) {
		
		this.name = "Ard Feain Schildkröte";
		this.pictureURI = "/source/ardfeainschildkroete.png";
		this.id = 1;
		this.leben = 2750;
		this.schaden = 130;
		this.ruestungProzent = 14;
		this.init = 105;
		this.counter = 2; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Stachelschwein");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer nilfgaardRitter(Spieler besitzer) {
		
		this.name = "Nilfgaardische Ritter";
		this.pictureURI = "/source/nilfgaardritter.png";
		this.id = 3;
		this.leben = 1900;
		this.schaden = 165;
		this.ruestungProzent = 17;
		this.init = 175;
		this.counter = 1; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Stampede");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();


		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer imperaBrigade(Spieler besitzer) {
		
		this.name = "Impera Brigade";
		this.pictureURI = "/source/imperabrigade.png";
		this.id = 4;
		this.leben = 3250;
		this.schaden = 75;
		this.ruestungProzent = 30;
		this.init = 50;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3, Impera Brigade = 4
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Stahlpanzer");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer brokvarbogenschutze(Spieler besitzer) {
		
		this.name = "Brokvar Bogenschütze";
		this.pictureURI = "/source/brokvarbogenschutze.png";
		this.id = 0;
		this.leben = 1350;
		this.schaden = 190;
		this.ruestungProzent = 4;
		this.init = 155;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Überfall");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer drummondschildmaid(Spieler besitzer) {
		
		this.name = "Drummond Schildmaid";
		this.pictureURI = "/source/drummondschildmaid.png";
		this.id = 2;
		this.leben = 2000;
		this.schaden = 130;
		this.ruestungProzent = 20;
		this.init = 95;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Schildwall");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer druiden(Spieler besitzer) {
		
		this.name = "Druiden";
		this.pictureURI = "/source/druiden.png";
		this.id = 1;
		this.leben = 2600;
		this.schaden = 60;
		this.ruestungProzent = 8;
		this.init = 100;
		this.counter = 2; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Heilkraut");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer ancraitlangschiff(Spieler besitzer) {
		
		this.name = "An Crait Langschiff";
		this.pictureURI = "/source/ancraitlangschiff.png";
		this.id = 3;
		this.leben = 2250;
		this.schaden = 210;
		this.ruestungProzent = 20;
		this.init = 125;
		this.counter = 1; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Pfeilsalve");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer svulblodfanatiker(Spieler besitzer) {
		
		this.name = "Svulblod Fanatiker";
		this.pictureURI = "/source/svulblodfanatiker.png";
		this.id = 2;
		this.leben = 2450;
		this.schaden = 150;
		this.ruestungProzent = 0;
		this.init = 150;
		this.counter = 1; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Svulblod");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer spy(Spieler besitzer) {
		
		this.name = "Spion";
		this.pictureURI = "/source/spy.png";
		this.id = 2;
		this.leben = 2000;
		this.schaden = 120;
		this.ruestungProzent = 12;
		this.init = 160;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Vorbereitung");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer zwergensoeldner(Spieler besitzer) {
		
		this.name = "Zwergensöldner";
		this.pictureURI = "/source/zwergensoeldner.png";
		this.id = 2;
		this.leben = 3100;
		this.schaden = 80;
		this.ruestungProzent = 28;
		this.init = 90;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Festnageln");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer wildejagdkrieger(Spieler besitzer) {
		
		this.name = "Krieger der Wilden Jagd";
		this.pictureURI = "/source/wildejagdkrieger.png";
		this.id = 2;
		this.leben = 2600;
		this.schaden = 140;
		this.ruestungProzent = 28;
		this.init = 70;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3, Impera Brigade = 4
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Stahlpanzer");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer wildejagdschlager(Spieler besitzer) {
		
		this.name = "Schläger der Wilden Jagd";
		this.pictureURI = "/source/wildejagdschlager.png";
		this.id = 3;
		this.leben = 1900;
		this.schaden = 200;
		this.ruestungProzent = 18;
		this.init = 50;
		this.counter = 1; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3, Impera Brigade = 4
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Festnageln");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer wildejagdhund(Spieler besitzer) {
		
		this.name = "Hunde der Wilden Jagd";
		this.pictureURI = "/source/wildejagdhund.png";
		this.id = 1;
		this.leben = 1500;
		this.schaden = 180;
		this.ruestungProzent = 8;
		this.init = 150;
		this.counter = 1; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3, Impera Brigade = 4
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("No Ability");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer nekker(Spieler besitzer) {
		
		this.name = "Nekker";
		this.pictureURI = "/source/nekker.png";
		this.id = 2;
		this.leben = 1400;
		this.schaden = 100;
		this.ruestungProzent = 16;
		this.init = 110;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Festnageln");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer ghul(Spieler besitzer) {
		
		this.name = "Ghul";
		this.pictureURI = "/source/ghul.png";
		this.id = 2;
		this.leben = 1250;
		this.schaden = 100;
		this.ruestungProzent = 20;
		this.init = 145;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Blutsbruder");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer wiederganger(Spieler besitzer) {
		
		this.name = "Wiedergänger";
		this.pictureURI = "/source/wiederganger.png";
		this.id = 2;
		this.leben = 1250;
		this.schaden = 110;
		this.ruestungProzent = 18;
		this.init = 95;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("No Ability");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	
	
	public Teilnehmer sucher(Spieler besitzer) {
		
		this.name = "Navigatoren der Wilden Jagd";
		this.pictureURI = "/source/sucher.png";
		this.id = 0;
		this.leben = 1000;
		this.schaden = 25;
		this.ruestungProzent = 10;
		this.init = 100;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Blitzschlag");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer harpy(Spieler besitzer) {
		
		this.name = "Harpyien";
		this.pictureURI = "/source/harpy.png";
		this.id = 0;
		this.leben = 900;
		this.schaden = 145;
		this.ruestungProzent = 6;
		this.init = 155;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Doppelschlag");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer wyvern(Spieler besitzer) {
		
		this.name = "Wyvern";
		this.pictureURI = "/source/wyvern.png";
		this.id = 3;
		this.leben = 1950;
		this.schaden = 120;
		this.ruestungProzent = 17;
		this.init = 100;
		this.counter = 1; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Feuerball");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer bruxa(Spieler besitzer) {
		
		this.name = "Bruxa";
		this.pictureURI = "/source/bruxa.png";
		this.id = 3;
		this.leben = 1920;
		this.schaden = 185;
		this.ruestungProzent = 21;
		this.init = 125;
		this.counter = 1; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Vampirrauch");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer katakan(Spieler besitzer) {
		
		this.name = "Katakan";
		this.pictureURI = "/source/katakan.png";
		this.id = 1;
		this.leben = 2200;
		this.schaden = 170;
		this.ruestungProzent = 12;
		this.init = 150;
		this.counter = 1; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Blut trinken");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer geist(Spieler besitzer) {
		
		this.name = "Geister";
		this.pictureURI = "/source/geist.png";
		this.id = 0;
		this.leben = 1100;
		this.schaden = 145;
		this.ruestungProzent = 12;
		this.init = 120;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.skill1 = skillFabrik.erstelle("Vorbereitung");
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + " - Fähigkeit: " + skill1.getBeschreibung();

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, skill1, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	
	public Teilnehmer erstelle(String name, Spieler besitzer) {
		
		if(name.equals("Geralt von Riva"))
			return this.geralt(besitzer);
		if(name.equals("König Foltest"))
			return this.foltest(besitzer);
		if(name.equals("Vernon Roche"))
			return this.vernonroche(besitzer);
		if(name.equals("Triss Merigold"))
			return this.triss(besitzer);
		if(name.equals("Yennefer von Vengerberg"))
			return this.yennefer(besitzer);
		if(name.equals("Emhyr var Emreis"))
			return this.emhyr(besitzer);
		if(name.equals("Letho von Guleta"))
			return this.letho(besitzer);
		if(name.equals("Morvran Voorhis"))
			return this.voorhis(besitzer);
		if(name.equals("Johan Natalis"))
			return this.johan(besitzer);
		if(name.equals("Hexerin Ciri"))
			return this.ciri(besitzer);
		if(name.equals("Crach an Craite"))
			return this.crach(besitzer);
		if(name.equals("Cerys an Craite"))
			return this.cerys(besitzer);
		if(name.equals("Mäussack"))
			return this.maussack(besitzer);
		if(name.equals("Falibor"))
			return this.falibor(besitzer);
		if(name.equals("Stefan Skellen"))
			return this.skellen(besitzer);
		if(name.equals("Korys"))
			return this.korys(besitzer);
		if(name.equals("Imlerith"))
			return this.imlerith(besitzer);
		if(name.equals("Caranthir"))
			return this.caranthir(besitzer);
		if(name.equals("Eredin"))
			return this.eredin(besitzer);
		if(name.equals("Auberon"))
			return this.auberon(besitzer);
		if(name.equals("Dettlaff"))
			return this.dettlaff(besitzer);
		if(name.equals("Kikimorenkönigin"))
			return this.kikimore(besitzer);
		if(name.equals("Waldschrat"))
			return this.waldschrat(besitzer);
		if(name.equals("Draug"))
			return this.draug(besitzer);
		
		if(name.equals("Temerische Heckenschützen"))
			return this.heckenschuetzen(besitzer);
		if(name.equals("Tridam Infanterie"))
			return this.hueter(besitzer);
		if(name.equals("Temerische Pikeniere"))
			return this.pikeniere(besitzer);
		if(name.equals("Foltests Stolz"))
			return this.kuerassiere(besitzer);
		if(name.equals("Blaue Streifen"))
			return this.blaueStreifen(besitzer);
		if(name.equals("Ard Feain Infanterie"))
			return this.ardfeain(besitzer);
		if(name.equals("Impera Armbrustschützen"))
			return this.imperaArmbrueste(besitzer);
		if(name.equals("Ard Feain Schildkröte"))
			return this.ardfeainSchildkroete(besitzer);
		if(name.equals("Nilfgaardische Ritter"))
			return this.nilfgaardRitter(besitzer);
		if(name.equals("Impera Brigade"))
			return this.imperaBrigade(besitzer);
		if(name.equals("Drummond Schildmaid"))
			return this.drummondschildmaid(besitzer);
		if(name.equals("Brokvar Bogenschütze"))
			return this.brokvarbogenschutze(besitzer);
		if(name.equals("Svulblod Fanatiker"))
			return this.svulblodfanatiker(besitzer);
		if(name.equals("Druiden"))
			return this.druiden(besitzer);
		if(name.equals("An Crait Langschiff"))
			return this.ancraitlangschiff(besitzer);
		if(name.equals("Spion"))
			return this.spy(besitzer);
		if(name.equals("Ves"))
			return this.ves(besitzer);
		if(name.equals("Zwergensöldner"))
			return this.zwergensoeldner(besitzer);
		if(name.equals("Krieger der Wilden Jagd"))
			return this.wildejagdkrieger(besitzer);
		if(name.equals("Schläger der Wilden Jagd"))
			return this.wildejagdschlager(besitzer);
		if(name.equals("Hunde der Wilden Jagd"))
			return this.wildejagdhund(besitzer);
		if(name.equals("Nekker"))
			return this.nekker(besitzer);
		if(name.equals("Ghul"))
			return this.ghul(besitzer);
		if(name.equals("Navigatoren der Wilden Jagd"))
			return this.sucher(besitzer);
		if(name.equals("Wiedergänger"))
			return this.wiederganger(besitzer);
		if(name.equals("Harpyien"))
			return this.harpy(besitzer);
		if(name.equals("Wyvern"))
			return this.wyvern(besitzer);
		if(name.equals("Geister"))
			return this.geist(besitzer);
		if(name.equals("Bruxa"))
			return this.bruxa(besitzer);
		if(name.equals("Katakan"))
			return this.katakan(besitzer);
		
		
		return null;
	}
	
	
	
	//Getter-Setter

	public Spieler getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Spieler besitzer) {
		this.besitzer = besitzer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	public List<Skill> getSkillListe() {
		return skillListe;
	}

	public void setSkillListe(List<Skill> skillListe) {
		this.skillListe = skillListe;
	}

	public Skill getSkill1() {
		return skill1;
	}

	public void setSkill1(Skill skill1) {
		this.skill1 = skill1;
	}

	public Skill getSkill2() {
		return skill2;
	}

	public void setSkill2(Skill skill2) {
		this.skill2 = skill2;
	}

	public Skill getSkill3() {
		return skill3;
	}

	public void setSkill3(Skill skill3) {
		this.skill3 = skill3;
	}

	public Skill getSkill4() {
		return skill4;
	}

	public void setSkill4(Skill skill4) {
		this.skill4 = skill4;
	}

	public Skill getUltimate() {
		return ultimate;
	}

	public void setUltimate(Skill ultimate) {
		this.ultimate = ultimate;
	}

	public int getSchaden() {
		return schaden;
	}

	public void setSchaden(int schaden) {
		this.schaden = schaden;
	}

	public int getInit() {
		return init;
	}

	public void setInit(int init) {
		this.init = init;
	}

	public int getKommandoWert() {
		return kommandoWert;
	}

	public void setKommandoWert(int kommandoWert) {
		this.kommandoWert = kommandoWert;
	}

	public ArrayList<Teilnehmer> getEinheitenListe() {
		return einheitenListe;
	}

	public void setEinheitenListe(ArrayList<Teilnehmer> einheitenListe) {
		this.einheitenListe = einheitenListe;
	}

	public boolean isIstKommandant() {
		return istKommandant;
	}

	public void setIstKommandant(boolean istKommandant) {
		this.istKommandant = istKommandant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public int getRuestungProzent() {
		return ruestungProzent;
	}

	public void setRuestungProzent(int ruestungProzent) {
		this.ruestungProzent = ruestungProzent;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getLebenActual() {
		return lebenActual;
	}

	public void setLebenActual(int lebenActual) {
		this.lebenActual = lebenActual;
	}

	public int getSchadenActual() {
		return schadenActual;
	}

	public void setSchadenActual(int schadenActual) {
		this.schadenActual = schadenActual;
	}

	public int getRuestungProzentActual() {
		return ruestungProzentActual;
	}

	public void setRuestungProzentActual(int ruestungProzentActual) {
		this.ruestungProzentActual = ruestungProzentActual;
	}

	public int getInitActual() {
		return initActual;
	}

	public void setInitActual(int initActual) {
		this.initActual = initActual;
	}

	public Artefakt[] getArtefakte() {
		return artefakte;
	}

	public void setArtefakte(Artefakt[] artefakte) {
		this.artefakte = artefakte;
	}

	public int getAngerichteterSchaden() {
		return angerichteterSchaden;
	}

	public void setAngerichteterSchaden(int angerichteterSchaden) {
		this.angerichteterSchaden = angerichteterSchaden;
	}

	public int getErlittenerSchaden() {
		return erlittenerSchaden;
	}

	public void setErlittenerSchaden(int erlittenerSchaden) {
		this.erlittenerSchaden = erlittenerSchaden;
	}

	public void addTruppen(Teilnehmer teilnehmer) {
		
		if(this.einheitenListe.size()<this.kommandoWert) {
			
			this.einheitenListe.add(teilnehmer);
			
		} else {
			Main.battlelog.add("Diese Kommandant hat bereits maximalen Kommandowert erreicht! " + teilnehmer.getName() + " konnte nicht hinzugefügt werden!");
		}
		
	}
	
	public void removeTruppen(ArrayList<Teilnehmer> einheitenListe, Teilnehmer teilnhemer) {
		
		for(int i=0;i<einheitenListe.size();i++) {
			
			if(einheitenListe.get(i).equals(teilnhemer))
				einheitenListe.remove(i);
			
		}
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

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public int getGeheilterSchaden() {
		return geheilterSchaden;
	}

	public void setGeheilterSchaden(int geheilterSchaden) {
		this.geheilterSchaden = geheilterSchaden;
	}

	public int getTurnsStunned() {
		return turnsStunned;
	}

	public void setTurnsStunned(int turnsStunned) {
		this.turnsStunned = turnsStunned;
	}

	public int getHealable() {
		return healable;
	}

	public void setHealable(int healable) {
		this.healable = healable;
	}



	
	
}
	