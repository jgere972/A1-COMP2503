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
	int totalwordCount;
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
		f = "input.txt";
		totalwordCount = 0;
		try {
			File file = new File(f);
			input = new Scanner(file);
			while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^\\\\sa-zA-Z0-9]", "");
				if (word.length() != 0) {
					totalwordCount++;
				}
				// Searching through avengerRoater array and updating counters for the
				// respective Avengers
				for (int i = 0; i < avengerRoster.length; i++) {
					for (int x = 0; x < avengerRoster[i].length; x++) {
						// Captain America counter
						if (word.equals(cptAmerica.getAlias())) {
							cptAmerica.incrementAliasCount();
							avengersList.add(cptAmerica);
						} else if (word.equals(cptAmerica.getName())) {
							cptAmerica.incrementNameCount();
							avengersList.add(cptAmerica);
						} else if (word.equals(cptAmerica.getActor())) {
							cptAmerica.incrementActorCount();
							avengersList.add(cptAmerica);
						}
						// Iron Man counter
						else if (word.equals(ironMan.getAlias())) {
							ironMan.incrementAliasCount();
							avengersList.add(ironMan);
						} else if (word.equals(ironMan.getName())) {
							ironMan.incrementNameCount();
							avengersList.add(ironMan);
						} else if (word.equals(ironMan.getActor())) {
							ironMan.incrementActorCount();
							avengersList.add(ironMan);
						}
						// Black Widow counter
						else if (word.equals(blackWidow.getAlias())) {
							blackWidow.incrementAliasCount();
							avengersList.add(blackWidow);
						} else if (word.equals(blackWidow.getName())) {
							blackWidow.incrementNameCount();
							avengersList.add(blackWidow);
						} else if (word.equals(blackWidow.getActor())) {
							blackWidow.incrementActorCount();
							avengersList.add(blackWidow);
						}
						// Hulk counter
						else if (word.equals(hulk.getAlias())) {
							hulk.incrementAliasCount();
							avengersList.add(hulk);
						} else if (word.equals(hulk.getName())) {
							hulk.incrementNameCount();
							avengersList.add(hulk);
						} else if (word.equals(hulk.getActor())) {
							hulk.incrementActorCount();
							avengersList.add(hulk);
						}
						// Black Panther counter
						else if (word.equals(blackPan.getAlias())) {
							blackPan.incrementAliasCount();
							avengersList.add(blackPan);
						} else if (word.equals(blackPan.getName())) {
							blackPan.incrementNameCount();
							avengersList.add(blackPan);
						} else if (word.equals(blackPan.getActor())) {
							blackPan.incrementActorCount();
							avengersList.add(blackPan);
						}
						// Thor counter
						else if (word.equals(thor.getAlias())) {
							thor.incrementAliasCount();
							avengersList.add(thor);
						} else if (word.equals(thor.getName())) {
							thor.incrementNameCount();
							avengersList.add(thor);
						} else if (word.equals(thor.getActor())) {
							thor.incrementActorCount();
							avengersList.add(thor);
						}
						// Hawk Eye counter
						else if (word.equals(hawkEye.getAlias())) {
							hawkEye.incrementAliasCount();
							avengersList.add(hawkEye);
						} else if (word.equals(hawkEye.getName())) {
							hawkEye.incrementNameCount();
							avengersList.add(hawkEye);
						} else if (word.equals(hawkEye.getActor())) {
							hawkEye.incrementActorCount();
							avengersList.add(hawkEye);
						}
						// War Machine counter
						else if (word.equals(warMachine.getAlias())) {
							warMachine.incrementAliasCount();
							avengersList.add(warMachine);
						} else if (word.equals(warMachine.getName())) {
							warMachine.incrementNameCount();
							avengersList.add(warMachine);
						} else if (word.equals(warMachine.getActor())) {
							warMachine.incrementActorCount();
							avengersList.add(warMachine);
						}
						// Spider Man counter
						else if (word.equals(spiderMan.getAlias())) {
							spiderMan.incrementAliasCount();
							avengersList.add(spiderMan);
						} else if (word.equals(spiderMan.getName())) {
							spiderMan.incrementNameCount();
							avengersList.add(spiderMan);
						} else if (word.equals(spiderMan.getActor())) {
							spiderMan.incrementActorCount();
							avengersList.add(spiderMan);
						}
						// Winter Soldier counter
						else if (word.equals(winterSoldier.getAlias())) {
							winterSoldier.incrementAliasCount();
							avengersList.add(winterSoldier);
						} else if (word.equals(winterSoldier.getName())) {
							winterSoldier.incrementNameCount();
							avengersList.add(winterSoldier);
						} else if (word.equals(winterSoldier.getActor())) {
							winterSoldier.incrementActorCount();
							avengersList.add(winterSoldier);
						}
					}
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	public void printResults(ArrayList<Avenger> av) {
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
		for(Avenger a: av) {
			System.out.println(a.toString());
			}
		
		// Print all ordered by AvengerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the topN most popular avengers
		Collections.sort(av, new Comparator<Avenger>() {
			@Override
			public int compare(Avenger a, Avenger b) {
			int totCountDiff = (b.getActorCount() + b.getAliasCount() + a.getNameCount()) // Descending by total mentions
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
		for(int i = 0; i < topN; i++) {
			System.out.println(av.get(i).toString());
			}
		
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
		for(int i = 0; i < topN; i++) {
			System.out.println(av.get(i).toString());
			}
		
		// Print all ordered by alias alphabetically
		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		Collections.sort(av);
		for(Avenger a: av) {
		System.out.println(a.toString());
		}
	}
}
