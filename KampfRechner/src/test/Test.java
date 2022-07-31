package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JComboBox;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 96, 200, 41);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Speichern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File folder = new File("./src/saves");
				File[] listOfFiles = folder.listFiles();

				for (int i = 0; i < listOfFiles.length; i++) {
				  if (listOfFiles[i].isFile()) {
				    System.out.println("File " + listOfFiles[i].getName());
				  } else if (listOfFiles[i].isDirectory()) {
				    System.out.println("Directory " + listOfFiles[i].getName());
				  }
				}
				
				
			}
		});
		btnNewButton.setBounds(229, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAudio = new JButton("Abspielen");
		btnAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					File file = new File("./fx/battlecry.wav");
					AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
					clip.open(audioStream);
					
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnAudio.setBounds(118, 148, 89, 23);
		contentPane.add(btnAudio);
	}
}
