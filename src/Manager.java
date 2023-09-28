import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
private Scanner input;	
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.run();
	}	
	
	public void run() {
		ArrayList<Avenger> avengers = new ArrayList<Avenger>();
		input = new Scanner(System.in);
		int wordCount = 0;
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
				for (int index = 0; index < avengers.size(); index++) {
					if (avengers.size() != 0) {
						if (word.equals(avenger.getName())) {
							avenger.setNameCount(avenger.getNameCount + 1);
						}
						if (word.equals(avenger.getAlias())) {
							avenger.setAliasCount(avenger.getAliasCount + 1);
						}
						if (word.equals(avenger.getActor())) {
							avenger.setActorCount(avenger.getActorCount + 1);
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
