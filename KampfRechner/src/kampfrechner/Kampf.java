package kampfrechner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import model.Spieler;
import model.Teilnehmer;

public class Kampf {

	private final static int runden = 10;
	private ArrayList<Teilnehmer> spieler1Einheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer spieler1Kommandant;
	private ArrayList<Teilnehmer> spieler2Einheiten = new ArrayList<Teilnehmer>();
	private Teilnehmer spieler2Kommandant;
	
	public Kampf(ArrayList<Teilnehmer> einheiten1, ArrayList<Teilnehmer> einheiten2, Teilnehmer spieler1Kommandant, Teilnehmer spieler2Kommandant) {
		super();
		this.spieler1Einheiten = einheiten1;
		this.spieler1Kommandant = spieler1Kommandant;
		this.spieler2Einheiten = einheiten2;
		this.spieler2Kommandant = spieler2Kommandant;
	}
	
	public ArrayList<Teilnehmer> initRechner(ArrayList<Teilnehmer> teilnehmer){
		
		System.out.println("---------------------------------------------------");
		System.out.println("Kalkuliert Reihenfolge...");
		System.out.println("---------------------------------------------------");
		
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
			System.out.println(sortierListe.get(i-1).getBesitzer().getName() + "'s " + sortierListe.get(i-1).getName() + " agiert an " + i + ". Stelle jeder Runde!" + " --- Initiativewert: " + sortierListe.get(i-1).getInitActual());
		}
		
		return sortierListe;
		
	}
	
	public ArrayList<Teilnehmer> vorKriegsPhase(ArrayList<Teilnehmer> teilnehmer) {
		
		System.out.println("---------------------------------------------------");
		System.out.println("Die Vorkriegsphase beginnt:");
		System.out.println("---------------------------------------------------");

		System.out.println("Passive Effekte werden ausgeführt:");
		System.out.println("---------------------------------------------------");
		
		//TODO
		
		System.out.println("---------------------------------------------------");
		
		
		System.out.println("Artefakteffekte werden durchlaufen:");
		System.out.println("---------------------------------------------------");
		
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
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Berechnung der Initiative:");
		System.out.println("---------------------------------------------------");
		teilnehmer = initRechner(teilnehmer);
		System.out.println("---------------------------------------------------");
		
		for(int i=0;i<teilnehmer.size();i++) {
			
			teilnehmer.get(i).setAngerichteterSchaden(0);
			teilnehmer.get(i).setErlittenerSchaden(0);
			
		}
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("Die Vorkriegsphase Endet...");
		System.out.println("---------------------------------------------------");
		
		return teilnehmer;
	}
	
	public ArrayList<Teilnehmer> kriegsPhase(ArrayList<Teilnehmer> teilnehmer, Spieler angreifer, Spieler verteidiger) {
		
		boolean angreiferHasLeben = false;
		boolean verteidigerHasLeben = false;
		
		System.out.println("---------------------------------------------------");
		System.out.println("Die Kriegsphase beginnt:");
		System.out.println("---------------------------------------------------");

		
		for(int runde=1;runde<=10;runde++) {
			
			System.out.println("Runde " + runde + " beginnt!");
			System.out.println("---------------------------------------------------");
			
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
				
				
				if(teilnehmer.get(i).getLebenActual()>0 || teilnehmer.get(i).isIstKommandant()) {
					if(teilnehmer.get(i).getSkill1() != null && teilnehmer.get(i).getSkill1().isActive() && runde % teilnehmer.get(i).getSkill1().getCooldown() == 0)
						teilnehmer.get(i).getSkill1().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill1().getEffectKey(), teilnehmer.get(i));
					if(teilnehmer.get(i).getSkill2() != null && teilnehmer.get(i).getSkill2().isActive() && runde % teilnehmer.get(i).getSkill2().getCooldown() == 0)
						teilnehmer.get(i).getSkill2().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill2().getEffectKey(), teilnehmer.get(i));
					if(teilnehmer.get(i).getSkill3() != null && teilnehmer.get(i).getSkill3().isActive() && runde % teilnehmer.get(i).getSkill3().getCooldown() == 0)
						teilnehmer.get(i).getSkill3().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill3().getEffectKey(), teilnehmer.get(i));
					if(teilnehmer.get(i).getSkill4() != null && teilnehmer.get(i).getSkill4().isActive() && runde % teilnehmer.get(i).getSkill4().getCooldown() == 0)
						teilnehmer.get(i).getSkill4().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getSkill4().getEffectKey(), teilnehmer.get(i));
					if(teilnehmer.get(i).getUltimate() != null && teilnehmer.get(i).getUltimate().isActive() && runde % teilnehmer.get(i).getUltimate().getCooldown() == 0)
						teilnehmer.get(i).getUltimate().triggerEffekt(teilnehmer, teilnehmer.get(i).getBesitzer(), teilnehmer.get(i).getUltimate().getEffectKey(), teilnehmer.get(i));
					
					
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
					
					
					
					angriff(teilnehmer.get(i), teilnehmer);
				}
					
				
				

			}
			
			System.out.println("---------------------------------------------------");
			
		}
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("Die Schlacht endet...");
		System.out.println("---------------------------------------------------");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("*                  UNENTSCHIEDEN                  *");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("---------------------------------------------------");
		
		showDamage(teilnehmer);
		
		return teilnehmer;
		
	}

	private ArrayList<Teilnehmer> writeDefenderWin(ArrayList<Teilnehmer> teilnehmer) {
		System.out.println("---------------------------------------------------");
		System.out.println("Die Schlacht endet...");
		System.out.println("---------------------------------------------------");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("*              ANGREIFER VERLIERT                 *");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("---------------------------------------------------");
		
		showDamage(teilnehmer);
		
		return teilnehmer;
	}

	private ArrayList<Teilnehmer> writeAttackerWin(ArrayList<Teilnehmer> teilnehmer) {
		System.out.println("---------------------------------------------------");
		System.out.println("Die Schlacht endet...");
		System.out.println("---------------------------------------------------");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("*              VERTEIDIGER VERLIERT               *");
		System.out.println("*                                                 *");
		System.out.println("*                                                 *");
		System.out.println("---------------------------------------------------");
		
		showDamage(teilnehmer);
		
		return teilnehmer;
	}

	private void showDamage(ArrayList<Teilnehmer> teilnehmer) {
		for(int zeigeschaden=0;zeigeschaden<teilnehmer.size();zeigeschaden++) {
			
			System.out.println(teilnehmer.get(zeigeschaden).getBesitzer().getName() + "'s " + teilnehmer.get(zeigeschaden).getName() + " hat " + teilnehmer.get(zeigeschaden).getAngerichteterSchaden() + " Schaden angerichtet!");
			if(teilnehmer.get(zeigeschaden).getErlittenerSchaden()>0)
				System.out.println(teilnehmer.get(zeigeschaden).getBesitzer().getName() + "'s " + teilnehmer.get(zeigeschaden).getName() + " hat " + teilnehmer.get(zeigeschaden).getErlittenerSchaden() + " Schaden erlitten!");
			
		}
	}
	
	public void angriff(Teilnehmer angreifer, ArrayList<Teilnehmer> teilnehmer) {
		ArrayList<Teilnehmer> opportunities = new ArrayList<Teilnehmer>();
		for(int i =0;i<teilnehmer.size();i++) {
			if(teilnehmer.get(i).getBesitzer() != angreifer.getBesitzer() && !teilnehmer.get(i).isIstKommandant() && teilnehmer.get(i).getLebenActual()>0)
				opportunities.add(teilnehmer.get(i));
		}
		for(int i =0;i<opportunities.size();i++) {
			System.out.println("Mögliche Ziele für " + angreifer.getBesitzer().getName() + "'s " + angreifer.getName() + ": " + opportunities.get(i).getBesitzer().getName() + "'s " + opportunities.get(i).getName());
		}
		
		Teilnehmer ziel = zielauswaehlen(opportunities);
		
		if(ziel.getCounter() != (angreifer.getId())) {
			
			int schwaechung = (100*angreifer.getLebenActual()/angreifer.getLeben());
			int schaden = ((angreifer.getSchadenActual()*((100-ziel.getRuestungProzentActual()))))*(schwaechung);
			schaden = schaden/10000;
			schaden = (int) (schaden * (1 + Math.random() * angreifer.getInitActual()/1000));
			
			ziel.setLebenActual(ziel.getLebenActual()-schaden);
			angreifer.setAngerichteterSchaden(angreifer.getAngerichteterSchaden()+schaden);
			ziel.setErlittenerSchaden(ziel.getErlittenerSchaden()+schaden);
			System.out.println(ziel.getName() + " wurden getroffen und verlieren " + schaden + " Leben!" + ziel.getName() + " hat noch " + ziel.getLebenActual() + " Leben. Der Schaden wird dementsprechend reduziert.");
			if(ziel.getLebenActual()<=0) {
				System.out.println( ziel.getBesitzer().getName() + "'s " + ziel.getName() + " wurden getötet! Solange diese Einheit nicht geheilt wird, wird sie nach dem Kampf aus der Truppenliste entfernt.");
			}
			
		}
			
		if(ziel.getCounter() == (angreifer.getId())) {
			
			int schwaechung = (100*angreifer.getLebenActual()/angreifer.getLeben());
			int schaden = angreifer.getSchadenActual()*schwaechung;
			schaden = schaden/100;
			schaden = (int) (schaden * (1 + Math.random() * angreifer.getInitActual()/1000));
			
			ziel.setLebenActual(ziel.getLebenActual()-schaden);
			angreifer.setAngerichteterSchaden(angreifer.getAngerichteterSchaden()+schaden);
			ziel.setErlittenerSchaden(ziel.getErlittenerSchaden()+schaden);
			System.out.println("Ein guter Treffer! Die Rüstung wird von einer Kontereinheit ignoriert!" + angreifer.getName() + " kontern " + ziel.getName());
			System.out.println(ziel.getName() + " wurden getroffen und verlieren " + schaden + " Leben!" + ziel.getName() + " hat noch " + ziel.getLebenActual() + " Leben. Der Schaden wird dementsprechend reduziert.");
			if(ziel.getLebenActual()<=0) {
				System.out.println(ziel.getBesitzer().getName() + "'s " + ziel.getName() + " wurden getötet! Solange diese Einheit nicht geheilt wird, wird sie nach dem Kampf aus der Truppenliste entfernt.");
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
        System.out.println("Als Ziel wurde: " + ziel.getName() + " ausgewählt!");		
		return ziel;
	}

}
