package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {

    private final int capacity; // maximum number of songs per user
    private final int initialCapacity; // initial capacity of the store
    private final Map<String, List<String>> store; // map of users to their recently played songs
   
    
    public RecentlyPlayedStore(int capacity, int initialCapacity) {
        this.capacity = capacity;
        this.initialCapacity = initialCapacity;
        this.store = new HashMap<String, List<String>>(initialCapacity);//
    }

    public void addSong(String user, String song) {
        List<String> songs = store.get(user);
        if (songs == null) {
            songs = new LinkedList<String>();//
            store.put(user, songs);
        }

        songs.add(song);
        // remove the least recently played song if the number of songs exceeds the capacity
        if (songs.size() > capacity) {
            songs.remove(0);
        }
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        List<String> songs = store.get(user);
        if (songs == null) {
            return Collections.emptyList();
        }
        // return a copy of the songs list to prevent external modification
        return new ArrayList<String>(songs);//
    }

    

}
