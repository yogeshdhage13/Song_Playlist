package utility;

import java.util.List;

public class Result {

	public static void main(String[] args) {
		
		
		RecentlyPlayedStore store = new RecentlyPlayedStore(3,10);
	    store.addSong("Alice", "Song A");
	    store.addSong("Alice", "Song B");
	    store.addSong("Bob", "Song C");
	    store.addSong("Alice", "Song D");
	    store.addSong("Alice", "Song Z");
	    store.addSong("Alice", "Song Y");
	    store.addSong("Bob", "Song E");
	    store.addSong("Bob", "Song F");
	    store.addSong("R", "Song 1");
	    store.addSong("R", "Song 2");
	    store.addSong("R", "Song 3");
	    store.addSong("R", "Song 4");
	
	    
	    
	    List<String> aliceSongs = store.getRecentlyPlayedSongs("Alice");
	    System.out.println("Alice's recently played songs: " + aliceSongs);
	    // output: Alice's recently played songs: [Song A, Song B, Song D]

	    
	    List<String> bobSongs = store.getRecentlyPlayedSongs("Bob");
	    System.out.println("Bob's recently played songs: " + bobSongs);
	    // output: Bob's recently played songs: [Song C, Song E, Song F]


	    List<String> Rsongs = store.getRecentlyPlayedSongs("R");
	    System.out.println("R's recently played songs: " + Rsongs);
	    
	}

}
