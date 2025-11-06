package org.java_fundamentals._09_composition._04_PlaylistandSongs;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play(){
        System.out.println("Playing: " + title + " by " + artist);
    }

    public void displayInfo(){
        System.out.println(title + " by " + artist);
    }
}
