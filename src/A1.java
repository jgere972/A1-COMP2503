import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class A1 {
	private String f;
	private Scanner input;
	private int totalwordcount = 0;
	private int topN = 4;
	private ArrayList<Avenger> avengersList = new ArrayList<>();
	public String[][] avengerRoster = { { "captainamerica", "rogers", "evans" }, { "ironman", "stark", "downey" },
			{ "blackwidow", "romanoff", "johansson" }, { "hulk", "banner", "ruffalo" },
			{ "blackpanther", "tchalla", "boseman" }, { "thor", "odinson", "hemsworth" },
			{ "hawkeye", "barton", "renner" }, { "warmachine", "rhodes", "cheadle" },
			{ "spiderman", "parker", "holland" }, { "wintersoldier", "barnes", "stan" } };
	// Avenger objects
	private Avenger cptAmerica = new Avenger("captainamerica", "rogers", "evans");
	private Avenger ironMan = new Avenger("ironman", "stark", "downey");
	private Avenger blackWidow = new Avenger("blackwidow", "romanoff", "johansson");
	private Avenger hulk = new Avenger("hulk", "banner", "ruffalo");
	private Avenger blackPan = new Avenger("blackpanther", "tchalla", "boseman");
	private Avenger thor = new Avenger("thor", "odinson", "hemsworth");
	private Avenger hawkEye = new Avenger("hawkeye", "barton", "renner");
	private Avenger warMachine = new Avenger("warmachine", "rhodes", "cheadle");
	private Avenger spiderMan = new Avenger("spiderman", "parker", "holland");
	private Avenger winterSoldier = new Avenger("wintersoldier", "barnes", "stan");

	public static void main(String[] args) {
		A1 manager = new A1();
		manager.run();
	}

	public void run() {
		readInput();
		printResults();
	}

	public void readInput() {
		f = "input.txt";
		int wordCount = 0;
		try {
			File file = new File(f);
			input = new Scanner(file);
			while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^\\\\sa-zA-Z0-9]", "");
				if (word.length() != 0) {
					wordCount++;
				}
				// Searching through avengerRoater array and updating counters for the
				// respective Avengers
				for (int i = 0; i < avengerRoster.length; i++) {
					for (int x = 0; x < avengerRoster[i].length; x++) {
						// Captain America counter
						if (word.equals(cptAmerica.getAlias())) {
							cptAmerica.incrementAliasCount();
						} else if (word.equals(cptAmerica.getName())) {
							cptAmerica.incrementNameCount();
						} else if (word.equals(cptAmerica.getActor())) {
							cptAmerica.incrementActorCount();
						}
						// Iron Man counter
						else if (word.equals(ironMan.getAlias())) {
							ironMan.incrementAliasCount();
						} else if (word.equals(ironMan.getName())) {
							ironMan.incrementNameCount();
						} else if (word.equals(ironMan.getActor())) {
							ironMan.incrementActorCount();
						}
						// Black Widow counter
						else if (word.equals(blackWidow.getAlias())) {
							blackWidow.incrementAliasCount();
						} else if (word.equals(blackWidow.getName())) {
							blackWidow.incrementNameCount();
						} else if (word.equals(blackWidow.getActor())) {
							blackWidow.incrementActorCount();
						}
						// Hulk counter
						else if (word.equals(hulk.getAlias())) {
							hulk.incrementAliasCount();
						} else if (word.equals(hulk.getName())) {
							hulk.incrementNameCount();
						} else if (word.equals(hulk.getActor())) {
							hulk.incrementActorCount();
						}
						// Black Panther counter
						else if (word.equals(blackPan.getAlias())) {
							blackPan.incrementAliasCount();
						} else if (word.equals(blackPan.getName())) {
							blackPan.incrementNameCount();
						} else if (word.equals(blackPan.getActor())) {
							blackPan.incrementActorCount();
						}
						// Thor counter
						else if (word.equals(thor.getAlias())) {
							thor.incrementAliasCount();
						} else if (word.equals(thor.getName())) {
							thor.incrementNameCount();
						} else if (word.equals(thor.getActor())) {
							thor.incrementActorCount();
						}
						// Hawk Eye counter
						else if (word.equals(hawkEye.getAlias())) {
							hawkEye.incrementAliasCount();
						} else if (word.equals(hawkEye.getName())) {
							hawkEye.incrementNameCount();
						} else if (word.equals(hawkEye.getActor())) {
							hawkEye.incrementActorCount();
						}
						// War Machine counter
						else if (word.equals(warMachine.getAlias())) {
							warMachine.incrementAliasCount();
						} else if (word.equals(warMachine.getName())) {
							warMachine.incrementNameCount();
						} else if (word.equals(warMachine.getActor())) {
							warMachine.incrementActorCount();
						}
						// Spider Man counter
						else if (word.equals(spiderMan.getAlias())) {
							spiderMan.incrementAliasCount();
						} else if (word.equals(spiderMan.getName())) {
							spiderMan.incrementNameCount();
						} else if (word.equals(spiderMan.getActor())) {
							spiderMan.incrementActorCount();
						}
						// Winter Soldier counter
						else if (word.equals(winterSoldier.getAlias())) {
							winterSoldier.incrementAliasCount();
						} else if (word.equals(winterSoldier.getName())) {
							winterSoldier.incrementNameCount();
						} else if (word.equals(winterSoldier.getActor())) {
							winterSoldier.incrementActorCount();
						}
					}
				}
			}
			input.close();
			// Generating Lists
			avengersList.add(cptAmerica);
			avengersList.add(ironMan);
			avengersList.add(blackWidow);
			avengersList.add(hulk);
			avengersList.add(blackPan);
			avengersList.add(thor);
			avengersList.add(hawkEye);
			avengersList.add(warMachine);
			avengersList.add(spiderMan);
			avengersList.add(winterSoldier);

			


			printResults();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	public void printResults() {
		/*
		 * Make sure your format matches the sample output exactly. No extra empty
		 * lines, or text. Use the diff command to check if your output matches the
		 * sample outputs.
		 */
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersList.size());
		System.out.println();

		// Print all ordered by appearance
		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input)
		System.out.println();

		// Print all ordered by AvengerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the topN most popular avengers
		Collections.sort(avengersList, new Comparator<Avenger>() {
			@Override
			public int compare(Avenger a, Avenger b) {
			int totCountDiff = (b.getActorCount() + b.getAliasCount() + a.getNameCount()) // Descending by
																											// total
																											// mentions
			- (a.getActorCount() + a.getAliasCount() + a.getNameCount());
			int nameDiff = a.getName().compareTo(b.getName()); // Ascending alphabetical order of Name
			// Breaking Ties
				if (totCountDiff == 0) {
					return nameDiff;
				} else {
					return totCountDiff;
				}
			}
					});
		for(int i = 0; i < avengersList.size(); i++) {
			System.out.println(avengersList.get(i).toString());
			}
		// Print top n ordered by AvengerPerformerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular performers:");
		// Todo: Print the topN most popular performers, see the instructions for tie
		// Ordering for most popular Performers
		Collections.sort(avengersList, new Comparator<Avenger>() {
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
		for(int i = 0; i < avengersList.size(); i++) {
			System.out.println(avengersList.get(i).toString());
			}
		// Print all ordered by alias alphabetically
		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		Collections.sort(avengersList);
		for(int i = 0; i < avengersList.size(); i++) {
		System.out.println(avengersList.get(i).toString());
		}
	}
}
