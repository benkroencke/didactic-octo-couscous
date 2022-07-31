package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

	Clip clip;
	URL soundURL[] = new URL[30];
	
	public Sound() {
		
		soundURL[0] = getClass().getResource("/sounds/battlecry.wav");
		soundURL[1] = getClass().getResource("/sounds/AUBERON.wav");
		soundURL[2] = getClass().getResource("/sounds/CARANTHIR.wav");
		soundURL[3] = getClass().getResource("/sounds/CERYS.wav");
		soundURL[4] = getClass().getResource("/sounds/CIRI.wav");
		soundURL[5] = getClass().getResource("/sounds/CRACH.wav");
		soundURL[6] = getClass().getResource("/sounds/DETTLAFF.wav");
		soundURL[7] = getClass().getResource("/sounds/DRAUG.wav");
		soundURL[8] = getClass().getResource("/sounds/EMHYR.wav");
		soundURL[9] = getClass().getResource("/sounds/EREDIN.wav");
		soundURL[10] = getClass().getResource("/sounds/FALIBOR.wav");
		soundURL[11] = getClass().getResource("/sounds/FOLTEST.wav");
		soundURL[12] = getClass().getResource("/sounds/GERALT.wav");
		soundURL[13] = getClass().getResource("/sounds/HOCHLANDKRIEGSHERR.wav");
		soundURL[14] = getClass().getResource("/sounds/IMLERITH.wav");
		soundURL[15] = getClass().getResource("/sounds/KIKIMORE.wav");
		soundURL[16] = getClass().getResource("/sounds/LETHO.wav");
		soundURL[17] = getClass().getResource("/sounds/MAUSSACK.wav");
		soundURL[18] = getClass().getResource("/sounds/MORVRAN.wav");
		soundURL[19] = getClass().getResource("/sounds/NATALIS.wav");
		soundURL[20] = getClass().getResource("/sounds/ROCHE.wav");
		soundURL[21] = getClass().getResource("/sounds/STEFANSKELLEN.wav");
		soundURL[22] = getClass().getResource("/sounds/TRISS.wav");
		soundURL[23] = getClass().getResource("/sounds/VESEMIR.wav");
		soundURL[24] = getClass().getResource("/sounds/WALDSCHRAT.wav");
		soundURL[25] = getClass().getResource("/sounds/YENNEFER.wav");



	}
	
	public void setFile(int i) {
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void play() {
		clip.start();
	}
	
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		clip.stop();
	}
	
}
