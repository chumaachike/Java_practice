import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("");
        }
    }
}
