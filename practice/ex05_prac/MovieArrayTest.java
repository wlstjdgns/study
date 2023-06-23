package practice.ex05_prac;


public class MovieArrayTest {
    public static void main(String[] args) {
        Movie [] list = new Movie[10];
        list[0] = new Movie("102", "더퓨쳐");
        list[1] = new Movie("더퓨터", "102");
        list[7] = new Movie("더퓨터", "102");

        for(int i = 0; i<Movie.count; i++){
            System.out.print(list[i].title);
            System.out.println(list[i].director);
        }


    }
}
