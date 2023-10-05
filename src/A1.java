import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class A1 {
	private Scanner input;
	private int topN = 4;
	private int totalwordCount;
	private ArrayList<Avenger> avengersList = new ArrayList<>();
	public String[][] avengerRoster = { { "captainamerica", "rogers", "evans" }, { "ironman", "stark", "downey" },
			{ "blackwidow", "romanoff", "johansson" }, { "hulk", "banner", "ruffalo" },
			{ "blackpanther", "tchalla", "boseman" }, { "thor", "odinson", "hemsworth" },
			{ "hawkeye", "barton", "renner" }, { "warmachine", "rhodes", "cheadle" },
			{ "spiderman", "parker", "holland" }, { "wintersoldier", "barnes", "stan" } };
	// Avenger objects
	private Avenger cptAmerica = new Avenger(avengerRoster[0][0], avengerRoster[0][1], avengerRoster[0][2]);
	private Avenger ironMan = new Avenger(avengerRoster[1][0], avengerRoster[1][1], avengerRoster[1][2]);
	private Avenger blackWidow = new Avenger(avengerRoster[2][0], avengerRoster[2][1], avengerRoster[2][2]);
	private Avenger hulk = new Avenger(avengerRoster[3][0], avengerRoster[3][1], avengerRoster[3][2]);
	private Avenger blackPan = new Avenger(avengerRoster[4][0], avengerRoster[4][1], avengerRoster[4][2]);
	private Avenger thor = new Avenger(avengerRoster[5][0], avengerRoster[5][1], avengerRoster[5][2]);
	private Avenger hawkEye = new Avenger(avengerRoster[6][0], avengerRoster[6][1], avengerRoster[6][2]);
	private Avenger warMachine = new Avenger(avengerRoster[7][0], avengerRoster[7][1], avengerRoster[7][2]);
	private Avenger spiderMan = new Avenger(avengerRoster[8][0], avengerRoster[8][1], avengerRoster[8][2]);
	private Avenger winterSoldier = new Avenger(avengerRoster[9][0], avengerRoster[9][1], avengerRoster[9][2]);

	public static void main(String[] args) {
		A1 manager = new A1();
		manager.run();
	}

	public void run() {
		readInput();
		printResults(avengersList);
	}

	public void readInput() {
		input = new Scanner(System.in);
		while (input.hasNext()) {
			String word = input.next();
			word = word.trim().toLowerCase().split("'")[0].replaceAll("[^\\\\sa-zA-Z]", "");
			if (word.length() != 0) {
				totalwordCount++;
			}
			// Searching through avengerRoater array and updating counters for the
			// respective Avengers

			// Captain America counter
			if (word.equals(cptAmerica.getAlias())) {
				cptAmerica.incrementAliasCount();
				checkList(cptAmerica);
				continue;
			} else if (word.equals(cptAmerica.getName())) {
				cptAmerica.incrementNameCount();
				checkList(cptAmerica);
				continue;
			} else if (word.equals(cptAmerica.getActor())) {
				cptAmerica.incrementActorCount();
				checkList(cptAmerica);
				continue;
			}

			// Iron Man counter
			if (word.equals(ironMan.getAlias())) {
				ironMan.incrementAliasCount();
				checkList(ironMan);
				continue;
			} else if (word.equals(ironMan.getName())) {
				ironMan.incrementNameCount();
				checkList(ironMan);
				continue;
			} else if (word.equals(ironMan.getActor())) {
				ironMan.incrementActorCount();
				checkList(ironMan);
				continue;
			}

			// Black Widow counter
			if (word.equals(blackWidow.getAlias())) {
				blackWidow.incrementAliasCount();
				checkList(blackWidow);
				continue;
			} else if (word.equals(blackWidow.getName())) {
				blackWidow.incrementNameCount();
				checkList(blackWidow);
				continue;
			} else if (word.equals(blackWidow.getActor())) {
				blackWidow.incrementActorCount();
				checkList(blackWidow);
				continue;
			}

			// Hulk counter
			if (word.equals(hulk.getAlias())) {
				hulk.incrementAliasCount();
				checkList(hulk);
				continue;
			} else if (word.equals(hulk.getName())) {
				hulk.incrementNameCount();
				checkList(hulk);
				continue;
			} else if (word.equals(hulk.getActor())) {
				hulk.incrementActorCount();
				checkList(hulk);
				continue;
			}

			// Black Panther counter
			if (word.equals(blackPan.getAlias())) {
				blackPan.incrementAliasCount();
				checkList(blackPan);
				continue;
			} else if (word.equals(blackPan.getName())) {
				blackPan.incrementNameCount();
				checkList(blackPan);
				continue;
			} else if (word.equals(blackPan.getActor())) {
				blackPan.incrementActorCount();
				checkList(blackPan);
				continue;
			}

			// Thor counter
			if (word.equals(thor.getAlias())) {
				thor.incrementAliasCount();
				checkList(thor);
				continue;
			} else if (word.equals(thor.getName())) {
				thor.incrementNameCount();
				checkList(thor);
				continue;
			} else if (word.equals(thor.getActor())) {
				thor.incrementActorCount();
				checkList(thor);
				continue;
			}

			// Hawk Eye counter
			if (word.equals(hawkEye.getAlias())) {
				hawkEye.incrementAliasCount();
				checkList(hawkEye);
				continue;
			} else if (word.equals(hawkEye.getName())) {
				hawkEye.incrementNameCount();
				checkList(hawkEye);
				continue;
			} else if (word.equals(hawkEye.getActor())) {
				hawkEye.incrementActorCount();
				checkList(hawkEye);
				continue;
			}

			// War Machine counter
			if (word.equals(warMachine.getAlias())) {
				warMachine.incrementAliasCount();
				checkList(warMachine);
				continue;
			} else if (word.equals(warMachine.getName())) {
				warMachine.incrementNameCount();
				checkList(warMachine);
				continue;
			} else if (word.equals(warMachine.getActor())) {
				warMachine.incrementActorCount();
				checkList(warMachine);
				continue;
			}

			// Spider Man counter
			if (word.equals(spiderMan.getAlias())) {
				spiderMan.incrementAliasCount();
				checkList(spiderMan);
				continue;
			} else if (word.equals(spiderMan.getName())) {
				spiderMan.incrementNameCount();
				checkList(spiderMan);
				continue;
			} else if (word.equals(spiderMan.getActor())) {
				spiderMan.incrementActorCount();
				checkList(spiderMan);
				continue;
			}

			// Winter Soldier counter
			if (word.equals(winterSoldier.getAlias())) {
				winterSoldier.incrementAliasCount();
				checkList(winterSoldier);
				continue;
			} else if (word.equals(winterSoldier.getName())) {
				winterSoldier.incrementNameCount();
				checkList(winterSoldier);
				continue;
			} else if (word.equals(winterSoldier.getActor())) {
				winterSoldier.incrementActorCount();
				checkList(winterSoldier);
				continue;
			}

		}
		input.close();
	}
	//Checks if an avenger mentioned is found in the avengersList
	//If not add the avenger to the avengerList
	public void checkList(Avenger a) {
		if(!(avengersList.contains(a))){
			avengersList.add(a);
		}
	}

	public void printResults(ArrayList<Avenger> av) {
		/*
		 * Make sure your format matches the sample output exactly. No extra empty
		 * lines, or text. Use the diff command to check if your output matches the
		 * sample outputs.
		 */
		// Output file content
		System.out.println("Total number of words: " + totalwordCount);
		System.out.println("Number of Avengers Mentioned: " + avengersList.size());
		System.out.println();

		// Print all ordered by appearance
		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input)
		for (Avenger a : av) {
			System.out.println(a.toString());
		}
		System.out.println();

		// Print all ordered by AvengerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the topN most popular avengers
		Collections.sort(av, new Comparator<Avenger>() {
			@Override
			public int compare(Avenger a, Avenger b) {
				int totCountDiff = (b.getActorCount() + b.getAliasCount() + b.getNameCount()) // Descending by total
																								// mentions
						- (a.getActorCount() + a.getAliasCount() + a.getNameCount());
				int nameDiff = a.getActor().compareTo(b.getActor()); // Ascending alphabetical order of Name
				// Breaking Ties
				if (totCountDiff == 0) {
					return nameDiff;
				} else {
					return totCountDiff;
				}
			}
		});
		if(avengersList.size() >= 4) {
			for (int i = 0; i < topN; i++) {
				System.out.println(av.get(i).toString());
			}
		}else {
			for (int i = 0; i < avengersList.size(); i++) {
				System.out.println(av.get(i).toString());
			}
		}
		
		System.out.println();

		// Print top n ordered by AvengerPerformerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular performers:");
		// Todo: Print the topN most popular performers
		Collections.sort(av, new Comparator<Avenger>() {
			@Override
			public int compare(Avenger a, Avenger b) {
				int actCountdiff = b.getActorCount() - a.getActorCount(); // Descending Actor mentions
				int lengDiff = a.getName().length() - b.getName().length(); // Ascending of name's length
				int aliasDiff = a.getAlias().compareTo(b.getAlias()); // Ascending alphabetical order of Alias
				// Breaking Ties
				if (actCountdiff == 0) {
					if (lengDiff == 0) {
						return aliasDiff;
					} else {
						return lengDiff;
					}
				} else {
					return actCountdiff;
				}
			}
		});
		if(avengersList.size() >= 4) {
			for (int i = 0; i < topN; i++) {
				System.out.println(av.get(i).toString());
			}
		}else {
			for (int i = 0; i < avengersList.size(); i++) {
				System.out.println(av.get(i).toString());
			}
		}
		System.out.println();

		// Print all ordered by alias alphabetically
		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		Collections.sort(av);
		for (Avenger a : av) {
			System.out.println(a.toString());
		}
		System.out.println();
	}
}
