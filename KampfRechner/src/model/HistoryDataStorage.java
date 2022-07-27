package model;

import java.io.Serializable;
import java.util.ArrayList;

public class HistoryDataStorage implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Teilnehmer> teilnehmer = new ArrayList<Teilnehmer>();
	public String battleLog = new String();
	public Spieler s1;
	public Spieler s2;
	public Teilnehmer held1;
	public Teilnehmer held2;
	

}
