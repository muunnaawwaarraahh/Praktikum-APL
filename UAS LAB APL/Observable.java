
/**
 * Interface observer memiliki method yang mewakili hal-hal yang
 * dapat dilakukan oleh Subject atau Observable atau Publisher
 * 
 * @author Munawarah
 * @version 1.0
 */

public interface Observable
{
    /**
     * method untuk menambah subscriber
     *
     * @param  observer a sample parameter for a method
     */
    public void addObserver(Observer observer);
    
    /**
     * method untuk menghapus subscriber
     *
     * @param  observer a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public void removeObserver(Observer observer);
    
    /**
     * method notify untuk memberikan notifikasi kepada subscriber jika ada perubahan
     *
     * @param  s a sample parameter for a method
     */
    public void notify(String s);
}
