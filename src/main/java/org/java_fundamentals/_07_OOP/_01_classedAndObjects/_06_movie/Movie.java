package org.java_fundamentals._07_OOP._01_classedAndObjects._06_movie;

public class Movie {
    String title;
    String genre;
    int duration;
    double rating;

    public void playMovie(){
        System.out.println("Playing movie: " + title);
    }

    public void pauseMovie(){
        System.out.println("Movie " + title + " is paused.");
    }

    public void stopMovie(){
        System.out.println("Movie " + title + " is stopped.");
    }

    public void displayMovieInfo(){
        System.out.println("Movie info:");
        System.out.println("Movie title: " + title);
        System.out.println("Movie genre: " + genre);
        System.out.println("Movie duration: " + duration + " minutes");
        System.out.println("Movie rating: " + rating);
    }
}
