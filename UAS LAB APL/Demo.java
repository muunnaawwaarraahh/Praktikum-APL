
/**
 * Class Demo merupakan class utama untuk mengeksekusi seluruh program pattern yang telah dibuat
 *
 * @author Munawarah
 * @version 1.0
 */

public class Demo
{
   
    /**
     * method utama untuk mengeksekusi program
     *
     */
    public static void main (String[] args) {
        Observable admin = new Admin();
        Observer rml1 = new RomanceMovieLovers("Muna");
        Observer rml2 = new RomanceMovieLovers("Farel");

        admin.addObserver(rml1);
        admin.addObserver(rml2);

        admin.notify(" we have good news for you ");
    }
}
