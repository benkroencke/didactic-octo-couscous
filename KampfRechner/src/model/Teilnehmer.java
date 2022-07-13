package model;

import java.util.ArrayList;
import java.util.List;

public class Teilnehmer {
	
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
		System.out.println("TeilnehmerPool erstellt! Hier können nun neue Teilnehmer (Einheiten und Kommandanten generiert werden!");
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
	
	public Teilnehmer heckenschuetzen(Spieler besitzer) {
		
		this.name = "Heckenschützen";
		this.pictureURI = "/source/Heckenschuetzen.png";
		this.id = 0;
		this.leben = 1000;
		this.schaden = 200;
		this.ruestungProzent = 5;
		this.init = 150;
		this.counter = 3; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + ".";
		
		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, null, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer hueter(Spieler besitzer) {
		
		this.name = "Hüter";
		this.pictureURI = "/source/hueter.png";
		this.id = 2;
		this.leben = 1800;
		this.schaden = 100;
		this.ruestungProzent = 20;
		this.init = 100;
		this.counter = 0; //Heckenschütze = 0, Hellebardier = 1, Hüter = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + ".";

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, null, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer pikeniere(Spieler besitzer) {
		
		this.name = "Pikeniere";
		this.pictureURI = "/source/pikeniere.png";
		this.id = 1;
		this.leben = 2000;
		this.schaden = 120;
		this.ruestungProzent = 12;
		this.init = 115;
		this.counter = 2; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + ".";

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, null, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
	}
	
	public Teilnehmer kuerassiere(Spieler besitzer) {
		
		this.name = "Kürassiere";
		this.pictureURI = "/source/RedanienRitter.png";
		this.id = 3;
		this.leben = 1500;
		this.schaden = 165;
		this.ruestungProzent = 15;
		this.init = 200;
		this.counter = 1; //Armbrust = 0, Hellebardier = 1, Schwertkämpfer = 2, Ritter = 3
		
		this.lebenActual = leben;
		this.schadenActual = schaden;
		this.ruestungProzentActual = ruestungProzent;
		this.initActual = init;
		this.istKommandant = false;
		this.beschreibung = this.name + " - Leben: " + this.leben + ", Schaden: " + this.schaden + ", Rüstung: " + this.ruestungProzent + "%, Initiative: " + this.init + ".";

		return new Teilnehmer(besitzer, name, beschreibung, "", pictureURI, 0, null, null, null,
				null, null, null, schaden, init, 0,
				null, istKommandant, id, leben, ruestungProzent,
				counter, lebenActual, schadenActual, ruestungProzentActual, initActual);
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
			System.out.println("Diese Kommandant hat bereits maximalen Kommandowert erreicht! " + teilnehmer.getName() + " konnte nicht hinzugefügt werden!");
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


	
	
}
	