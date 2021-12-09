import java.util.ArrayList;

/**
 * Class Admin merupakan observable atau subject pada kasus movie ini dan mewakili seorang admin pada platform movie. 
 * Class ini dapat menambahkan dan menghapus observer, serta mengirim 
 * notifikasi bagi setiap observer yang telah di tambahkan sebelumnya 
 * @author Munawarah
 * @version 1.0
 */

public class Admin implements Observable
{
    // instance variables - replace the example below with your own
    private ArrayList<Observer> rml = new ArrayList<>();

    @Override
    /**
     * method untuk menambah subscriber
     *
     * @param  observer
     */
    public void addObserver(Observer observer) {
        rml.add(observer);
    }
    
     @Override
     /**
     * method untuk menghapus subscriber
     * @Override
     * @param  observer  a sample parameter for a method
     */
    public void removeObserver(Observer observer) {
        rml.remove(observer);
    }

   
    /**
     * An example of a method - replace this comment with your own
     * @Override
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void notify(String s) {
        for (Observer movieLover : rml) {
            movieLover.update(s);
        }

    }
}
