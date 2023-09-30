import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}	
	
	public void run() {
		int currentAvenger = 0;
		int currentName = 0;
		String[][] validAvengers = new String[currentAvenger][currentName];
		validAvengers[0][0] = "captainamerica";
		validAvengers[0][1] = "rogers";
		validAvengers[0][2] = "evans";
		
		validAvengers[1][0] = "ironman";
		validAvengers[1][1] = "stark";
		validAvengers[1][2] = "downey";
		
		validAvengers[2][0] = "blackwidow";
		validAvengers[2][1] = "romanoff";
		validAvengers[2][2] = "johansson";
		
		validAvengers[3][0] = "hulk";
		validAvengers[3][1] = "banner";
		validAvengers[3][2] = "ruffalo";
		
		validAvengers[4][0] = "blackpanther";
		validAvengers[4][1] = "tchalla";
		validAvengers[4][2] = "boseman";

		validAvengers[5][0] = "thor";
		validAvengers[5][1] = "odinson";
		validAvengers[5][2] = "hemsworth";

		validAvengers[6][0] = "hawkeye";
		validAvengers[6][1] = "barton";
		validAvengers[6][2] = "renner";
		
		validAvengers[7][0] = "warmachine";
		validAvengers[7][1] = "rhodes";
		validAvengers[7][2] = "cheadle";
		
		validAvengers[8][0] = "spiderman";
		validAvengers[8][1] = "parker";
		validAvengers[8][2] = "holland";

		validAvengers[9][0] = "wintersoldier";
		validAvengers[9][1] = "barnes";
		validAvengers[9][2] = "stan";
		
		ArrayList<Avenger> avengers = new ArrayList<Avenger>();
		Scanner input = new Scanner(System.in);
		int wordCount = 0;
		int avengerCount = 0;
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
				
				for (currentAvenger = 0; currentAvenger < 10; currentAvenger ++) {
					if (word.equals(validAvengers[currentAvenger][0])) {
						switch(currentAvenger) {
						case 0:
							break; // captainameruca
						case 1:
							break; // ironman
						case 2:
							break; // blackwidow
						case 3:
							break; // hulk
						case 4:
							break; // blackpanther
						case 5:
							break; // thor
						case 6:
							break; // hawkeye
						case 7:
							break; // warmachine
						case 8: 
							break; // spiderman
						case 9: 
							break; // wintersoldier
						}
					}
					else if (word.equals(validAvengers[currentAvenger][1])) {
						switch(currentAvenger) {
						case 0:
							break; // rogers
						case 1:
							break; // stark
						case 2:
							break; // romanoff
						case 3:
							break; // banner
						case 4:
							break; // tchalla
						case 5:
							break; // odinson
						case 6:
							break; // barton
						case 7:
							break; // rhodes
						case 8: 
							break; // holland
						case 9: 
							break; // barnes
						}
					}
					else if (word.equals(validAvengers[currentAvenger][2])) {
						switch(currentAvenger) {
						case 0:
							break; // evans
						case 1:
							break; // downey
						case 2:
							break; // johansson
						case 3:
							break; // ruffalo
						case 4:
							break; // boseman
						case 5:
							break; // hemsworth
						case 6:
							break; // renner
						case 7:
							break; // cheadle
						case 8: 
							break; // holland
						case 9: 
							break; // stan
						}
					}
					else {
						// some about adding a new avenger to the list
					}
				}
				
				for (Avenger avenger: avengers) {
					if (avengers.size() != 0) {
						if (word.equals(avenger.getHeroName())) {
							avenger.setNameFreq(avenger.getNameFreq() + 1);
						}
						if (word.equals(avenger.getHeroAlias())) {
							avenger.setAliasFreq(avenger.getAliasFreq() + 1);
						}
						if (word.equals(avenger.getPerformer())) {
							avenger.setPerformerFreq(avenger.getPerformerFreq() + 1);
						}
					}
					else {
						// use this to add a new avenger to avengers list
						// need to figure out how to bring out the avengers 
						// from the list to assign avenger to current in list
						avengerCount ++;
					}
				}
			}
		System.out.println("Total number of words: " + wordCount);
		System.out.println("Number of Avengers mentioned: " + avengerCount);
		System.out.println(); // list of avengers in order
		System.out.println(); // 4 most frequent avengers, by order of appearance count, ties go by order of last name a-z
							// appearanceCount = avenger.getNameCount() + avenger.getAliasCount + avenger.getActorCount
		System.out.println(); // 4 most frequent actors, ties are broken by hero name length then ascending alias
		System.out.println(); // avengers in alphabetical order by 	alias a-z
	}
}
