package org.java_fundamentals._07_OOP._01_classedAndObjects._06_movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.title = "Inception";
        movie.genre = "Sci-Fi";
        movie.duration = 148;
        movie.rating = 8.8;

        movie.playMovie();
        movie.pauseMovie();
        movie.stopMovie();
        movie.displayMovieInfo();
    }
}
