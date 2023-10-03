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
	
	public void readInput() {
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
				
				for (currentAvenger = 0; currentAvenger < 10; currentAvenger ++) {
					if (word.equals(validAvengers[currentAvenger][currentName])) {
						switch(currentAvenger) {
						case 0:
							captainAmerica = new Avenger(validAvengers[0][0],validAvengers[0][1],validAvengers[0][2]);

							if (avengers.contains(captainAmerica) == false) {
								avengers.add(captainAmerica);
							}
							if (currentName == 0) {
								captainAmerica.setNameFreq(captainAmerica.getNameFreq()+1);
							}
							else if (currentName == 1) {
								captainAmerica.setAliasFreq(captainAmerica.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								captainAmerica.setPerformerFreq(captainAmerica.getPerformerFreq()+1);
							}
								
						case 1:
							ironMan = new Avenger(validAvengers[1][0],validAvengers[1][1],validAvengers[1][2]);
							
							if (avengers.contains(ironMan) == false) {
								avengers.add(ironMan);
							}							
							if (currentName == 0) {
								ironMan.setNameFreq(ironMan.getNameFreq()+1);
							}
							else if (currentName == 1) {
								ironMan.setAliasFreq(ironMan.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								ironMan.setPerformerFreq(ironMan.getPerformerFreq()+1);
							}						
							
						case 2:
							blackWidow = new Avenger(validAvengers[2][0],validAvengers[2][1],validAvengers[2][2]);
							if (avengers.contains(blackWidow) == false) {
								avengers.add(blackWidow);
							}
							if (currentName == 0) {
								blackWidow.setNameFreq(blackWidow.getNameFreq()+1);
							}
							else if (currentName == 1) {
								blackWidow.setAliasFreq(blackWidow.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								blackWidow.setPerformerFreq(blackWidow.getPerformerFreq()+1);
							}						
							
						case 3:
							hulk = new Avenger(validAvengers[3][0],validAvengers[3][1],validAvengers[3][2]);
							if (avengers.contains(hulk) == false) {
								avengers.add(hulk);
							}							
							if (currentName == 0) {
								hulk.setNameFreq(hulk.getNameFreq()+1);
							}
							else if (currentName == 1) {
								hulk.setAliasFreq(hulk.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								hulk.setPerformerFreq(hulk.getPerformerFreq()+1);
							}						
							
						case 4:
							blackPanther = new Avenger(validAvengers[4][0],validAvengers[4][1],validAvengers[4][2]);
							if (avengers.contains(blackPanther) == false) {
								avengers.add(blackPanther);
							}
							if (currentName == 0) {
								blackPanther.setNameFreq(blackPanther.getNameFreq()+1);
							}
							else if (currentName == 1) {
								blackPanther.setAliasFreq(blackPanther.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								blackPanther.setPerformerFreq(blackPanther.getPerformerFreq()+1);
							}
							
						case 5:
							thor = new Avenger(validAvengers[5][0],validAvengers[5][1],validAvengers[5][2]);
							if (avengers.contains(thor) == false) {
								avengers.add(thor);
							}
							if (currentName == 0) {
								thor.setNameFreq(thor.getNameFreq()+1);
							}
							else if (currentName == 1) {
								thor.setAliasFreq(thor.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								thor.setPerformerFreq(thor.getPerformerFreq()+1);
							}
							
						case 6:
							hawkEye = new Avenger(validAvengers[6][0],validAvengers[6][1],validAvengers[6][2]);
							if (avengers.contains(hawkEye) == false) {
								avengers.add(hawkEye);
							}
							if (currentName == 0) {
								hawkEye.setNameFreq(hawkEye.getNameFreq()+1);
							}
							else if (currentName == 1) {
								hawkEye.setAliasFreq(hawkEye.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								hawkEye.setPerformerFreq(hawkEye.getPerformerFreq()+1);
							}
							
						case 7:
							warMachine = new Avenger(validAvengers[7][0],validAvengers[7][1],validAvengers[7][2]);
							if (avengers.contains(warMachine) == false) {
								avengers.add(warMachine);
							}
							if (currentName == 0) {
								warMachine.setNameFreq(warMachine.getNameFreq()+1);
							}
							else if (currentName == 1) {
								warMachine.setAliasFreq(warMachine.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								warMachine.setPerformerFreq(warMachine.getPerformerFreq()+1);
							}
							
						case 8: 
							spiderMan = new Avenger(validAvengers[8][0],validAvengers[8][1],validAvengers[8][2]);
							if (avengers.contains(spiderMan) == false) {
								avengers.add(spiderMan);
							}
							if (currentName == 0) {
								spiderMan.setNameFreq(spiderMan.getNameFreq()+1);
							}
							else if (currentName == 1) {
								spiderMan.setAliasFreq(spiderMan.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								spiderMan.setPerformerFreq(spiderMan.getPerformerFreq()+1);
							}
							
						case 9: 
							winterSoldier = new Avenger(validAvengers[9][0],validAvengers[9][1],validAvengers[9][2]);
							if (avengers.contains(winterSoldier) == false) {
								avengers.add(winterSoldier);
							}
							if (currentName == 0) {
								winterSoldier.setNameFreq(winterSoldier.getNameFreq()+1);
							}
							else if (currentName == 1) {
								winterSoldier.setAliasFreq(winterSoldier.getAliasFreq()+1);
							}
							else if (currentName == 2) {
								winterSoldier.setPerformerFreq(winterSoldier.getPerformerFreq()+1);
							}
						}
					}
				}
			}
	}
	
	 private void printResults() {
	    	
	        // Sort the avengersArrayList alphabetically by alias
	        Collections.sort(avengers);

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

			// Print all ordered by alias alphabetically
			System.out.println("All mentioned avengers in alphabetical order:");
			// Todo: Print the list of avengers in alphabetical order
			// Make sure you follow the formatting example in the sample output
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
}
