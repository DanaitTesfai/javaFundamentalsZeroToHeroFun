package org.java_fundamentals._09_composition._04_PlaylistandSongs;

import java.util.ArrayList;

public class Playlist {
    private String name;

    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song){
        if (songs.contains(song)){
            System.out.println("Song already in the playlist.");
        }else {
            songs.add(song);
            System.out.println("Song added.");
        }
    }

    public void showPlaylist(){
        if (songs.isEmpty()){
            System.out.println("There are no songs.");
            return;
        }
        for (Song s: songs){
            s.displayInfo();
        }
    }
}
