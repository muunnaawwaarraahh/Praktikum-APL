import java.util.Scanner;

public class RomanceMovieLovers implements Observer {

    private String movieLover;

    public RomanceMovieLovers (String movieLover) {
        this.movieLover = movieLover;
    }

    @Override //overide method update agar notifikasi diterima customer
    public void update(String n) {

        Movie actionRomance = new ActionRomance(new Action());

        System.out.print("\nHallooo, " + this.movieLover + n );
        actionRomance.makeMovie();
        System.out.println(". Lets check the update on our official movie platform"); 

        Movie comedyRomance = new ComedyRomance(new Comedy());
        
        System.out.print("\nHallooo, " + this.movieLover + n );
        comedyRomance.makeMovie();
        System.out.println(". Lets check the update on our official movie platform"); 

    }
}