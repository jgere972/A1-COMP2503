import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class A1 {
	
	int currentAvenger = 0;
	int currentName = 0;
	String[][] validAvengers = {
			{"captainamerica", "rogers", "evans"}, 
			{"ironman", "stark", "downey"},
			{"blackwidow", "romanoff", "johansson"}, 
			{"hulk", "banner", "ruffalo"},
			{"blackpanther", "tchalla", "boseman"}, 
			{"thor", "odinson", "hemsworth"},
			{"hawkeye", "barton", "renner"}, 
			{"warmachine", "rhodes", "cheadle"},
			{"spiderman", "parker", "holland"}, 
			{"wintersoldier", "barnes", "stan"}
	};
	ArrayList<Avenger> avengers = new ArrayList<Avenger>();
	Avenger captainAmerica;
	Avenger ironMan;
	Avenger blackWidow;
	Avenger hulk;
	Avenger blackPanther;
	Avenger thor;
	Avenger hawkEye;
	Avenger warMachine;
	Avenger spiderMan;
	Avenger winterSoldier;
	Scanner input = new Scanner(System.in);
	int wordCount = 0;
	int avengerCount = 0;
	private int topN = 4;
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}	
	
	public void run() {
		readInput();
		printResults();
	}
	
	public boolean checkIfExists(Avenger a, ArrayList<Avenger> l) {
		if (l.contains(a)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Avenger nameChecker(Avenger a, int currentName ) {
		if (currentName == 0) {
			a.setNameFreq(a.getNameFreq()+1);
		}
		else if (currentName == 1) {
			a.setAliasFreq(a.getAliasFreq()+1);
		}
		else {
			a.setPerformerFreq(a.getPerformerFreq()+1);
		}
		return a;
	}
	
	public void readInput() {
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
				
				for (currentAvenger = 0; currentAvenger < 10; currentAvenger ++) {
					for (currentName = 0; currentName < 3; currentName ++) {
						if (word.equals(validAvengers[currentAvenger][currentName])) {
							switch(currentAvenger) {
							case 0:	
								if (checkIfExists(captainAmerica, avengers) == false ) {
									avengers.add(captainAmerica = new Avenger(validAvengers[0][0],validAvengers[0][1],validAvengers[0][2]));
								}
								captainAmerica = nameChecker(captainAmerica,currentName);
									
							case 1:			
								if (checkIfExists(ironMan, avengers) == false) {
									avengers.add(ironMan = new Avenger(validAvengers[1][0],validAvengers[1][1],validAvengers[1][2]));
								}
								ironMan = nameChecker(ironMan,currentName);
								
							case 2:
								if (checkIfExists(blackWidow, avengers) == false) {
									avengers.add(blackWidow = new Avenger(validAvengers[2][0],validAvengers[2][1],validAvengers[2][2]));
								}
								blackWidow = nameChecker(blackWidow,currentName);
								
							case 3:
								if (checkIfExists(hulk, avengers) == false) {
									avengers.add(hulk = new Avenger(validAvengers[3][0],validAvengers[3][1],validAvengers[3][2]));
								}
								hulk = nameChecker(hulk,currentName);
								
							case 4:
								if (checkIfExists(blackPanther, avengers) == false) {
									avengers.add(blackPanther = new Avenger(validAvengers[4][0],validAvengers[4][1],validAvengers[4][2]));
								}
								blackPanther = nameChecker(blackPanther,currentName);
								
							case 5:
								if (checkIfExists(thor, avengers) == false) {
									avengers.add(thor = new Avenger(validAvengers[5][0], validAvengers[5][1], validAvengers [5][2]));
								}
								thor = nameChecker(thor,currentName);
								
							case 6:
								if (checkIfExists(hawkEye, avengers) == false) {
									avengers.add(hawkEye = new Avenger(validAvengers[6][0],validAvengers[6][1],validAvengers[6][2]));
								}
								hawkEye = nameChecker(hawkEye,currentName);
								
							case 7:
								if (checkIfExists(warMachine, avengers) == false) {
									avengers.add(warMachine = new Avenger(validAvengers[7][0],validAvengers[7][1],validAvengers[7][2]));
								}
								warMachine = nameChecker(warMachine,currentName);
								
							case 8: 
								if (checkIfExists(spiderMan, avengers) == false) {
									avengers.add(spiderMan = new Avenger(validAvengers[8][0],validAvengers[8][1],validAvengers[8][2]));
								}
								spiderMan = nameChecker(spiderMan,currentName);
								
							case 9: 
								if (checkIfExists(winterSoldier, avengers) == false) {
									avengers.add(winterSoldier = new Avenger(validAvengers[9][0],validAvengers[9][1],validAvengers[9][2]));
								}
								winterSoldier = nameChecker(winterSoldier,currentName);
							}
						}
						else {
							currentName++;
						}
					}
				}
			}
	}
	
	 private void printResults() {
	    	
	        System.out.println("Total number of words: " + wordCount);
	        System.out.println("Number of Avengers Mentioned: " + avengers.size());
	        System.out.println();

	        // Print all ordered by appearance
	        System.out.println("All avengers in the order they appeared in the input stream:");
	        for (Avenger avenger : avengers) {
	            System.out.println(avenger.toString());
	        }
	        System.out.println();

			// Print all ordered by AvengerComparatorFreqDesc
			System.out.println("Top " + topN + " most popular avengers:");
			// Todo: Print the topN most popular avengers, see the instructions for tie breaking
			// Make sure you follow the formatting example in the sample output
			System.out.println();

			// Print top n ordered by AvengerPerformerComparatorFreqDesc
			System.out.println("Top " + topN + " most popular performers:");
			// Todo: Print the topN most popular performers, see the instructions for tie breaking
			// Make sure you follow the formatting example in the sample output	
			System.out.println();

			
			// Sort the avengersArrayList alphabetically by alias
		 	Collections.sort(avengers, new AvengerAliasComparator());
			// Print all ordered by alias alphabetically
			System.out.println("All mentioned avengers in alphabetical order:");
			for (Avenger avenger : avengers) {
	            System.out.println(avenger.toString());
	        }
			System.out.println();
	    }
	
    // Compares total mention frequencies of avengers in descending order
    class AvengerTotalFreq implements Comparator<Avenger> {
    	
        @Override
        public int compare(Avenger a1, Avenger a2) {
        	
            return Integer.compare(a2.getTotalMentionFrequency(), a1.getTotalMentionFrequency());
        }
    }

    // Compares performer frequencies of avengers in descending order
    class AvengerPerformerFreq implements Comparator<Avenger> {
    	
        @Override
        public int compare(Avenger a1, Avenger a2) {
        	
            return Integer.compare(a2.getPerformerFreq(), a1.getPerformerFreq());
        }
    }
    
    class AvengerAliasComparator implements Comparator<Avenger> {
    	
        @Override
        public int compare(Avenger a1, Avenger a2) {
            return a1.getHeroAlias().compareTo(a2.getHeroAlias());
        }
    }
}
