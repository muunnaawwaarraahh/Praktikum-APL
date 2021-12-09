
/**
 * Interface observer memiliki method yang mewakili hal-hal yang
 * dapat dilakukan oleh seorang Observer
 *
 * @author Munawarah
 * @version 1.0
 */

public interface Observer
{
    /**
     * method yang harus dioverride untuk memberikan info update jika publisher membuat perubahan
     *
     * @param  s as string
     */
    public void update(String s);
}
