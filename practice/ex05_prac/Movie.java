package practice.ex05_prac;

public class Movie {
    String title, director;
    static int count;
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        count++;
    }

    
}
