package GameLogic;

import java.util.Random;

public class IAPlayer extends Player {
	
	private Random rand;
	private static String[] randomNames = { "Albert Einstein",
		"Stephen Hawking", "Sheldon Cooper", "Dr.House", "Michael Jackson",
		"Michael Bay", "Mark Zuckerberg", "Alfred Hitchcock", "Amy Whinehouse",
		"Angelina Jolie", "Arnold Schwarzenegger", "Barak Obama", "Batman",
		"David Beckham", "Bruce Willis", "Charlie Chaplin", "Clint Eastwood",
		"Conan O' Brien", "Condoleezza Rice", "Charles Darwin", "Dexter Morgan",
		"Frodo", "Sauron", "George W Bush", "Hannibal", "Harrison Ford", "Harry Potter",
		"John Locke", "Johnny Depp", "John Wayne", "Karl Marx", "Larry King", "Leonardo Dicaprio",
		"Manny Pacquiao", "Marilyn Manson", "Matt Damon", "Meryl Streep", "Mr Bean",
		"Paris Hilton", "Prince Charles", "Quentin Tarantino", "Robert Pattinson",
		"Samuel L. Jackson", "Simon Cowell", "Snoop Lion", "Spielberg", "Steven Seagal",
		"Terminator", "Tom Cruise", "Will Smith", "Nelson Mandela", "Iron Man", "Hulk", "Thor",
		"Loki", "Captain America", "Black Widow", "Phil Coulson"};
	
	public IAPlayer(int playerId) {
		super(playerId);
		setName();
	}
	
	private void setName() {
		rand = new Random();
		name = randomNames[rand.nextInt(randomNames.length)];
		System.out.println("Name of CPU: "+name);
	}
}