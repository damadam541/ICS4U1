package unit1;
import java.util.ArrayList;
public class ListOfArray {

	static ArrayList<Song> songs = new ArrayList<Song>();

	public static void main(String[] args) {

		System.out.println("-----Songs from The Beatles 1 Album-----");
		System.out.printf("%-30s %-20s %-1s%n","Song Name:","Year Release:","Album Name:");

		listingArray();
		output();
		System.out.println();
		System.out.println("-----Removed Singles-----");
		removeContents();
		System.out.println();
		output();

	}

	public static void listingArray() {
		songs.add(new Song("Love Me Do", 1963, "Please Please Me"));
		songs.add(new Song("From Me To You", 1963, "Single"));
		songs.add(new Song("She Loves Me", 1964, "Single"));
		songs.add(new Song("I Want To Hold Your Hand", 1964, "Single"));
		songs.add(new Song("Can't Buy Me Love", 1964, "A Hard Days Night"));
		songs.add(new Song("A Hard Days Night", 1964, "A Hard Days Night"));
		songs.add(new Song("I Feel Fine", 1964, "Single"));
		songs.add(new Song("Eight Days A Week", 1964, "Single"));
		songs.add(new Song("Ticket To Ride", 1965, "Help!"));
		songs.add(new Song("Help!", 1965, "Help!"));
		songs.add(new Song("Yesterday", 1965, "Help!"));
		songs.add(new Song("Day Tripper", 1965, "Single"));
		songs.add(new Song("Paperback Writer", 1966, "Single"));
		songs.add(new Song("Yellow Submarine", 1966, "Single"));
		songs.add(new Song("Eleanor Rigby", 1966, "Revolver"));
		songs.add(new Song("Penny Lane", 1967, "Single"));
		songs.add(new Song("All You Need Is Love", 1967, "Single"));
		songs.add(new Song("Hello, Goodbye", 1967, "Single"));
		songs.add(new Song("Lady Madonna", 1967, "Single"));
		songs.add(new Song("Hey Jude", 1968, "Single"));
		songs.add(new Song("Get Back", 1969, "Let It Be"));
		songs.add(new Song("The Ballad Of John And Yoko", 1969, "Abbey Road"));
		songs.add(new Song("Something", 1969, "Abbey Road"));
		songs.add(new Song("Come Together", 1969, "Abbey Road"));
		songs.add(new Song("Let It Be", 1970, "Let It Be"));
		songs.add(new Song("The Long And Winding Road", 1970, "Let It Be"));

	}

	public static void output() {
		for (int i = 0 ; i < songs.size() ; i++) {
			Song x = songs.get(i);
			System.out.printf("%-30s %-20d %-1s %n",x.songName,x.yearRelease,x.albumName);
		}
	}

	public static void removeContents() {
		for (int i = 0 ; i < songs.size() ; i++) {
			Song x = songs.get(i);
			if (x.albumName == "Single") {
				songs.remove(i);
				i--;
			}
		}
		System.out.printf("%-30s %-20s %-1s","Song Name:","Year Release:","Album Name:");
	}
}
