
/**
 * Class comedy movie yang tidak mengimplementasi decorator
 *
 * @author Munawarah
 * @version 1.0
 */
public class Comedy implements Movie
{
 
    /**
     * method yang masih menghasilkan movie comedy tanpa diberi genre tambahan apapun
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override 
    public void makeMovie()
    {
        System.out.print("some comedy movie ");
    }

}
