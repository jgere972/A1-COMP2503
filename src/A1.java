import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}	
	
	public void run() {
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
