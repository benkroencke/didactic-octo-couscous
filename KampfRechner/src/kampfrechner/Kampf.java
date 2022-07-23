package kampfrechner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.ImageIcon;

import main.Main;
import model.Spieler;
import model.Teilnehmer;
import view.MainWindow;

public class Kampf {

	private final static int runden = 10;
	private ArrayList<Teilnehmer> spieler1Einheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer spieler1Kommandant;
	private ArrayList<Teilnehmer> spieler2Einheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer spieler2Kommandant;
	private ArrayList<Teilnehmer> prioListe = new ArrayList<Teilnehmer>();
	
	public Kampf(ArrayList<Teilnehmer> einheiten1, ArrayList<Teilnehmer> einheiten2, Teilnehmer spieler1Kommandant, Teilnehmer spieler2Kommandant) {
		super();
		this.spieler1Einheiten = einheiten1;
		this.spieler1Kommandant = spieler1Kommandant;
		this.spieler2Einheiten = einheiten2;
		this.spieler2Kommandant = spieler2Kommandant;
	}
	
	public ArrayList<Teilnehmer> initRechner(ArrayList<Teilnehmer> teilnehmer){
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Kalkuliert Reihenfolge...");
		Main.battlelog.add("---------------------------------------------------");
		
		ArrayList<Teilnehmer> sortierHilfeListe = teilnehmer;
		ArrayList<Teilnehmer> sortierListe = new ArrayList<Teilnehmer>();
			
		
		Collections.sort(teilnehmer, new Comparator<Teilnehmer>() {

			@Override
			public int compare(Teilnehmer arg0, Teilnehmer arg1) {
				// TODO Auto-generated method stub
				return Integer.valueOf(Integer.valueOf(arg1.getInitActual()).compareTo(arg0.getInitActual()));
			}
			
		});
		
		sortierListe = teilnehmer;
		
		for(int i=1; i<=sortierListe.size(); i++) {
			Main.battlelog.add(sortierListe.get(i-1).getBesitzer().getName() + "'s " + sortierListe.get(i-1).getName() + " agiert an " + i + ". Stelle jeder Runde!" + " --- Initiativewert: " + sortierListe.get(i-1).getInitActual());
		}
		
		return sortierListe;
		
	}
	
	public ArrayList<Teilnehmer> prioRechner(ArrayList<Teilnehmer> teilnehmer) {
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Kalkuliert Priorität...");
		Main.battlelog.add("---------------------------------------------------");
		
		ArrayList<Teilnehmer> sortierListe = new ArrayList<Teilnehmer>();
			
		
		Collections.sort(teilnehmer, new Comparator<Teilnehmer>() {

			@Override
			public int compare(Teilnehmer arg0, Teilnehmer arg1) {
				return Integer.valueOf(Integer.valueOf(arg1.getRuestungProzentActual()).compareTo(arg0.getRuestungProzentActual()));
			}
			
		});
		
		sortierListe = teilnehmer;
		
		for(int i=1; i<=sortierListe.size(); i++) {
			Main.battlelog.add(sortierListe.get(i-1).getBesitzer().getName() + "'s " + sortierListe.get(i-1).getName() + " wird als " + i + ". für Fähigkeiten priorisiert!" + " --- Rüstungswert: " + sortierListe.get(i-1).getRuestungProzentActual());
		}
		
		return sortierListe;
		
	}
	
	public ArrayList<Teilnehmer> vorKriegsPhase(ArrayList<Teilnehmer> teilnehmer) {
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Vorkriegsphase beginnt:");
		Main.battlelog.add("---------------------------------------------------");

		Teilnehmer ves = new Teilnehmer();
		Teilnehmer zwerg1 = new Teilnehmer();
		Teilnehmer zwerg2 = new Teilnehmer();
		int belegt1 = 0;
		int belegt2 = 0;
		
		for(int i = 0; i<teilnehmer.size();i++) {
			if(teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && !teilnehmer.get(i).isIstKommandant())
				belegt1++;
			if(teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && !teilnehmer.get(i).isIstKommandant())
				belegt2++;
		}
		
		for(int i=0; i<teilnehmer.size();i++){
			if(teilnehmer.get(i).getUltimate() != null) {
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "spezialkommando" && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).getKommandoWert()>belegt1) {
					teilnehmer.add(ves.erstelle("Ves", Main.getSpieler1()));
				}
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "spezialkommando" && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).getKommandoWert()>belegt2) {
					teilnehmer.add(ves.erstelle("Ves", Main.getSpieler2()));
				}
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "zwerge" && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).getKommandoWert()>belegt1) {
					teilnehmer.add(zwerg1.erstelle("Zwergensöldner", Main.getSpieler1()));
					belegt1++;
				}
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "zwerge" && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).getKommandoWert()>belegt2) {
					teilnehmer.add(zwerg2.erstelle("Zwergensöldner", Main.getSpieler2()));
					belegt2++;
				}
				
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "zwerge" && teilnehmer.get(i).getBesitzer() == Main.getSpieler1() && teilnehmer.get(i).getKommandoWert()>belegt1) {
					teilnehmer.add(zwerg1.erstelle("Zwergensöldner", Main.getSpieler1()));
				}
				if(teilnehmer.get(i).getUltimate().getEffectKey() == "zwerge" && teilnehmer.get(i).getBesitzer() == Main.getSpieler2() && teilnehmer.get(i).getKommandoWert()>belegt2) {
					teilnehmer.add(zwerg2.erstelle("Zwergensöldner", Main.getSpieler2()));
				}
			}
		}
		
		
		Main.battlelog.add("Passive Effekte werden ausgeführt:");
		Main.battlelog.add("---------------------------------------------------");
		
		for(int passiveEffekt=0;passiveEffekt<teilnehmer.size();passiveEffekt++) {
		

			if(teilnehmer.get(passiveEffekt).getSkill1() != null && teilnehmer.get(passiveEffekt).getSkill1().isPassive())
				teilnehmer.get(passiveEffekt).getSkill1().triggerEffekt(teilnehmer, teilnehmer.get(passiveEffekt).getBesitzer(), teilnehmer.get(passiveEffekt).getSkill1().getEffectKey(), teilnehmer.get(passiveEffekt));
			if(teilnehmer.get(passiveEffekt).getSkill2() != null && teilnehmer.get(passiveEffekt).getSkill2().isPassive())
				teilnehmer.get(passiveEffekt).getSkill2().triggerEffekt(teilnehmer, teilnehmer.get(passiveEffekt).getBesitzer(), teilnehmer.get(passiveEffekt).getSkill2().getEffectKey(), teilnehmer.get(passiveEffekt));
			if(teilnehmer.get(passiveEffekt).getSkill3() != null && teilnehmer.get(passiveEffekt).getSkill3().isPassive())
				teilnehmer.get(passiveEffekt).getSkill3().triggerEffekt(teilnehmer, teilnehmer.get(passiveEffekt).getBesitzer(), teilnehmer.get(passiveEffekt).getSkill3().getEffectKey(), teilnehmer.get(passiveEffekt));
			if(teilnehmer.get(passiveEffekt).getSkill4() != null && teilnehmer.get(passiveEffekt).getSkill4().isPassive())
				teilnehmer.get(passiveEffekt).getSkill4().triggerEffekt(teilnehmer, teilnehmer.get(passiveEffekt).getBesitzer(), teilnehmer.get(passiveEffekt).getSkill4().getEffectKey(), teilnehmer.get(passiveEffekt));
			if(teilnehmer.get(passiveEffekt).getUltimate() != null && teilnehmer.get(passiveEffekt).getUltimate().isPassive())
				teilnehmer.get(passiveEffekt).getUltimate().triggerEffekt(teilnehmer, teilnehmer.get(passiveEffekt).getBesitzer(), teilnehmer.get(passiveEffekt).getUltimate().getEffectKey(), teilnehmer.get(passiveEffekt));
		}
		
		Main.battlelog.add("---------------------------------------------------");
		
		
		Main.battlelog.add("Artefakteffekte werden durchlaufen:");
		Main.battlelog.add("---------------------------------------------------");
		
		for(int i = 0; i<teilnehmer.size(); i++) {
			
			if(teilnehmer.get(i).isIstKommandant()) {
				
				if(teilnehmer.get(i).getArtefakte() != null) {
					for(int j = 0; j<teilnehmer.get(i).getArtefakte().length;j++) {
						 if(teilnehmer.get(i).getArtefakte()[j] != null && !teilnehmer.get(i).getArtefakte()[j].isIstKampfEffekt()) {
							 
								teilnehmer.get(i).getArtefakte()[j].triggerEffekt(teilnehmer, teilnehmer.get(i).getArtefakte()[j].getBonus(), teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getArtefakte()[j].getEffectKey());

						 }
						
					}
					
					
				}
				
			}
				
			
		}
		
		//Shuffle der Teilnehmerliste, um Spieler 1 Vorteil zu nehmen
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Durcheinanderwürfeln der Teilnehmer:");
		Collections.shuffle(teilnehmer);

		Main.battlelog.add("---------------------------------------------------");
		
		Main.battlelog.add("Berechnung der Initiative:");
		Main.battlelog.add("---------------------------------------------------");
		teilnehmer = initRechner(teilnehmer);
		Main.battlelog.add("---------------------------------------------------");
		
		for(int i=0;i<teilnehmer.size();i++) {
			
			teilnehmer.get(i).setAngerichteterSchaden(0);
			teilnehmer.get(i).setErlittenerSchaden(0);
			
		}
		
		this.prioListe = new ArrayList<Teilnehmer>();
		Main.battlelog.add("Berechnung der Prioritätsliste:");
		Main.battlelog.add("---------------------------------------------------");
		prioListe = (ArrayList<Teilnehmer>) teilnehmer.clone();
		prioListe = prioRechner(prioListe);
		Main.battlelog.add("---------------------------------------------------");
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Vorkriegsphase Endet...");
		Main.battlelog.add("---------------------------------------------------");
		
		return teilnehmer;
	}
	
	public ArrayList<Teilnehmer> kriegsPhase(ArrayList<Teilnehmer> teilnehmer, Spieler angreifer, Spieler verteidiger) {
		
		boolean angreiferHasLeben = false;
		boolean verteidigerHasLeben = false;
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Kriegsphase beginnt:");
		Main.battlelog.add("---------------------------------------------------");

		
		for(int runde=1;runde<=10;runde++) {
			
			Main.battlelog.add("Runde " + runde + " beginnt!");
			Main.battlelog.add("---------------------------------------------------");
			
			for(int i=0;i<teilnehmer.size();i++) {

			
				if(runde == 1) {
					
					if(teilnehmer.get(i).getSkill1() != null) {
						if(teilnehmer.get(i).getSkill1().isHatEile())
							teilnehmer.get(i).getSkill1().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill1().getEffectKey(), teilnehmer.get(i));
					}
					if(teilnehmer.get(i).getSkill2() != null) {
						if(teilnehmer.get(i).getSkill2().isHatEile())
							teilnehmer.get(i).getSkill2().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill2().getEffectKey(), teilnehmer.get(i));
					}
					if(teilnehmer.get(i).getSkill3() != null) {
						if(teilnehmer.get(i).getSkill3().isHatEile())
							teilnehmer.get(i).getSkill3().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill3().getEffectKey(), teilnehmer.get(i));
					}
					if(teilnehmer.get(i).getSkill4() != null) {
						if(teilnehmer.get(i).getSkill4().isHatEile())
							teilnehmer.get(i).getSkill4().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill4().getEffectKey(), teilnehmer.get(i));
					}
					if(teilnehmer.get(i).getUltimate() != null) {
						if(teilnehmer.get(i).getUltimate().isHatEile())
							teilnehmer.get(i).getUltimate().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getUltimate().getEffectKey(), teilnehmer.get(i));
					}

					
					if(teilnehmer.get(i).getSkill1() != null) {
						if(teilnehmer.get(i).getSkill1().getEffectKey() == "noDamageFirstRound") {
							teilnehmer.get(i).setLebenActual(teilnehmer.get(i).getLeben());
							Main.battlelog.add("Effekt von: " + teilnehmer.get(i).getBesitzer().getName() + " " + teilnehmer.get(i).getName() + "'s " + teilnehmer.get(i).getSkill1().getName() + " - Die Einheit regeneriert jeglichen Schaden zum Anfang nächster Runde!");
						}
					}
					
				}
				
				if(runde == 2) {
					
					if(teilnehmer.get(i).getSkill1() != null) {
						if(teilnehmer.get(i).getSkill1().getEffectKey() == "noDamageFirstRound") {
							
							teilnehmer.get(i).setGeheilterSchaden(teilnehmer.get(i).getLeben()-teilnehmer.get(i).getLebenActual());
							teilnehmer.get(i).setLebenActual(teilnehmer.get(i).getLeben());
							teilnehmer.get(i).setErlittenerSchaden(0);
							
							Main.battlelog.add(teilnehmer.get(i).getBesitzer().getName() + " " + teilnehmer.get(i).getName() + "'s " + teilnehmer.get(i).getSkill1().getName() + " - Die Werte wurden wiederhergestellt!");
						}
					}
					
				}
			}
			
			
			for(int i=0;i<teilnehmer.size();i++) {
				
				angreiferHasLeben = false;
				verteidigerHasLeben = false;
				
				for(int j = 0;j<teilnehmer.size();j++) {
					
					if(teilnehmer.get(j).getLebenActual()>0 && teilnehmer.get(j).isIstKommandant() == false && teilnehmer.get(j).getBesitzer().equals(angreifer))
						angreiferHasLeben = true;
					
					if(teilnehmer.get(j).getLebenActual()>0 && teilnehmer.get(j).isIstKommandant() == false && teilnehmer.get(j).getBesitzer().equals(verteidiger))
						verteidigerHasLeben = true;

				}
				
				if(angreiferHasLeben == false) {
					
					return writeDefenderWin(teilnehmer);
				}
				
				if(verteidigerHasLeben == false) {
					
					return writeAttackerWin(teilnehmer);
				}
				
				
				if(teilnehmer.get(i).getTurnsStunned() <= 0) {
					if(teilnehmer.get(i).getLebenActual()>0 || teilnehmer.get(i).isIstKommandant()) {
						if(teilnehmer.get(i).getSkill1() != null  && runde % teilnehmer.get(i).getSkill1().getCooldown() == 0)
							teilnehmer.get(i).getSkill1().triggerEffekt(prioListe, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill1().getEffectKey(), teilnehmer.get(i));
						if(teilnehmer.get(i).getSkill2() != null && runde % teilnehmer.get(i).getSkill2().getCooldown() == 0)
							teilnehmer.get(i).getSkill2().triggerEffekt(prioListe, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill2().getEffectKey(), teilnehmer.get(i));
						if(teilnehmer.get(i).getSkill3() != null && runde % teilnehmer.get(i).getSkill3().getCooldown() == 0)
							teilnehmer.get(i).getSkill3().triggerEffekt(prioListe, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill3().getEffectKey(), teilnehmer.get(i));
						if(teilnehmer.get(i).getSkill4() != null && runde % teilnehmer.get(i).getSkill4().getCooldown() == 0)
							teilnehmer.get(i).getSkill4().triggerEffekt(prioListe, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill4().getEffectKey(), teilnehmer.get(i));
						if(teilnehmer.get(i).getUltimate() != null && runde % teilnehmer.get(i).getUltimate().getCooldown() == 0)
							teilnehmer.get(i).getUltimate().triggerEffekt(prioListe, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getUltimate().getEffectKey(), teilnehmer.get(i));
						
						
						for(int a=0;a<teilnehmer.size();a++) {
							
							angreiferHasLeben = false;
							verteidigerHasLeben = false;
							
							for(int j = 0;j<teilnehmer.size();j++) {
								
								if(teilnehmer.get(j).getLebenActual()>0 && teilnehmer.get(j).isIstKommandant() == false && teilnehmer.get(j).getBesitzer().equals(angreifer))
									angreiferHasLeben = true;
								
								if(teilnehmer.get(j).getLebenActual()>0 && teilnehmer.get(j).isIstKommandant() == false && teilnehmer.get(j).getBesitzer().equals(verteidiger))
									verteidigerHasLeben = true;
								
							}
							
							if(angreiferHasLeben == false) {
								
								return writeDefenderWin(teilnehmer);
							}
							
							if(verteidigerHasLeben == false) {
								
								return writeAttackerWin(teilnehmer);
							}
						}
					}
					
					
					
					
					angriff(teilnehmer.get(i), teilnehmer);
				}
				else if (teilnehmer.get(i).getTurnsStunned() > 0) {
					Main.battlelog.add(teilnehmer.get(i).getBesitzer().getName() + "'s " + teilnehmer.get(i).getName() + " betäubt! keine Aktion möglich!");
					int turnsStunned = (teilnehmer.get(i).getTurnsStunned())-1;
					teilnehmer.get(i).setTurnsStunned(turnsStunned);
				}
					
				
				

			}
			
			Main.battlelog.add("---------------------------------------------------");
			
		}
		
		
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Schlacht endet...");
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                  UNENTSCHIEDEN                    ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("---------------------------------------------------");
		MainWindow.lblVictory.setIcon(new ImageIcon(MainWindow.class.getResource("/source/draw.png")));
		showDamage(teilnehmer);
		
		return teilnehmer;
		
	}

	private ArrayList<Teilnehmer> writeDefenderWin(ArrayList<Teilnehmer> teilnehmer) {
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Schlacht endet...");
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("              VERTEIDIGER GEWINNT                  ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("---------------------------------------------------");
		MainWindow.lblVictory.setIcon(new ImageIcon(MainWindow.class.getResource("/source/defeat.png")));
		showDamage(teilnehmer);
		
		return teilnehmer;
	}

	private ArrayList<Teilnehmer> writeAttackerWin(ArrayList<Teilnehmer> teilnehmer) {
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("Die Schlacht endet...");
		Main.battlelog.add("---------------------------------------------------");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                ANGREIFER GEWINNT                  ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("                                                   ");
		Main.battlelog.add("---------------------------------------------------");
		MainWindow.lblVictory.setIcon(new ImageIcon(MainWindow.class.getResource("/source/victory.png")));
		showDamage(teilnehmer);
		
		return teilnehmer;
	}

	private void showDamage(ArrayList<Teilnehmer> teilnehmer) {
		for(int zeigeschaden=0;zeigeschaden<teilnehmer.size();zeigeschaden++) {
			
			Main.battlelog.add(teilnehmer.get(zeigeschaden).getBesitzer().getName() + "'s " + teilnehmer.get(zeigeschaden).getName() + " hat " + teilnehmer.get(zeigeschaden).getAngerichteterSchaden() + " Schaden angerichtet!");
			if(teilnehmer.get(zeigeschaden).getErlittenerSchaden()>0)
				Main.battlelog.add(teilnehmer.get(zeigeschaden).getBesitzer().getName() + "'s " + teilnehmer.get(zeigeschaden).getName() + " hat " + teilnehmer.get(zeigeschaden).getErlittenerSchaden() + " Schaden erlitten!");
			if(teilnehmer.get(zeigeschaden).getGeheilterSchaden()>0)
				Main.battlelog.add(teilnehmer.get(zeigeschaden).getBesitzer().getName() + "'s " + teilnehmer.get(zeigeschaden).getName() + " hat " + teilnehmer.get(zeigeschaden).getGeheilterSchaden() + " Leben geheilt!");
			
		}
	}
	
	private void konter(Teilnehmer angreifer, Teilnehmer konterer, int schaden) {
		
		if(!angreifer.isIstKommandant()) {
			
			angreifer.setLebenActual(angreifer.getLebenActual()-schaden);
			konterer.setAngerichteterSchaden(konterer.getAngerichteterSchaden()+schaden);
			angreifer.setErlittenerSchaden(angreifer.getErlittenerSchaden()+schaden);
			Main.battlelog.add("Effekt von: " + konterer.getBesitzer().getName() + " " + konterer.getName() + "'s " + konterer.getSkill1().getName() + " - Ein Konterangriff wurde ausgeführt: " + 
					angreifer.getName() + " wurden getroffen und verlieren " + schaden + " Leben!" + angreifer.getName() + " hat noch " + angreifer.getLebenActual() + " Leben. Der Schaden wird dementsprechend reduziert.");
			
		}
	}
	
	public int checkDouble(Teilnehmer angreifer, int doubleAttack) {
		
		if(angreifer.getSkill1() != null) {
			if(angreifer.getSkill1().getEffectKey() == "doubleAttack") {
				doubleAttack = (int) ((Math.random()*100)+1)/(angreifer.getSkill1().getSchadensMulitplikator());
				if(doubleAttack>0)
					doubleAttack = -1;
			}
		}
		
		if(angreifer.getSkill2() != null) {
			if(angreifer.getSkill2().getEffectKey() == "doubleAttack") {
				doubleAttack = (int) ((Math.random()*100)+1)/(angreifer.getSkill2().getSchadensMulitplikator());
				if(doubleAttack>0)
					doubleAttack = -1;
			}
		}
		
		if(angreifer.getSkill3() != null) {
			if(angreifer.getSkill3().getEffectKey() == "doubleAttack") {
				doubleAttack = (int) ((Math.random()*100)+1)/(angreifer.getSkill3().getSchadensMulitplikator());
				if(doubleAttack>0)
					doubleAttack = -1;
			}
		}
		
		if(angreifer.getSkill4() != null) {
			if(angreifer.getSkill4().getEffectKey() == "doubleAttack") {
				doubleAttack = (int) ((Math.random()*100)+1)/(angreifer.getSkill4().getSchadensMulitplikator());
				if(doubleAttack>0)
					doubleAttack = -1;
			}
		}
		
		if(angreifer.getUltimate() != null) {
			if(angreifer.getUltimate().getEffectKey() == "doubleAttack") {
				doubleAttack = (int) ((Math.random()*100)+1)/(angreifer.getUltimate().getSchadensMulitplikator());
				if(doubleAttack>0)
					doubleAttack = -1;
			}
		}
		if(doubleAttack == -1)
			Main.battlelog.add("Doppelschlag von: " + angreifer.getBesitzer().getName() + " " + angreifer.getName() + "'s " + angreifer.getSkill1().getName() + ". Es folgen 2 Angriffe!");
		return doubleAttack;
		
	}
	
	public void angriff(Teilnehmer angreifer, ArrayList<Teilnehmer> teilnehmer) {
		
		if(angreifer.getLebenActual()>0) {
			
			int schaden = angreifer.getSchadenActual();
			int doubleAttack = 0;
			doubleAttack = checkDouble(angreifer, doubleAttack);
			
			for(int doubleAA = doubleAttack;doubleAA < 1; doubleAA++) {

				ArrayList<Teilnehmer> opportunities = new ArrayList<Teilnehmer>();
				for(int i =0;i<teilnehmer.size();i++) {
					if(teilnehmer.get(i).getBesitzer() != angreifer.getBesitzer() && !teilnehmer.get(i).isIstKommandant() && teilnehmer.get(i).getLebenActual()>0)
						opportunities.add(teilnehmer.get(i));
				}
				for(int i =0;i<opportunities.size();i++) {
					Main.battlelog.add("Mögliche Ziele für " + angreifer.getBesitzer().getName() + "'s " + angreifer.getName() + ": " + opportunities.get(i).getBesitzer().getName() + "'s " + opportunities.get(i).getName());
				}
				
				if(opportunities.size()==0) {
					Main.battlelog.add("Keine Ziele für einen weiteren Angriff...");
					return;
				}
					
				Teilnehmer ziel = zielauswaehlen(opportunities);
				
				if(ziel.getCounter() != (angreifer.getId())) {
					
					int schwaechung = (100*angreifer.getLebenActual()/angreifer.getLeben());
					schaden = ((angreifer.getSchadenActual()*((100-ziel.getRuestungProzentActual()))))*(schwaechung);
					schaden = schaden/10000;
					schaden = (int) (schaden * (1 + Math.random() * angreifer.getInitActual()/1000));
					
					if(ziel.getSkill1() != null) {
						
						if(ziel.getSkill1().getEffectKey() == "reduceDamagePercent") {
							int vorher = schaden;
							int reduction = ziel.getSkill1().getDamageReduction();
							schaden = schaden*(100-reduction)/100;
							Main.battlelog.add("Effekt von: " + ziel.getBesitzer().getName() + " " + ziel.getName() + "'s " + ziel.getSkill1().getName() + " - Der Schaden wurde von " + vorher + " auf " + schaden + " reduziert.");
						}
						
					}
					
					ziel.setLebenActual(ziel.getLebenActual()-schaden);
					angreifer.setAngerichteterSchaden(angreifer.getAngerichteterSchaden()+schaden);
					ziel.setErlittenerSchaden(ziel.getErlittenerSchaden()+schaden);
					Main.battlelog.add(ziel.getName() + " wurden getroffen und verlieren " + schaden + " Leben!" + ziel.getName() + " hat noch " + ziel.getLebenActual() + " Leben. Der Schaden wird dementsprechend reduziert.");
					if(ziel.getLebenActual()<=0) {
						Main.battlelog.add( ziel.getBesitzer().getName() + "'s " + ziel.getName() + " wurden getötet! Solange diese Einheit nicht geheilt wird, wird sie nach dem Kampf aus der Truppenliste entfernt.");
					}
					
				}
					
				if(ziel.getCounter() == (angreifer.getId())) {
					
					int schwaechung = (100*angreifer.getLebenActual()/angreifer.getLeben());
					schaden = angreifer.getSchadenActual()*schwaechung;
					schaden = schaden/100;
					schaden = (int) (schaden * (1 + Math.random() * angreifer.getInitActual()/1000));
					
					ziel.setLebenActual(ziel.getLebenActual()-schaden);
					angreifer.setAngerichteterSchaden(angreifer.getAngerichteterSchaden()+schaden);
					ziel.setErlittenerSchaden(ziel.getErlittenerSchaden()+schaden);
					Main.battlelog.add("Ein guter Treffer! Die Rüstung wird von einer Kontereinheit ignoriert!" + angreifer.getName() + " kontern " + ziel.getName());
					Main.battlelog.add(ziel.getName() + " wurden getroffen und verlieren " + schaden + " Leben!" + ziel.getName() + " hat noch " + ziel.getLebenActual() + " Leben. Der Schaden wird dementsprechend reduziert.");
					if(ziel.getLebenActual()<=0) {
						Main.battlelog.add(ziel.getBesitzer().getName() + "'s " + ziel.getName() + " wurden getötet! Solange diese Einheit nicht geheilt wird, wird sie nach dem Kampf aus der Truppenliste entfernt.");
					}
				}
				
				if(ziel.getSkill1() != null) {
					if(ziel.getSkill1().getEffectKey() == "konter") {
						schaden = 0;
						schaden = (ziel.getSchadenActual() * ziel.getSkill1().getSchadensMulitplikator())/100;
						konter(angreifer, ziel, schaden);
					}
				}
			}
		}
	}

	private Teilnehmer zielauswaehlen(ArrayList<Teilnehmer> opportunities) {
		Teilnehmer ziel;
		
		if (opportunities.size()>1)
		{
			Random rand = new Random();
			Teilnehmer random = opportunities.get(rand.nextInt(opportunities.size()));
			ziel = random;
		}
		else
			ziel = opportunities.get(0);
		Main.battlelog.add("Als Ziel wurde: " + ziel.getName() + " ausgewählt!");		
		return ziel;
	}

}
