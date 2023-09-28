import java.util.Scanner;

public class Manager {
private Scanner input;	
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.run();
	}	
	
	public void run() {
		input = new Scanner(System.in);
		int wordCount = 0;
		while (input.hasNext()) {
				String word = input.next();
				word = word.trim().toLowerCase().split("'")[0].replaceAll("[^a-zA-Z\\s]", "");
				if (word.length() != 0) wordCount ++;
		}
	}
}
