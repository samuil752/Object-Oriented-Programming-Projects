package lab6;

import java.util.ArrayList;
import java.util.List;

public class consoleTesting {

	public static void main(String[] args) {
		SongCollection collection1 = new SongCollection("Collection1");
		SongCollection collection2 = new SongCollection("Collection2");
		SongCollection collection3 = new SongCollection("Collection3");
		SongCollection collection4 = new SongCollection("Collection4");

		Song s1 = new Song("Bird Set Free", "Sia", "This Is Acting", 2016, 252, 1.21);
		Song s2 = new Song("Fight Song", "Rachel Platten", "", 2015, 204, 1.25);
		Song s3 = new Song("Baby One More Time", "Britney Spears", "", 1999, 210, 1.29);
		Song s4 = new Song("One Million Bullets", "Sia", "This Is Acting", 2016, 250, 1.39);
		Song s5 = new Song("Under Stars", "Amy Macdonald", "Under Stars", 2017, 221, 1.79);
		Song s6 = new Song("Song Of Ocarina", "Diego Modena", "", 1991, 215, 0.79);
		Song s7 = new Song("Alive", "Sia", "This Is Acting", 2016, 554, 1.22);
		Song s8 = new Song("Sometimes", "Britney Spears", "Baby One More Time", 1999, 345, 1.45);
		Song s9 = new Song("Moonlight Reggae", "Diego Modena", "", 2010, 854, 3.45);

		List<Song> alist = new ArrayList<>();
		List<Song> blist = new ArrayList<>();
		List<Song> clist = new ArrayList<>();
		List<Song> dlist = new ArrayList<>();
		alist.add(s9);
		alist.add(s8);
		alist.add(s7);
		alist.add(s6);
		alist.add(s5);
		alist.add(s4);
		alist.add(s3);
		alist.add(s2);
		alist.add(s1);
		blist.add(s9);
		clist.add(s7);
		clist.add(s6);
		clist.add(s5);
		clist.add(s4);
		dlist.add(s9);
		dlist.add(s8);
		dlist.add(s7);
		dlist.add(s6);

		// test the totalListeningTime
		collection1.addSongs(alist);
		collection2.addSongs(blist);
		collection3.addSongs(clist);
		collection4.addSongs(dlist); collection4.addSongs(alist);
		collection4.addSongs(clist); collection4.addSongs(blist);
		collection4.addSongs(alist);
		collection4.addSongs(clist); collection4.addSongs(blist);
		
		String collectionListingtime = collection1.totalListeningTime();
		System.out.println(collectionListingtime);
		collectionListingtime = collection2.totalListeningTime();
		System.out.println(collectionListingtime);
		collectionListingtime = collection3.totalListeningTime();
		System.out.println(collectionListingtime);
		collectionListingtime = collection4.totalListeningTime();
		System.out.println(collectionListingtime);

		
	}

}
