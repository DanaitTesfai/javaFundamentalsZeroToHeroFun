package org.java_fundamentals._09_composition._04_PlaylistandSongs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("1.Add song 2.Show playlist 3.Exit : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter playlist's name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter song's title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();

                    Song song = new Song(title, artist);

                    Playlist playlist = new Playlist(name,song);

                    playlist.addSong(song);

                    break;
                case 2:
                    playlist.showPlaylist();

                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }


    }
}
