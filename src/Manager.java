import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
private Scanner input;
private int totalwordcount = 0;
private int topN = 4;
private ArrayList<Avenger> avengersArrayList = new ArrayList<>();
public String[][] avengerRoster = { { "captainamerica", "rogers", "evans" }, { "ironman", "stark", "downey" },
		{ "blackwidow", "romanoff", "johansson" }, { "hulk", "banner", "ruffalo" },
		{ "blackpanther", "tchalla", "boseman" }, { "thor", "odinson", "hemsworth" },
		{ "hawkeye", "barton", "renner" }, { "warmachine", "rhodes", "cheadle" },
		{ "spiderman", "parker", "holland" }, { "wintersoldier", "barnes", "stan" } };
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.run();
	}	
	
	public void run() {
		readInput();
		printResults();
		}
	
	public void readInput() {
		input = new Scanner(System.in);
		int wordCount = 0;
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
		}
		
		
		
		
		
		Comparator<Avenger> comp = new Comparator<Avenger>() {
			@Override
			public int compare(Avenger a, Avenger b) {
				int totalCount1 = a.getActorCount() + a.getAliasCount() + a.getNameCount();
				int totalCount2 = b.getActorCount() + b.getAliasCount() + a.getNameCount();
				if(totalCount1 == totalCount2) {
					return a.getActorCount() - b.getActorCount();
				}else {return totalCount1;}
			}
		};
		
	}
	public void printResults() {
		/*
		 * Make sure your format matches the sample output exactly. 
		 * No extra empty lines, or text. Use the diff command to check if your output matches the sample outputs.
		 */
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		// Print all ordered by appearance
		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
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
	
}
