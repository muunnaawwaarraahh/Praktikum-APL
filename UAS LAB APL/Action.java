
/**
 * Class action movie yang tidak mengimplementasi decorator
 *
 * @author Munawarah
 * @version 1.0
 */

public class Action implements Movie
{

    /**
     * method yang masih menghasilkan movie action tanpa diberi genre tambahan apapun
     *
     * @param  y  a sample parameter for a method
     * @return    
     */
    @Override public void makeMovie()
    {
       
        System.out.print("some action movie ");
    }
}
