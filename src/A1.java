import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}	
	
	public void run() {
		
		String[] validAvengers = {"captianamerica, rogers, evans",
								  "ironman, stark, downey",
								  "blackwidow, romanoff, johansson",
								  "hulk, banner, ruffalo",
								  "blackpanther, tchalla, boseman",
								  "thor, odinson, hemsworth",
								  "hawkeye, barton, renner",
								  "warmachine, rhodes, cheadle",
								  "spiderman, parker, holland",
								  "wintersoldier, barnes, stan"};
		//edit to become array of array of string, then edit code to check if 
		//word.equals(validAvengers[currAvenger][0/1/2]) where 0 is name, 1 is alias, 
		//2 is performer, separate if statements though
		//for (Avenger avenger: avengers) {
		//if (word.equals(validAvengers[currAvenger][0] {
		// something about the name
		//if (word.equals(validAvengers[currAvenger][1] {
		// something about the alias
		//if (word.equals(validAvengers[currAvenger][2] {
		// something about the performer
		
		ArrayList<Avenger> avengers = new ArrayList<Avenger>();
		Scanner input = new Scanner(System.in);
		int wordCount = 0;
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
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
					}
				}
			System.out.println(); // total number of words
			System.out.println(); // total number of avengers
			System.out.println(); // list of avengers in order
			System.out.println(); // 4 most frequent avengers, by order of appearance count, ties go by order of last name a-z
								  // appearanceCount = avenger.getNameCount() + avenger.getAliasCount + avenger.getActorCount
			System.out.println(); // 4 most frequent actors, ties are broken by hero name length then ascending alias
			System.out.println(); // avengers in alphabetical order by 	alias a-z
			
			// oops need to change a lot of stuff to follow implementation details
		}
		
	}
}
