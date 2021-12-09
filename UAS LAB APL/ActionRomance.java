
/**
 * class ActionRomance mengimplementasi decorator movie untuk meremake movie dan menambahkan genre romance
 *
 * @author Munawarah
 * @version 1.0
 */
public class ActionRomance extends MovieDecorator
{
    /**
     * construct method ActionRomance
     * 
     * @param decoratedMovie
     */
    public ActionRomance(Movie decoratedMovie)
    {
        super(decoratedMovie);
    }

    /**
     * override method di movie decorator untuk menambah genre pada movie 
     *
     * @Override 
     */
    public void makeMovie()
    {
        decoratedMovie.makeMovie();
        setGenre(decoratedMovie);
    }

     /**
     * method set genre untuk menambah genre pada movie
     *
     * @param  decoratedMovie
     */
    private void setGenre(Movie decoratedMovie)
    {
    // Display message whenever function is called
        System.out.print(" have been remake and adding romance genre");
    }

   

}
